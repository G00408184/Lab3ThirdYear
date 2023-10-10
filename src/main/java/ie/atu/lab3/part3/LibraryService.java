package ie.atu.lab3.part3;

import org.springframework.stereotype.Service;

import java.sql.Array;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;

@Service
public class LibraryService {
    ArrayList<Book> list = new ArrayList<>();
    public void add(Book book){
        list.add(book);
    }

}
