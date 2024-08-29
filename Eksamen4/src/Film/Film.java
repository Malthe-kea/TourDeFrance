package Film;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Film {

    LocalDate localDate = LocalDate.now();

    private String filmTitel;
    private LocalDate udgivelsesÅr;
    private Producer producer;

    public Film(String filmTitel){
        this.filmTitel = filmTitel;
        this.udgivelsesÅr = localDate;
    }

    public Film(String filmTitel, Producer producer){
        this.filmTitel = filmTitel;
        this.producer = producer;
        this.udgivelsesÅr = localDate;
    }
}
