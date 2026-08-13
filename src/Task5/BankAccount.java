package Task5;

import java.math.BigDecimal;

public  class BankAccount {
  private   String owner ;
   private BigDecimal balance ;

    public BankAccount(String owner, BigDecimal balance) {
        this.owner = owner;
        this.balance = balance;
    }

    class Transaction{
       void  deposite(BigDecimal amount ){
            if(amount.signum()<0){
                System.out.println("Amount menfi ola bilmez!");
            }else {
             balance=  balance.add(amount)  ;
               System.out.println("Balance: "+ balance);

            }


        }
        void withdraw(BigDecimal amount) {
            if (balance.compareTo(amount)<0) {
                System.out.println("Insufficient balance!");
            } else {
                balance = balance.subtract(amount) ;
                System.out.println("Balance: " + balance );
            }
        }
    }
}

