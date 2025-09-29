import java.util.ArrayList;

public class Biblioteka {
    private ArrayList<Ksiazka> ksiazki;


    public void dodajKsiazke(Ksiazka k){
        ksiazki.add(k);
    };

    public void wypozyczKsiazke(String tytul){
        for(Ksiazka ksiazka: ksiazki){
            System.out.println(ksiazka);
        }
    }
}
