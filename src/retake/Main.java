package retake;
//You are tasked with designing a housing rental system. The system has to manage different types of housing (apartment, villa).
// It also needs to save information about customers who rent the housing.
//House information:
//number of rooms
//size in m2
//price per day
//address
//city
//Customer information:
//Name
//Address
//Age
//When designing this system, have in mind the features that the users will need:
//check if the housing is currently free or rented out
//calculate total rental income per housing

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment(1, 60.5, 80.0, "111 Bombo", "Entebbe");
        Villa villa = new Villa(2, 120.0, 250.0, "212 Luwero", "Kampala");

//CREATE CUSTOMER
        Customer customer = new Customer("Babu Bosco", "001 Jinja", 39);

//CREATE RENTAL
        Rental rental1 = new Rental(apartment, customer, LocalDate.now(), 4);
        rental1.processRental();

        Rental rental2 = new Rental(villa, customer, LocalDate.now().plusDays(9), 5);
        rental2.processRental();

        System.out.println("Apartment available: " + apartment.isAvailable());
        System.out.println("Villa available: " + villa.isAvailable());

        System.out.println("Apartment total income: $" + apartment.getTotalIncome());
        System.out.println("Villa total income: $" + villa.getTotalIncome());


        System.out.println("Customer rental history size: " + customer.getRentalHistory());
    }
}


