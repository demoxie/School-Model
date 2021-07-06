package EmailSenderServices;

public interface EmailSender {
    void sendEmail(String senderAddress,String recipientAddress,String title,String message) throws InterruptedException;
}
