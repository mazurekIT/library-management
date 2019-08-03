package pl.mazurekit.cognifide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mazurekit.cognifide.model.Json;
import pl.mazurekit.cognifide.model.VolumeInfo;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class CognifideApplication {

    public static void main(String[] args) {
        SpringApplication.run(CognifideApplication.class, args);

        BookListProvider bookListProvider = new JSONBookListProvider("C:\\Users\\Mazzi\\Desktop\\cognifide\\src\\main\\resources\\books.json");

        try {
            Json availableBooks = bookListProvider.getAvailableBooks();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
