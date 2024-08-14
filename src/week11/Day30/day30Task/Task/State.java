package week11.Day30.day30Task.Task;

import java.util.ArrayList;

public class State {

    private String name, abbreviation, politicalParty, Governor,senator;
    private int population;


    public State(String abbreviation, String politicalParty, String governor, String senator, int population) {
       setName(getClass().getSimpleName());
        setAbbreviation(abbreviation);
       setPoliticalParty(politicalParty);
        setGovernor (governor);
        setSenator (senator);
       setPopulation (population);
    }

    public String getName(){
        if(name==null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name){
        ArrayList<String> nameList= new ArrayList<>();
        nameList.add(name);
        for(int i=0 ; i<nameList.size() ; i++){
            if(nameList.get(i)==null || nameList.get(i).isEmpty()||nameList.get(i).isBlank()){
                System.out.println("State name can not be "+ nameList.get(i) );
                System.exit(1);
            }
        }

        this.name=name;
    }

    public String getAbbreviation(){
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation){
        ArrayList<String> abbreviationList= new ArrayList<>();
        abbreviationList.add(abbreviation);

        for(int i=0 ; i<abbreviationList.size() ; i++){
            if(abbreviationList.get(i)==null){
                System.out.println("State name can not be null "+ abbreviationList.get(i) );
                return;
            }
        }

        for(int i=0 ; i<abbreviationList.size() ; i++) {
            if (abbreviationList.get(i).isEmpty()) {
                System.out.println(abbreviationList.get(i) + "State name can not be empty ");
                return;
            }
        }

            for(int i=0 ; i<abbreviationList.size() ; i++){
                if(abbreviationList.get(i).isBlank()){
                    System.out.println(abbreviationList.get(i) + "State name can not be Blank " );
                    return;
                }
            }

            this.abbreviation=abbreviation;
    }


    public String getPoliticalParty(){
        if(politicalParty==null){
            return "Unknown";
        }
        return politicalParty;
    }
    public void setPoliticalParty(String politicalParty){
        if(!politicalParty.isEmpty() || !politicalParty.isBlank()){
            this.politicalParty=politicalParty;
        }else{
            this.politicalParty=null;
        }
    }




    public String getGovernor(){
        if( Governor==null){
            return "Unknown";
        }
        return  Governor;
    }



    public void setGovernor(String Governor){
        if(!Governor.isEmpty() || !Governor.isBlank()){
            this.Governor=Governor;
        }else{
            this.Governor=null;
        }
    }



    public String getSenator(){
        if( senator==null){
            return "Unknown";
        }
        return  senator;
    }



    public void setSenator(String senator){
        if(!senator.isEmpty() || !senator.isBlank()){
            this.senator=senator;
        }else{
            this.senator=null;
        }
    }





    public int getPopulation(){
        if( population==0){
            System.out.println("Population can not be" + population);
            return -1;
        }
        return  population;
    }


    public void setPopulation(int population){
        if(population<0){
            System.out.println("Population can not be less than  0" +population + " this value wrong ");
            return;
        }else if(population==0){

            System.out.println("Population can not be equal" +population + " value");
            return;
        }

        this.population=population;
    }


    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
