import java.util.ArrayList;

public class Magazyn {
    private ArrayList<Produkt> produkt;

    Magazyn(){
        produkt = new ArrayList<>();
    }
    public void dodajProdukt(Produkt p){
        produkt.add(p);
    };

    public Produkt znajdzProdukt(String nazwa){
        for(Produkt p : produkt){
            if(p.getNazwa().equals(nazwa))
            return p;
        }
        return null;
    };

    public  double wartoscMagazynu(){
        for(Produkt p : produkt) {
            return p.getIlosc()*p.getCena();
        }
        return 0;
    }
}
