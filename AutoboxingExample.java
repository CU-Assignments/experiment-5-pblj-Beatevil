import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {
    public static void main(String[] args) {
        String[] numberStrings = {"10", "20", "30", "40", "50"};

        // Convert String array to Integer list
        List<Integer> numbers = parseStringArrayToIntegers(numberStrings);

        // Calculate sum of numbers
        int sum = calculateSum(numbers);

        System.out.println("The sum of the numbers is: " + sum);
    }

    // Method to parse an array of Strings into a List of Integers
    public static List<Integer> parseStringArrayToIntegers(String[] strings) {
        List<Integer> integerList = new ArrayList<>();
        for (String str : strings) {
            integerList.add(Integer.parseInt(str)); // Autoboxing: int → Integer
        }
        return integerList;
    }

    // Method to calculate the sum of all integers in the list
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing: Integer → int
        }
        return sum;
    }
}
