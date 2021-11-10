public abstract class Vehicle{
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    //constructor cho class:
    public Vehicle(String brand, String model, String registrationNumber, Person owner){
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }
    //phuong thuc abstrac:
    public abstract String getInfo();
    public void transferOwnership(Person newPerson){
        this.owner = newPerson;
    }
    //getter va setter cho brand:
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    //getter va setter cho model:
    public void setModel(String model){
        this.model = model;
    }
    public String setModel(){
        return this.model;
    }
    //getter va setter cho registrationNumber
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public String getRegistrationNumber(){
        return this.registrationNumber;
    }
    //getter va setter cho owner
    public void setOwner(Person owner){
        this.owner = owner;
    }
    public Person getOwner(){
        return this.owner;
    }
}