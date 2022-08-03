import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
     int i[],j[],n,temp;
     a=new int[10];
     b=new int[10];
     Scanner sc=new Scanner(Sytem.in);
     System.out.println("Enter array values");
     for(i=0;i<n-1i++){
        a[i]=sc.nextInt();
     }
     for(j=0;j<n-i-1;j++)
     {
     a[j]=sc.nextInt();
    }
    if(a[j]>a[j+1])
    {
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;  
    }

    }
}
