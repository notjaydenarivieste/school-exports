class CurrentAccount extends BankAccount{
   double money = 0;
   float dep;
   double with;
   
   CurrentAccount(double with){
      this.with = with;
   }
   
   CurrentAccount(float dep){
      this.dep = dep;
   }

   @Override
   void deposit(){
      System.out.printf("\nYou have deposited: %.2f", dep);
      money += dep;
      System.out.printf("\nCurrent Current Account Amount: %.2f", money);
   
   }
   
   @Override
   void withdraw(){
      System.out.printf("\nYou have withdrawn: %.2f", with);
      money -= with;
      System.out.printf("\nCurrent Current Account Amount: %.2f", money);
   
   }
}