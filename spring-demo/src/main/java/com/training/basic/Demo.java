package com.training.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	
	public static void main(String[] args) {
		try{
			//BeanFactory bFact = new XmlBeanFactory(new ClassPathResource("basic.xml"));
			
			 ClassPathXmlApplicationContext ctx = 
					 new ClassPathXmlApplicationContext("basic.xml");
		//	 FileSystemXmlApplicationContext ctx1 = new 
			//		 FileSystemXmlApplicationContext("classpath:basic.xml");
			
			AccountDetails accDetails = ctx.getBean("accountdetails",AccountDetails.class);
			//System.out.println(accDetails);
			//AccountDetails accDetailsOne = ctx.getBean(AccountDetails.class);
			//System.out.println(accDetailsOne);
			accDetails.print();
			// ctx.close();
			
			} catch (Exception e) {
			e.printStackTrace();
		}

	}
}




