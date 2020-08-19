package exercise6;

/*
    Создайте пример наследования, реализуйте класс Student и класс Aspirant,
    аспирант отличается от студента наличием некой научной работы
    а) класс Student содержит переменные:  String firstName, lastName, group.
    А также double averageMark, содержащую среднюю оценку.
    б) Создать переменную типа Student, которая ссылается на объект Aspirant
    в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
       Если средняя оценка студента равна 5, то сумма 100 грн., иначе 80.
       Переопределить этот метод в классе Aspirant. Если  средняя оценка равна 5, то сумма 200 грн.,
       иначе 180.
    г) Содать массив типа Student, содержащий объекты класса Student и Aspirant.
       Вызвать метод getScholarship() для каждого элемента массива
*/

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return this.averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.group = "";
        this.averageMark = 0.0;
    }

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        if (this.averageMark == 5.0)
            return 100;
        else
            return 80;
    }

    public void showInfo() {
        System.out.println("Студент " + this.lastName + " " + this.firstName +
                ". Обучается в группе " + this.group + ". Средний балл: " + this.averageMark);
    }
}
