package be.cegeka.cleancode.domain;

import org.junit.*;
import org.mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SupermarketServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private SupermarketService supermarketService;

    @Mock
    private SupermarketRepository supermarketRepository;

    @Test
    public void whenSupermarketServiceAddCustomerIsCalledSupermarketRepositoryAddCustomerShouldBeCalled() throws Exception {
        supermarketService.addCustomer("test", "test");
        Mockito.verify(supermarketRepository).addCustomer(Mockito.refEq(new Customer("test","test")));
    }
}