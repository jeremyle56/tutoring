package example;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        // 6 2 3 4 5, numbers: ["6", "2", "3", "4", "5"]
        int sum = 0;
        // for (int i = 0; i < numbers.length; i++) {
        // sum += Integer.parseInt(numbers[i]);
        // }

        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        System.out.println(sum);
    }
}
