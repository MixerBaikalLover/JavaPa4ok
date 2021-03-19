package ru.Mixer.AbstractPrakt;

import java.util.ArrayList;
import java.util.List;

public class School extends Building {
    private int index;
    private String title;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public School(String address, int floorCount, int index, String title) {
        super(address, floorCount);
        this.index = index;
        this.title = title;
        this.type = BuildingTypeEnum.SOCIAL;
    }

    @Override
    public BuildingTypeEnum getBuildingType() {
        return type;
    }

    public void workAll() {
        for (Student student : students) {
            if (student != null) student.work();
        }
        for (Teacher teacher : teachers) if (teacher != null) teacher.work();
    }

    public boolean addEntity(Human human) {
        if (human != null) {
            if (human instanceof Teacher) {
                teachers.add((Teacher) human);
                return true;
            } else if (human instanceof Student) {
                students.add((Student) human);
                return true;
            }
            System.out.println("Not a school entity");
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", floorCount=" + floorCount +
                ", type=" + type +
                ", index=" + index +
                ", title='" + title + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
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

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}


