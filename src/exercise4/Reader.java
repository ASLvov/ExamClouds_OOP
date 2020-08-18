package exercise4;

import java.util.Date;

public class Reader {
    String FIO;
    int ticketNumber;
    String facility;
    Date birthday;
    String phoneNumber;

    public String getFIO() {
        return this.FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getTicketNumber() {
        return this.ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFacility() {
        return this.facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Reader(String FIO, int ticketNumber, String facility, Date birthday, String phoneNumber) {
        this.FIO = FIO;
        this.ticketNumber = ticketNumber;
        this.facility = facility;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public String fullNameToInitials() {
        String output = "";
        for (int i = 0; i < 3; i++) {
            if (i == 0)
                output += this.FIO.split(" ")[i] + " ";
            else
                output += this.FIO.split(" ")[i].charAt(0) + ".";
        }
        return output;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullNameToInitials() + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... books) {
        System.out.print(fullNameToInitials() + " взял книги: ");
        for (String book : books)
            System.out.print(book + ", ");
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullNameToInitials() + " взял книги: ");
        for (Book book : books)
            System.out.print(book.name + ", ");
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullNameToInitials() + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... books) {
        System.out.print(fullNameToInitials() + " вернул книги: ");
        for (String book : books)
            System.out.print(book + ", ");
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullNameToInitials() + " вернул книги: ");
        for (Book book : books)
            System.out.print(book.name + ", ");
        System.out.println();
    }
}
