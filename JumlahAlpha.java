 import java.util.Scanner;

    public class JumlahAlpha {
    
        public static void main(String[] args) {
            System.out.println("***PENGHITUGAN JAM KOMPENSASI***");
            Scanner input = new Scanner(System.in);
            String nama_mahasiswa, nim, jurusan_mahasiswa;
            int jam_alfa;
            double ketentuan_kompensasi = 2, keputusan_jam_kompensasi;
            System.out.println("Masukan Nama Mahasiswa");
            nama_mahasiswa = input.nextLine();
            System.out.println("NIM");
            nim = input.nextLine();
            System.out.println("Masukan Jurusan Mahasiswa");
            jurusan_mahasiswa = input.nextLine();
            System.out.println("Masukan Jam Alfa");
            jam_alfa = input.nextInt();
            keputusan_jam_kompensasi = jam_alfa*ketentuan_kompensasi;
            System.out.println("Keputusan Jam Kompensasi: " + keputusan_jam_kompensasi); 
}
    }