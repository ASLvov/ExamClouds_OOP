package exercise11;

abstract class Shape {
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

    public abstract void draw();

    public boolean equals(Shape shape) {
        if (this.color == shape.getColor())
            return true;
        else
            return false;
    }
}
