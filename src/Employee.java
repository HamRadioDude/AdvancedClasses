public class Employee {
    //    Create an employee class
//    Create a constructor that accepts: name (string) , position (string) , salary (boolean)
//  payRate (double) shift (int), and start date (string)
//
    // initialize private
    private String empName;
    private PositionTitle empPos;
    private boolean empSal = true;
    private double empPay;
    private int empShft;
    private String empStrt;


    public Employee(String empName, PositionTitle empPos, boolean empSal, double empPay, int empShft, String empStrt) {
        this.empName = empName;
        this.empPos = empPos;
        this.empSal = empSal;
        this.empPay = empPay;
        this.empShft = empShft;
        this.empStrt = empStrt;
    }
    // Create all getter and setter methods

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public PositionTitle getEmpPos() {
        return empPos;
    }

    public void setempPos(PositionTitle empPos) {
        this.empPos = empPos;
    }

    public boolean isEmpSal() {
        return empSal;
    }

    public void setEmpSal(boolean empSal) {
        this.empSal = empSal;
    }

    public double getEmpPay() {
        return empPay;
    }

    public void setEmpPay(double empPay) {
        this.empPay = empPay;
    }

    public int getEmpShft() {
        return empShft;
    }

    public void setEmpShft(int empShft) {
        this.empShft = empShft;
    }

    public String getEmpStrt() {
        return empStrt;
    }

    public void setEmpStrt(String empStrt) {
        this.empStrt = empStrt;
    }


    public void empPrint(double hoursIn) {

        Calculate calculate = new Calculate(); // calling the calculations to determine pay info.
        //public double Calculate(double hoursIn, int empshft, int empPay, boolean empSal) //
        // SK 10318 - Changed empPay from an INT (as show above) to a double)
           double totalPay = calculate.Calculate( hoursIn, empShft, empPay, empSal );

//    System.out.println("_________________________________________________________________________________");
    System.out.println("---------------------------Employee Information-------------------------------------- ");
    System.out.println("Name: " + empName);
    System.out.println("Position: " + empPos);
    System.out.println("Is Salary: " + empSal);
    System.out.println("Start Date: " + empStrt);
    System.out.println("Shift:  " + empShft);
    System.out.printf("%20s %11s %.2f", "Pay Rate:", "$", empPay);
    System.out.printf("\n%20s  %10s %.2f", "Hours Worked:", " ", hoursIn);
    System.out.printf("\n%20s %9s %.2f", "Total Pay:", "$", totalPay);
    System.out.printf("\n--------------------------------------------------------------------------------------\n ");

    }

}