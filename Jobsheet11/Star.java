package Jobsheet11;
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int N = scan.nextInt();

        for(int i=0;i<=N;i++){
            System.out.print("*");
        }

       
    }

    
}