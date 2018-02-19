package philipg.factoryDemo;

public class MessengerFactory extends BaseMessengerFactory {

    public Messenger sendMessage(MessengerTypes type) {
        Messenger messenger;
        switch (type)
        {
            case SMS:
                messenger = new SMSMessenger();
                break;
            case EMAIL:
                messenger = new EmailMessenger();
                break;
            case PIZZA:
                messenger = new Pizza();
                break;
            default: throw new IllegalArgumentException("No such messenger.");
        }

        messenger.send();
        return messenger;
    }
}
