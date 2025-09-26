import java.util.ArrayList;

public class Student {
    public String imie;
    public String nazwisko;
    public int numerindesku;
    public ArrayList<Double> oceny;

    Student(String imie,String nazwisk,int numerindesku){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numerindesku=numerindesku;
        oceny=new ArrayList<>();
    };

    public int getNumerindesku() {
        return numerindesku;
    }

    public void dodajOcene(double ocena){
        if(ocena >= 2.0 && ocena <= 5.0){
            this.oceny.add(ocena);
        }
    };

    public double srednia(){
        double srednia= 0;
        double suma=0;
        if(this.oceny.size()==0){
            return 0;
        }else{
            for(double o:oceny){
                suma+=o;
                srednia=suma/this.oceny.size();
            }
            return srednia;
        }
    };

    public String toString(){
        return "imie: "+this.imie+"\nnazwisko: "+this.nazwisko+"\nnumer inedksu: "+getNumerindesku()+"\noceny: "+this.oceny+"\nsrednia: "+srednia();
    }
}
