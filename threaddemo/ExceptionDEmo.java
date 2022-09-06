package threaddemo;



//public class ExceptionDEmo extends Exception{
//    static String ipadd="192.168.2.2";
//    public ExceptionDEmo(String msg)
//    {
//        super(msg);
//    }
//    public static void checkip(String ip) throws Exception {
//        if(ip.equals(ipadd))
//        {
//            System.out.println("connect");
//        }
//        else
//        {
//            try
//            {
//                throw new Exception("not");
//            }
//            catch (Exception e)
//            {
//
//            }
//        }
//    }
//
//    public static void main(String[] args) throws Exception{
//
////       try
////       {
////           checkip("192.168.2.2");
////       }
////       catch(Exception e)
////       {
////           System.out.println(e);
////       }
//        checkip("192.168.3.3");
//
//
//    }
//}



//package threaddemo;
public class ExceptionDEmo extends Exception {
    static String ip="192.168.2.2";
    public ExceptionDEmo (String msg)
    {
        super(msg);
    }
    public  static void checkIp(String ipaddress)
    {
        if(ipaddress.equals(ip))
        {
            System.out.println("Connected to Network");
        }
        else {
            try {
                throw new ExceptionDEmo("Enter proper ip address");
            } catch (ExceptionDEmo e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {

        checkIp("190.166.3.2");
    }
}