package org.antwalk;

import org.antwalk.customer.Customer;
import org.antwalk.interfaces.Account;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Customer cust=context.getBean(Customer.class);
		cust.setName("AnweshaKayal");
		cust.setAddress("Kolkata");
		cust.setAge(21);
		cust.setUserName("anu1");
		cust.setBalance(10000);
		cust.setEmail("anu@gmail.com");
		cust.setPhone(9800123456L);
		System.out.println("\n_________Details of Customer_________\n");
		cust.display();
		System.out.println("\n______________________________________\n");
		Account saving=context.getBean("saving",Account.class);
		Account current=context.getBean("current",Account.class);
		System.out.println(saving.showAccont());
		System.out.println(current.showAccont());
	}

}
