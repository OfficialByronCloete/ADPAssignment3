package ac.za.cput;

public class Employee implements Payment {

    private String name;
    private int age;
    private String empNum;

    private Vehicle veh;

    public Employee(){

    }

    public Employee(String nm, int ag, String num){
        name = nm;
        age = ag;
        empNum = num;
    }

    public Employee(String nm, int ag, String num, Vehicle v){
        name = nm;
        age = ag;
        empNum = num;
        veh = v;
    }

    public void setName(String nm){
        this.name = nm;
    }

    public void setAge(int ag){
        this.age = ag;
    }

    public void setEmpNum(String num){
        this.empNum = num;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmpNum(){
        return empNum;
    }

    public void setVehicleInfo(Vehicle v){
        this.veh = v;
    }

    public Vehicle getVehicleInfo(){
        return veh;
    }

    @Override
    public double payment() {
        double pay = 1000;
        return pay;
    }

}
