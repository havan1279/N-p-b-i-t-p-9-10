public class MotorBike extends Vehicle{

    private boolean hasSideCar;

    
    public MotorBike(String brand, String model, String registrationNumber, Person owner, boolean hasSideCar){
        super(brand, model, registrationNumber, owner);
        this.hasSideCar = hasSideCar;
    }
    public String getInfo(){
        return "\nMotor Bike:\n\tBrand: "+this.brand+"\n\tModel: "+this.model+"\n\tRegistration Number: "+this.registrationNumber+"\n\tHas Side Car: "+this.hasSideCar+"\n\tBelongs to "+this.owner.getName() +" - "+this.owner.getAddress();
    }
    
    //setter va getter cho hasSideCar
    public boolean isHasSideCar(){
        return this.hasSideCar;
    }
    public boolean getIsHasSideCar(){
        return this.hasSideCar;
    }
    public boolean getHasSideCar(){
        return this.hasSideCar;
    }
    public void setHasSideCar(boolean hasSideCar){
        this.hasSideCar = hasSideCar;
    }
}
