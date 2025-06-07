public class wrapperClasses {
    public static void main(String[] args) {
        Integer num1 = 10;
        Double num3 = 3.14;
        Boolean isTrue = true;
        Boolean isFalse = false;
        Character char1 = 'A';
        Float float1 = 3.14f;
        Byte byte1 = 127;
        Long long1=  12345678l;  
        Short short1=100;



        System.out.println("Byte: " + byte1);
        System.out.println("Int: " + num1);
        System.out.println("Short: " + short1);
        System.out.println("Long: " + long1);
        System.out.println("Char: " + char1);
        System.out.println("Double: " + num3);
        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);
        System.out.println("Float: " + float1);
    
        System.out.println("Int: " + num1.intValue());
        System.out.println("Char: " + char1.charValue());
        System.out.println("Double: " + num3.doubleValue());
        System.out.println("isTrue: " + isTrue.booleanValue());
        System.out.println("isFalse: " + isFalse.booleanValue());
        System.out.println("Float: " + float1.floatValue());
        System.out.println("Byte: " + byte1.byteValue());
        System.out.println("Short: " + short1.shortValue());
        System.out.println("Long: " + long1.longValue());

        String str=byte1.toString();
        System.out.println(str.length());
    }
}