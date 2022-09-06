import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class start {
    public static void main(String[] args) throws IOException {
        System.out.println("welcome to student management App");
        BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
        while(true)
        {
            System.out.println("Press 1 add");
            System.out.println("Press 2  delete");
            System.out.println("Press 3 display");
            System.out.println("Press 4 exit");

            int c= Integer.parseInt(br.readLine());

            if(c==1)
            {
                System.out.println("Enter name");
                String name=br.readLine();
                System.out.println("Enter city");
                String city=br.readLine();

                Student st=new Student(name,city);
               boolean answer= StudentDao.insertStudentToDb(st);
                System.out.println(st);
                if(answer)
                {
                    System.out.println("added ");
                }
                else
                {
                    System.out.println("not added");
                }
            }
            else if(c==2)
            {
                System.out.println("Enter id to delete");
                int userId=Integer.parseInt(br.readLine());
               boolean f= StudentDao.deleteStudent(userId);
               // System.out.println(st);
                if(f)
                {
                    System.out.println("deleted ");
                }
                else
                {
                    System.out.println("not delete");
                }
            }
            else if(c==3)
            {

                StudentDao.showAllStudent();
            }
            else if(c==4)
            {
                break;
            }
            else
            {

            }
        }
        System.out.println("Thank you for using application");
    }
}
