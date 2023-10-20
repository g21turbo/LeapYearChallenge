public class Main {
    
    public static void main(String[] args) {

        int year = 1850;
        boolean leapYear = isLeapYear(year);
        System.out.println(year + " is a leap year: " + leapYear);

        year = 2024;
        leapYear = isLeapYear(year);
        System.out.println(year + " is a leap year: " + leapYear);

        year = 1975;
        leapYear = isLeapYear(year);
        System.out.println(year + " is a leap year: " + leapYear);
        
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0){
            return false;
        } else {
            return true;
        }
    }
}