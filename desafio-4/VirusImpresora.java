import java.util.Scanner;

public class VirusImpresora {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = Integer.parseInt(scanner.nextLine());
    String[] lines = new String[size];
    String correctOrder;
    String fraseCorreta;
    for (int i = 0; i < size; i++) {
      lines[i] = scanner.nextLine();
    }

    System.out.println("Saidas");
    
    for (int i = 0; i < size; i++) {
      correctOrder = lines[i].substring(lines[i].length() / 2, lines[i].length())
          + lines[i].substring(0, lines[i].length() / 2);
      fraseCorreta = "";
      for (int j = correctOrder.length() - 1; j >= 0; j--) {
        fraseCorreta += correctOrder.charAt(j);
      }
      System.out.println(fraseCorreta);
    }

    scanner.close();
  }
}
