package be.cegeka.cleancode.application;

import be.cegeka.cleancode.domain.SupermarketService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/supermarket")
@Transactional
public class SupermarketController {
    @PersistenceContext
    private EntityManager entityManager;

    @Inject
    private SupermarketService supermarketService;

    @PostMapping(path="/addcustomer")
    public void addCustomer(@RequestParam(value="firstname",required = true)String firstname,@RequestParam(value="lastname",required = true)String lastname){
        supermarketService.addCustomer(firstname,lastname);
    }


}
