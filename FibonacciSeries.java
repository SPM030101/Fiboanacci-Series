public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 25;
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + limit + ":");

        // Print the first number
        System.out.print(first + " ");

        // Print the second number if within limit
        if (second <= limit) {
            System.out.print(second + " ");
        }

        int next = first + second;

        // Generate and print the next numbers in the series
        while (next <= limit) {
            System.out.print(next + " ");
            first = second;
            second = next;
            next = first + second;
        }

        System.out.println(); // For newline
    }
}
