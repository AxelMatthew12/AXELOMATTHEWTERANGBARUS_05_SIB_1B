package Percobaan;
public class fibonanci {
    
    public static void main(String[] args) {
        int jumlahAngka = 18; 

        System.out.println("Deret Fibonacci dengan " + jumlahAngka + " angka:");
        tampilkanDeretFibonacci(1, jumlahAngka);
    }

    public static void tampilkanDeretFibonacci(int n, int jumlahAngka) {
        if (n < jumlahAngka) {
            System.out.print(fibonacci(n) + " ");
            tampilkanDeretFibonacci(n + 1, jumlahAngka);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}



    
    






    
    

