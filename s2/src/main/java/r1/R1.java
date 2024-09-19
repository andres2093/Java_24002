package r1;

public class R1 {
    public static void main(String[] args) {
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("maxByte " + maxByte);
        maxByte++;
        System.out.println("maxByte " + maxByte);

        byte minByte = Byte.MIN_VALUE;
        System.out.println("minByte " + minByte);
        minByte++;
        System.out.println("minByte " + minByte);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("maxInt " + maxInt);
        maxInt++;
        System.out.println("maxInt " + maxInt);

        long maxLong = Long.MAX_VALUE;
        System.out.println("maxLong " + maxLong);
        maxLong++;
        System.out.println("maxLong " + maxLong);

        float maxFloat = Float.MAX_VALUE;
        System.out.println("maxFloat " + maxFloat);
        maxFloat++;
        System.out.println("maxFloat " + maxFloat);

        double maxDouble = Double.MAX_VALUE;
        System.out.println("maxDouble " + maxDouble);
        maxDouble++;
        System.out.println("maxDouble " + maxDouble);
    }
}