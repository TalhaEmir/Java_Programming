package MurodilSessions.week07intervievalso;
import java.util.*;
public class ShoppingList {

    public static void main(String[] args) {
        String myList="";
        String answer="";
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter item:");
            String item=input.next();
            myList= item + ", ";
            System.out.println("Do you you have mor items?");
            answer=input.next();
        }while(answer.equalsIgnoreCase("yes"));

        System.out.println("mylist = " +  myList);


        /*Shopping List [do while, String]

    create a program that create a shopping list for the user.
    The program will ask the user to enter the items one by one.

    the flow:
        ask the user for the item
        add item to the shopping list
        ask user if they want to add more items

    when the user is done creating the list print it*/


    }
}
