package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id) {
        Address address = new Address(
                "10 High Street",
                "London",
                "SW1A 1AA"
        );

        return new Customer(id, "John Smith", address);
    }
}