public class Encapsulation {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(100);
        ba.withdraw(40);
        ba.getBalance();
    }
}


class BankAccount {
    private double balance;

    public void deposit (double amt) {
        balance += amt;
    }

    public void withdraw (double amt){
        balance -= amt;
    }

    public void getBalance(){
        System.out.println(balance);
    }
}