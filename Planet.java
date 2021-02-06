import java.util.Random;
public class Planet{
    Boolean isHabitable;
    String Terrain;
    int conflict;
    String Government;

    public Planet(){
        this.isHabitable = isHabitable();
        this.Terrain = Terrain();
    }
    public Boolean isHabitable(){
        Random rand = new Random();
        Boolean habitable = rand.nextBoolean();
        return habitable;
    }
    public String Terrain(){
        String terrain;
        Random rand = new Random();
        int number = rand.nextInt(11);
        if(number == 1){
            terrain = "Forest";
            return terrain;
        }
        else if(number == 2){
            terrain = "Tundra";
            return terrain;
        }
        else if(number == 3){
            terrain = "Desert";
            return terrain;
        }
        else if(number == 4){
            terrain = "Ocean";
            return terrain;
        }
        else if(number == 5){
            terrain = "Swamp";
            return terrain;
        }
        else if(number == 6){
            terrain = "Mountain";
            return terrain;
        }
        else if(number == 7){
            terrain = "Gas";
            return terrain;
        }
        else if(number == 8){
            terrain = "Volcanic";
            return terrain;
        }
        else if(number == 9){
            terrain = "Urbanized";
            return terrain;
        }
        else if(number == 10){
            terrain = "Grassland";
            return terrain;
        }
        else{
            terrain = "Asteroid";
            return terrain;
        }
    }
    public int conflict(){

    }
    public String Government(){

    }
}