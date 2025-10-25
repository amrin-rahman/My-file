import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of arrays: ");
        int n = scan.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] sum = new int[n];
        int[] sub = new int[n];
        int[] mul = new int[n];
        double[] div = new double[n];

        System.out.println("\nEnter elements of first array: ");
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }

        System.out.println("\nEnter elements of second array: ");
        for (int i = 0; i < n; i++) {
            B[i] = scan.nextInt();
        }

        // Calculations
        for (int i = 0; i < n; i++) {
            sum[i] = A[i] + B[i];
            sub[i] = A[i] - B[i];
            mul[i] = A[i] * B[i];
            if (B[i] != 0)
                div[i] = (double) A[i] / B[i];
            else
                div[i] = Double.NaN;
        }

        // Display results
        System.out.println("\nSum of two arrays: ");
        for (int x : sum)
            System.out.print(x + " ");

        System.out.println("\n\nSubtraction of two arrays: ");
        for (int x : sub)
            System.out.print(x + " ");
        System.out.println("\n\nMultiplication of two arrays: ");
        for (int x : mul)
            System.out.print(x + " ");
        System.out.println("\n\nDivision of two arrays: ");
        for (double x : div)
            System.out.print(x + " ");

        scan.close();
    }
}
