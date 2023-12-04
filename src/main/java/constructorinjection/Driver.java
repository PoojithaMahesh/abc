package constructorinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("const.xml");
	BeanFactory beanFactory=new XmlBeanFactory(resource);
	Laptop laptop=(Laptop)beanFactory.getBean("laptop");
	System.out.println(laptop);
}
}
