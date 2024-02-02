import java.util.Scanner;

public class Nilai{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Nilai Asli: ");
        double nilai = input.nextDouble();
        System.out.println("Masukkan Durasi: ");
        int durasi = input.nextInt();

        double nilaiAkhir;
        if(durasi<60){
            nilaiAkhir = 1.2 * nilai;
        }
        else if(durasi>=60 && durasi<=70){
            nilaiAkhir = 0.75 * nilai;
        }
        else if(durasi>=90 && durasi<=100){
            nilaiAkhir = 0.5*nilai;
        }
        else {
            nilaiAkhir = 0.2*nilai;
        }

        System.out.println("nama " + nama + " mendapatkan nilai " + nilaiAkhir);
        //Close
        input.close();
    }
}