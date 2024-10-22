import java.util.Scanner;

class atm{

    private float balance;
    private int pin = 9001;

    public void checkPin(){
        System.out.println("Welocome to SBI ATM");
        System.out.println("Please enter your ATM CARD Pin....!");
        Scanner sc = new Scanner(System.in);
        int myPin = sc.nextInt();
        if(pin==myPin){
            menu();
        }else{
            System.out.println("Incorrect Pine ...xxx");
            System.out.println("Please Give Valid Pin.... THANKYOU");
            checkPin();
        }
    }

    public void menu(){
        System.out.println("Welocome to SBI ATM");
        System.out.println("Please enter your choice ...");
        System.out.println("1. Check A/C Balance....");
        System.out.println("2. Withdraw your amount....");
        System.out.println("3. Deposit your amount....");
        System.out.println("4. Exit ....");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1){
            checkBalance();
        } else if (opt==2) {
            withdrawAmount();
        } else if (opt==3) {
            depositAmount();
        } else if (opt==4) {
            System.out.print("BYE BYE BYE ....");
            menu();
        }
    }

    public void checkBalance(){
        System.out.println("YOUR BALANCE :" +balance);
        menu();
    }
    public void depositAmount(){
        System.out.println("Please enter the amount....");
        Scanner sc= new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("AMOUNT CREDITED SUCCESSFULLY....");
        System.out.println("Total Balance Available : "+balance);
        menu();
    }
    public void withdrawAmount(){
        System.out.println("Please enter the amount....");
        Scanner sc= new Scanner(System.in);
        float withdrawAmount = sc.nextFloat();
        if(withdrawAmount>balance){
            System.out.println("Insufficient Balance : Please Check First Balance ");
            menu();
        }
        balance = balance - withdrawAmount;
        System.out.println("AMOUNT DEBITED SUCCESSFULLY....");
        System.out.println("Total Balance Available : "+balance);
        menu();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("SBI - Live Happy ");
       atm obj = new atm();
       obj.checkPin();
    }
}