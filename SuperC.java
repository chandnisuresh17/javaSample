 class Animal {
   Animal(){
      super();
      System.out.println("Animals");
   } 
    
}
class Tiger extends Animal{
    Tiger(){
        super();
        System.out.println("Tiger");
    }
}

public class SuperC{
    public static void main(String[] args){
        Tiger tiger = new Tiger();
        // Calculator calc = new Calculator();
        // calc.add(2,3);
    }
}
