import java.util.*;

public class Listas {

    // somar uma lista de valores

    public static int somar(List<Integer> lista) {
        int total = 0;
        for (int i: lista) {
            total = total + i;
            //lista.add(2);
            // lista.add(new Integer(2));
        }
        return total;
    }
  
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(3);
        lista.add(4);
        somar(lista);
    }
}
