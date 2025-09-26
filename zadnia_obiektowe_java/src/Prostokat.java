public class Prostokat {
    public double szerokosc;
    public  double wyskosc;

    public double pole(double szerokosc,double wyskosc){
        this.szerokosc=szerokosc;
        this.wyskosc=wyskosc;

        double pole = szerokosc*wyskosc;

        return pole;
    }

    public double obwod(double szerokosc,double wyskosc){
        this.szerokosc=szerokosc;
        this.wyskosc=wyskosc;

        double obwod =(szerokosc*2)+(wyskosc*2);

        return obwod;
    }
}
