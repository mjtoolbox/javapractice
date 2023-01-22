package comparatorexample;

//public class Student implements Comparable<Student>{
public class Student {
    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Attributes of a student
    int idnumber;
    String name;
    String address;


    // Constructor
    public Student(int idnumber, String name, String address)
    {

        // This keyword refers to current instance itself
        this.idnumber = idnumber;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString()
    {
        // Returning attributes of Student
        return this.idnumber + " " + this.name + " "
                + this.address;
    }

//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(getRollno(), o.getRollno());
//    }
}
