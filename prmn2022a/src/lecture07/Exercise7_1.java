package lecture07;

import java.util.*;
import java.util.function.Supplier;

public class Exercise7_1 {
    public static void main(String[] args) {

        int stdinId = stdinMonsterId();
        int randomId = randomMonsterId();

    }

    private static int stdinMonsterId(){
        Scanner input = new Scanner(System.in);
        int stdinId = input.nextInt();
        return stdinId;
    }

    private static int randomMonsterId(){
        Random rand = new Random();
        int randomId = rand.nextInt(3) + 1;
        return randomId;
    }

    public enum MonsterCreator{ MONKEY, PENGUIN, TURTLE,;
        private int id;
        private Supplier<Monster> supplier;
        private Map<Integer, MonsterCreator> map;

        public void viewMonsterList(){

        }
    }
}
