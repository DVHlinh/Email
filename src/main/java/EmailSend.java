import javax.activation.DataHandler;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Random;

public class EmailSend {
    public static void main(String[] args) {
        String to ="lhnldoan@gmail.com";
        String form="linhlinhdoanvo@gmail.com";
        final String userName="linhlinhdoanvo@gmail.com";
        final String passWord="linhdeptrai123";
        String host = "pop.gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", " 995");
        Random s1 = new Random();
        System.out.println( s1.nextInt());

        Session s = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName,passWord);
            }
        });
            Message m = new MimeMessage(s);
        try {
            m.setFrom(new InternetAddress(form));
           m.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));
            m.setSubject("Test Subject");
            m.setText("Hello, this is sample for to check send " +
                    "email using JavaMailAPI ");
            m.setFileName(new File("abcs.txt").getPath());
            m.setContent("<h1>demo youtube.com<h1>","text/html");

            // To send message
            Transport.send(m);

            System.out.println("message send");

        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
    }

