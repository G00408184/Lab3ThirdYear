package ie.atu.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    private  final EmailService emailService;

    @Autowired

    public EmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String username,String email){

    }
}
