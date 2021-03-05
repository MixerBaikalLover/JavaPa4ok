package ru.Mixer.Interface;

public class Dragon extends EntityLiving implements IFlyEntity, IPredator, ISoundEntity {
    public Dragon() {
        super("Драконика", "ну дракон");
    }


    @Override
    public String toString() {
        return "Dragon{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public double getMaxFlyHeight() {
        return 6500;
    }

    @Override
    public double getMaxFlyTime() {
        return Double.MAX_VALUE;
    }

    @Override
    public void hunt(EntityLiving entity) {
        System.out.print(this.title + " Раздраконил " + entity.title);
        System.out.println(" И сказанул: "+ getSound());
    }

    @Override
    public String getSound() {
        return " И ты называл себя драконорожденным?";
    }
}
