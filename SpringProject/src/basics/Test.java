package basics;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import constructor.injection.Employee;
import constructor.injection.Question;


public class Test {
	public static void main(String[] args) {
		//Student lahari = new Student();
		
		 Resource r=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(r);  
		      
		    Question q=(Question)factory.getBean("questionbean");  
		    q.displayInfo();  
		/*
		 *  Resource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Employee s=(Employee)factory.getBean("employee");  
	        s.show(); 
		*/
		/*
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * //BeanFactory beanFactory = new XmlBeanFactory(resource); Student lahari=
		 * (Student) context.getBean("studentbean"); //bean is a pojo class
		 * lahari.displayInfo();
		 */
	}

}