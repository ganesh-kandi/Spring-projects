package in.ineron.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineron.model.Employee;

public class TestApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		reader.loadBeanDefinitions("in/ineron/cfg/applicationContext.xml");
		Employee employee=factory.getBean("person1",Employee.class);
		Employee employee1=factory.getBean("person2",Employee.class);
		System.out.println(employee.getEname());
//		System.out.println(employee);
//		System.out.println(employee1);
	}
}
