import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> numbers;
        try {
            numbers = new TreeMap<>();
            Scanner scanner = new Scanner(new File("liczby.txt"));
            int number;
            while (scanner.hasNextLine()) {
                number = scanner.nextInt();
                numbers.put(number, numbers.getOrDefault(number, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
                System.out.println(entry.getKey() + " - liczba wystąpień " + entry.getValue());
                scanner.close();
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        }
    }
}