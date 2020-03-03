package ac.za.cput;

public class PartTime extends Employee{

    private int hoursWorked;

    public PartTime(String nm, int ag, String num, int hours) {
        super(nm, ag, num);
        hoursWorked = hours;
    }

    public void setHoursWorked(int hours){
        this.hoursWorked = hours;
    }

    public int getHoursWorked(){
        return hoursWorked;
    }

    @Override
    public double payment() {
        double pay = Double.valueOf(getHoursWorked()) * 45;
        return pay;
    }

}
