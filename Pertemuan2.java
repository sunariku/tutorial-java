/*
Materi: Variabel, Tipe Data, Ekspresi
Dosen: Made Agus Putra Subali, S.Kom., M.Kom.
*/

public class Pertemuan2 {
  public static void main(String[] args) {
    String namaLengkap = "Made Subali"; // -> Variabel dengan identifier namaLengkap dengan tipe data String dan literal value "Made Subali"

    int bilanganA = 5; // -> Bagaimana dengan ini?
    int bilanganB = 7; // -> Bagaimana dengan ini?

    int hasilPenjumlahan = 0;

    /*
    Ekspresi dibentuk dengan menggunakan operand dan operator.

    Pada contoh ekpresi hasilPenjumlahan di bawah:
    Operand (nilai) adalah bilanganA dan bilanganB
    Operator (simbol) adalah +
    */

    hasilPenjumlahan = bilanganA + bilanganB; // -> Ekspresi hasilPenjumlahan

    System.out.println(hasilPenjumlahan);
  }
}