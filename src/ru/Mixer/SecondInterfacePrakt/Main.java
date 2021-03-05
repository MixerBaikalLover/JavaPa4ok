package ru.Mixer.SecondInterfacePrakt;

public class Main {
    public static void main(String[] args){
        LinkedEntity spisok = new LinkedEntity();
        spisok.add(new LinkedEntity());
        spisok.add(new LinkedEntity());
        spisok.add(new LinkedEntity());
        spisok.add(new LinkedEntity());
        spisok.add(new LinkedEntity());
        System.out.println(spisok);
        System.out.println( spisok.delete(7));
        System.out.println(spisok);
        System.out.println(spisok.contains(5));
        System.out.println(spisok.size());
    }
}
