package FlyWeight;

public class Hero implements IPlayer{
    private final String task;

    private String weapon;

    public Hero() {
        this.task = "kill enemy";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon=weapon;
    }
    @Override
    public String toString(){
        return "Hero {" +
                "task='" + task + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
