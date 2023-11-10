package in.ineron.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineron.model.PersonalInfo;

public class TestApp {

	public static void main(String[] args) {
		//using the FileSystemResource to locate the configuration file
		 FileSystemResource resource=new FileSystemResource("./src/applicationContext.xml");
		 
		// Creating an IOC container
		 @SuppressWarnings("deprecation")
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		 
		//Requesting IOC container to give the Object
		PersonalInfo info1= factory.getBean("per1", PersonalInfo.class);
		 System.out.println(info1);
		//using the target object performing the operation and printing the result
		 PersonalInfo info2= factory.getBean("per2", PersonalInfo.class);
		 System.out.println(info2);
	}

}
