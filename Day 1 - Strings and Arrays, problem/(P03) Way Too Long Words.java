import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // There is a space from the \n so this is to consume it idk bro
        String[] arr = new String[n];
        for(int i = 0;  i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        for(int j = 0; j < n; j++) {
            //String hadToMakeThisForChar = arr[j];
            if (arr[j].length() == 0) {
                continue;
            }
            else if (arr[j].length() > 10) {
                System.out.println("" + arr[j].charAt(0) + (arr[j].length() - 2) + arr[j].charAt(arr[j].length() -1));
            }
            else {
                System.out.println(arr[j]);
            }
        }
        scanner.close();
    }
}
