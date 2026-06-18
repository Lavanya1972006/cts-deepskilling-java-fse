public class LibraryManagementSystem {

    // Linear Search
    public static Book linearSearch(Book[] books, String title) {

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }

    // Binary Search (Books must be sorted by title)
    public static Book binarySearch(Book[] books, String title) {

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = books[mid].title.compareToIgnoreCase(title);

            if (result == 0) {
                return books[mid];
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        // Sorted by title
        Book[] books = {
                new Book(101, "Clean Code", "Robert Martin"),
                new Book(102, "Data Structures", "Seymour Lipschutz"),
                new Book(103, "Java Programming", "Herbert Schildt"),
                new Book(104, "Operating Systems", "Galvin")
        };

        System.out.println("Linear Search Result:");
        Book book1 = linearSearch(books, "Java Programming");

        if (book1 != null) {
            System.out.println(book1);
        } else {
            System.out.println("Book Not Found.");
        }

        System.out.println("\nBinary Search Result:");
        Book book2 = binarySearch(books, "Java Programming");

        if (book2 != null) {
            System.out.println(book2);
        } else {
            System.out.println("Book Not Found.");
        }
    }
}