package ru.Mixer.Test;

public class Main {
    public static void main(String[] args) {
        /*Student student1 = new Student("vasya", 2, 3);
        student1.getMarks()[0] = 3;
        student1.getMarks()[1] = 2;
        student1.getMarks()[2] = 3;
        System.out.println(student1)*/
        Teacher pudj = new Teacher(
                "Pudge",
                "Butchery",
                99,
                new Group[]{
                        new Group("Y2333", 25),
                        new Group("Y2335", 16)
                }
        );
        Teacher teach = new Teacher(
          "name", "math", 99,
          3
        );
        System.out.println(pudj);
        pudj.removeGroup("Y2333");
        System.out.println(pudj);
        pudj.addGroup(new Group("Y2333", 120));
        System.out.println(pudj);
    }
}