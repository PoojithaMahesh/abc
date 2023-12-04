package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import setterinjection.Mobile;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("dependency.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Laptop laptop=(Laptop)beanFactory.getBean("laptop");
	Charger charger=(Charger)beanFactory.getBean("c");
	System.out.println(charger);
	System.out.println(laptop);
	Laptop laptop2=beanFactory.getBean("laptop",Laptop.class);
	System.out.println(laptop2);
}
}
