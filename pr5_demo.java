import java.util.Scanner;
class LessBalanceException extends Exception{
    LessBalanceException(double amt){
        System.out.println("withdrawing"+amt+"is invalid");
    }
}
class user{
    String name;
    user(String name)
    {
        this.name=name;
    }


class account{
    double balance;
    int accno;
    account(int accno,double balance){
        this.accno=accno;
        this.balance=balance;
    }
}
account[] a=new account[2];
void deposit(double amt,int ano){
    int found=0,k=1;
    for(int i=0;i<2;i++)
    if(a[i].accno==ano){
    a[i].balance+=amt;
    found=1;
    k=i;
    break;
    }
    if(found==1)
    {
        System.out.println("Balance updated");
        display(a[k].accno);  
    }
    else
    System.out.println("Account does not exist");
}

void withdraw(double amt,int accno) throws LessBalanceException
{
    int k=-1;
    int found=0;
    for(int i=0;i<2;i++)
    if(a[i].accno==accno)
    {
        k=i;
        found=1;
        break;
    }
    if(found==1){
        if((a[k].balance<500)||(a[k].balance<amt))
        throw new LessBalanceException(amt);
        else
        {
            a[k].balance=amt;
            display(a[k].accno);
        }
        }
        else
        System.out.println("Account number does not exist");
    }

    void create_account(){
        try (Scanner sc = new Scanner(System.in)) {
            for(int i=0;i<2;i++){
                System.out.println("Enter the account number");
                int accno=sc.nextInt();
                System.out.println("Enter Balance");
                Double bal=sc.nextDouble();
                a[i]=new account(accno,bal);
            }
        }
    }
    void display(int accno){
        int k=-1,found=0;
        for(int i=0;i<2;i++)
        if(a[i].accno==accno)
        {
            k=i;
            found=1;
            break;
        }
        if(found==1)
        {
            System.out.println("---------Account Details------------");
            System.out.println(name+"\t"+a[k].accno+"\t"+a[k].balance);
            System.out.println("------------------------------------");
        }
        }
    }
    
public class pr5_demo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("CREATE A ACCOUNT WITH MINIMUM BALANCE 500");
            System.out.println("Enter owner name");
            String name=sc.next();
            int accno;
            user u=new user(name);
            u.create_account();
            System.out.println("Account created sucessfully");
            Boolean opt=true;
            while(opt)
            {
                System.out.println("-----");
                System.out.println("1.BALANCE ENQUIRY 2.DEPOSIT 3.WITHDRAWL");
                System.out.println("====");
                System.out.println("Enter your choice");
                int ch=sc.nextInt();
                switch(ch)
                {
                    case 1:System.out.println("Your account details");
                           System.out.println("Enter account number");
                           accno=sc.nextInt();
                           u.display(accno);
                           break;
                    case 2:System.out.println("Enter account number");     
                           accno=sc.nextInt();
                           System.out.println("Enter amount to deposit");
                           double amt=sc.nextDouble();
                           u.deposit(amt,accno);
                           break;
                    case 3:try{
                        System.out.println("Enter account number");     
                           accno=sc.nextInt();
                           System.out.println("Enter amount to withdrwal");
                           u.withdraw(amt,accno);
                    }
                    catch(LessBalanceException e){

                    }
                    break;
                    }
                }
        }
        }
       
        
    }

