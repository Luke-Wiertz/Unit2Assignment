import java.util.Scanner;

public class AverageValue {
    private final double MIN = 0.5;
    private final double MAX = 5.0;
    private double cumulativeValue = 0;
    private int count = 0;

    // Method calculates values
    public void accumulate(Scanner scanner) {
    count++;
    System.out.println("Item number " + count + ":");
    double value = inputValue(scanner, MIN, MAX);
    cumulativeValue += value;
    }

    // Input validation method
    private double inputValue(Scanner scanner, double min, double max) {
    double value = 0;
    while (true) {
    System.out.print("Enter value (" + min + " < value < " + max + "): ");
    try {
    value = Double.parseDouble(scanner.next());
    if (value > min && value < max) {
    break;
    } else {
    System.out.println("Value out of range. Please try again.");
    }
    } catch (NumberFormatException ignore) {
    System.out.println("Invalid input. Please enter a valid number.");
    }
    }
    return value;
    }

    // Prints average
    public void printAverage() {
    if (count > 0) {
    double average = cumulativeValue / count;
    System.out.println("Average value = " + average);
    } else {
    System.out.println("No values were entered.");
    }
    }
}
