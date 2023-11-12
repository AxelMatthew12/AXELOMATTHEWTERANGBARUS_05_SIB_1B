package Jobsheet11;
import java.util.Scanner;
public class tugasindividu{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Masukkan Nilai N minimal 3.");
            return;

        }

        for(int i = 0; i<=N; i++){
            for (int j= 1;j<= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();

            if (i==N) {
                break;
                
            }
        }

    for (int i = N - 1; i >0; i--){

        for(int j = 1; j<= i; j++){

            System.out.print(j + " ");
        }
        System.out.println();
    }
 
            
            
        }


        
    }
      
   
