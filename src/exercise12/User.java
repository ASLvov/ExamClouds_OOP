package exercise12;

/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров.
   Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket.
   Создать объект класса User. (Интернет магазин)
 */

import java.net.PasswordAuthentication;

public class User {
    String login;
    char[] password;
    Basket basket;

    public User(String login, char[] password, Basket basket) {
        this.login = login;
        this.password = password.clone();
        this.basket = basket;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public char[] getPassword() {
        return this.password;
    }

    public void setPassword(char[] password) {
        this.password = password.clone();
    }

    public Basket getBasket() {
        return this.basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
