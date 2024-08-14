package Week05.day12.task;

import week03.Day06ifstataement.LongVideo.Ifandelse;

public class eligibletovote {

    public static void main(String[] args) {

        eligibleVote(22, true);

    }


    public static void eligibleVote(int age, boolean citizen ){

        if (age >= 21 && citizen){
            System.out.println("You successfully eligible to vote");

        }else{
            System.out.println("You are not eligible to vote");
        }


    }




        }
