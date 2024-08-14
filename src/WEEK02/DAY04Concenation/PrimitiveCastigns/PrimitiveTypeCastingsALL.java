package WEEK02.DAY04Concenation.PrimitiveCastigns;

public class PrimitiveTypeCastingsALL {



        public static void main(String [] args){

         //---------Implicit Casting----
            // smaller primitive type is casted to be larger primitive type


            byte a= 15; //value of the byte it is equal to 15

            // in order to assigned to the byte to the short. End of the day short gonna accept short value
            // smaller primitive type casted to the larger primitive type
            short b= a;

            System.out.println(b); // b's value is also 15

            //Can I also assigned to smaller primitive type to larger primitive type directly

            int c=a;// implicit casting



            long d=3000L;
            float f= d;
            //Actually 3000 is int but we assigned long

            //how can I be sure this value is long value not int value

            // we need to add lover case or upper case L

            System.out.println(f);//implicit casting



            //-------------Explicit Casting---------------
            //casting to larger primitive type to smaller primitive type


            int x=100;
            byte y=(byte)x;

            System.out.println(y);

            float z =20.8F;
            short q=(short)z;
            System.out.println(q); // z=20.8

            double n1=2.5;
            byte n2= (byte) n1; //


            System.out.println("----------------------");

            int num= 500;
            byte result= (byte)num; // explicit casting

            System.out.println(result);


            int r= 50000;

            short t=(short)r;

            System.out.println(t);

            double u= 3000.5;

            int p= (int) u;

            System.out.println(p);

            int o= 100;
            double d1= o;

            System.out.println(d1);


























        }
}
