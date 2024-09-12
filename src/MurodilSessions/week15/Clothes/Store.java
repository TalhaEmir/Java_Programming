package MurodilSessions.week15.Clothes;

public class Store {
    public static void main(String[] args) {
        HasHood jacketwithhood=new Jacket();

        HasHood tshirt=new Tshirt();

        Clothes jacket1= new Jacket();

        jacketwithhood.putOnHood();

//Solution Down casying
       jacketwithhood.wear();

       Jacket myJacket= new Jacket();

       myJacket.wear();
       myJacket.putOnHood();

       HasHood myJacketWithHood= new Jacket();


        myJacketWithHood.putOnHood();




        //DownCasting

        // first temporarily way


        Jacket myNewJacket= (Jacket) myJacketWithHood;

        ((Jacket) myJacketWithHood).wear();


        myNewJacket.wear();
        myNewJacket.putOnHood();










    }


}
