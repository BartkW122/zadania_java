import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("podaj szerokosc: ");
        double a= sc.nextDouble();

        System.out.println("podaj wysokosc: ");
        double b= sc.nextDouble();

        Prostokat prostokat = new Prostokat();

        System.out.println("pole prostokata wynosi: "+prostokat.pole(a,b));
        System.out.println("obwod prostokata wynosi: "+prostokat.obwod(a,b));
    }
}