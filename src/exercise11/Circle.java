package exercise11;

public class Circle extends Shape {
    int[][] coordinates;

    public Circle(int[][] coordinates, String color) {
        super(color);
        this.coordinates = coordinates;
    }

    public Circle() {
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
        System.out.println(this.color + " круг");
    }

    public boolean equals(Circle circle) {
        if (this.color == circle.getColor() && this.coordinates == circle.coordinates)
            return true;
        else
            return false;
    }
}
