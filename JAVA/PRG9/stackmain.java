package JAVA;

import java.util.Scanner;

public class stackmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for Stack...");
        int size=sc.nextInt();
        fixed_stack fs=new fixed_stack(size);
        dynamic_stack ds=new dynamic_stack(size);
        stack_op so;
        so=fs;
        int ch;
        boolean lp=true;
        boolean loop=true;
        while(loop){
            lp=true;
            System.out.println("1.Fixed Stack 2.Dynamic Stack\nEnter your choice : ");
            int c=sc.nextInt();
            switch(c){
                case 1:so=fs;
                break;
                case 2:so=ds;
                break;
                default:System.out.println("Invalid Choice...");
                lp=false;
                break;
            }
            while(lp){      
            System.out.println("\n1.PUSH 2.POP 3.DISPLAY 4.EXIT 5.Change Stack");
            ch=sc.nextInt();
            switch(ch){  
                case 1:so.push();
                break;
                case 2:so.pop();
                break;
                case 3:so.display();
                break;
                case 4:loop=false;
                lp=false;
                break;
                case 5:lp=false;
                break;
                default:System.out.println("Invalid choice");
                break;
            }
        }
        }
    }
}
