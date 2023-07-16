import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class NotasMoedas {
    public static void main(String args[]) {
        Map<Double, Integer> data = new LinkedHashMap <>();
        data.put(100.0, 0);
        data.put(50.0, 0);
        data.put(20.0, 0);
        data.put(10.0, 0);
        data.put(5.0, 0);
        data.put(2.0, 0);
        data.put(1.0, 0);
        data.put(0.50, 0);
        data.put(0.50, 0);
        data.put(0.25, 0);
        data.put(0.10, 0);
        data.put(0.05, 0);
        data.put(0.01, 0);
        Scanner scan = new Scanner(System.in);
        double inputMoney = scan.nextDouble();
        String tipo = "notas";
        System.out.println("NOTAS: ");
        for(Entry<Double, Integer> value: data.entrySet()) {
            int concient = (int) (inputMoney / value.getKey());
            inputMoney =  inputMoney % value.getKey();
            value.setValue(concient);
            if(value.getKey() == 1.0) {
                System.out.println("MOEDAS: ");
                tipo= "moeda";
            }
            String message = String.format("%d %s(s) de R$ %.2f", value.getValue(), tipo, value.getKey());
            System.out.println(message);
            
        }
        scan.close();
    }
}
