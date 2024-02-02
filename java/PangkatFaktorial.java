import java.util.Scanner;
public class PangkatFaktorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan bilangan utama (n): ");
        int n = input.nextInt();
        System.out.println("masukkan pemangkatan (m): ");
        int m = input.nextInt();

        int hasilFact;
        int tempN;
        
        hasilFact = 1;
        tempN = n;
        while (tempN >= 1){
            hasilFact *= tempN ;
            tempN -= 1;
        }

        int hasilPangkat = 1;
        for(int i = 0;i<m;i++){
            hasilPangkat*=n;
        }

        System.out.println("n factorial = "+hasilFact);
        System.out.println("n pangkat m = " + hasilPangkat);

        //Close
        input.close();
    }
}
