package smnrkssn.jms;

import lombok.Data;

@Data
public class Email {
    private String to;
    private String body;

    public Email(){}

    Email(String to, String body) {
        this.to = to;
        this.body = body;
    }

    @Override
    public String toString() {
        return (
            "Email: {\n" +
            "    to: " + getTo() + ",\n" +
            "    body: " + getBody() + "\n" +
            "}"
        );
    }
}
