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

        System.out.println("Александр Грибоедов " + " hashCode = " + author1.hashCode());
        System.out.println("Иван Тургенев " + " hashCode = " +  author2.hashCode());

        System.out.println("Горе от ума " + " hashCode = " + book1.hashCode());
        System.out.println("Отцы и дети " + " hashCode = " + book2.hashCode());

        System.out.println("Сравнение авторов : " + author1.equals(author2) + " (авторы не равны)");
        System.out.println("Сравнение книг : " + book1.equals(book2) + " (книги не равны)");

    }

}