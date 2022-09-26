import java.util.Scanner;

public class bank{
    String holder="USER";
    static acnt[] ac=new acnt[2];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ano;
        double amt;
        boolean flag;
        for(int i=0;i<ac.length;i++){
            System.out.print("Enter the Account 1: ");
            ac[i]=new acnt(sc.nextInt());
            
        }  
        while(true){
            System.out.println("\n___________MENU___________");
            System.out.print("1.DEPOSIT\t2.WITHDRAW\n3.BALANCE\t4.EXIT\nYour Choice:\t");
            switch(sc.nextInt()){
                case 1:
                    System.out.print("Enter the Account Number:");
                    ano=sc.nextInt();
                    flag=false;
                    for(int i=0;i<ac.length;i++){
                        if(ano==ac[i].ano){
                            System.out.print("Enter the amount");
                            amt=sc.nextDouble();
                            ac[i].deposit(amt);
                            flag=true;
                            break;
                        }else{
                            flag=false;
                        }
                    }
                    if(flag==false)
                        System.out.println("Invalid Account number..");
                    break;
                case 2:
                    System.out.print("Enter the Account Number:");
                    ano=sc.nextInt();
                    flag=false;
                    for(int i=0;i<ac.length;i++){
                        if(ano==ac[i].ano){
                            System.out.print("Enter the amount");
                            amt=sc.nextDouble();
                            ac[i].withdraw(amt);
                            flag=true;
                            break;
                        }else{
                            flag=false;
                        }
                    }
                    if(flag==false)
                        System.out.println("Invalid Account number..");
                    break;
                case 3:
                    System.out.print("Enter the Account Number:");
                    ano=sc.nextInt();
                    flag=false;
                    for(int i=0;i<ac.length;i++){
                        if(ano==ac[i].ano){
                            ac[i].display();
                            flag=true;
                            break;
                        }else{
                            flag=false;
                        }
                    }
                    if(flag==false)
                        System.out.println("Invalid Account number..");
                    break;
                    case 4:
                        System.out.println("\nThank You!\n");
                        System.exit(0);

            }
        }
    }
}

class acnt{
    int ano;
    double balance;
    acnt(int ano){
        this.ano=ano;
        balance=500;
    }
    void display(){
        System.out.println("Ano: "+this.ano);
        System.out.println("Balance: "+this.balance);
    }
    void deposit(double amt){
        if(amt>0){
            this.balance+=amt;
        }
        else
            System.out.println("Amount must be greater than zero..");
    }
    void withdraw(double amt){
    try{
        if(this.balance-amt<500)
            throw new LessBalanceException(amt);
        else
            this.balance-=amt;

    }catch(LessBalanceException e){
        return;
    }
    }
}

class LessBalanceException extends Throwable{
    LessBalanceException(double withdraw){
        System.out.println("Illegal withdraw amount: "+withdraw);
    }
}