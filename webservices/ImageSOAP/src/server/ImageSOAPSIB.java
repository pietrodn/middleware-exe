package server;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

@WebService(endpointInterface = "server.ImageSOAPSEI")
@MTOM(threshold = 2048)
public class ImageSOAPSIB implements ImageSOAPSEI {

	static int counter;

	static {
		counter = 0;
	}

	@Override
	public String uploadImage(Image data) {
		if (data != null) {
			BufferedImage bImage = new BufferedImage(data.getWidth(null), data.getHeight(null),
					BufferedImage.TYPE_INT_RGB);
			Graphics2D graphics = (Graphics2D) bImage.getGraphics();
			graphics.drawImage(data, null, null);
			RenderedImage rImage = bImage;
			try {
				ImageIO.write(rImage, "jpg", new File("/Users/pietro/Desktop/" + counter + ".jpg"));
				counter++;
				return "Upload successful!";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "Error! Data was null!";
	}

	@Override
	public Image downloadImage(String name) {
		Image returnImage = null;
		try {
			returnImage = ImageIO.read(new File("/Users/pietro/Desktop/" + name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnImage;
	}

}
