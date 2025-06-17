package Arrays;

public class Array004 {
    public static void main(String[] args) {
        String [] nome = {"Win", "Wendel", "Wilson", "Welson", "Wifi"};

        for( String i: nome) {
            if (i.equals("Wilson")) {
                System.out.println(i);
            }
        }
    }
}
