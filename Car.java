public class Car extends Vehicle{
    private int numberOfDoors;
    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors){
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }
    public String getInfo(){
        return "\nCar:\n\tBrand: "+this.brand+"\n"+"\tModel: "+this.model+"\n"+"\tRegistration Number: "+this.registrationNumber+"\n"+"\tNumber of Doors: "+this.numberOfDoors+"\n"+"\tBelongs to "+this.owner.getName()+" - "+this.owner.getAddress();
    }
    //setter va getter cho numberOfDoors
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }
}
