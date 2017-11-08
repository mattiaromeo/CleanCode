package be.cegeka.cleancode.domain;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    private Customer testcustomer;

    @Before
    public void setUp() throws Exception {
        testcustomer=new Customer("mattia","romeo");
    }

    @Test
    public void getIdShouldReturnId() throws Exception {
        Assertions.assertThat(testcustomer.getId()).isEqualTo(0);
    }

    @Test
    public void getFirstnameShouldReturnFirstname() throws Exception {
        Assertions.assertThat(testcustomer.getFirstname()).isEqualTo("mattia");
    }

    @Test
    public void getLastnameShouldReturnLastname() throws Exception {
        Assertions.assertThat(testcustomer.getLastname()).isEqualTo("romeo");
    }

    @Test
    public void createNewCustomerIsEqualToNewlyCreatedCustomer() throws Exception {
        Customer newlyCreatedCustomer=new Customer("valentina","romeo");
        Assertions.assertThat(newlyCreatedCustomer.getLastname()).isEqualTo("romeo");
        Assertions.assertThat(newlyCreatedCustomer.getFirstname()).isEqualTo("valentina");
        Assertions.assertThat(newlyCreatedCustomer.getId()).isEqualTo(0);
    }
}