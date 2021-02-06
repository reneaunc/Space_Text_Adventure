public class Ship{
    String name;
    int guns;
    int engines;
    Boolean drill;
    Boolean tractor_beam;
    Boolean hyperspace;
    
    public Ship(){
        this.name = "ship";
        this.guns = 0;
        this.engines = 1;
        this.drill = false;
        this.tractor_beam = false;
        this.hyperspace = false;
    }
    public Ship(String name, int guns, int engines, Boolean drill, Boolean tractor_beam, Boolean hyperspace){
        this.name = name;
        this.guns = guns;
        this.engines = engines;
        this.drill = drill;
        this.tractor_beam = tractor_beam;
        this.hyperspace = hyperspace;
    }
}