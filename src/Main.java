public class Main {
    public static void main(String[] args) {
        //  The class should include a method that calculates
        // the pay for that week and displays it well formatted with
        // the employ name, position, pay rate, and how much they earned that week.

        //    Define / Set employee info empNum** format
        //  Below are positions available for use
//    ADMINISTRATION, PRODUCTION, SALES, MAINTENANCE, TECHNICAL, SECRETARIAL;

        Employee empNum001 = new Employee("Sean A Klechak", "ADMINISTRATION", true, 27.00,
                1, "01/10/2007");

        Employee empNum002 = new Employee("Buddy Dog", "SECRETARIAL", false, 50.00, 1, "09/15/2015");

        Employee empNum003 = new Employee("Guy Clark", "SALES", true, 100.00, 2, "1/2/2001");

        Employee empNum004 = new Employee("Homer Simpson", "MAINTENANCE", false, 22.00, 2, "4/5/2014");

        Employee empNum005 = new Employee("Carl Carlson", "TECHNICAL", true, 100.00, 3, "1/2/2005");

        Employee empNum006 = new Employee("Moe Szyslak", "PRODUCTION", false, 21.00, 3, "4/5/2013");

// Set up with Emp, 1 3 and 5 having the same pay rate, just different shifts, The same with 2 4 6.  So checking the math will be easier


        // Print Employee and hours worked

        /*  INSTRUCTORS NOTES
        Test the class by instantiating 3 people, one on salary working 45 hours
         that week on first shift, one on hourly working 50 hours that week on second shift,
         and one on hourly working 35 hours that week, on third shift.
        Sample code for the main method - you will need to create the Employee class and PositionTitle enum
         */


        /* MY NOTE: The 3rd shift worker was specified to be hourly (35 hours), the sample output shows:
        John Smith
        Maintenance Is salary: false shift: 3
        Rate of pay is: $21.0 per hour
        John Smith earned $924.00 this week

        I checked my math and it appears 808.50 was correct for what was requested in the assignment. It appears somehow John
        Smith is not salary, but he is being paid as a salary employee. Good for him.
         */

        empNum001.empPrint(45);
        // empNum002.empPrint(45);
       //  empNum003.empPrint(50);
        empNum004.empPrint(50);
      //  empNum005.empPrint(35);
        empNum006.empPrint(35);






    }
}
