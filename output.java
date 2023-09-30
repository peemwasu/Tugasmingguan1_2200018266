import java.util.Scanner;
public class output {
    public static void main(String[] args){
        String nama;
        int nilai;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa  : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan Nilai Mahasiswa : ");
        nilai = keyboard.nextInt();
        System.out.println("Data Berhasil Disimpan di Memori");
//        Menampilkan hasil output
        System.out.println("================");
        System.out.println("Nama Mahasiwa  : " + nama);
        System.out.println("Nilai Mahasiwa : " + nilai);
    }
}
