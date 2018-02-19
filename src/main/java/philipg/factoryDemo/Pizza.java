package philipg.factoryDemo;

import org.springframework.stereotype.Component;

@Component
public class Pizza implements Messenger {
    public void send() {
        System.out.println("Sending Pizza...");
    }

    public int getType() {
        return 3;
    }
}
