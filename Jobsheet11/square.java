package Jobsheet11;

import java.util.Scanner;

public class square{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("masukkan nilai N= ");
        int N= sc.nextInt();
        // inner loop
        for(int iOuter=1; iOuter<=N; iOuter++){
        for(int i=1;i<=N;i++){
            System.out.print("*");
        }
        System.out.println();

        }
        
    }
}