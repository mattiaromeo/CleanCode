package be.cegeka.cleancode.domain;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
public class SupermarketRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Customer> getAllCustomers() {
        return entityManager.createQuery("select c from Customer c", Customer.class).getResultList();
    }

    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

}
