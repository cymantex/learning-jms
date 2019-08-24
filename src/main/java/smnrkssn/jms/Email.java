package smnrkssn.jms;

import lombok.Data;

@Data
public class Email {
    private String to;
    private String body;

    @Override
    public String toString() {
        return String.join(
            "Email: {",
            "    to = " + getTo() + ",\n",
            "    body = " + getBody() + "\n",
            "}"
        );
    }
}
