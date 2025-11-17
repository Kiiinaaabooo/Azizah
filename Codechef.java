import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // jumlah test case

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // jumlah problem
            int[] difficulties = new int[N]; // array untuk simpan rating

            for (int i = 0; i < N; i++) {
                difficulties[i] = sc.nextInt();
            }

            int countRemove = 0;
            for (int i = 0; i < N; i++) {
                if (difficulties[i] >= 1000) {
                    countRemove++;
                }
            }

            System.out.println(countRemove);
        }

        sc.close();
    }
}