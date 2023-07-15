import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParImpar {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();
        int size = scan.nextInt();
        for( int i = 0; i < size; i++) {
            int value = scan.nextInt();
            if( value % 2 == 0) {
                par.add(value);
            } else {
                impar.add(value);
            }
        }
        par.sort(null);
        impar.sort((e1, e2) ->  e2 - e1);
        par.forEach(System.out::println);
        impar.forEach(System.out::println);
    }
}
