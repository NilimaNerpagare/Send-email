package Demo1;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

import java.io.File;

public class SendEmailJava {

    public static void main(String[] args) throws EmailException {

        System.out.println("- 1- ");
        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        //email.setHostName("smtp.gmail.com");
        email.setHostName("smtp.outlook.live.com");
        email.setAuthentication("automationtask2@outlook.com", "Tasktwo1234");
        email.setDebug(true);
        email.setSmtpPort(587);
        //email.setSSLOnConnect(false);
        email.setStartTLSEnabled(true);
        email.attach(new File("/Users/nilimanerpagare/Desktop/Nilima/Testing/Nilima Nerpagare-A personal plan.pages"));
        System.out.println("- 2- ");
        email.addTo("dearsachin@gmail.com");
        email.setFrom("Nilima@gmail.com", "Nilima");
        email.setSubject("The picture");
        email.setMsg("Here is the picture you wanted");
        System.out.println("- 3- ");
        // add the attachment

        // send the email
        email.send();
        System.out.println("- 4- ");
    }

}
