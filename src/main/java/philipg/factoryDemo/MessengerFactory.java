package philipg.factoryDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MessengerFactory {
    private static Map<Integer, Messenger> map = new HashMap<>();

    @Autowired
    public void configureMap(List<Messenger> messengers) {
        for (Messenger messenger : messengers) {
            map.put(messenger.getType(), messenger);
        }
    }

    public Messenger sendMessage(Message message) {
        Messenger messenger = map.get(message.messageType);
        messenger.send();
        return messenger;
    }
}
