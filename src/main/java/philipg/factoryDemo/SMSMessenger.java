package philipg.factoryDemo;

import org.springframework.stereotype.Component;

@Component
public class SMSMessenger implements Messenger {
    public void send() {
        System.out.println("Sending SMS message..");
    }

    public int getType() {
        return 2;
    }
}
