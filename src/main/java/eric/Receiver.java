package eric;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;

@Component
public class Receiver {

    @JmsListener(destination = "order-queue")
    public void receiveMessage(String message) {
        System.out.println("Order received : " + message);
    }
}

