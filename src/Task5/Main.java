package Task5;

import java.math.BigDecimal;

public class Main {
    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Anar" , BigDecimal.valueOf(500)) ;
        BankAccount.Transaction transaction = bankAccount.new Transaction() ;
        transaction.deposite(BigDecimal.valueOf(19.9)) ;
        transaction.withdraw(BigDecimal.valueOf(600)) ;
        transaction.withdraw(BigDecimal.valueOf(500)) ;

    }
}
