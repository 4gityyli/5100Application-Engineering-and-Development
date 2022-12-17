//(a) Write a generic method to count the number of elements in a collection that have a specific property (for example, odd integers, prime numbers, palindromes)
import java.util.List;
public class MainA {

    public static <T extends Comparable<T>> T findMax(List<T> list, int begin, int end) {
        T max = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T element = list.get(i);
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
