package ie.atu.lab3;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
        UserService userService;

        public UserController(UserService userService) {
                this.userService = userService;
        }
        @GetMapping("/newUser1/{name}/{email}")
        public String getUser(@PathVariable String name, @PathVariable String email){
                return "valid";
        }
}
