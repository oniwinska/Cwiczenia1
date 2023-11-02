import java.util.Scanner;
public class Hello
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj imie studenta: ");
        String imieStudenta = scanner.nextLine();


        System.out.print("Podaj nazwisko studenta: ");
        String nazwiskoStudenta = scanner.nextLine();

        System.out.print("Podaj kierunek studenta: ");
        String kierunekStudenta = scanner.nextLine();

        System.out.println("Imie studenta: "+ imieStudenta);
        System.out.println("Nazwisko studenta: "+ nazwiskoStudenta);
        System.out.println("Kierunek studenta: "+ kierunekStudenta);

        scanner.close();
    }
}
