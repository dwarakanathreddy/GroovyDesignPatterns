public class Starbucks{

    /*
    if I want to use something like to tmobile
    I would go about doing the decorator pattern
    we have phone price
    we have decorations like adding isurance
    socs can be decarators

    * */
    public static void main(String[] args){
        Bevrage bevrage = new Mocha()
        Bevrage bevrage1 = new Milk(bevrage)
        println(bevrage1.getDescription())
        println(bevrage1.cost())
    }
}