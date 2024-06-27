// toString and boolean equals methods

class Student {
    String name;
    int id;
    String college;
    long phno;

    public Student() {
    }

    Student(String name, int id, String college, long phno) {
        super();
        this.college = college;
        this.name = name;
        this.id = id;
        this.phno = phno;
    }

    public String toString() {
        return "[Name : " + name + " , Id " + id + " , College " + college + " , phone no " + phno + "]";
    }

    public boolean equals(Object i) {
        Student s = (Student) i; // Downcasting
        if (this.name == s.name && this.id == s.id && this.college == s.college && this.phno == s.phno) {
            return true;
        }
        return false;
    }
}

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Vishwajit", 2010023, "RIT", 9011764828l);
        System.out.println(s1);
        Student s2 = new Student("Aman", 2010003, "RIT", 7871006813l);
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
