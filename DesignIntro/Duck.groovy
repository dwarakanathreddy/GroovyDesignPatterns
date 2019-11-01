public abstract class Duck{


  public void performquack(QuackBehavior quackbehavior){
    quackbehavior.makesound()
  }
  public void performfly(FlyBehavior flybehavior){
    flybehavior.fly()
  }
  public abstract void display()
  public void swim(){
    println("no ducks can swim")
  }
}
