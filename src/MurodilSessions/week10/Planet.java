package MurodilSessions.week10;

public class Planet {


    /*
    Planet Custom Class;
    String name:
    long distanceFromSun;
    1)empty constructor
    2)accepts name and distance from Sun

     *//*
public Planet{

    public String name;// or String name=
        public long distanceFromSun;

        public Planet() {
        }

        public String toString() {
            return "Planet{" +
                    "name='" + name + '\'' +
                    ", distanceFromSun=" + distanceFromSun +
                    '}';
*/



            public String name; // Gezegenin adı
            public long distanceFromSun; // Güneşten uzaklığı

            // Boş kurucu (constructor)
            public Planet() {
                System.out.println("Creating planet object");
            }

            // Gezegenin adını ve Güneşten uzaklığını kabul eden kurucu
            public Planet(String name, long distanceFromSun) {
                System.out.println("Creating planet object using name and distanceFromSun");
                this.name = name;
                this.distanceFromSun = distanceFromSun;
            }

            // Gezegenin detaylarını görüntülemek için toString metodu
            @Override
            public String toString() {
                return "Planet{" +
                        "name='" + name + '\'' +
                        ", distanceFromSun=" + distanceFromSun +
                        '}';



            }
        }
