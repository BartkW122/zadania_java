import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        //zadanie 1
        /*
        System.out.print("podaj liczbe: ");
        double liczba=sc.nextDouble();


        for(int i = 1;i<=10;i++){
            System.out.println(liczba + " * " + i + " = " + liczba*i);
        }
        sc.close();*/

        //zadanie 2


        /*System.out.print("podaj liczbe1: ");
        double liczba1=sc.nextDouble();

        System.out.print("podaj liczbe2: ");
        double liczba2=sc.nextDouble();

        System.out.print("podaj dzailanie (+, -, *, /): ");
        String znak=sc.next();

        switch (znak){
            case "+":
                System.out.println("wynik: "+ (liczba1 + liczba2));
                break;
            case "-":
                System.out.println("wynik: "+ (liczba1 - liczba2));
                break;
            case "*":
                System.out.println("wynik: "+ (liczba1 * liczba2));
                break;
            case "/":
                System.out.println("wynik: "+ (liczba1 / liczba2));
                break;
        }

        sc.close();*/

        //zadanie 3

        /*Random random=new Random();
        System.out.print("podaj ile losowan: ");
        int liczba_losowan = sc.nextInt();

        int suma_parzystych = 0;
        int suma_nie_parzystych = 0;

        for (int i= 0;i<liczba_losowan;i++){
            int rand_liczba=random.nextInt(10)+1;

            System.out.println("wylosowana liczba : "+rand_liczba);

            if(rand_liczba % 2 == 0){

                suma_parzystych+=rand_liczba;

            }else{

                suma_nie_parzystych+=rand_liczba;

            }

        }
        System.out.println("suma liczb parzystych: "+suma_parzystych);
        System.out.println("suma liczb nie parzystych: "+suma_nie_parzystych);*/

        //zadnaie 4

        Random random=new Random();
        System.out.print("podaj ile losowan: ");
        int liczba_losowan = sc.nextInt();

        System.out.print("wylosowana liczby : ");

        int suma=0;
        double srednia=0;
        int max=0;

        for (int i= 0;i<liczba_losowan;i++){
            int rand_liczba=random.nextInt(100)+1;

            System.out.print(" "+rand_liczba);

            suma+=rand_liczba;

            if(max<rand_liczba){
                max=rand_liczba;
            }

        }
        srednia=suma/liczba_losowan;

        System.out.print(System.lineSeparator());
        System.out.println("srednia = "+srednia);
        System.out.println("najwieksza liczba = "+max);



    }
}