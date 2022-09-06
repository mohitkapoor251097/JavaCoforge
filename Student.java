public class Student {

    private int id;
    private String nane;
    private  String city;

    public Student(int id, String nane, String city) {
        this.id = id;
        this.nane = nane;
        this.city = city;
    }

    public Student(String nane, String city) {
        this.nane = nane;
        this.city = city;
    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nane='" + nane + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
