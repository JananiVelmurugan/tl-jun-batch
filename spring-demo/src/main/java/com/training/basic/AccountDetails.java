package com.training.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class AccountDetails implements BeanNameAware,InitializingBean,DisposableBean{
	
	private CustomerInfo cusInfo = null;  
	
	private Address add = null;
	
	@Inject // @autowired @resource
	private ApplicationContext appCtx ;
		
	
	public AccountDetails() {
		System.out.println("Inside cons of Account details.." );
		
	}
	
	// Business ()
	public void print() {
		System.out.println(appCtx);
		cusInfo.print();
		add.print();
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		System.out.println("Inside the add " + add);
		this.add = add;
	}

	public CustomerInfo getCusInfo() {
		return cusInfo;
	}

	public void setCusInfo(CustomerInfo cusInfo) {
		System.out.println("Inside cus info ..");
		this.cusInfo = cusInfo;
	}

	public void setBeanName(String name) {
		System.out.println("Bean name = "+name);
	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("context ::"+ctx);
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("After property set");
		
	}
	
	public void sta(){
		System.out.println("Inside sta");
	}
	
	@PostConstruct
	public void postInit(){
		System.out.println("Inside post init");
	}

	public void destroy() throws Exception {
		System.out.println("destroy method");
		
	}
	
	public void des(){
		System.out.println("XML des ()");
	}
	
	@PreDestroy
	public void dest(){
		System.out.println("anno destroy");
	}

}






















