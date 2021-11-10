import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();
    //constructor cho Person
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //ham them phuong tien
    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    //ham xoa phuong tien
    public void removeVehicle(String registrationNumber){
        for(Vehicle i: vehicleList){
            if(i.getRegistrationNumber().equals(registrationNumber)){
                vehicleList.remove(i);
                break;
            }
        }
    }
    public String getVehiclesInfo(){
        if(vehicleList.size() == 0){
            return this.name+" has no vehicle!";
        }else{
            String results = this.name +" has:\n";
            for(Vehicle i : vehicleList){
                results += i.getInfo();
            }
            return results ;
        }
    }
    //setter va getter cho Name:
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    //setter va getter cho Address:
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return this.address;
    }

}