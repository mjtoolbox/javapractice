package comparatorexample;

import java.util.Comparator;

class Sortbyidnumber implements Comparator<Student> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {

        return a.idnumber - b.idnumber;
    }
}