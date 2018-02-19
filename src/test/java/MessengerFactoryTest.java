import org.junit.Test;
import philipg.factoryDemo.*;

public class MessengerFactoryTest {
    @Test
    public void testMessengerFactory(){
        BaseMessengerFactory factory = new MessengerFactory();
        Messenger smsMessenger = factory.sendMessage(MessengerTypes.SMS);
        Messenger emailMessenger = factory.sendMessage(MessengerTypes.EMAIL);
        Messenger pizzaMessenger = factory.sendMessage(MessengerTypes.PIZZA);
    }
}
