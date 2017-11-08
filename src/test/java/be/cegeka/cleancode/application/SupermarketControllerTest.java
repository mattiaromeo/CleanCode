package be.cegeka.cleancode.application;

import be.cegeka.cleancode.domain.Customer;
import be.cegeka.cleancode.domain.SupermarketRepository;
import be.cegeka.cleancode.domain.SupermarketService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;

public class SupermarketControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private SupermarketController supermarketController;

    @Mock
    private SupermarketService supermarketService;
    @Test
    public void whenSupermarketControllerAddCustomerIsCalledSupermarketServAddCustomerShouldBeCalled() throws Exception {
        supermarketController.addCustomer("test", "test");
        Mockito.verify(supermarketService).addCustomer("test","test");
    }

}