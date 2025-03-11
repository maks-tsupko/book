public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Александр ", "Грибоедов");
        System.out.println(author1.toString());
        Author author2 = new Author("Иван ", "Тургенев");
        System.out.println(author2.toString());

        Book book1 = new Book(author1, 1822, "Горе от ума" );
        Book book2 = new Book(author2, 1860, "Отцы и дети");

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book1.setYearPublication(1900);
        System.out.println(book1.toString());
    }

}