/*
Materi: Input Nilai Melalui Keyboard
Dosen: Made Agus Putra Subali, S.Kom., M.Kom.
*/

import java.util.*; // -> Import java.util package

public class Pertemuan3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);  // -> Buat instance objek dari class Scanner

    System.out.print("Masukan Nama Anda: ");
    String namaLengkap = scn.nextLine();

    System.out.println("Halo, " + namaLengkap);

    System.out.print("Masukan Umur Anda: ");
    int umur = scn.nextInt();

    System.out.println("Umur Anda Saat Ini: " + umur);

    /*
    Method yang digunakan sesuai dengan jenis tipe data:
    String -> next() atau nextLine()
    Integer -> nextInt()
    Floating Point -> nextDouble()
    */
  }
}