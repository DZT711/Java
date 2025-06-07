public class innerClassandOuterClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        System.out.println("Outer class field: " + outer.outerField);
        System.out.println("Inner class field: " + inner.innerField);
        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        System.out.println("Static inner class field: " + staticInner.staticInnerField);
    }
}
class OuterClass {
    int outerField = 10;

    class InnerClass {
        int innerField = 20;

    }
static class StaticInnerClass {
        int staticInnerField = 30;

    }

}