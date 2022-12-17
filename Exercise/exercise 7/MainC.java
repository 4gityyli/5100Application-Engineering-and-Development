//(c) A generic method to find the maximal element in the range [begin, end) of a list:
import java.util.List;

public class MainC {

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
