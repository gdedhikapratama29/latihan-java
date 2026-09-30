import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.err.println("program hitung luas jajar genjang");

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("input alas: ");

            int alas = input.nextInt();
            System.out.print("input tinggi: ");

            int tinggi = input.nextInt();

            int luas = alas * tinggi;

            System.out.print("Alas: " + alas);
            System.out.print("Tinggi: " + tinggi);
            System.out.print("luas: " + luas);
        }
    }
}
