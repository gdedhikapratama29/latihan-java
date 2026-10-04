
public class Escape {

    public static void main(String[] args) throws Exception {
        String nama = "d\bv\bid\bd";
        int umur = 23;
        double beratBadan = 80.9;

        /*
            \t -> tab
            \n -> enter
            \b -> backspace
         */

        System.out.print("nama \t\t= " + nama + "\nUsia \t\t= " + umur + " tahun\n");
        System.out.println("berat badan \t= " + beratBadan + " kg");
    }
}
