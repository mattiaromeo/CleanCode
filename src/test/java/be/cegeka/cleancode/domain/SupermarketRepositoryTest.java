package be.cegeka.cleancode.domain;

import be.cegeka.cleancode.Application;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
@Transactional
public class SupermarketRepositoryTest {
    @Inject
    private SupermarketRepository supermarketRepository;

    @PersistenceContext
    private EntityManager entityManager;

    private Customer testCustomer1;
    private Customer testCustomer2;

    @Before
    public void setUp() throws Exception {
        testCustomer1 = new Customer("test", "test");
        entityManager.persist(testCustomer1);
        testCustomer2=new Customer("test","test");
    }

    @Test
    public void getAllCustomersShouldContaintestCustomer() throws Exception {
        Assertions.assertThat(supermarketRepository.getAllCustomers()).contains(testCustomer1);
    }

    @Test
    public void addCustomerShouldAddCustomerToTable() throws Exception {
        supermarketRepository.addCustomer(testCustomer2);
        Assertions.assertThat(supermarketRepository.getAllCustomers()).contains(testCustomer2);
    }
}