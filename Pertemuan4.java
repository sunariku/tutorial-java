/*
Materi: Percabangan
Dosen: Made Agus Putra Subali, S.Kom., M.Kom.
*/

public class Pertemuan4 {
  public static void main(String[] args) {
    /*
    Pada pemrograman java untuk membuat percabangan
    dapat menggunakan if() dan switch()
    */

    if (10 < 5) { // --> Apabila kondisi benar maka block if() akan dijalankan
      System.out.println("Kondisi Benar");
    }

    /*
    Setiap if() merupakan perintah
    yang terpisah dengan if() lain
    */

    if (10 < 2) { // --> Perintah if(10 < 5) sebelumnya berbeda dengan perintah if(10 < 2) saat ini
      System.out.println("Kondisi Benar"); // --> Blok if() akan dijalankan ketika kondisi benar
    }

    if (10 != 5) {
      System.out.println("Kondisi Benar");
    } else { // --> Kita dapat menambahkan else untuk menangani apabila kondisi bernilai salah
      System.out.println("Kondisi Salah"); // --> Blok else akan dijalankan ketika kondisi salah
    }

    /*
    Bagaimana dengan lebih dari satu kondisi yang diperiksa?
    Misalkan saya ingin memeriksa data sebagai berikut:

    Nilai         Grade
      0   - 100	    A
      70  - 79	    B
      60  - 69    	C
      50  - 59	    D
    < 50	          E

    Pada kondisi seperti di atas dapat diselesaikan dengan if ... else if ... else
    Seperti berikut:
    */

    if (score >= 80 && score <= 100) {
      System.out.println("A");
    } else if (score >= 70 && score < 80) { // --> Penggunaan else if dapat digunakan sebanyak mungkin
      System.out.println("B");
    } else if (score >= 60 && score < 70) {
      System.out.println("C");
    } else if (score >= 50 && score < 60) {
      System.out.println("D");
    } else {
      System.out.println("E");
    }
  }
}