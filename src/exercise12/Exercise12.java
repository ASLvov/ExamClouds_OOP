package exercise12;

/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров.
   Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket.
   Создать объект класса User. (Интернет магазин)
 */

public class Exercise12 {
    public static void main(String[] args) {
        Product tshirt = new Product("Майка", 500, 5.0);
        Product jacket = new Product("Пиджак", 2500, 4.8);
        Product ball = new Product("Мяч", 799, 4.2);
        Category clothes = new Category("Одежда", new Product[]{tshirt, jacket});
        Category sport = new Category("Спортивные товары", new Product[]{ball});
        Basket basket = new Basket(new Product[]{tshirt, ball});
        User user1 = new User("LvovAS", new char[]{'q', 'w', 'e', 'r', 't', 'y'}, basket);

        System.out.println("Товары в корзине пользователя " + user1.getLogin() + ": ");
        int i = 0;
        for (Product pr : user1.getBasket().products) {
            System.out.print(++i + ") ");
            pr.printInfo();
        }
    }
}
