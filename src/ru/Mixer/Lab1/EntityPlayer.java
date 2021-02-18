package ru.Mixer.Lab1;

public class EntityPlayer extends Entity {
    protected String nickname;

    public EntityPlayer(String title, double posX, double posZ, int maxHealth, int health, int attackDamage, String nickname) {
        super(title, posX, posZ, false, maxHealth, health, attackDamage);
        this.nickname = nickname;
    }


    @Override
    public String toString() {
        super.toString();
            return
                     super.toString() + ("EntityPlayer{" +
                "nickname='" + nickname + '\'' +
                '}');
    }

    public void update(){
        super.update();
        if (GameServer.getInstance().getTick() % 2 == 0 && getHealth() < getMaxHealth()){
            setHealth(getHealth() + 1);
            System.out.println(this.nickname + " Отхилился на одну хепешку");
        }
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
