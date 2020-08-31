package exercise11;

public class Exercise11 {
    public static void main(String[] args) {
        int[][] arrayCircle = new int[2][20];
        int[][] arrayRectangle = new int[2][10];
        Circle circle = new Circle(arrayCircle, "Красный");
        Rectangle rectangle = new Rectangle(arrayRectangle, "Синий");
        Shape[] shapes = {circle, rectangle};
        for (Shape s : shapes)
            s.draw();
        Circle circle1 = new Circle(arrayCircle, "Коричневый");
        Rectangle rectangle1 = new Rectangle(arrayRectangle, "Синий");
        if (circle.equals(circle1))
            System.out.println("Фигуры эквивалентны");
        else
            System.out.println("Фигуры не эквивалентны");
        if (rectangle.equals(rectangle1))
            System.out.println("Фигуры эквивалентны");
        else
            System.out.println("Фигуры не эквивалентны");
        if (circle.equals(rectangle1))
            System.out.println("Фигуры эквивалентны");
        else
            System.out.println("Фигуры не эквивалентны");
    }
}
