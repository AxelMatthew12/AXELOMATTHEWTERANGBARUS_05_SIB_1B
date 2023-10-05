import java.util.Scanner;
public class Pemilihan2Percobaan2No5 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        float totalSudut;
        

        System.out.println("===SELAMAT DATANG===");
        System.out.println("Masukkan sudut1=     ");
        float sudut1=input00.nextInt();
        System.out.println("Masukkan sudut2=     ");
        float sudut2=input00.nextInt();
        System.out.println("Masukkan sudut3=     ");
        float sudut3=input00.nextInt();

         totalSudut = sudut1 + sudut2 + sudut3;
        //rumus
        if(totalSudut == 180){
           { if((sudut1 == 60) || (sudut2 == 30) || (sudut3 == 90)) 
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");}
            
            {if((sudut1== 60) || (sudut2 == 60) || (sudut3 == 60))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");}
            {if((sudut1 == 90) || (sudut2 == 60) || (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");} }
            
            else{
            System.out.println("Merupakan segitiga sembarang");
        }
        {
        else
        System.out.println("Bukkan merupakaan segitiga");}
        


        }

        


    }
    

