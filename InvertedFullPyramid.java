import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        printInvertedFullPyramid(rows);
        
        scanner.close();
    }
    
    public static void printInvertedFullPyramid(int rows) {
     
        for (int i = rows; i >= 1; i--) {
        
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
