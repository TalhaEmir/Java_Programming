package week09.day24.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
public class WarmUp2 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

                list.removeIf(p->p<4);//p-> rules p is element
        System.out.println(list);//[4, 5, 6, 7, 4, 5, 6, 7]



        //or

        System.out.println("===================================");


        for (int i = 0; i <= list.size()-1; i++) {//[4, 5, 6, 7, 4, 5, 6, 7]

            if(list.get(i) <4){
                list.remove(i);

            }
        }

        System.out.println(list);

        System.out.println("===================================1");


        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer>list3=new ArrayList<>();

        for(int i=0 ; i<=list2.size()-1; i++){
            if(list2.get(i)>4){
                list3.add(list2.get(i));// neden buraya i atarsan o,1,2,3,4 bana listin icindekiler lazim
            }

        }


        System.out.println(list3);//5, 6, 7, 5, 6, 7


        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Ruby","Phyton","C#","Java"));
            names.removeIf(each->each.startsWith("J"));

        System.out.println(names);//[Ruby, Phyton, C#]


    }


            }







