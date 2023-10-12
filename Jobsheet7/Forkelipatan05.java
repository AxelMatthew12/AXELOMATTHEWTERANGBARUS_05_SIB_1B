package Jobsheet7;
import java.util.Scanner;
public class Forkelipatan05 {
    public static void main(String[] args) {
        
        int kelipatan,jumlah,total,counter;
        jumlah = 0;
        counter= 0;
        total = 0;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Masukkan bilangan kelipatan (1-9)");
        kelipatan= scan.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total +=i;
                counter++;
                System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalaah %d\n", kelipatan, counter);
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan , total);
            }
        }



    }
    
}
