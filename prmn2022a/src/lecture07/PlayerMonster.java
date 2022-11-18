package lecture07;

import java.util.Random;
import java.util.Scanner;

public  abstract class PlayerMonster extends BattleMonster{

    public PlayerMonster(IMonster monster){
        super(monster);
    }

    public int skillSelect(){
        Scanner input = new Scanner(System.in);
        int sS = input.nextInt();
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
