import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Consider an array of integers (positive and negative), nums [].
        // Find all the pairs of integers whose sum is equal to a giver number, N.

        Function function = new Function();

        Integer [] arr = {1,2,3,4,5,6,7,8,9,10};

        List<String> resultado = function.findPairs(10, arr);

        System.out.println(resultado.toString());

    }
}