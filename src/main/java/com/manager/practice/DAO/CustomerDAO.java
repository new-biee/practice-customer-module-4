package com.manager.practice.DAO;

import com.manager.practice.model.Customer;

import java.util.ArrayList;
import java.util.List;


public class CustomerDAO implements ICustomerDAO {
    private static List<Customer> customers = new ArrayList<>();
    private static int autoIncreaseId = 1;

    static {
        customers.add(new Customer(autoIncreaseId++, "T", "t@codegym.vn", "Da Nang"));
        customers.add(new Customer(autoIncreaseId++, "Nhat", "nhat@codegym.vn", "Quang Tri"));
        customers.add(new Customer(autoIncreaseId++, "Trang", "trang@codegym.vn", "Ha Noi"));
        customers.add(new Customer(autoIncreaseId++, "Nguyen Binh Son", "son@codegym.vn", "Sai Gon"));
        customers.add(new Customer(autoIncreaseId++, "Vu Tuan Anh", "anhvt@codegym.vn", "Ha Noi"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findOne(int id) {
//        Customer customer = new Customer();
        for (Customer c: customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return null;
    }

    @Override
    public Customer remove(Customer customer) {
        return null;
    }

    @Override
    public Customer edit(Customer customer) {
        return null;
    }

    @Override
    public int count() {
        return customers.size();
    }
}
