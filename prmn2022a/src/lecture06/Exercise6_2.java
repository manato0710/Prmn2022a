package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            list.add(random.nextInt(6));
        }
        System.out.println("さいころを５つ振りました。");
        System.out.println("何番目のさいころの値を確認しますか？");
        try{
            int index = input.nextInt();
            System.out.println(list.get(index));
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
        }
        catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。");
        }
        finally {
            System.out.println("プログラムを終了します。");
        }
    }
}
