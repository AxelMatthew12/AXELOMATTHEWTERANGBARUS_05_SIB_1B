import java.util.Scanner;
public class PemilihanPercobaan2No5{
    public static void main(String[] args) {
        Scanner input00= new Scanner(System.in);
        System.out.println("Nilai uas   :   ");
        float uas = input00.nextFloat();
        System.out.println("Nilai uts   :   ");
        float uts = input00.nextFloat();
        System.out.println("Nilai kuis  :   ");
        float kuis= input00.nextFloat();
        System.out.println("Nilai tugas :   ");
        float tugas= input00.nextFloat();
        float total = (uas *0.4F) + (uts * 0.3F) + (kuis* 0.1F) + (tugas * 0.2F);

        //Menghitung murni karya axelo matthew :D

        if (total >= 90 && total <= 100) {
          System.out.println("Nilai dalam huruf    = A, anda tidak remidi " +total);
        } else if (total >= 80 && total < 90) {
            System.out.println("Nilai dalam huruf  = B, anda tidak remidi " +total);
        } else if (total >= 70 && total < 80) {
           System.out.println("Nilai dalam huruf   = C, anda tidak remidi " +total);
        } else if (total >= 60 && total < 70) {
            System.out.println("Nilai dalam huruf  = D, anda remidi" +total);
        } else if (total >= 0 && total < 60) {
            System.out.println("Nilai dalam huruf  = E, anda remidi " +total);
        } else {
            System.out.println("Nilai dalam huruf  = F, anda remidi " +total);
        }

        
    }
}


    
        


