import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Zadanie 1
        int sztuk_dodaj;
        int sztuk_sprzedaj;

        Produkt produkt =new Produkt("Telefon",20,100);
        Magazyn magazyn=new Magazyn();
        magazyn.dodajProdukt(produkt);

        System.out.println("Wartosc magazynu: "+magazyn.wartoscMagazynu());


        System.out.println("ilosc sztuk przed sprzedaniem:"+produkt.ilosc);
        System.out.println("podaj ile sztuk chcesz sprzedac:");
        sztuk_sprzedaj=scanner.nextInt();

        produkt.sprzedaj(sztuk_sprzedaj);
        System.out.println("ilosc sztuk po sprzedaniu:"+produkt.ilosc);

    }
}