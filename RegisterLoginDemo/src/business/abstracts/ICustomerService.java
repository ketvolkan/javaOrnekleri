package business.abstracts;

import java.util.List;

import entities.concretes.Customer;

public interface ICustomerService {
	void add(Customer customer,List<Customer> customers);
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	boolean control(Customer customer, List<Customer> customers);
	boolean login(String mail,String password,List<Customer> customers);
}
