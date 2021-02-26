package ru.Mixer.AbstractPrakt;

import java.util.Arrays;

public class School extends Building {
    private int index;
    private String title;
    private Teacher[] teachers;
    private Student[] students;

    public School(String address, int floorCount, int index, String title, Teacher[] teachers, Student[] students) {
        super(address, floorCount);
        this.index = index;
        this.title = title;
        this.teachers = teachers;
        this.students = students;
        this.type = BuildingTypeEnum.SOCIAL;
    }

    @Override
    public BuildingTypeEnum getBuildingType() {
        return type;
    }

    public void workAll(){
        for (Student student : students){
            if (student != null) student.work();
        }
        for (Teacher teacher : teachers) if (teacher != null) teacher.work();
    }
    public boolean addEntity(Human human){
        if (human != null) {
            if (human instanceof Teacher) {
                for (int i = 0; i < teachers.length; i++) {
                    if (teachers[i] == null) {
                        teachers[i] = (Teacher) human;
                        return true;
                    }
                }
            } else if (human instanceof Student) {
                for (int i = 0; i < students.length; i++) {
                    if (students[i] == null) {
                        students[i] = (Student) human;
                        return true;
                    }
                }
            }
        }
        System.out.println("Not a school entity");
        return false;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", floorCount=" + floorCount +
                ", index=" + index +
                ", title='" + title + '\'' +
                ", teachers=" + Arrays.toString(teachers) +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
