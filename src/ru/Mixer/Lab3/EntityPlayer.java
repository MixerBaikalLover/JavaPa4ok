package ru.Mixer.Lab3;

public class EntityPlayer extends Entity {
    protected String nickname;
    public static final String ANSI_GREEN = "\u001B[32m";   // Цвета
    public static final String ANSI_RESET = "\u001B[0m";   //    Для вывода
    public EntityPlayer(String title, double posX, double posZ, int maxHealth, int health, int attackDamage, World world , String nickname) {
        super(title, posX, posZ, false, maxHealth, health, attackDamage, world);
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
            System.out.println(this.nickname + ANSI_GREEN + " Отхилился на одну хепешку" + ANSI_RESET );
        }
    }
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
