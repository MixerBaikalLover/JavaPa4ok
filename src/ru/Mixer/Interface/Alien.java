package ru.Mixer.Interface;

public class Alien extends EntityLiving implements ISoundEntity, IFlyEntity, IPredator {
    public Alien() {
        super("Инопрешиленец", "ну пришелец");
    }

    @Override
    public String toString() {
        return "Alien{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public double getMaxFlyHeight() {
        return 120;
    }

    @Override
    public double getMaxFlyTime() {
        return 60;
    }

    @Override
    public void hunt(EntityLiving entity) {
        System.out.print(this.title +" Задушил тентаклями " + entity.title);
        System.out.println(" И сказанул: "+ getSound());
    }

    @Override
    public String getSound() {
        return "你是拍马屁"; //ты жополиз
    }
}
