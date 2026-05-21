package service;

import interfaces.IMethodsAccommodations;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.Accommodation;
import model.CampingExtraHotel;
import model.ExtraHotel;
import model.Hotel;
import model.ResidenceExtraHotel;

public class ServiceAccommodation implements IMethodsAccommodations{
    

    @Override
    public void showMenuAccomodations(List<Accommodation>accommodations) {
        Scanner scanner = new Scanner(System.in);
         Integer option = 0;
        do {
           
            System.out.println("-------Ingrese una opcion del Menu-------"+
                    "\n1-------> Mostrar todos los hospedajes <-------"+
                    "\n2------->Hoteles mas caro al mas barato <-------"+
                    "\n3------->Camping con Restaurante <-------"+
                    "\n4------->Residencias con Descuento a gremios <-------"+
                    "\n5-------> SALIR <-------");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1 -> showAllAccomodations(accommodations);
                case 2 -> System.out.println(allHotels(accommodations));
                case 3 -> System.out.println(allCampingWithRestaurant(accommodations));
                case 4 -> System.out.println(allResidenceWithdDscount(accommodations));
                case 5 -> System.out.println("Gracias por su visita");
                default -> System.out.println("Opcion no valida");
                    
            }
        } while (option !=5);

    }

    @Override
    public void showAllAccomodations(List<Accommodation> accommodations) {
        accommodations.forEach(System.out::println);
    }

    @Override
    public List<Hotel> allHotels(List<Accommodation> accommodations) {
        List<Hotel> hotels = new ArrayList<>();
        for (Accommodation accommodation : accommodations) {
            if (accommodation instanceof Hotel) {
                hotels.add((Hotel) accommodation);
            }
        }
        hotels.sort(Comparator.comparing( Hotel::pricePerRoom));
        return hotels;
    }

    @Override
    public List<ExtraHotel> allCampingWithRestaurant(List<Accommodation> accommodations) {
        List<ExtraHotel> extraHotels = new ArrayList<>();
        for (Accommodation accommodation :accommodations) {
            if (accommodation instanceof CampingExtraHotel) {
                if (((CampingExtraHotel) accommodation).getHasARestaurant() == true) extraHotels.add((ExtraHotel) accommodation);
            }
        }
        return extraHotels;
    }

    @Override
    public List<Accommodation> allResidenceWithdDscount(List<Accommodation> accommodations) {
        List<Accommodation> residencesDiscount = new ArrayList<>();
        for (Accommodation accommodation : accommodations) {
            if (accommodation instanceof ResidenceExtraHotel) {
                if(((ResidenceExtraHotel) accommodation).getHasGuildDiscount()== true) residencesDiscount.add(accommodation);
            }
        }
        return residencesDiscount;//Aqui use otra manera en la que manejo un  list de la clase padre principal pero a mi parecer es mas limpio como lo use en el metodo anterior
        
    }
    
    
    
}
