package lecture07;

public abstract class BattleMonster extends Monster implements IMonster, IBattleMonster{
    protected BattleMonster(IMonster monster){
        super(monster);
    }

    public void attack(int skillIndex, IMonster opponent){

    }

    protected void receiveDamage(int damage, IMonster opponent){

    }
}
