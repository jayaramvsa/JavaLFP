package com.lfp.javagenerics;

public class JavaGenerics<E extends Comparable<E>> {
    E x, y, z;

    public JavaGenerics(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public E calculateMaximum() {
        return JavaGenerics.calculateMax(x, y, z);
    }

    public static void main(String[] args) {
        Integer xInt = 70, yInt = 4, zInt = 9;
        Integer intMax = maximumInteger(xInt, yInt, zInt);
        System.out.println("***The value of X : " + xInt + " \n ***The Value of Y :" + yInt + "\n ***The Value of Z :" + zInt +
                "\n *** The Maximum Value among x,y,z is : " + intMax);
        // For Float Exercise
        Float xFloat = 1.3f, yFloat = 2.3f, zFloat = 9.5f;
        Float fMax = maximumFloat(xFloat, yFloat, zFloat);
        System.out.println("***The value of X : " + xFloat + " \n ***The Value of Y :" + yFloat + "\n ***The Value of Z :" + zFloat +
                "\n *** The Maximum Value among x,y,z is : " + fMax);
        //For String Exercise
        String xString = "Apple", yString = "Mango", zString = "Grapes";
        String sMax = maximumString(xString, yString, zString);
        System.out.println("***The value of X : " + xString + " \n ***The Value of Y :" + yString + "\n ***The Value of Z :" + zString +
                "\n *** The Maximum Value among x,y,z is : " + sMax);
        //Calculate using Generic Method
        intMax = calculateMax(xInt, yInt, zInt);
        System.out.println("***The value of X using Generic: " + xInt + " \n ***The Value of Y using Generic :" + yInt + "\n ***The Value of Z using Generic:" + zInt +
                "\n *** The Maximum Value among x,y,z using Generic is : " + intMax);
        fMax = calculateMax(xFloat, yFloat, zFloat);
        System.out.println("***The value of X using Generic: " + xFloat + " \n ***The Value of Y using Generic:" + yFloat + "\n ***The Value of Z using Generic:" + zFloat +
                "\n *** The Maximum Value among x,y,z  using Generic is : " + fMax);
        sMax = calculateMax(xString, yString, zString);
        System.out.println("***The value of X using Generic: " + xString + " \n ***The Value of Y using Generic:" + yString + "\n ***The Value of Z using Generic:" + zString +
                "\n *** The Maximum Value among x,y,z  using Generic is : " + sMax);
        new JavaGenerics<Integer>(xInt,yInt,zInt).calculateMaximum();
        new JavaGenerics<Float>(xFloat,yFloat,zFloat).calculateMaximum();
        new JavaGenerics<String>(xString,yString,zString).calculateMaximum();


    }

    /**
     * <p>Method for checking Maximum Integer in traditional way without generics</p>
     *
     * @param xInt
     * @param yInt
     * @param zInt
     * @return
     */
    public static Integer maximumInteger(Integer xInt, Integer yInt, Integer zInt) {
        Integer iMax = xInt;//Assumption X is maximum
        if (yInt.compareTo(xInt) > 0) iMax = yInt; // if Y > X set Y as Maximum
        if (zInt.compareTo(iMax) > 0) iMax = zInt; // if Z  > Maximum then set Z as Maximum
        return iMax;
    }

    /**
     * <p>Method for checking Maximum Float in traditional way without generics</p>
     *
     * @param xFloat
     * @param yFloat
     * @param zFloat
     * @return
     */
    public static Float maximumFloat(Float xFloat, Float yFloat, Float zFloat) {
        Float maxFloat = xFloat;//Assumption X is Maximum
        if (yFloat.compareTo(xFloat) > 0) maxFloat = yFloat; // If Y > X set Y as Maximum
        if (zFloat.compareTo(maxFloat) > 0) maxFloat = zFloat; // if Z > Maximum set Z as Maximum
        return maxFloat;
    }

    /**
     * <p>Method for checking maximum String in traditional way without generics</p>
     * @param xString
     * @param yString
     * @param zString
     * @return
     */
    public static String maximumString(String xString, String yString, String zString) {
        String maxString = xString;
        if (yString.compareTo(xString) > 0) maxString = yString; // If Y > X set Y as Maximum
        if (zString.compareTo(maxString) > 0) maxString = zString; // if Z > Maximum set Z as Maximum
        return maxString;
    }

    /**
     * <p>Generic method to caluclate the maximum value</p>
     * @param x
     * @param y
     * @param z
     * @param <E>
     * @return
     */
    //Create Generic Method to find maximum Value
    public static <E extends Comparable<E>> E calculateMax(E x, E y, E z) {
        E max = x;
        if (y.compareTo(x) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        printMaximumValue(x, y, z, max);
        return max;
    }

    public static <G> void printMaximumValue(G x, G y, G z, G max) {
        System.out.printf("Maximum of %s,%s and %s is %s\n", x, y, z, max);
    }
}
