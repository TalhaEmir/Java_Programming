package Tekrar.Tekrar.Days.week10.Days26Tasks.OtherTasks;

public class Persian {
    public static void main(String[] args) {

        Iranian caferi= new Iranian();
        caferi. width=10.5;
        caferi.length=20.5;
        caferi.isIranian=false;
        caferi.unitPrice=10.5;


        System.out.println(caferi);

        Iranian caferi1=new Iranian(20,30,10.5,true);
        System.out.println(caferi1);

    }
}
