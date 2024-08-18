package MurodilSessions.week12;

import java.io.IOException;

public class TestCitiesService {
    public static void main(String[] args) throws IOException {
        System.out.println(CitiesService.getAllCities());
        CitiesService.loadAllCities();
        System.out.println(CitiesService.getAllCities());
        /*
        filter by state
        filter by city names started with a specific letter
        filter cities by their growth rate
        filter cities by their population
         */
        System.out.println(CitiesService.getCitiesByState("Texas"));

        for(City each : CitiesService.getAllCities()) {
            //if
        }
    }
}

