package in.ineron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineron.model.wishMessageGenerator;

public class TestApp {

	public static void main(String[] args) {
		//using the FileSystemResource to locate the configuration file
		 FileSystemResource resource=new FileSystemResource("./src/applicationContext.xml");
		 
		// Creating an IOC container
		 @SuppressWarnings("deprecation")
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		 
		//Requesting IOC container to give the Object
		 wishMessageGenerator genetrator= factory.getBean("wmg",wishMessageGenerator.class);
		 
		//using the target object performing the operation and printing the result
		 String result=genetrator.generateWishMessage("Ganesh");
		 System.out.println("");
		 System.out.println(result);
	}

}
