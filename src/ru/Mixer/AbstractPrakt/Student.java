package ru.Mixer.AbstractPrakt;

public class Student extends Human{


    private int level;
    public Student(String firstname, String surname, String patronymic, int age, int level) {
        super(firstname, surname, patronymic, age);
        this.level = level;
    }
    public void work(){
        System.out.println(this.firstname + " " + this.patronymic);
        System.out.println("Сдает долги");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", level=" + level +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
