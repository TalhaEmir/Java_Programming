package MurodilSessions.WEEK05murodil;

import com.sun.security.jgss.GSSUtil;

public class pizzaOrder {

public static void main(String[] args) {

    /*
    /*
    [String comparison, if statements]
    String size => , small(13.99), medium(15.99), large(18.99)
    String extraCheese = yes, or no:
        small(1.25), medium(1.65), large(2.0)
    Print price
 */

    String size="small";
    String extraCheese="yes";

    double price=0.0;


if (size.equalsIgnoreCase("small") ) {

    price=13.99;

}else if((size.equalsIgnoreCase("medium") )){
    price=15.99;
}else if((size.equalsIgnoreCase("large") )){
    price=18.99;
}
//---extracheeese
if (extraCheese.equalsIgnoreCase("yes")) {

    if (size.equalsIgnoreCase("small") ) {
    price +=1.25;

}else if((size.equalsIgnoreCase("medium") )){
    price +=1.65;
}else if((size.equalsIgnoreCase("large") )){
    price=2.0;

}else {
    System.out.println("Invalid Size");
}

    System.out.println("Price: "+price);

    }




}


}


