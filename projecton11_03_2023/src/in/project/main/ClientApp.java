package in.project.main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.project.model.MarksInfo;

public class ClientApp {
	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/project/cfg/applicationContext.xml");

		//Array object is injected
		MarksInfo marksInfo = factory.getBean("marksInfo", MarksInfo.class);
		System.out.println(marksInfo);		
	}
}
