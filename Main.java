import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    System.out.println("Online Courier Service");
    System.out.println("1 -> Customer");
    System.out.println("2 -> Employee");
    System.out.println("3 -> Admin");

    Scanner scanner = new Scanner(System.in);
    int userType = scanner.nextInt();

    switch (userType) {
    case 1:
      Customer customer = new Customer();
      customer.customerMenu();
      break;
    case 2:
      DeliveryEmployee employee = new DeliveryEmployee();
      employee.employeeMenu();
      break;
    case 3:
      Admin admin = new Admin();
      admin.adminMenu();
      break;
    default:
      System.out.println("Enter valid input");
      break;
    }
    scanner.close();
  }
}

class Customer {
  private Map < String, String > credentials;

  public Customer() {
    credentials = new HashMap < > ();
    // trail user
    credentials.put("customer123", "pass123");
  }

  public void customerMenu() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome Customer");
    System.out.println("1 -> Old User");
    System.out.println("2 -> New User");
    int customerType = scanner.nextInt();

    switch (customerType) {
    case 1:
      authenticateUser(scanner);
      break;
    case 2:
      registerNewUser(scanner);
      break;
    default:
      System.out.println("Enter valid option");
      break;
    }
    scanner.close();
  }

  private void authenticateUser(Scanner scanner) {
    System.out.print("Enter username: ");
    String enteredUsername = scanner.next();

    System.out.print("Enter password: ");
    String enteredPassword = scanner.next();

    if (credentials.containsKey(enteredUsername) && credentials.get(enteredUsername).equals(enteredPassword)) {
      System.out.println("Authentication successful!");
      // Proceed with customer actions

      System.out.println("1 -> View Order");
      System.out.println("2 -> Add New Order");
      int orderType = scanf.nextInt();
      switch (orderType) {
      case 1:
        ViewOrder viewOrder = new ViewOrder();
        viewOrder.viewOrderMenu();
        break;
      }
    } else {
      System.out.println("Invalid username or password");
    }
  }

  private void registerNewUser(Scanner scanner) {
    System.out.print("Enter new username: ");
    String newUsername = scanner.next();

    if (credentials.containsKey(newUsername)) {
      System.out.println("Username already exists. Try a different username.");
    } else {
      System.out.print("Enter new password: ");
      String newPassword = scanner.next();
      credentials.put(newUsername, newPassword);
      System.out.println("Registration successful!");
      // Proceed with customer actions for the newly registered user
    }
  }

}

class DeliveryEmployee {
  public void employeeMenu() {
    System.out.println("Welcome Employee");
    // Add employee functionalities here
  }
}

class Admin {
  public void adminMenu() {
    System.out.println("Welcome Admin");
    // Add admin functionalities here
  }
}