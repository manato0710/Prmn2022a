package lecture01;

public class Main {
    public static void main(String[] args) {
        System.out.println("B2211650 Manato Tooyama");

        int studentNumber = 2211650;
        String s = "B" + studentNumber + " Manato Tooyama";
        System.out.println(s);

        int age = 20;
        if(age < 20){
            String introduction = "I am " + age + " years old so I cannot drink liquor.";
            System.out.println(introduction);
        }
        else{
            String introduction = "I am " + age + " years old so I can drink liquor.";
            System.out.println(introduction);
        }

        int[] array = new int[100];
        int sum = 0;
        for(int i = 0; i < 100; i++){
            array[i] = i+1;
            if(i % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);

        int[] score = {41,85,72,38,80};
        int min_score = min(score);
        int max_score = max(score);
        double average_score = average(score);
        for(int i = 0; i < 5; i++){
            if(score[i] >= 90){
                System.out.println(i + "番 " + score[i] + "点 " + "秀");
            }
            else if (score[i] >= 80) {
                System.out.println(i + "番 " + score[i] + "点 " + "優");
            }
            else if (score[i] >= 70) {
                System.out.println(i + "番 " + score[i] + "点 " + "良");
            }
            else if (score[i] >= 60) {
                System.out.println(i + "番 " + score[i] + "点 " + "可");
            }
            else{
                System.out.println(i + "番 " + score[i] + "点 " + "不可");
            }
        }
        System.out.println("最高点：" + max_score + "点");
        System.out.println("最低点：" + min_score + "点");
        System.out.println("平均点：" + average_score + "点");
    }
    static int min(int[] score){
        int mi = score[0];
        for(int i = 1; i < 5; i++){
            if(mi > score[i]){
                mi = score[i];
            }
        }
        return mi;
    }

    static int max(int[] score){
        int ma = score[0];
        for(int i = 1; i < 5; i++){
            if(ma < score[i]){
                ma = score[i];
            }
        }
        return ma;
    }

    static double average(int[] score){
        int sum = 0;
        for(int i = 0; i < 5; i++){
            sum += score[i];
        }
        double ave = (double)sum/5;
        return ave;
    }
}
