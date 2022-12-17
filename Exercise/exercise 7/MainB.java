//(b) Write a generic method to exchange the positions of two different elements in an array.
public class MainB {

public static <T> void exchangeElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
