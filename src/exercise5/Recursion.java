package exercise5;

public class Recursion {
    int a;
    int b;

    private String fromMinToMax(int min, int max) {
        String result = "";
        if (min == max)
            return String.valueOf(max);
        else
            result = result + String.valueOf(min) + " " + fromMinToMax(min + 1, max) + " ";
        return result;
    }

    private String fromMaxToMin(int max, int min) {
        String result = "";
        if (min == max)
            return String.valueOf(min);
        else
            result = result + String.valueOf(max) + " " + fromMaxToMin(max - 1, min) + " ";
        return result;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return this.b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Recursion(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printNums() {
        if (this.a < this.b)
            System.out.println(fromMinToMax(this.a, this.b));
        else
            System.out.println(fromMaxToMin(this.a, this.b));
    }
}
