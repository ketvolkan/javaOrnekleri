import java.util.ArrayList;
import java.util.List;

import business.concretes.CustomerManager;
import business.concretes.CustomerVerification;
import core.concretes.Gmailreg;
import dataAccess.concretes.CustomerDao;
import entities.concretes.Customer;

public class main {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		
		Customer kullanici = new Customer(1, "Volkan", "Ket", "absac@gmail.com", "123456");
		Customer kullanici2 = new Customer(2, "Nazmi", "Çakmakçý", "adadasac@gmail.com", "123456");
		Customer kullanici3 = new Customer(3, "Asya", "Güzelyurt", "abddsac@gmail.com", "123456");
		Customer kullanici4 = new Customer(4, "Ýbrahim", "Livat", "ab2ac@gmail.com", "123456");
		
		CustomerManager customerManager = new CustomerManager(new CustomerVerification(),new CustomerDao());
		CustomerVerification customerVerification = new CustomerVerification();
		CustomerManager gmailcustomerManager = new CustomerManager(new Gmailreg());
		
		System.out.println("***Gmail Register***");
		gmailcustomerManager.add(kullanici4);
		customers.add(kullanici4);
		System.out.println("**************\n");
		
		System.out.println("***Register***");
		customerVerification.verificationOk(kullanici);
		customerManager.add(kullanici, customers);
		System.out.println("");
		
		customerVerification.verificationOk(kullanici2);
		customerManager.add(kullanici2, customers);
		System.out.println("");
		
		customerVerification.verificationOk(kullanici3);
		customerManager.add(kullanici3, customers);
		System.out.println("**************\n");

		
		System.out.println("****Login****");
		customerManager.login("abddsac@gmail.com","123456", customers);
		customerManager.login("adadasac@gmail.com","123456", customers);
		customerManager.login("absac@gmail.com","123456", customers);
		customerManager.login("ab2ac@gmail.com","123456", customers);
		System.out.println("**************");
	}

}
