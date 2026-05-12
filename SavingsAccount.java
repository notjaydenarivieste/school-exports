class SavingsAccount extends BankAccount{
   double money = 0;
   float dep;
   double with;
   
   SavingsAccount(double with){
      this.with = with;
   }
   
   SavingsAccount(float dep){
      this.dep = dep;
   }

   @Override
   void deposit(){
      System.out.printf("\nYou have deposited: %.2f", dep);
      money += dep;
      System.out.printf("\nCurrent Savings Account Amount: %.2f", money);
   
   }
   
   @Override
   void withdraw(){
      System.out.printf("\nYou have withdrawn: %.2f", with);
      money -= with;
      System.out.printf("\nCurrent Savings Account Amount: %.2f", money);
   }
}