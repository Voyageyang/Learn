package numberandstring;

public class TestNumber {
    public static void main(String[] args) {
        // 1. ��byte,short,float,double�����Զ�������Զ�װ��
        // Byte�Զ�����
        byte b = new Byte((byte)5);
        // Byte�Զ�װ��
        Byte b1 = b;

        // Short�Զ�����
        short s = new Short((short)5);
        // Short�Զ�װ��
        Short s1 = s;

        // Float�Զ�����
        float f = new Float(1.34);
        // Float�Զ�װ��
        Float f1 = f;

        // Double�Զ�����
        double d = new Double(3.14);
        // Double�Զ�װ��
        Double d1 = d;

        //--------------------------------

        // 2. byte��Integer֮���ܷ�����Զ�������Զ�װ��
        /*byte bi = new Integer(10); // Incompatible types. Found: 'java.lang.Integer', required: 'byte'
        int ib = new Byte((byte)10);
        Byte bi1 = 10;
        Integer ib1 = (byte) 10;*/
    }
}
