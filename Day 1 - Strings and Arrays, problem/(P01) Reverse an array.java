import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] revArr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            revArr[n - j - 1] = arr[j];
        }
        for (int k = 0; k < n; k++) {
            System.out.print(revArr[k] + " ");
        }
        scanner.close();
    }
}
