package ru.Mixer.lab2;


import java.util.ArrayList;
import java.util.List;

public class Entity {
    public static final String ANSI_RED = "\u001B[31m";   // Цвета
    public static final String ANSI_RESET = "\u001B[0m";  //    Для вывода
    private static int idCounter = 1;
    private final long id;
    private String title;
    private  double posX;
    private double posZ;
    private boolean aggressive;
    private int maxHealth;
    private int health;
    private int attackDamage;
    private Entity target;
    private World world;
    private double distance;

    public void searchTarget(){
        List<Entity> nearby = new ArrayList<>();
        nearby = world.getEntitiesNearEntity(this, 20);
        for(int i = 0; i < nearby.size(); i++){
            if(!nearby.get(i).aggressive) target = nearby.get(i);
        }
    }

    public Entity( String title, double posX, double posZ, boolean aggressive, int maxHealth, int health, int attackDamage, World world) {
        this.id = idCounter;
        idCounter ++;
        this.title = title;
        this.posX = posX;
        this.posZ = posZ;
        this.aggressive = aggressive;
        this.maxHealth = maxHealth;
        this.health = health;
        this.attackDamage = attackDamage;
        this.world = world;
    }

    public Entity(long id) {
        this.id = id;
    }

    public void update(){
        if(aggressive){
            if (target == null) this.searchTarget();
            if (target==null) return;
            if (target.posX > posX) posX++;
            else if (target.posX < posX) posX--;
            if (target.posZ > posZ) posZ++;
            else if (target.posZ < posZ) posZ--;
            if (distance < 2) attack(target);
        }
        /*for(int i = GameServer.getInstance().getServerWorld().getEntities().size() - 1; i >= 0; i--){
            if ( GameServer.getInstance().getServerWorld().getEntities().get(i) != null && !GameServer.getInstance().getServerWorld().getEntities().get(i).aggressive )
            {
                double entityX = GameServer.getInstance().getServerWorld().getEntities().get(i).getPosX();
                double entityZ = GameServer.getInstance().getServerWorld().getEntities().get(i).getPosZ();
                double distance = Math.sqrt(Math.pow((posX - entityX),2) + Math.pow((posZ - entityZ),2));
                if (distance <= 20){
                    this.posX = this.posX + (entityX - this.posX) / distance * 1;
                    this.posZ = this.posZ + (entityZ - this.posZ) / distance * 1;

                    }
                if (distance <= 2){
                    this.attack(GameServer.getInstance().getServerWorld().getEntities().get(i));
                    }
                }

            }
        }*/
    }




    public void attack(Entity entity){
        if (entity instanceof EntityPlayer){
            entity.setHealth((int) (entity.getHealth() - getAttackDamage() + 0.5 * GameServer.getInstance().getDifficulty()));
            System.out.println(this.title + ANSI_RED +  " attacked " + ANSI_RESET + ((EntityPlayer) entity).nickname + " for " + this.getAttackDamage() + " dmg.");
            if (entity.getHealth() > 0) entity.attack(this);
        } else{
            entity.setHealth((int) (entity.getHealth() - getAttackDamage() + 0.5 * GameServer.getInstance().getDifficulty()));
            System.out.println(this.title + ANSI_RED +  " attacked " + ANSI_RESET + entity.title + " for " + this.getAttackDamage() + " dmg.");
            }
            if (entity.getHealth() <= 0){
                System.out.println(entity.getTitle() + " Was slain by " + this.getTitle());
                this.target = null;
            }
        }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", posX=" + posX +
                ", posZ=" + posZ +
                ", aggressive=" + aggressive +
                ", maxHealth=" + maxHealth +
                ", health=" + health +
                ", attackDamage=" + attackDamage +
                ", target=" + target +
                ", world=" + world +
                '}';
    }

    public Entity getTarget() {
        return target;
    }

    public void setTarget(Entity target) {
        this.target = target;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Entity.idCounter = idCounter;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosZ() {
        return posZ;
    }

    public void setPosZ(double posZ) {
        this.posZ = posZ;
    }

    public boolean isAggressive() {
        return aggressive;
    }

    public void setAggressive(boolean aggressive) {
        this.aggressive = aggressive;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

}
