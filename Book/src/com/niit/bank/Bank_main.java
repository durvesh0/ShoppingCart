package com.niit.bank;

public class Bank_main {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.setAcno(123456);
		bank.setActype("saving");
		bank.setCname("SAGAR");
		bank.setCadd("Pune");
		
		System.out.println( bank.getAcno());
		System.out.println( bank.getActype());
		System.out.println( bank.getCname());
		System.out.println( bank.getCadd());
				
				
	}

}
