public class CalcDemo {
    
    public static void main(String[] args){
        Calc obj = new Calc();
        System.out.println(obj.add(7,4));

        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.sub(10,6));
        BasicCalc ca = new BasicCalc();
        ca.display();
    }
    
    
}
// public class BasicCalc{
//     public void display(){
//         System.out.println("basic ");
//     }
// }
