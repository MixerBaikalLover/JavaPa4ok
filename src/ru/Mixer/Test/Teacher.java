package ru.Mixer.Test;

import java.util.Arrays;

public class Teacher {
    private String name;
    private String subject;
    private int exp;
    private Group[] groups;

    public Teacher(String name, String subject, int exp, Group[] groups) {
        this.name = name;
        this.subject = subject;
        this.exp = exp;
        this.groups = groups;
    }

    public Teacher(String name, String subject, int exp, int groupsCount){
        this(name, subject, exp, new Group[groupsCount] );
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", exp=" + exp +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }

    public boolean hasGroup(String g){

        for (int i = 0; i< groups.length; i++ ){
            if(groups[i].getTitle() != null){

            if( groups[i].getTitle().equals(g) ){
                return true;
            }
        }}
        return false;
    }
    public boolean removeGroup(String title){
        for (int i = 0; i< groups.length; i++ ){
            if(groups[i] != null ){
            if( groups[i].getTitle().equals(title)){
                groups[i] = null;

                return true;
            }}
        }
        return false;
    }
    public boolean addGroup(Group group){
        for (int i = 0; i< groups.length ; i++ ){
            if( groups[i].getTitle() == null ){
                groups[i]=  group;
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }
}
