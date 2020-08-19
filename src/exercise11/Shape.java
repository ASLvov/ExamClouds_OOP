package exercise11;

public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        this.color = "";
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println(this.color + " фигура");
    }

    public boolean equals(Shape shape) {
        if (this.color == shape.getColor())
            return true;
        else
            return false;
    }
}
