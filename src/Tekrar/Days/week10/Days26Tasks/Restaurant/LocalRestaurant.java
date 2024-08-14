package Tekrar.Days.week10.Days26Tasks.Restaurant;

import java.util.Arrays;

public class LocalRestaurant {
    public static void main(String[] args) {


//neden buraya adiyla beraber bir farson ekleyemiyorum

        Restaurant restaurant = new Restaurant("Mahdi", "McLean", 4);
        Restaurant restaurant1 = new Restaurant("Talha", "Michelin", 5);
        System.out.println( restaurant);

        Server[] servers = {

                new Server("Yasin", 29, 15, false)
                , new Server("Sabryne", 28, 10, false)
                , new Server("Karim", 27, 12, false),
                new Server("Aysel", 26, 20, true),
                new Server("Kamal", 25, 23, true)
        };
        System.out.println(Arrays.toString(servers));


        Chef[] chefs2 = {new Chef("Talha", 23, 35, true),
                new Chef("Efe", 22, 26, false),
                new Chef("Crista", 21, 27, true),};


        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };

       restaurant1.hireChef(chefs);
        restaurant1.hireChef(chefs2);

        System.out.println( restaurant1);


        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);

        System.out.println(restaurant.servers);

        restaurant.hireServer(new Server("Mona", 30, 20, true));
        System.out.println(restaurant.servers);

        restaurant.terminateChef(22);

        System.out.println(restaurant.chefs);

        System.out.println(restaurant);
    }
}
