package org.antwalk.customer;

import org.antwalk.interfaces.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Customer {
    private String name;
    private String userName;
    private String password;
    private int age;
    private String SSN;
    private String address;
    private String email;
    private long phone;
    private float balance;
    
       
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Autowired
    @Qualifier("saving")
    Account acc;
    public void display()
    {
    	System.out.println("Name : "+this.getName());
    	System.out.println("Age : "+this.getAge());
    	System.out.println("Address : "+this.getAddress());
    	System.out.println("Email : "+this.getEmail());
    	System.out.println("Balance : "+this.getBalance());
    	System.out.println("Account type : "+acc.showAccont());
    }
}
