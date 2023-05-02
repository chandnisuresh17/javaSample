public class StringBufferDemo {
    public static void main(String[] args) {
        
        // mutable
        StringBuffer s = new StringBuffer("Chandni");
        s.append("009");

        s.insert(0, "Suresh");

        System.out.println(s);

        // System.out.println(s.capacity());

        String s1 = s.toString();
    }
}