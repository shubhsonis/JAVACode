// Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
//  Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,  but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis   of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.   Also   create   method   in   above   classes   to  display faculty data. 
//  Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2 parttime faculty information. Also print their details.

class Faculty{
    private String facultyid;
    private double salary;

    public Faculty(String facultyid, int basic, int allowance){
        this.facultyid = facultyid;
        this.salary = basic+allowance;
    }
    public Faculty(){

    }
    public Faculty(String facultyid, double hour, double rate){
        this.facultyid = facultyid;
        salary = hour*rate;
    }
    public void display(){
        System.out.println("\nFacultyId  : " +facultyid);
        System.out.println("Salary  : " +salary);
    }
}

class FullTimeFaculty extends Faculty{
    private int basic, allowance;

    public FullTimeFaculty(){

    }
    public FullTimeFaculty(String facultyid, int basic, int allowance){
        super(facultyid, basic, allowance);
        this.basic = basic;
        this.allowance = allowance;
    }
    public void display(){
        super.display();
        System.out.println("Basic : " +basic);
        System.out.println("Allowance : " +allowance);
    }
}

class PartTimeFaculty extends Faculty{
    private double hour;
    private double rate;

    public PartTimeFaculty(String facultyid, double hour, double rate){
        super(facultyid,hour,rate);
        this.hour = hour;
        this.rate = rate;
    }
    public void display(){
        super.display();
        System.out.println("Hour : " +hour);
        System.out.println("Rate : " +rate);
    }
}
class xyz{
    public static void main(String[]args){
        PartTimeFaculty obj = new PartTimeFaculty("201A", 5, 100);
        obj.display();
        FullTimeFaculty obj1 = new FullTimeFaculty("202B", 10000, 500);
        obj1.display();
    }
}