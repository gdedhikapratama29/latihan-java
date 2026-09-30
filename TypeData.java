public class TypeData {

    // penjelasan sedikit tentang type data

    /*
     * angka
     * integer -> int -> bilangan bulat
     * floating point -> float -> bilangan berkoma
     * double -> double -> bilangan berkoma
     *
     *
     * text
     * string -> kata / kalimat (saya sedang makan) dll
     * char -> karakter (a) (b) (-) (+)
     *
     * boolean -> true/false
     *
     * varible -> tipe data nama_variable = isi_variable;
     *
     */

    public static void main(String[] args) throws Exception {

        // type data integer
        int umur = 12;
        System.out.println("umur saya adalah " + umur + " tahun ");

        // floating true atau false

        float berat = 12.9f;
        System.out.println("Berat = " + berat + " kg ");

        // double floating pint (double)
        double panjang = 12.199999;
        System.out.println("panjang = " + panjang + " m");

        // varible String;
        String nama = "Dhika Pratama";
        System.out.println("nama saya = " + nama);

        // karakter (char)
        char gender = 'L';
        System.out.println("gender = " + gender);

        // boolean (bool)
        boolean sehat = true;
        System.out.println("sehat = " + sehat);
    }
}
