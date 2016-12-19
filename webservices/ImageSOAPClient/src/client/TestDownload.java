package client;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.SOAPBinding;

import support.ImageSOAPSEI;
import support.ImageSOAPSIBService;

public class TestDownload {

	public static void main(String[] args) {
		ImageSOAPSIBService service = new ImageSOAPSIBService();
		ImageSOAPSEI port = service.getImageSOAPSIBPort();

		BindingProvider bProvide = (BindingProvider) port;
		SOAPBinding soapBinding = (SOAPBinding) bProvide.getBinding();
		soapBinding.setMTOMEnabled(true);

		// Downloading
		ByteArrayInputStream bais = new ByteArrayInputStream(port.downloadImage("0.jpg"));
		try {
			Image image = ImageIO.read(bais);
			JFrame frame = new JFrame();
			frame.setSize(image.getWidth(null), image.getHeight(null));
			JLabel label = new JLabel(new ImageIcon(image));
			frame.add(label);
			frame.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
