package it.pietrodn.mw.photobook;

public class PhotoBook {

	private final String title;
	private final int maxPhotos;
	private Photo[] photos;
	private String[] captions;

	public PhotoBook(String title, int maxPhotos) {
		super();
		this.title = title;
		this.maxPhotos = maxPhotos;
		this.photos = new Photo[maxPhotos];
		this.captions = new String[maxPhotos];
	}

	public synchronized int add(Photo p) {
		while (true) {
			for (int i = 0; i < maxPhotos; i++) {
				if (photos[i] == null) {
					photos[i] = p;
					return i;
				}
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void setCaption(int slot, String caption) {
		captions[slot] = caption;
	}

	public synchronized void upload(SharingSvc svc) {
		new Thread() {
			@Override
			public void run() {
				synchronized (PhotoBook.this) {
					svc.upload(PhotoBook.this.title, PhotoBook.this.photos, PhotoBook.this.captions);
					for (int i = 0; i < maxPhotos; i++) {
						PhotoBook.this.photos[i] = null;
						PhotoBook.this.captions[i] = null;
					}
					PhotoBook.this.notifyAll();
				}
			}
		}.start();
	}

}
