package exercise11;

public class Rectangle extends Shape {
    int[][] coordinates;

    public Rectangle(int[][] coordinates, String color) {
        super(color);
        this.coordinates = coordinates;
    }

    public Rectangle() {
        super();
        this.coordinates = new int[0][0];
    }

    public int[][] getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(int[][] coordinates) {
        this.coordinates = coordinates;
    }

    public void draw() {
        System.out.println(this.color + " прямоугольник");
    }

    public boolean equals(Rectangle rectangle) {
        if (this.color == rectangle.getColor() && this.coordinates == rectangle.coordinates)
            return true;
        else
            return false;
    }
}
