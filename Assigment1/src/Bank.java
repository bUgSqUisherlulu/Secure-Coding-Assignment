/*CHARLIE PRECIOUS RUTENDO\
* ASSIGNMENT 1
* H230407R */
class Bank {//Question1
    //Parameterized constuctor
    //Question 4
    private String accountType;
    private double accountBalance;
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    //Method to deposit money
    public double deposit(double amount){//Question 2
        accountBalance += amount;
        return accountBalance;
    }
    //Method to withdraw money
    public double withdraw(double amount){//Question 3
        if (amount <= accountBalance) {//the ammount to be withdrawn should be less or equal to the existing balance
            accountBalance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
        return accountBalance;
    }
    public  void display () {//Question 5
        System.out.println("The account type is "+ accountType +" and the balance is "+ accountBalance);
    }
}
class Insurance extends Bank {//Question 6 insurance class is inheriting from the bank class
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);

    }
    //Question 7
    public void cover(){
        System.out.println("You are covered");

    }
    //Question 8
    public static void main(String[] args) {
        Bank myAccount = new Bank("PRC",230407);
        myAccount.display();//Involking the display method //Question 9
        myAccount.deposit(230407);
        myAccount.display();
        myAccount.withdraw(100000);
        myAccount.display();

    }


}

