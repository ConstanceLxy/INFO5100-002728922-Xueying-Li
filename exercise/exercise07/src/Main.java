import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    // Method (a)
    public static <T> long countElementsByProperty(Collection<T> collection, Predicate<T> property) {
        return collection.stream().filter(property).count();
    }

    // Method (b)
    public static <T> List<T> swapElements(List<T> list, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= list.size() || index2 >= list.size()) {
            throw new IllegalArgumentException("Invalid indices");
        }

        List<T> swappedList = list.stream().collect(Collectors.toList());
        T temp = swappedList.get(index1);
        swappedList.set(index1, swappedList.get(index2));
        swappedList.set(index2, temp);

        return swappedList;
    }

    // Method (c)
    public static <T> T findMaxInRange(List<T> list, int begin, int end, Comparator<T> comparator) {
        if (begin >= end || begin < 0 || end > list.size()) {
            throw new IllegalArgumentException("Invalid range");
        }

        return list.subList(begin, end).stream().max(comparator).orElse(null);
    }

    // Example usage
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Method (a) example
        long oddCount = countElementsByProperty(numbers, n -> n % 2 != 0);
        System.out.println("Number of odd integers: " + oddCount);

        // Method (b) example
        List<Integer> swappedNumbers = swapElements(numbers, 2, 7);
        System.out.println("Swapped elements: " + swappedNumbers);

        // Method (c) example
        Integer maxInRange = findMaxInRange(numbers, 2, 6, Comparator.naturalOrder());
        System.out.println("Maximal element in range [2, 6): " + maxInRange);
    }
}
