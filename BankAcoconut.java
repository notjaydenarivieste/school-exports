import java.util.*;

public class BankAcoconut{
   public static void main(String [] args){
      Scanner bato = new Scanner(System.in);
      
      float dep;
      double with;
      int ch2;
      
      System.out.println("Welcome to Bank of Bikini Bottom!");
      System.out.println("Select Service");
      System.out.println("1 = Deposit || 2 = Withdraw");
      int ch = bato.nextInt();
      
      while (ch !=0){
         switch(ch){
            case 1: //deposit
               System.out.println("From which account?");
               System.out.println("1 = Savings || 2 = Current");
               ch2 = bato.nextInt();
            
               switch(ch2){
                  case 1: //depost savings
                  
                     System.out.println("Input Savings Deposit: ");
                     dep = bato.nextFloat();
                  
                     SavingsAccount s1 = new SavingsAccount(dep);
                  
                     s1.deposit();
                  
                  case 2: //deposit current
                  
                     System.out.println("Input Savings Deposit: ");
                     dep = bato.nextFloat();
                  
                     CurrentAccount c1 = new CurrentAccount(dep);
                  
                     c1.deposit();
               }
            
            case 2: //withdraw
               System.out.println("Withdraw from which account?");
               System.out.println("1 = Savings || 2 = Current");
               ch2 = bato.nextInt();
            
               switch(ch2){
                  case 1: //withdraw savings
                  
                     System.out.println("Input Savings Withdraw: ");
                     with = bato.nextFloat();
                  
                     SavingsAccount s1 = new SavingsAccount(with);
                  
                     s1.withdraw();
                  
                  case 2: //withdraw current
                  
                     System.out.println("Input Current Withdraw: ");
                     with = bato.nextFloat();
                  
                     CurrentAccount c1 = new CurrentAccount(with);
                  
                     c1.withdraw();
               }
         }
      }
   }
}