package smnrkssn.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MailBox {
    @JmsListener(destination = Address.MAIL_BOX)
    public void receiveEmail(Email email) {
        System.out.println("MailBox " + email);
    }
}
