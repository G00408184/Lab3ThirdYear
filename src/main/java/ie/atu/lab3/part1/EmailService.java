package ie.atu.lab3.part1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String to, String message){
        System.out.println("koobs" +message);
    }

}
