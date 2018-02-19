package philipg.factoryDemo;

import org.springframework.stereotype.Component;

@Component
public class EmailMessenger implements Messenger {

    public void send() {
        System.out.println("Sending Email message..");
    }

    public int getType() {
        return 1;
    }
}
