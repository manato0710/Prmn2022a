package lecture07;

import java.util.Random;
import java.util.Scanner;

public abstract class EnemyMonster extends BattleMonster{

    public EnemyMonster(IMonster monster){
        super(monster);
    }

    public int skillSelect(){
        Random rand = new Random();
        int sS = rand.nextInt(3);
        return sS;
    }

    public void attackOutput(){
        System.out.println(super.getAttack());
    }

    public void remainHpOutput(){
        System.out.println(super.getHP());
    }

    public void skillListOutput(){
        System.out.println();
    }

    public void winOutput(){

    }

    public void loseOutput(){

    }
}
