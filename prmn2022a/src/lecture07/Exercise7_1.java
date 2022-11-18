package lecture07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class Exercise7_1 {
    public static void main(String[] args) {
        System.out.println("1 -> ヒコザル");
        System.out.println("2 -> ポッチャマ");
        System.out.println("3 -> ナエトル");
        System.out.print("ナナカマド博士「ここに三匹のポケモンがおるじゃろ？好きなのを一匹選ぶんじゃ」 > ");

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
}
