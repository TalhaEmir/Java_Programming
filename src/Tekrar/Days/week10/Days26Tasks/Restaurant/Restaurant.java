package Tekrar.Days.week10.Days26Tasks.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    //medem this kullanilmis digerinde neden kullanilmamis

    // bir nasil tek garson eklyebiiyorum

    public void hireServer(Server server) {//Görevi: Bu metod, tek bir Server nesnesini servers adlı ArrayList'e ekler.
        //Kullanım: Bir garsonu işe almak için kullanılır.
        servers.add(server);
    }

    //ArrayListin icine Arraylist yazdirmak for loopla mumkun cunku biz 2d ArrayList yapmiyoruz. Amacimiz listeyi degil listenin icindekileri eklemek

    public void hireServer(Server[] servers) {//Bu metod, bir Server dizisini alır ve
        // bu dizideki tüm Server nesnelerini servers adlı Array e ekler.
        //Sonra da Array i icindekilerle cvirip bunlari Arrayliste ekler
        // Birden fazla garsonu aynı anda işe almak için kullanılır.
        this.servers.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef) {//Görevi: Bu metod, tek bir Chef nesnesini chefs adlı ArrayList'e ekler.
        //Kullanım: Bir şefi işe almak için kullanılır.
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {//Görevi: Bu metod, bir Chef dizisini alır ve bu dizideki tüm Chef nesnelerini chefs adlı ArrayList'e ekler.
       // Kullanım: Birden fazla şefi aynı anda işe almak için kullanılır.
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateServer(int id) {//Görevi: Bu metod, verilen kimlik bilgisine (id) sahip garsonu servers adlı ArrayList'ten çıkarır.
        //Kullanım: Belirli bir kimlik numarasına sahip garsonu işten çıkarmak için kullanılır.
        servers.removeIf(p -> p.employeeId == id);
    }

    public void terminateChef(int id) {//Görevi: Bu metod, verilen kimlik bilgisine (id) sahip şefi chefs adlı ArrayList'ten çıkarır.
        //Kullanım: Belirli bir kimlik numarasına sahip şefi işten çıkarmak için kullanılır.
        chefs.removeIf(p -> p.employeeId == id);
    }

    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
       servers = new ArrayList<>();
       chefs = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';






    /*
    public void terminateChef(int id) {
        for (int i = 0; i < allChefs.size(); i++) {
            if (allChefs.get(i).employeeId == id) {
                allChefs.remove(i);
                i--; // Eleman kaldırıldıktan sonra dizinin boyutu değişeceği için indexi azaltıyoruz.
            }
        }
    }
*/



/*Attributes:
			Owner (String)
			Location (String)
			numberOfStars (int)
			Servers (ArrayList of Server objects)
			Chefs (ArrayList of Chef objects)

	Add a constructor that sets the owner, location, and number of stars.

	Actions:
		hireServer(Server server): adds a server object to the Servers ArrayList
		hireServer(Server[] servers): adds an array of Server objects to the Servers ArrayList
		hireChef(Chef chef): adds a chef object to the Chefs ArrayList
		hireChef(Chef[] chefs): adds an array of Chef objects to the Chefs ArrayList
		terminateChef(int employeeID): removes the chef with the matching ID from the Chefs ArrayList
		terminateServer(int employeeID): removes the server with the matching ID from the Servers ArrayList
		toString(): returns a string representation of the Restaurant object, including the number of Servers and Chefs alongside other information*/

    }
}