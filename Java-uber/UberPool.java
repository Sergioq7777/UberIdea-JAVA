public class UberPool extends Car{
    
    Boolean experience;

    public UberPool(Boolean experience, String license, Account driver){
        super(license, driver);
        this.experience = experience;
    }
    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("Service: UberPool" + " Experience: " + experience);
    }


}