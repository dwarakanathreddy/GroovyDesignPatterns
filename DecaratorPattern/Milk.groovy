public class Milk extends Condiments{
   Bevrage bevrage
    Milk(Bevrage bevrage){
        this.bevrage=bevrage
    }

    public String getDescription(){
        return bevrage.getDescription() + " ,milk"
    }

    public int cost(){
        return bevrage.cost()+20
    }
}