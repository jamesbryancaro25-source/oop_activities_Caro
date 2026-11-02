
/*
 * Name: James Bryan G. Caro
 * Section: IT2B
 * Date: October 28, 2026
 */

public class EBook extends Book {
    private String fileFormat;

    // Constructor
    public EBook(String title, String author, String isbn,
                 double price, String fileFormat) {
        super(title, author, isbn, price);
        this.fileFormat = fileFormat;
    }

    // Getter
    public String getFileFormat() {
        return fileFormat;
    }

    // Setter
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    // Override displayInfo()
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + fileFormat);
    }
}
