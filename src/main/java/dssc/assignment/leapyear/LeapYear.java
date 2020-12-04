package dssc.assignment.leapyear;

public class LeapYear {

    public boolean convert(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))
            return false;
        else
            return true;
    }
    public void print(int year){
        System.out.println(convert(year));
    }
}
