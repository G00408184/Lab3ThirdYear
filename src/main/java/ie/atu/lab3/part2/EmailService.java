package ie.atu.lab3.part2;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String to, String message){
        System.out.println("koobs" +message);
    }

}
