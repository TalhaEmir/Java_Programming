package MurodilSessions.week07intervievalso;

public class Fibonacci {

    // fibonacci is sequence of numbers in which next number is sum of 2 previous numbers

    public static void main(String[] args) {

// 0,1,1, 2,3,5,8,13
int first=0;
int second=1;
int next=first+second;
        System.out.print(first + "");
        System.out.print(second + "");
        System.out.print(next + "");

// print until 5TH fibonacci sequence number
        for (int i=1 ; i<5 ; i++){
            first=second;
            second=next;// NEXT= FIRST + SECOND YANI SECOND=1
            next=first + second;
            System.out.print(next + "");

        }







}
}


       /* int first=0;
       int second=1;
       int next= first + second; //1

        first= second ;//1
        second= next ; //1
        next first + second//
        first=second//1
        second= next //2
        next= first + second// 3
        ...*/