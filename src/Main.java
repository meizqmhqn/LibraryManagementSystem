public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "12345");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "67890");

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("Are books equal? " + book1.equals(book2));
    }
}
