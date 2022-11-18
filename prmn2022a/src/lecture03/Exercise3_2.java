package lecture03;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        System.out.println("何行分入力しますか？");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String ArrayList[] = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.println(i+1 + "行目:");
            ArrayList[i] = input.nextLine();
        }
        int j = 0;
        System.out.println("入力した文字列:");
        for(String list : ArrayList){
            System.out.println("[" + j + "]" + list);
            j++;
        }
    }
}
