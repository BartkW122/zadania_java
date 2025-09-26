import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String znak;
        double ocena;

        Student student=new Student("Marek","Kowalski",1001);

        do {
            System.out.print("dodaj ocene (od 2.0 do 5.0): ");
            ocena = scanner.nextDouble();

            student.dodajOcene(ocena);

            System.out.println("czy chcesz kontynuowac (y/n): ");
            znak=scanner.next();

        }while (znak.equalsIgnoreCase("y"));

        System.out.println(student.toString());
    }
}