package com.lfp.javagenerics;

public class JavaGenerics {

    public static void main(String[] args) {
        Integer xInt = 70,yInt = 4,zInt=9;
        Integer intMax = maximumInteger(xInt,yInt,zInt);
        System.out.println("***The value of X : "+ xInt + " \n ***The Value of Y :" + yInt + "\n ***The Value of Z :" +zInt +
                "\n *** The Maximum Value among x,y,z is : " + intMax);
    }

    public static Integer maximumInteger(Integer xInt, Integer yInt, Integer zInt) {
        Integer iMax = xInt;//Assumption X is maximum
        if(yInt.compareTo(xInt) > 0) iMax = yInt; // if Y > X set Y as Maximum
        if(zInt.compareTo(iMax) >0 ) iMax = zInt; // if Z  > Maximum then set Z as Maximum
        return iMax;
    }
}
