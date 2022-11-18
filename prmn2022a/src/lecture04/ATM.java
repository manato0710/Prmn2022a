package lecture04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    List<Account> accountList;

    public ATM() {
        this.accountList = new ArrayList<Account>();
    }

    public void registerAccount(String name, String number) {
        Account ac = new Account(name, number);
        if(existsAccount(name, number)){
            System.out.println(name + " さんのアカウント,口座番号：" + number + " は既に登録しています。");
        }
        else {
            accountList.add(ac);
            System.out.println(name + " さんのアカウントを口座番号：" + number + " で登録しました。");
        }
    }

    public boolean existsAccount(String name, String number) {
        for (Account account : accountList) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                System.out.println("名前：" + name + " 口座番号：" + number + " は存在します。");
                return true;
            }
        }
        System.out.println("名前：" + name + " 口座番号：" + number + " は存在しません。");
        return false;
    }

    public void deposit(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number)) {
                account.setBalance(money);
                System.out.println("口座番号：" + number + " に " + money + " 円入金しました");
            }
        }
    }

    public long withdraw(String number, long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number) && account.getBalance() > money) {
                long hikidashi = account.getBalance() - money;
                System.out.println("口座番号：" + number + " から " + money + " 円引き出しました。 残高：" + hikidashi + "円です");
                return hikidashi;
            } else {
                System.out.println("口座番号：" + number + " から " + money + " 円引き出せませんでした。 残高：" + account.getBalance() + "円です");
            }
        }
        return accountList.get(0).getBalance();
    }
}
