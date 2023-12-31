import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    ArrayList<String> arrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    int userInput;

    do {
      System.out.print(Menu());
      userInput = scanner.nextInt();

      switch (userInput) {
        case 1:
          System.out.println("$98,345 average salary in South Florida!");
          break;
        case 2:
          System.out.println("US News - 100 Best Jobs!");
          break;
        case 3:
          System.out.println("Top 10 Forbes In-Demand Jobs!");
          break;
        case 4:
          System.out.println("Current Students:");
          FileReader fr = new FileReader("names.txt");
          Scanner fileScanner = new Scanner(fr);
          while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
          }
          fileScanner.close();
          break;
        case 5:
          break;
        default:
          System.out.println("Please select a correct option.");
      }
    } while (userInput != 5);
  }

  // I do not want to remake the menu every TIME!!!!
  static String Menu() {
    return "Press 1 to learn about salary.\nPress 2 to learn about the job.\nPress 3 to learn about demand.\nPress 4 to view current students.\nPress 5 to quit.\n";
  }
}
