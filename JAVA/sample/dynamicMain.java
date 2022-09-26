public class dynamicMain {
    public static void main(String[] args) {
        fixedLength f=new fixedLength(15);
        dynamicStack d=new dynamicStack(5);
        stack iStack;
        iStack=f;
        System.out.println("Conetnt of Fixed stack");
        for(int i=0;i<15;i++){
            f.push((char)('A'+i));
        }
        for(int i=0;i<15;i++){
            System.out.println(f.pop()+"\t");
        }
        iStack=d;
        System.out.println("Contents of Dynamic stack");
        for(int i=0;i<25;i++){
            d.push((char)('A'+i));
        }
        for(int i=0;i<25;i++){
            System.out.println(d.pop()+"\t");
        }
    }
}
