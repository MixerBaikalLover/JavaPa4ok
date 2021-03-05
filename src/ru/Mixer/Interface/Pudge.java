package ru.Mixer.Interface;

public class  Pudge extends EntityLiving implements IPredator, ISoundEntity {
    public Pudge() {
        super("Падж", "Мясник");
    }

    @Override
    public String toString() {
        return "Pudge{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void hunt(EntityLiving entity){
        System.out.print(this.title +" Зафрешмитил кого его " + entity.title);
        System.out.println(" И сказанул: "+ getSound());
    }
    @Override
    public String getSound() {
        return "Chin chopper chin chopper( чинь чёпа) )";
    }
}
