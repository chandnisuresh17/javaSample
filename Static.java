public class Static {
    static String str = "Hi";
    static class Inner {
       private int a = 10;
       public void demoMethod() {
          System.out.println("Hi I'm Chandni!");
          System.out.println(" My age= "+ str);
       }
    }
    public static void main(String[] args) {
       Inner inObj = new Inner();
       inObj.demoMethod();
       System.out.println(inObj.a);
    }
 }

