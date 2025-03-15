package MatrixDesign;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // declare the scanner
        System.out.println("Number of variable");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // start process looping with i and j
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1 || i + j == n - 1) { // print - if : j <= i && i + j < n - 1
                    System.out.print("-" + "\t");
                } else if (j <= i && i + j < n - 1) { // print a if : j <= i && i + j < n - 1
                    System.out.print("A" + "\t");
                } else if (i + j < n - 1) { // print b if : i + j < n - 1
                    System.out.print("B" + "\t");
                } else if (j <= i) { // print c if : j <= i
                    System.out.print("C" + "\t");
                } else if (j >= i) { // print d if : j >= i OR you can you else
                    System.out.print("D" + "\t");
                }
            }
            // print new line once the j looping is done
            System.out.println(" ");
        }
    }
}