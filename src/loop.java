import java.util.ArrayList;
import java.util.List;

public class loop {
    public static List<Integer> loopFunction(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
