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

public class Exercise6 {
    public static void main(String[] args) {
        Student student1 = new Student("Александр", "Львов", "12КЗОИ", 5.0);
        Student student2 = new Student("Мария", "Кондрашкина", "12КЗОИ", 4.9);
        student2.showInfo();
        student2.setLastName("Львова");
        student2.showInfo();
        System.out.println("Студент " + student1.getLastName() + " получает стипендию " + student1.getScholarship() + " грн.");
        System.out.println("Студент " + student2.getLastName() + " получает стипендию " + student2.getScholarship() + " грн.");

        //б

        Student student3 = new Aspirant("John", "Brown", "13ИВТ", 3.7, "Период полураспада урана");

        //г

        Student[] students = {student1, student2, student3};
        for (Student s:students)
            System.out.println("Студент " + s.getLastName() + " получает стипендию " + s.getScholarship() + " грн.");
    }
}
