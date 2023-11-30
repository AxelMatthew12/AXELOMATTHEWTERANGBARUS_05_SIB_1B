package Percobaan;
public class percobaan2 {
    public static void combineData(String message, int... numbers) {
        System.out.println("Message: " + message);
        
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void combineWords(String message, String... kata) {
        System.out.println("Message: " + message);
        
        System.out.print("Words: ");
        for (String word : kata) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        combineData("Combining Numbers:", 1, 2, 3);
        combineWords("Combining Words:", "Hello", "World");
    }
}
