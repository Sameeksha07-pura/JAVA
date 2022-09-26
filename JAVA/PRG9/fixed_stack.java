package JAVA;

import java.util.Scanner;

public class fixed_stack implements stack_op {
    private int top;
    private int[] st;
    private int max;
    fixed_stack(int size){
         top=-1;
          max=size;
         st =new int[max];
    }
 public void push(){
    if(isFull()){
        System.out.println("Stack is full");
        return;
    }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to push...");
        int ele=sc.nextInt();
        st[++top]=ele;
  }
  public void pop(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return;
    }
    top--;
  }
  public boolean isEmpty(){
    return top==-1;
  }
  public boolean isFull(){
    return top==max-1;
  }
  public void display(){
    if(isEmpty()){
        System.out.println("Stack is Empty");
        return;
    }
    System.out.print("Elements are ");
    for(int i=top;i>=0;i--)
    System.out.print(st[i] +" ");
  }
}
