import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[]args){
    // move to seperat method in Artist & Album
        List<String> instruments = new ArrayList<>();
       instruments.add("Gutiar");
       instruments.add("harmonica");
       instruments.add("drums");
        List <Artist> nirvana = new ArrayList<>();
        nirvana.add(new Artist("Dave Ghrol", 27, instruments));
        nirvana.add(new Artist("Kurt kobain", 27, instruments));
        int nomembernir= nirvana.size();
Artist Art1 = new Artist("Bob dylan", 80, instruments );

Band band1 = new Band(nirvana,nomembernir);
       GUI gui = new GUI();


//grafical interface creation

    }
}
