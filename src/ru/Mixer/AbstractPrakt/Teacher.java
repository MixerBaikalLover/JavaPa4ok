package ru.Mixer.AbstractPrakt;

public class Teacher extends Human{
    private String subject;
    private int exp;

    public Teacher(String firstname, String surname, String patronymic, int age, String subject, int exp) {
        super(firstname, surname, patronymic, age);
        this.subject = subject;
        this.exp = exp;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public void work() {
        System.out.print(this.firstname + " " + this.patronymic);
        System.out.println(" Учит студентов");
    }
}

