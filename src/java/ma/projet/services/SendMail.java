/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

/**
 *
 * @author hp
 */
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    static final String username = "abderrahmane.ouaday@gmail.com";
    static final String password = "eomrgiaqkxxhccyg";
    static final String host = "smtp.gmail.com";
    static final String port = "587";

    public static void sendEmail(String recipient, String subject, String messageBody) {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", port);        
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
            message.setSubject(subject);
            message.setText(messageBody);

            Transport.send(message);
            System.out.println("Email sent successfully to " + recipient);
        } catch (MessagingException e) {
            System.err.println("Failed to send email: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Exemple d'utilisation de la classe EmailSender
        String username = "abderrahmane.ouaday@gmail.com";
        String password = "eomrgiaqkxxhccyg";
        String host = "smtp.gmail.com"; // ou tout autre serveur SMTP que vous utilisez
        String port = "587"; // Port SMTP, par exemple, 587 pour TLS

        String recipient = "abdoouaday361@gmail.com";
        String subject = "test sendMailer";
        String messageBody = "hello";

        SendMail.sendEmail(recipient, subject, messageBody);
    }
}
