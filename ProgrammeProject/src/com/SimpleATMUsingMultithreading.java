package com;

public class SimpleATMUsingMultithreading extends Thread{
	
	private Person person;
	public SimpleATMUsingMultithreading(Person person)
	{this.person=person;
		
	}
	public static void main(String args[])
	{
		SimpleATMUsingMultithreading s1=new SimpleATMUsingMultithreading(new  Person("vivek",1));
		SimpleATMUsingMultithreading s2=new SimpleATMUsingMultithreading(new  Person("vivek111",11));
		SimpleATMUsingMultithreading s3=new SimpleATMUsingMultithreading(new  Person("vivek2222",21));
		
		s1.start();
		s2.start();
		s3.start();
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			try {
				Account a1=  Account.getAccount(person);
			}catch(Exception e)
			{
				
			}
		}
		
	}
}
 class Account {

	public static Account simple;
	private static int balance =1000;
	private static Person person;
	
	public static Account getAccount(Person p) {
	    if (simple == null) {
	    	simple = new Account();
	    }
	    Account.person = p;
	    return simple;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public synchronized void withdraw(int amount)
	{
		if(balance>=amount)
		{	
			System.out.println(person.getName()+""+ "is withdrawing amount");
			try {
				Thread.sleep(1000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			balance=balance-amount;
			System.out.println("current balance is"+balance);
		}else
		{
			System.out.println("NOt enough money in account");
		}
	}
	public synchronized void deposit(int amont)
	{
		if(amont>0) {
			System.out.println(person.getName()+" "+"deposit " +amont);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance=balance+amont;
			System.out.println(person.getName() + " " + " deposit Rs." + balance);
		}
		else {
			System.out.println("enter enough amout to deposit");
		}
	}
}
class Person{
	String name;
	int id;
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}

	
}

