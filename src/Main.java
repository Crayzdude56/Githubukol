import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metoda ukol1 = new Metoda();

        System.out.println("napis slovo");
        String vypis = sc.nextLine();
        System.out.print(vypis);


        ukol1.ahojsvete();
        ukol1.ukol3();
        ukol1.nasobky5();
        ukol1.ukol5();

    }
}