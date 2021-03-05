package ru.Mixer.SecondInterfacePrakt;

public class LinkedEntity {
    private static int idCounter = 0;
    final int id = ++idCounter;
    private LinkedEntity child;
    public LinkedEntity() {

    }

    //дойти до элемента у которого child == null и поставить ентити на его место
    public void add(LinkedEntity entity){
        if(this.child == null) child = entity;
        else child.add(entity);
    }

    //дойти до элемента у которого child.id == id, удалить его, но на его место поставить чайлд чайлда
    public boolean delete(int id){
        if(this.contains(id)) {
            if (this.child.id == id) {
                if (child.child == null) {
                    child = null;
                } else {
                    child = child.child;
                }
                return true;
            } else {
                child.delete(id);
            }
        }
     return false;
    }

    //есть ли обьект с таким айди в списке
    public boolean contains(int id){
        LinkedEntity entity = this;
        if(entity.getChild() != null)
        if(entity.id == id){
            return true;
        }
        else{
            return this.child.contains(id);
        }
        else return this.id == id;
       /* LinkedEntity entity = this;
        while(entity.child != null){
            if(this.getId() == id){
                return true;
            }
            else
            {
                entity = entity.getChild();
            }
        }
        return false;*/
    }
    // итоговое количество объектов

    public int size(){
        int i = 1;
        LinkedEntity entity = this;
        while(entity.child != null){
            i++;
            entity = entity.getChild();
        }
        return i;
    }

    @Override
    public String toString() {
        return "LinkedEntity{" +
                "id=" + id +
                ", child=" + child +
                '}';
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        LinkedEntity.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public LinkedEntity getChild() {
        return child;
    }

    public void setChild(LinkedEntity child) {
        this.child = child;
    }
}
