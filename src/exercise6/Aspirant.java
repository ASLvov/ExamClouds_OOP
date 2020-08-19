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

public class Aspirant extends Student {
    String scientificWork;

    public String getScientificWork() {
        return this.scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
        this.scientificWork = scientificWork;
    }

    public Aspirant() {
        this.firstName = "";
        this.lastName = "";
        this.group = "";
        this.averageMark = 0.0;
        this.scientificWork = "";
    }

    public int getScholarship() {
        if (this.averageMark == 5.0)
            return 200;
        else
            return 180;
    }
}
