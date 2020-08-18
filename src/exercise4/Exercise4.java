package exercise4;

import java.util.Date;

public class Exercise4 {
    public static void main(String[] args) {
        String[] names = {"Иванов Иван Иванович", "Петров Петр Петрович", "Львов Александр Сергеевич",
                "Козлов Василий Геннадьевич", "Петросян Евгений Ваганович"};
        int[] ticketNumbers = {777, 362, 341, 878, 1001};
        String[] facilities = {"ФМИТ", "ЭЭФ", "ФЭУ", "ФЖ", "ФПБИ"};
        Date[] dates = {new Date(2000, 11, 3), new Date(1962, 0, 28),
                new Date(1995, 5, 1), new Date(), new Date(1982, 8, 16),
                new Date(1958, 4, 11)};
        String[] phoneNumbers = {"89878622241", "89052563124", "89534527835", "89226217455", "89223214747"};
        Reader[] readers = new Reader[5];
        for (int i = 0; i < 5; i++)
            readers[i] = new Reader(names[i], ticketNumbers[i], facilities[i], dates[i], phoneNumbers[i]);
        Book[] books = {new Book("Преступление и наказание", "Достоевский Федор Михайлович"),
                new Book("Идиот", "Достоевский Федор Михайлович"),
                new Book("Война и мир", "Толстой Лев Николаевич"),
                new Book("Пиковая дама", "Пушкин Александр Сергеевич"),
                new Book("Капитанская дочка", "Пушкин Александр Сергеевич")};
        readers[0].takeBook(3);
        readers[1].takeBook("Ведьмак", "Теория относительности");
        readers[2].takeBook(books[1], books[3], books[4]);
        readers[2].returnBook(books[3]);
        readers[0].setFIO("Лукашенко Иван Иванович");
        readers[0].returnBook(1);
    }
}
