public class booleanEx {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean andResult = a && b; // false
        System.out.println("a && b: " + andResult);

        // Logical OR
        boolean orResult = a || b; // true
        System.out.println("a || b: " + orResult);

        // Logical NOT
        boolean notA = !a; // false
        System.out.println("!a: " + notA);

        System.out.println(7<5);
        System.out.println(7>5);
        System.out.println(7 == 5);
        int x=7;
        System.out.println(7==x);
    }
}