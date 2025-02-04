    // Main method
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AverageValue avg = new AverageValue();
    String more = "y";

    while (more.equalsIgnoreCase("y")) {
    avg.accumulate(scanner);
    System.out.print("more? (y/n): ");
    more = scanner.next();
    }

    avg.printAverage();
    scanner.close();
    }