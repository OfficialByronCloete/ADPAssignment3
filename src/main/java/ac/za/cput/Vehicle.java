package ac.za.cput;

public class Vehicle {

    private String make;

    public Vehicle(){

    }

    public Vehicle(String mk){
        make = mk;
    }

    public void setMake(String mk){
        this.make = mk;
    }

    public String getMake(){
        return make;
    }

}
