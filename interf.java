interface car
{
    void engine();
   public void  cover();
}
class Model implements  car{
    @Override
    public void cover() {
        System.out.println("cover");
    }

    @Override
    public void engine() {
        System.out.println("Engine");
    }
    public void dis() {
        System.out.println("dis");
    }
}
public class interf {
    public static void main(String[] args) {
       car m=new Model();
        m.cover();
        m.engine();


    }
}
