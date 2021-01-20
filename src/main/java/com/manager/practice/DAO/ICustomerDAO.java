package com.manager.practice.DAO;

import com.manager.practice.model.Customer;

import java.util.List;

public interface ICustomerDAO {

    List<Customer> findAll();

    Customer findOne(int id);

    Customer save(Customer customer);

    List<Customer> save(List<Customer> customers);

    void remove(int id);

    void edit (Customer customer);

    int count();

}
