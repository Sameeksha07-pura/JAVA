
class Const_over{
 double l,b,h;
    Const_over(double l)
    {
      this.l=this.b=this.h=this.l;
    }
    Const_over(double l,double b,double h){
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
    System.out.println("Method overloading");
}
void print(double v)
{
    System.out.println("Volume ="+v);
}
}
public class pr1_demo {
    public static void main(String[] args){
      Const_over  ob1=new Const_over(10);
      Const_over  ob2=new Const_over(10,20,10);
      double v1=ob1.volume();
      double v2=ob2.volume();

    ob1.print();
    ob2.print();
    ob1.print(v1);
    ob2.print(v2);
    }
  
  }



