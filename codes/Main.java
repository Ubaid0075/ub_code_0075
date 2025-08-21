import java.util.Scanner;

class Car {
    
    String name;
    String brand;
    int year;

    
    Car(String name, String brand, int year) {
        this.name = name;
        this.brand = brand;
        this.year = year;
    }

   
    void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        // Taking details from user
        System.out.print("Enter Car Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Car Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter Manufacturing Year: ");
        int year = sc.nextInt();

        // Creating Car object using user input
        Car car1 = new Car(name, brand, year);

        // Display details
        System.out.println("\nCar Details:");
        car1.displayDetails();

        sc.close();
    }
}
