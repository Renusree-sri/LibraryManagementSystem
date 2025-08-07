🔹 Step 1: Create Project Folder and Files

    Create a folder named LibraryManagementSystem

    Open it in VS Code (File > Open Folder)

    Inside the folder, create these Java files:

        Book.java

        User.java

        Library.java

        Main.java

🔹 Step 2: Write Book.java

public class Book {
    int id;
    String title;
    boolean isIssued;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
    }

    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Issued: " + isIssued);
    }
}

🔹 Step 3: Write User.java

public class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("User ID: " + id + ", Name: " + name);
    }
}

🔹 Step 4: Write Library.java

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added.");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book b : books) {
                b.display();
            }
        }
    }

    public void showUsers() {
        if (users.isEmpty()) {
            System.out.println("No users found.");
        } else {
            for (User u : users) {
                u.display();
            }
        }
    }

    public void issueBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book issued.");
                } else {
                    System.out.println("Book already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(int bookId) {
        for (Book b : books) {
            if (b.id == bookId) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book returned.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

🔹 Step 5: Write Main.java

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

✅ Step 6: Compile and Run the Project
Open terminal in VS Code (Terminal > New Terminal)
🔹 Compile:

javac *.java

🔹 Run:

java Main

✅ Example Output (Console)

--- Library Menu ---
1. Add Book
2. Add User
3. Show Books
4. Show Users
5. Issue Book
6. Return Book
7. Exit
Enter choice: 1
Enter Book ID: 101
Enter Book Title: Java Basics
Book added.