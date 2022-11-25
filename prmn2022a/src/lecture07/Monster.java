package lecture07;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IMonster{
    private String name;
    private HP hp;
    private int attack;
    private int defense;
    private int speed;
    private List<Skill> skills = new ArrayList<>();

    protected Monster(String name, int hp, int attack, int defence, int speed, List skills){
        this.name = name;
        this.hp = new HP();
        this.hp.setHp(hp);
        this.attack = attack;
        this.defense = defence;
        this.speed = speed;
        this.skills = skills;
    }

    protected Monster(IMonster monster){
        super();
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.hp.getHp();
    }

    public void setHP(int hp){
        this.hp.setHp(hp);
    }

    public int getAttack(){
        return this.attack;
    }

    public int getDefense(){
        return this.defense;
    }

    public boolean isAlive(){
        if(this.hp.getHp() > 0){
            return true;
        }
        else{
            return false;
        }
    }
}

