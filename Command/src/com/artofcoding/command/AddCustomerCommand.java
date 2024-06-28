package com.artofcoding.command;

import com.artofcoding.command.CustomerService;
import com.artofcoding.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}
