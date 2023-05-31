package task.five;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of numbers: " + sum);
    }
}



