package be.cegeka.cleancode.domain;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SupermarketService {

    @Inject
    private SupermarketRepository supermarketRepository;

    public SupermarketService(){
    }

    public void addCustomer(String firstname, String lastname) {
        supermarketRepository.addCustomer(new Customer(firstname,lastname));
    }
}
