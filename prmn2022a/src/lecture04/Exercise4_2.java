package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.registerAccount("遠山愛斗", "12345");
        atm.registerAccount("遠山愛斗", "12345");
        atm.deposit("12345", 1000);
        atm.withdraw("12345",2000);
        atm.withdraw("12345",500);
    }
}