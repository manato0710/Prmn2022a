package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 2;
        String number[] = new String[n];
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + "つ目の整数を入力してください:");
            number[i] = input.next();
            num[i] = Integer.parseInt(number[i]);
        }
        System.out.println(num[0] + " + " + num[1] + " = " + (num[0] + num[1]));
    }
}
