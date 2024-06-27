// multi level inheritance
class University {
    String uniname;
    int unicode;
    String uniloc;
    String vc;

    public University() {
    }

    University(String uniname, int unicode, String uniloc, String vc) {
        this.uniloc = uniloc;
        this.unicode = unicode;
        this.uniname = uniname;
        this.vc = vc;
    }

    public void displayUniversity() {
        System.out.println("University code : " + unicode);
        System.out.println("University Name : " + unicode);
        System.out.println("University loc : " + uniloc);
        System.out.println("Vice chancellor : " + vc);
        System.out.println("---------------------------");
    }
}

class College extends University {
    String colname;
    String colloc;
    int colcode;
    String naac;
    String type;

    public College() {
    }

    College(String uniname, int unicode, String uniloc, String vc, String colname, String colloc, int colcode,
            String naac, String type) {
        this.uniloc = uniloc;
        this.unicode = unicode;
        this.uniname = uniname;
        this.vc = vc;
        this.colname = colname;
        this.colloc = colloc;
        this.colcode = colcode;
        this.naac = naac;
        this.type = type;
    }

    public void displayCollege() {
        displayUniversity();
        System.out.println("College name : " + colname);
        System.out.println("College location : " + colloc);
        System.out.println("College Code : " + colcode);
        System.out.println("NaaC Grade : " + naac);
        System.out.println("College type : " + type);
        System.out.println("-------------------");
    }
}

class Department extends College {
    String name;
    String hod;
    int std;
    int lec;

    public Department() {
    }

    Department(String uniname, int unicode, String uniloc, String vc, String colname, String colloc, int colcode,
            String naac, String type, String name, String hod, int std, int lec) {
        this.uniloc = uniloc;
        this.unicode = unicode;
        this.uniname = uniname;
        this.vc = vc;
        this.colname = colname;
        this.colloc = colloc;
        this.colcode = colcode;
        this.naac = naac;
        this.type = type;
        this.name = name;
        this.hod = hod;
        this.std = std;
        this.lec = lec;
    }

    public void dislpayDepartment() {
        displayCollege();
        System.out.println("Dept name : " + name);
        System.out.println("Dept Hod : " + hod);
        System.out.println("No of students : " + std);
        System.out.println("number of lec : " + lec);
        System.out.println("------------------");
    }
}

public class UniversityDriver {
    public static void main(String[] args) {
        Department d1 = new Department("SPPU", 48, "Pune", "Karbham", "COEP", "Shivaji Nagar", 1234, "A+",
                "Engineering", "CSIT", "PK", 180, 25);
        d1.dislpayDepartment();
    }
}
