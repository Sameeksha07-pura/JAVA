import java.util.Scanner;

class Sort{
    int a[],i,j,temp,n;
    for(i=0;i<n-1;i++)
    {
    for(j=0;j<n-i-1;j++)
    {
    if(a[j]>a[j+1])
    {
    temp=a[j];
    a[j]=a[j+1];
    a[j+1]=temp;
    }
    }
    }   
}
public class Cons_bubble {
    public static void main(string[] args){
        int a[], i,n;
        Sort [] s=new Sort[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.println("Sorted order");
       for(i=0;i<n;i++)
           System.out.println(a[i]);
    }
    
}
