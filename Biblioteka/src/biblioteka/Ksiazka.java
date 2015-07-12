//import biblioteka.Biblioteka;

package biblioteka;

import java.io.*;

/**
 *
 * @author Krzycho
 */
public class Ksiazka {
    String autor;
    String tytul;
    int rok;
   
    
    public void dodajKsiazke() throws FileNotFoundException{
        File plik = new File ("plik.txt");
        try (PrintWriter zapis = new PrintWriter ("plik.txt")) {
            zapis.println(autor+tytul+rok);
            zapis.close();
        }
    }
}
