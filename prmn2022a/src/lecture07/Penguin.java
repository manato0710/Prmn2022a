package lecture07;

import java.util.List;

public class Penguin extends Monster{
    protected Penguin(String name, int hp, int attack, int defence, int speed, List skills){
        super(name, hp, attack, defence, speed, skills);
    }
}
