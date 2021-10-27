package numberandstring;

public class TestNumber {
    public static void main(String[] args) {
        // 1. 对byte,short,float,double进行自动拆箱和自动装箱
        // Byte自动拆箱
        byte b = new Byte((byte)5);
        // Byte自动装箱
        Byte b1 = b;

        // Short自动拆箱
        short s = new Short((short)5);
        // Short自动装箱
        Short s1 = s;

        // Float自动拆箱
        float f = new Float(1.34);
        // Float自动装箱
        Float f1 = f;

        // Double自动拆箱
        double d = new Double(3.14);
        // Double自动装箱
        Double d1 = d;

        //--------------------------------

        // 2. byte和Integer之间能否进行自动拆箱和自动装箱
        /*byte bi = new Integer(10); // Incompatible types. Found: 'java.lang.Integer', required: 'byte'
        int ib = new Byte((byte)10);
        Byte bi1 = 10;
        Integer ib1 = (byte) 10;*/
    }
}
