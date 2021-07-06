package Service_Implementations;

import EmailSenderServices.EmailSender;

import java.util.concurrent.TimeUnit;

public class EmailSenderImpl implements EmailSender {
    @Override
    public void sendEmail(String senderAddress, String recipientAddress, String title, String message) throws InterruptedException {
        System.out.println("....Sending Email");
        Thread.sleep(100);
        System.out.println("....Email Sent!");
        System.out.println("From : "+senderAddress);
        System.out.println("Sent to : "+recipientAddress);
        System.out.println("Subject: "+title);
        System.out.println("Message : "+message);
    }
}
