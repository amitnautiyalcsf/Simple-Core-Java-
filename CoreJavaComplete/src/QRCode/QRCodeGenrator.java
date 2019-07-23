package QRCode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodeGenrator 
{
	
	public static void main(String[] args) throws Exception {
		
	
	
	String details = "Ammy - Certified Ethical Hacker : Java Developer... ";
	ByteArrayOutputStream out = QRCode.from(details).to(ImageType.JPG).stream();
	File f = new File("D:\\BFSI Revision\\QrCodeGenrator Java Jar Files\\MyFile.jpg");
	FileOutputStream fos = new FileOutputStream(f);
	
	fos.write(out.toByteArray());
	fos.flush();
	
	
	}
	

}
