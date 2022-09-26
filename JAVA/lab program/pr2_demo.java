

import java.Outer.Inner;

class Outer{
    int x=100;
    class Inner{
        int y=200;
        void imethod()
        {
            System.out.println(x);
            System.out.println(x+y);
        }
    }
    void display(){
        System.out.println(x);
        Inner ob1=new Inner();
        System.out.println(ob1.y);
    }
}
public class pr2_demo {
    public static void main(String[] args){
        Outer obname=new Outer();
        obname.display();
         Outer.Inner obj2=obname.new Inner();
        obj2.imethod();
    }
    
}
