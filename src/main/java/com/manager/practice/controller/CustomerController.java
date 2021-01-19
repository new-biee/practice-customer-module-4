package com.manager.practice.controller;

import com.manager.practice.DAO.CustomerDAO;
import com.manager.practice.DAO.ICustomerDAO;
import com.manager.practice.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerDAO iCustomerDAO;
//    CustomerDAO customerDAO = new CustomerDAO();


//    @GetMapping("/customers")
//    public ModelAndView showList() {
//        ModelAndView modelAndView = new ModelAndView("list");
//        modelAndView.addObject("listCustomers", customerDAO.findAll());
//        modelAndView.addObject("count", customerDAO.count());
//        return modelAndView;
//    }
    @RequestMapping("")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listCustomers", iCustomerDAO.findAll());
        modelAndView.addObject("count", iCustomerDAO.count());
        return modelAndView;
    }


    @GetMapping("/{id}")
    public ModelAndView showCustomerById(@PathVariable("id") int id) {
        Customer customer = iCustomerDAO.findOne(id);
        if(customer == null) {
            return new ModelAndView("404");
        }
//            ModelAndView modelAndView = new ModelAndView("info");
//            modelAndView.addObject("customer", customer);
//            return modelAndView;
        return new ModelAndView("info", "customer", customer);

    }


}
