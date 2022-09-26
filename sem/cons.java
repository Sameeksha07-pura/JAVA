class area {

    double l,b,h;
   
    area(double l)
    {
       this.l=this.h=this.b=l;
    }
    area(double l,double b,double h)
    {
       this.l=l;
       this.b=b;
       this.h=h;

    }
    double volume()
    {
       return l*b*h;
    }
    void print()
    {
       System.out.println("Method overloading and constuctor overloading");
    }
     void print(double v)
     {
       System.out.println("Volume of box"+v);
     }
   }
    public class cons{
       public static void main(String [] args) {
           
          area a=new area(3);
          area a1=new area(4,5,6);
          double v1=a.volume();
          double v2=a1.volume();
          a.print();
          a1.print();
          a.print(v1);
          a1.print(v2);





          

       }

    }


 







   
   




