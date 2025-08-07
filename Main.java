import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Show Books");
            System.out.println("4. Show Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    library.addBook(new Book(bookId, title));
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(userId, name));
                    break;
                case 3:
                    library.showBooks();
                    break;
                case 4:
                    library.showUsers();
                    break;
                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;
                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 7:
                    running = false;
                    System.out.println("Exiting Library System.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
