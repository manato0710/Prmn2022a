package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }
    public void attack(Fighter enemy){
        enemy.hitPoint -= enemy.power;
        System.out.println(enemy.name + " は " + enemy.power + " ダメージを与えた。");
    }
    public boolean isAlive(){
        if(hitPoint > 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
        System.out.println(this.name + " の残り hitPoint : " + this.hitPoint);
    }

    public String getName(){
        return this.name;
    }
}
