package com.lfp.javagenerics;

public class JavaGenerics {

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
    }

    /**
     * <p>Method for checking Maximum Integer in tradition way without generics</p>
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
     * <p>Method for checking Maximum Float in tradition way without generics</p>
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
}
