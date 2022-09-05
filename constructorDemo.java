public class constructorDemo {
    String name="Sunita";
    int x;
    public constructorDemo()
    {
        System.out.println("Default constructor...");
    }
    public constructorDemo(int x,String n)
    {
        this.x=x;
        this.name=n;
        System.out.println("Hello inside the constructor..." + x + "" +n);
    }

    public static void main(String[] args) {
        constructorDemo cst1=new constructorDemo();
        //     constructorDemo cst2=new constructorDemo(2);
        constructorDemo cst3=new constructorDemo(4,"Nidhi");
        constructorDemo cst4=new constructorDemo(5,"Neeta");
        constructorDemo cst5=new constructorDemo(6,"Ritu");
        constructorDemo s=new constructorDemo(22,"Deep");
        System.out.println("before the assignment");
        System.out.println(s.hashCode());
        //System.out.println(t.hashCode());
        System.out.println(s.x + s.name);
        // System.out.println(t.x + t.name);
        constructorDemo t=s;
        System.out.println("after the assignment");
        System.out.println(s.hashCode());
        System.out.println(t.hashCode());
        System.out.println(s.x + s.name);
        System.out.println(t.x + t.name);
    }
}
