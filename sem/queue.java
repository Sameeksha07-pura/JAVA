import java.util.Scanner;

class QueueException extends Exception{
    public void Error()
    {
        System.out.println("Queue is full");
    }
}
class Queue{
    int front;
    int rear;
    int q[];
    Queue(int n)
    {    
        front=rear=-1;

        q=new int[n];
    }
    void insert(int ele)throws QueueException
    {
        if(rear==q.length-1)
        {
            throw new QueueException();

        }
        if(front==-1)
        front=rear=0;
        else
        rear+=1;
        q[rear]=ele;
    }
    int delete()
    {
        int ele;
        if(front==-1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(front==rear)
        {
            ele=q[front];
            rear=front=-1;
        }
        else{
            ele=q[front++];
        }
        return ele;

    }
    void display()
    {
        int i;
        if(front==-1)
        {
            System.out.println("Queue is empty");
            return;
        }
        for(i=front;i<=rear;i++)
        System.out.println(q[i]+"\t");
    }
}
public class queue
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of queue");
        int size=sc.nextInt();
        Queue que=new Queue(size);
        try{
            while(true)
            {
                System.out.println("\n1.Insert\t2.delete\t3.display\n");
                System.out.println("Enter your choice");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:System.out.println("Enter elemet to insert");
                           que.insert(sc.nextInt());
                           break;
                    case 2:System.out.println("deleted item is"+que.delete());
                           break;
                    case 3:que.display();
                           break;
                    default:System.out.println("Invalid choice");
                            return;             
                }
            }
        }
        catch(QueueException e){
            e.Error();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Queue is full");
        }
    }
}