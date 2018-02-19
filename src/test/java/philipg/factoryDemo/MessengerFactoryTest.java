package philipg.factoryDemo;

import org.junit.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class MessengerFactoryTest {

    @Before
    public void setUp()  {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessengerFactoryTest.class);
    }

    @Test
    public void testMessengerFactory(){
        MessengerFactory factory = new MessengerFactory();
        factory.sendMessage(new Message(1)); //Email Messenger
        factory.sendMessage(new Message(2)); //SMS Messenger
        factory.sendMessage(new Message(3)); //Pizza
    }
}