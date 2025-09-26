public class Produkt {
    public String nazwa;
    public double cena;
    public int ilosc;

    Produkt(String nazwa,double cena,int ilosc){
        if(!nazwa.equals(null)) {
            this.nazwa = nazwa;
        }

        if(cena > 0){
            this.cena=cena;
        }

        if(ilosc >= 0){
            this.ilosc=ilosc;
        }
    };

    public String getNazwa(){
        return nazwa;
    };

    public double getCena(){
        return cena;
    };

    public int getIlosc(){
        return ilosc;
    };

    public  void  dodaj(int sztuk){
        if(sztuk > 0){
            //dodaje sztuki
            this.ilosc+=sztuk;
        }else{
            System.out.println("Musi byc conajmniej 1 sztuka!!");
        }
    }

    public  void  sprzedaj(int sztuk){
        if(sztuk < this.ilosc){
            this.ilosc-=sztuk;
        }else{
            System.out.println("ilosc sztuk do sprzedania musi byc mniejsza niz ilosc produktu!!");
        }
    }

    @Override
    public String toString() {
        return nazwa + " - Cena: " + cena + " zł, Ilość: " + ilosc;
    }
}
