
package com.example.ejercicio06;

import java.util.ArrayList;
import java.util.List;
import model.Accommodation;
import model.CampingExtraHotel;
import model.FiveStarHotel;
import model.FourStarHotel;
import model.Gym;
import model.ResidenceExtraHotel;
import model.Restaurant;
import service.ServiceAccommodation;

public class Ejercicio06 {

    public static void main(String[] args) {
          
        List<Accommodation> listAccommodations = createListTest();
        
        ServiceAccommodation serviceAccommodation = new ServiceAccommodation();
        
        serviceAccommodation.showMenuAccomodations(listAccommodations);
        


    }
    public static List<Accommodation> createListTest (){
        List<Accommodation> accommodations = new ArrayList<>();
        // --- Hoteles 4 Estrellas (FourStarHotel) ---
        accommodations.add(new FourStarHotel(
            new Gym ('A'), 
            new Restaurant("Bistro Deluxe", 50), 
            100, 150, 5, 
            "Hotel Central Plaza", "Av. Principal 123", "Madrid", "Carlos Ruiz"
        ));
        accommodations.add(new FourStarHotel(
            new Gym('B'), 
            new Restaurant("Sabor Local", 40), 
            80, 120, 4, 
            "Hotel Verde Valle", "Calle Los Pinos 45", "Valencia", "Ana Lopez"
        ));
        accommodations.add(new FourStarHotel(
            new Gym('A'), 
            new Restaurant("Mar y Tierra", 60), 
            120, 180, 6, 
            "Hotel Costa Azul", "Paseo Marítimo 88", "Málaga", "Javier Diaz"
        ));
        accommodations.add(new FourStarHotel(
            new Gym('C'), 
            new Restaurant("La Terraza", 30), 
            90, 130, 4, 
            "Hotel Montaña Alta", "Carretera Sierra 22", "Granada", "Lucia Mendez"
        ));
        accommodations.add(new FourStarHotel(
            new Gym('A'), 
            new Restaurant("El Rincón del Chef", 45), 
            110, 160, 5, 
            "Hotel Ciudad Jardín", "Av. de las Flores 10", "Sevilla", "Pedro Gomez"
        ));
        // --- Hoteles 5 Estrellas (FiveStarHotel) ---
        accommodations.add(new FiveStarHotel(
            new Gym('A'), 
            new Restaurant("Gourmet Imperial", 100), 
            10, 20, 5, 
            200, 350, 10, 
            "Palacio Real Luxury", "Calle Real 1", "Madrid", "Fernando Torres"
        ));
        accommodations.add(new FiveStarHotel(
            new Gym('A'), 
            new Restaurant("Océano Deep", 120), 
            15, 30, 8, 
            250, 400, 12, 
            "Marina Grand Resort", "Puerto Deportivo 5", "Barcelona", "Sofia Martinez"
        ));
        accommodations.add(new FiveStarHotel(
            new Gym('B'), 
            new Restaurant("Skyline Dining", 80), 
            8, 15, 3, 
            150, 220, 8, 
            "Torre Vista Alta", "Av. del Cielo 99", "Bilbao", "Miguel Angel"
        ));
        accommodations.add(new FiveStarHotel(
            new Gym('A'), 
            new Restaurant("Jardín Secreto", 60), 
            12, 25, 6, 
            180, 280, 9, 
            "Hotel Imperial Garden", "Parque Central 7", "Valencia", "Elena Ruiz"
        ));
        accommodations.add(new FiveStarHotel(
            new Gym('A'), 
            new Restaurant("Crisol Fine Dining", 90), 
            20, 40, 10, 
            300, 500, 15, 
            "Gran Palacio de Cristal", "Plaza Mayor 1", "Madrid", "Roberto Sanchez"
        ));
        // --- Campings (CampingExtraHotel) ---
        accommodations.add(new CampingExtraHotel(
            50, 10, true, false, 5000.0, 
            "Camping Naturaleza Viva", "Carretera del Bosque km 12", "Asturias", "Luis Fernandez"
        ));
        accommodations.add(new CampingExtraHotel(
            30, 8, false, true, 3500.0, 
            "Campamento Sol y Arena", "Playa Norte 4", "Alicante", "Carmen Ruiz"
        ));
        accommodations.add(new CampingExtraHotel(
            75, 15, true, false, 7000.0, 
            "Camping Montaña Verde", "Valle del Río 33", "Pirineos", "Andres Lopez"
        ));
        accommodations.add(new CampingExtraHotel(
            40, 12, true, true, 4200.0, 
            "Camping Privado Los Pinos", "Camino Real 8", "Córdoba", "Maria Jose"
        ));
        accommodations.add(new CampingExtraHotel(
            60, 14, false, false, 6000.0, 
            "Camping Aventura Extrema", "Sierra Sur 15", "Jaén", "Jorge Diaz"
        ));
        // --- Residencias (ResidenceExtraHotel) ---
        // Necesitan: rooms, hasGuildDiscount, hasSportField, isprivate, surface, name, address, town, manager
        accommodations.add(new ResidenceExtraHotel(
            20, true, true, false, 1500.0, 
            "Residencia Estudiantil Central", "Av. Universidad 10", "Salamanca", "Teresa Gomez"
        ));
        accommodations.add(new ResidenceExtraHotel(
            15, false, true, true, 1200.0, 
            "Residencia Privada Los Álamos", "Calle Alta 5", "Zaragoza", "Pablo Ruiz"
        ));
        accommodations.add(new ResidenceExtraHotel(
            25, true, false, false, 1800.0, 
            "Residencia Corporativa Norte", "Parque Empresarial 2", "Vigo", "Isabel Martin"
        ));
        accommodations.add(new ResidenceExtraHotel(
            10, false, true, true, 900.0, 
            "Residencia Ejecutiva Premium", "Distrito Financiero 1", "Madrid", "Alejandro Ruiz"
        ));
        
        return accommodations;
    }
    
}
