public class cons {
  int id;
//    public cons(String name)
//    {
//        name=this.name;
//        System.out.println(name);
//    }


    public int getName() {
       return  id;
    }

    public void setName(int name) {
        this.id = name;
    }

    public static void setChange(cons c)
    {
          cons id=new cons();
          id.setName(2);
          System.out.println(id.getName());
    }
    public static void main(String[] args) {
       // cons c=new cons("Jatin");
        cons c=new cons();
        c.setName(1);
       System.out.print(c.getName());
       c.setChange(c);
    }
}
