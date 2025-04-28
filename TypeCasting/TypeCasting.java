public class TypeCasting {
    public static void main(String[] args) {
        //Implicit Typecasting
		System.out.println("******Implicit Typecasting******");
        int i1 = 25;
        float f1;
        f1 = i1;
        System.out.println("Integer to float: " + f1);

        float f2 = 18.75f;
        double d1;
        d1 = f2;
        System.out.println("Float to double: " + d1);

        int i2 = 92;
        double d2;
        d2 = i2;
        System.out.println("Integer to double: " + d2);

        short s1 = 30;
        int i3;
        i3 = s1;
        System.out.println("Short to integer: " + i3);

        byte b1 = 100;
        int i4;
        i4 = b1;
        System.out.println("Byte to integer: " + i4);

		//Explicit Typecasting
        System.out.println("******Explicit Typecasting******");
        double d5 = 45.6789;
        float f5;
        f5 = (float) d5;
        System.out.println("Double to float: " + f5);

        long L1 = 9876543;
        short s2;
        s2 = (short) L1;
        System.out.println("Long to short: " + s2);

        float f6 = 67.9F;
        byte b2;
        b2 = (byte) f6;
        System.out.println("Float to byte: " + b2);

        float f7 = 73.456F;
        int i5;
        i5 = (int) f7;
        System.out.println("Float to integer: " + i5);

        long l2 = 654321;
        int i6;
        i6 = (int) l2;
        System.out.println("Long to integer: " + i6);
	}
}   