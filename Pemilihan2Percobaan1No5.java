import java.util.Scanner;
public class Pemilihan2Percobaan1No5{
    public static void main(String[] args) {

        //masukkan
        Scanner input00= new Scanner(System.in);
        System.out.println("===SELAMAT DATANG===");
        System.out.println("Masukkan Tahun:     ");
        int tahun = input00.nextInt();

        System.out.println("Tahun adalah :  "+tahun);
        if((tahun % 4)== 0) {
            if((tahun % 100)==0){
                
            }
            System.out.println("Tahun Kabisat");
        } else
        System.out.println("Bukan Tahun Kabisat");
}
}