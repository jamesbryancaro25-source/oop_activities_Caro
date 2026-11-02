
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 28, 2026
 */

public class Main {
    public static void main(String[] args) {

        // Create Book objects
        Book book1 = new Book(
            "Noli Me Tangere", "Jose Rizal", "ISBN-001", 350.00
        );

        Book book2 = new Book(
            "El Filibusterismo", "Jose Rizal", "ISBN-002", 320.00
        );

        // Create EBook object
        EBook book3 = new EBook(
            "Florante at Laura", "Francisco Balagtas",
            "ISBN-003", 150.00, "PDF"
        );

        // Display book information
        System.out.println("===== BOOK INFORMATION =====");
        System.out.println();

        book1.displayInfo();
        System.out.println();

        book2.displayInfo();
        System.out.println();

        // Display e-book information
        System.out.println("===== E-BOOK =====");
        System.out.println();

        book3.displayInfo();
        System.out.println();

        // Update book price
        book2.setPrice(299.50);

        // Display updated information
        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println();

        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: " + book2.getPrice());

        /*
         * REFLECTION QUESTIONS
         *
         * 1. Why is it better to change the price through
         *    setPrice() instead of making price public?
         *    Answer: It protects the price from invalid values
         *    because the setter can check if the price is negative.
         *
         * 2. Which members does EBook inherit from Book,
         *    and which does it add on its own?
         *    Answer: EBook inherits the public methods of Book,
         *    including its getters, setters, and displayInfo().
         *    It adds its own private fileFormat attribute and
         *    its getter and setter.
         *
         * 3. If the library later adds an AudioBook class,
         *    how would inheritance make that easier?
         *    Answer: AudioBook can extend Book and reuse its
         *    existing attributes and methods, adding only
         *    the features specific to audiobooks.
         */
    }
}
