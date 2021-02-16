package ru.Mixer.Lab1;

public class EntityPlayer extends Entity {
    protected String nickname;

    public EntityPlayer(long id, String title, double posX, double posZ, boolean aggressive, int maxHealth, int health, int attackDamage, String nickname) {
        super(id, title, posX, posZ, aggressive, maxHealth, health, attackDamage);
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "EntityPlayer{" +
                "nickname='" + nickname + '\'' +
                '}';
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
