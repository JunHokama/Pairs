import java.util.ArrayList;
import java.util.List;

public class Function {

    public List<String> findPairs(int n, Integer[] arr) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == n) {
                    // Formato de saída: "{valor1, valor2}"
                    list.add(String.format("{%d, %d}", arr[i], arr[j]));
                }
            }
        }
        return list;
    }
}
