
public class UberVan extends Car{
    
    String size;

    public UberVan(String size, String license, Account driver){
        super(license, driver);
        this.size = size;
    }

    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("size " + size);
    }


}
 