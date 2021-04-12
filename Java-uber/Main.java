import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** Input name */
        System.out.println("Name: ");
        Scanner nameInput = new Scanner(System.in);
        String nameI = nameInput.next();
        Boolean isFoundname = nameI.contains("");

        /** Input license */
        System.out.println("License :");
        Scanner licenseInput = new Scanner(System.in);
        String licenseI = licenseInput.next();
        Boolean isFoundlicense = licenseI.contains("");

        /** input seats */

        System.out.println("How many seats do you need: ");
        Scanner seatInput = new Scanner(System.in);
        Integer seatI = seatInput.nextInt();


        System.out.println("\n" + "Choose your service: " + "\n" + "1) UberPool" + "\n"+ "2) UberVan" + "\n"+ "3) UberX" + "\n");
        Scanner ServiceInput = new Scanner(System.in);
        Integer ServiceI = ServiceInput.nextInt();

        switch(ServiceI){
            case 1:
            System.out.println("You've choose UberPool");

            System.out.println("Do you have experience");
            Scanner experInput = new Scanner(System.in);
            String experI = experInput.next();
            Boolean expp = true;
            

            if(experI.equals("no")){
                expp = false;
            }
            UberPool car1 = new UberPool(expp, "SDE433", new Account("Sergio", 2132312, "email", "password"));
            car1.setPassenger(4);
            car1.printDataCar();
            break;
            case 2:
            System.out.println("You've choose UberVan");
            break;
            case 3:
            System.out.println("You've choose UberX");
            break;
        }
        
        /*Car car1 = new Car(licenseI, new Account(nameI, 66756, "sergio$", "sergio@"));
        car1.setPassenger(seatI);*/

        /** if((isFoundname==true) && (isFoundlicense==true)) {
            car1.printDataCar();
        }else{
            System.out.println("Please star again and fill the info: ");
        }*/

        
        
    }
}
