package client;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.SOAPBinding;

import support.ImageSOAPSEI;
import support.ImageSOAPSIBService;

public class TestUpload {

	public static void main(String[] args) {
		ImageSOAPSIBService service = new ImageSOAPSIBService();
		ImageSOAPSEI port = service.getImageSOAPSIBPort();

		BindingProvider bProvide = (BindingProvider) port;
		SOAPBinding soapBinding = (SOAPBinding) bProvide.getBinding();
		soapBinding.setMTOMEnabled(true);

		// Uploading
		byte[] imageInByte = null;
		try {
			BufferedImage bImage = ImageIO.read(new File("/Users/pietro/Desktop/Negan.png"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write(bImage, "jpg", baos);
			baos.flush();
			imageInByte = baos.toByteArray();
			baos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String result = port.uploadImage(imageInByte);
		System.out.println(result);
	}

}
