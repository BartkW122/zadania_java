//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ksiazka k1 = new Ksiazka("Pan Tadeusz", "Adam Mickiewicz");
        Ksiazka k2 = new Ksiazka("Lalka", "Bolesław Prus");
        //System.out.print(k1.toString());

        Biblioteka biblioteka =new Biblioteka();

        biblioteka.dodajKsiazke(k1);
        biblioteka.dodajKsiazke(k2);
        //biblioteka.wypozyczKsiazke("tytul");

    }
}