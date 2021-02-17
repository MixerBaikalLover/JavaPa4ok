package ru.Mixer.Lab1;

public class EntityPlayer extends Entity {
    protected String nickname;

    public EntityPlayer(long id, String title, double posX, double posZ, boolean aggressive, int maxHealth, int health, int attackDamage, String nickname) {
        super(id, title, posX, posZ, false, maxHealth, health, attackDamage);
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
        if (GameServer.tick % 2 == 0 && getHealth() < getMaxHealth()){
            setHealth(getHealth() + 1);
        }
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
