public class NoOfDaysInMonthOfYear {
    public static void main(String[] args) {
        int month = 11, year = 2013;
        /*
         * Steps
         * Check if the given month is February.
         * If True Check if the year is a year leap or not.
         * If year is a leap year Print 29 Days, Else Print 28 Days.
         * Now, check if month is 1, 3, 5, 7, 8, 10, 12, then print 31 days.
         * Check if month is 4, 6, 9, 11 then print 30 days.
         * Otherwise, print Invalid Month.
         */
        if ((month == 2) && ((year % 4 == 0) && (((year % 100 == 0) && (year % 400 == 0))) || (year % 4 == 0))) {
            System.out.println("No of Days is : 29");
        } else if (month == 2)
            System.out.println("Number of Days is 28");
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("No of Days is 31");
        else
            System.out.println("No of Days is 30");

        // By Switch Case
        switch (month) {
            // cases for 31 days
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("No of Days is 31");
                break;
            // cases for 30 days
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("No of Days is : 30");
                break;
            case 2:
                if ((year % 4 == 0) && ((year % 100 == 0) && ((year % 400 == 0)) || (year % 4 == 0)))
                    System.out.println("No of Days is : 29");
                else
                    System.out.println("No of Days is : 28");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
}
