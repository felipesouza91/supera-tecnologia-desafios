import java.util.Scanner;

public class ResultadoAlvo {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int count = 0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }
    scan.close();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (arr[i] - arr[j] == k) {
          count++;
        }
      }
    }
    System.out.println("Resultado: " + count);
  }
}