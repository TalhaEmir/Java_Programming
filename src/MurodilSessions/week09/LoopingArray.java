package MurodilSessions.week09;
import java.util.*;//import all classes in util package
public class LoopingArray {
    public static void main(String[] args) {

        ArrayList<String>colors=new ArrayList<>(Arrays.asList("Red","Blue","Green","Yellow"));
        System.out.println("colors size: "+colors);
        System.out.println("First color= " + colors.get(0));
        System.out.println("Last color= " + colors.get(colors.size()-1));


        //1)for loop

        for(int i=0;i<colors.size();i++){
            System.out.println(i+"->"+colors.get(i));




        }
        //2)for each loop
        for(String eachColor:colors){
            System.out.println("each color= "+eachColor);
            //colors.remove(eachColor)://Concurrent method
        }

        //3)while loop with iterator
        Iterator<String> it=colors.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }

        /*IQ= for each loop vs Iterator:
        -in for each loop, we cannot modify arraylist
        -in ITERATOR, WE CAN MODIFY arraylist


         */
    }
}
