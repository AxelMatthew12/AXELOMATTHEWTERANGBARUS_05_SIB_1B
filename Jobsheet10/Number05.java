package Jobsheet10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Number05 {
    public static void main(String[] args) {
        // Deklarasi dan instansiasi array 2 dimensi myNumbers
        int[][] myNumbers = {
            {1, 2, 3, 4, 5},    // Baris pertama dengan 5 kolom
            {6, 7, 8},          // Baris kedua dengan 3 kolom
            {9}                 // Baris ketiga dengan 1 kolom
        };

        // Menampilkan isi array
        System.out.println("Isi Array myNumbers:");
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.print(myNumbers[i][j] + " ");
            }
            
            System.out.println(); // Pindah ke baris baru setelah satu baris selesai ditampilkan
        }

        for( int i = 0; i < myNumbers.length;i++){
            System.out.println(Arrays.toString(myNumbers[i]));
        }


        for(int i = 0; i <myNumbers.length; i++){
            System.out.println("Panjang baris ke-" + (i+1) + ":" + myNumbers[i].length);
        }
    }
}
