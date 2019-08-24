package smnrkssn.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email) {
        System.out.println(String.join(
                "Received: {\n",
                "    " + email + "\n",
                "}"
        ));
    }
}
