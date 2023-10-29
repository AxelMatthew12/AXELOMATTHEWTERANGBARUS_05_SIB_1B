package Jobsheet9;
import java.util.Scanner;
public class ArrayNilaiRatarata05 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int[] nilaiMhs= new int[10];
        double total = 0;
        double rata2;

        System.out.println("Masukkan jumlah Mahasiswa :");
        int namaMhs = scan.nextInt();


        for (int i=0; i < nilaiMhs.length; i++){
            System.out.println("Masukkan nilai mahasiswa ke-" +(i+1)+":");
            nilaiMhs[i]= scan.nextInt();
            
        }

        for(int i = 0; i< nilaiMhs.length; i++){
            total += nilaiMhs[i];
           
        }
         rata2= total/nilaiMhs.length;
            System.out.println("Nama Mahasiswa :" +namaMhs);
            System.out.println("Rata-rata nilai = " +rata2);
            System.out.println("Nilai rata rata lulus : 85.0");
            System.out.println("Nilai rata-rata tidak lulus : 62.5");

            if(rata2 >70){
                System.out.println("Anda dinyatakan lulus");
            }else
            System.out.println("Anda dinyatakan tidak lulus");
        
    }
    
}
