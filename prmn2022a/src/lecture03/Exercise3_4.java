package lecture03;

public class Exercise3_4 {
    public static void main(String[] args) {
        Vegetable ArrayList[] = new Vegetable[3];
        ArrayList[0] = new Vegetable("にんじん",117);
        ArrayList[1] = new Vegetable("たまねぎ",120);
        ArrayList[2] = new Vegetable("じゃがいも",154);
        for(int i = 0; i < ArrayList.length; i++){
            ArrayList[i].print();
        }
    }
}
