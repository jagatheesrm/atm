import java.util.Scanner;
class Atm {

    private double Balance = 50000;
    private int pwd;
    Scanner sc=new Scanner(System.in);
    public void bankBalance(){
        System.out.println(Balance);
    }

    public void withdraw(){
        System.out.println("Enter a withdra amount: ");
        double withdrawAmo=sc.nextInt();
        if(withdrawAmo <= Balance){
            System.out.println("Please collect your money: ");
            double avl = Balance-withdrawAmo;
            System.out.println("Availabal balance:"+avl);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(){
        System.out.println("Enter a deposit amount: ");
        double dep=sc.nextInt();
        double tol = Balance+dep;
        System.out.println("Your Money has been successfully depsited");
        System.out.println("Availabal amount: "+tol);




    }




    public void tryTogetIn(){
        
        System.out.println("Enter the password:");
        
        pwd=sc.nextInt();
              
        if(pwd == 2456){
            System.out.println("1.Deposit");
            System.out.println("2.withdraw");
            System.out.println("3.check balance");
            System.out.println("4.Exit");
            
            System.out.println("Enter option");
            int option=sc.nextInt();
            switch(option){
                case 1:
                deposit();
                break;
                case 2:
                withdraw();
                break;
                case 3:
                bankBalance();
                break;
                case 4:
                System.exit(0);
                break;
               /*  default:
                System.out.println("incorrect option");
                */
                
            }
        }
        else{
            System.out.println("incorrect password");
        }

    }
   
}
public class App {
    public static void main(String[] args) throws Exception {
        Atm b=new Atm();
        b.tryTogetIn();
        
        
    }
}
