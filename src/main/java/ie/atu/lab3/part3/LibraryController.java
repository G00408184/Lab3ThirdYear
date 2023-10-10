package ie.atu.lab3.part3;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@AllArgsConstructor
public class LibraryController {
    LibraryService libraryService;//this makes this class able to access from LibraryService

    @GetMapping("/book{")
    public ArrayList<Book> getBook(){
        return libraryService.retrieve();
    }

}
