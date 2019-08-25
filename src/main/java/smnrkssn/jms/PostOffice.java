package smnrkssn.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class PostOffice {
    @JmsListener(destination = Address.POST_OFFICE)
    @SendTo(Address.MAIL_BOX)
    public Email processEmail(Email email, @Header("_type") String type) {
        System.out.println("PostOffice processes " + type);
        return email;
    }
}
