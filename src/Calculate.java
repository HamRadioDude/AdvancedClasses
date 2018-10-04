public class Calculate {
//    Create a method called calculate that accepts hoursIn (double), and modifies the pay on second shift to be 5% higher, and the
// pay for the 3rd shift to be 10% higher. Overtime for all employees that are not salary starts after 40 hours and is calculated at
// 1.5 times normal pay. The class should include a method
// that calculates the pay for that week and displays it well formatted with the employ name, position, pay rate, and how much they
// earned that week.

    public double Calculate(double hoursIn, int empshft, Double empPay, boolean empSal) {

        double empTP = 0.00;  // total pay
        double payRate = 0.00;

    // Determining Shift
        switch (empshft) {
            case 1:
                payRate = empPay; // First Shift: pay rate is equal to employees normal salary rate

                break;
            case 2:
                payRate = ((empPay * .05) + empPay); // Second Shift: pya rate is 5 percent higher

                break;
            case 3:
                payRate = ((empPay * .10) + empPay); // Third Shift pay rate is 10 percent higher

                break;
        }

     // Based on the shift determined above, we now calculate their hours, plus any overtime (40 hours)

     if(empSal) { // true if an employee is on salary
         empTP = payRate * 40; // if true, you are salary, so you are getting paid at minimum of 40 hours.
     }else{
         if(hoursIn > 40){
             empTP = (payRate * 40) + ((payRate*1.5)*(hoursIn-40)); // pay rate multiply 40 for normal pay.  get the total OT hours worked by subtracting from forty..
                                                                    // multi the difference in hours by the normal pay total.
         }else {
             // Calculate the hours in 40 and less for salary
             empTP = (payRate * hoursIn);

         }

     }
     return empTP;
    }
}
