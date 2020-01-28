import java.util.Scanner;
public class WorkingWithClasses {
    static Address inputAddress()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Street num :");
        int streetnum = input.nextInt();
        System.out.println("City :");
        String cityname = input.next();
        System.out.println("State :");
        String statename = input.next();
        System.out.println("Country :");
        String countryname = input.next();
        Address address = new Address(streetnum,cityname,statename,countryname);
        return address;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of objects to be made (n)");
        int n = input.nextInt();
        Student[] student = new Student[n];
        College[] college = new College[n];
        Employee[] employee = new Employee[n];
        for(int i=0;i<n;i++)
        {
            //Student data read
            System.out.println("Input student "+ (i+1) +"'s USN");
            String USN = input.next();
            System.out.println("Input student "+ (i+1) +"'s name");
            String Student_Name = input.next();
            System.out.println("Input student "+ (i+1) +"'s address");
            Address student_address = inputAddress();
            student[i] = new Student(USN,Student_Name,student_address);

            //College data read
            System.out.println("Input college "+ (i+1) +"'s name");
            String College_Name = input.next();
            System.out.println("Input college "+ (i+1) +"'s address");
            Address college_address = inputAddress();
            college[i] = new College(College_Name,college_address);

            //Employee data read
            System.out.println("Input employee "+ (i+1) +"'s employee ID");
            String EmpID = input.next();
            System.out.println("Input employee "+ (i+1) +"'s name");
            String Employee_Name = input.next();
            System.out.println("Input employee "+ (i+1) +"'s address");
            Address employee_address = inputAddress();
            employee[i] = new Employee(EmpID,Employee_Name,employee_address);
        }
        for(int i=0;i<n;i++)
        {
            //Student Output
            System.out.println("Student "+ (i+1) +":");
            student[i].display();

            //College Output
            System.out.println("College "+ (i+1) +":");
            college[i].display();

            //Employee Output
            System.out.println("Employee "+ (i+1) +":");
            employee[i].display();
        }
    }
}
class Address {
    private int StreetNum;
    private String city;
    private String state;
    private String country;
    private int getStreetNum() {
        return StreetNum;
    }
    private String getCity() {
        return city;
    }
    private String getState() {
        return state;
    }
    private String getCountry() {
        return country;
    }
    void display() {
        System.out.println("No."+getStreetNum()+","+getCity()+","+getState()+","+getCountry());
    }
/*
    Address() {
        StreetNum = 0;
    }
    Address(int street) {
        StreetNum = street;
    }
    Address(int street, String cityName) {
        StreetNum = street;
        city = cityName;
    }
    Address(int street, String cityName, String stateName) {
        StreetNum = street;
        city = cityName;
        state = stateName;
    }
*/
    Address(int street, String cityName, String stateName, String countryName) {
        StreetNum = street;
        city = cityName;
        state = stateName;
        country = countryName;
    }
}
class Student {
    private String USN;
    private String Name;
    private Address address;
    void display() {
        System.out.println("USN: "+USN);
        System.out.println("Name: "+Name);
        System.out.println("Address: ");
        address.display();
        System.out.print("\n");
    }
    /*
    Student (String usn) {
        USN = usn;
    }
    Student (String usn,String name) {
        Name = name;
    }
     */
    Student (String usn, String name, Address address) {
        USN = usn;
        Name = name;
        this.address = address;
    }
}
class College {
    private String Name;
    private Address address;
    void display() {
        System.out.println("Name: "+Name);
        System.out.println("Address: ");
        address.display();
        System.out.print("\n");
    }
/*
    College (String name) {
        Name = name;
    }
 */
    College (String name, Address address) {
        Name = name;
        this.address = address;
    }
}
class Employee {
    private String EmployeeID;
    private String Name;
    private Address address;
    void display() {
        System.out.println("Employee ID: "+EmployeeID);
        System.out.println("Name: "+Name);
        System.out.println("Address: ");
        address.display();
        System.out.print("\n");
    }
/*
    Employee () {
        EmployeeID = 0;
    }
    Employee (int empid) {
        EmployeeID = empid;
    }
    Employee (int empid, String name) {
        EmployeeID = empid;
        Name = name;
    }
 */
    Employee (String empid, String name, Address address) {
        EmployeeID = empid;
        Name = name;
        this.address = address;
    }
}

