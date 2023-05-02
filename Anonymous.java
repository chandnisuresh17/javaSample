class C{
    public C(){
        System.out.println("constructor");
    }
    public void show(){
        System.out.println("show");
    }
}

public class Anonymous {
    public static void main(String[] args){
        new C().show();

    }
    
}
