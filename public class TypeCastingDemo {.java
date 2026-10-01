public class TypeCastingDemo {

    public static void main(String[] args) {

        int intValue = 100;
        double doubleValue = intValue;   

        System.out.println("Implicit Type Casting:");
        System.out.println("Int Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);

        double num = 45.78;
        int intNum = (int) num;   

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value: " + num);
        System.out.println("Int Value: " + intNum);
    }
}