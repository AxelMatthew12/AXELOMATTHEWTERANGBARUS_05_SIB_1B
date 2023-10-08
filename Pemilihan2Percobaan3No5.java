import java.util.Scanner;
public class Pemilihan2Percobaan3No5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kategori;
        int penghasilan;
        double pajak;
        int gajiBersih;
        
        System.out.print("Masukan kategori : ");
        kategori = input.nextLine();
        System.out.print("Masukan penghasilan : ");
        penghasilan = input.nextInt();

        if (kategori.equals("pekerja")) {

            if (penghasilan <= 2000000 ){
                pajak = 0.1;
            } 
            else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } 
            else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } 
        else if (kategori.equalsIgnoreCase("pebisnis")){
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } 
            else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } 
            else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        }else {
            System.out.println("Kategori salah");
        }


    }
}
