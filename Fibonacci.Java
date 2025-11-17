import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int a = 0, b = 1, c = 0, total = 0;
        
        while (c < (1 << n)) { 
            if (c % 2 == 1) { 
                total += c;
            }
            
            c = a + b;
            a = b;
            b = c;
        }
        
        System.out.println("Jumlah bilangan Fibonacci ganjil hingga batas: " + total);
    }
}