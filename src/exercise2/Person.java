package exercise2;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.age = 0;
        this.fullName = "";
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " двигается");
    }

    public void talk(String str) {
        System.out.println(this.fullName + " говорит: " + str);
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
