package ie.atu.lab3.part3;

import org.springframework.web.bind.annotation.*;

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

        @PostMapping("/newUser1")
        public String getUser(@RequestBody User kuba){
                userService.registerUser(kuba.getName(), kuba.getEmail());
                return "done";
        }
}
