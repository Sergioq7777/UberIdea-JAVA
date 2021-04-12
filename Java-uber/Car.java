public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    String brand;
    String model;
    


    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCar(){
        System.out.println("\n" + "Driver name: "+ driver.name + "\n" + "license number: "+ license +  "\n" +"passenger:" + passenger + "\n" );
    }

    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        this.passenger = passenger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    



}
