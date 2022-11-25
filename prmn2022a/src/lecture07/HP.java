package lecture07;

public class HP {
    private int hp;
    private int dead = 0;


    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public boolean isAlive(){
        if(hp >dead){
            return true;
        }
        else {
            return false;
        }
    }
}
