public class Ksiazka {
    private String tytul;
    private String autor;
    private boolean wypozyczona = true;

    Ksiazka(String tytul, String autor){
        this.tytul=tytul;
        this.autor=autor;
    };

    public void  wypozycz(){
        if(this.wypozyczona != true) {
            this.wypozyczona = true;
        }else{
            //wyjatek
        }
    };

    public void  dodaj(){
        if(this.wypozyczona != false) {
            this.wypozyczona = false;
        }else{
            //wyjatek
        }
    };

    public  String status(){
        if(this.wypozyczona == true){
            return "dostepna";
        } else if (this.wypozyczona == false) {
            return "wypozyczona";
        }
        return "";
    };

    public String toString(){
        return "tytul: "+this.tytul+" autor: "+this.autor+" wypozyczona: "+this.status();
    }

}
