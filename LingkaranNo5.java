import java.util.Scanner;
public class LingkaranNo5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas, Phi=3.14;
        System.out.println("Masukkan jari-jari lingkaran");
        r=input.nextInt();
        keliling=2*3.14*r;
        luas=Phi*r*r;
        System.out.println(keliling);
        System.out.println(luas);

    }
    
}
