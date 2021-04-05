package com.lfp.javagenerics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaGenericsTest {

    // Test Cases for Integer
    @Test
    public void validXMax() {
        Integer iX = 5,iY=2, iZ = 1;
        Integer iMax = JavaGenerics.maximumInteger(iX,iY,iZ);
        Assertions.assertEquals(iX,iMax);
    }

    @Test
    public void validYMax() {
        Integer iX = 5,iY=20, iZ = 1;
        Integer iMax = JavaGenerics.maximumInteger(iX,iY,iZ);
        Assertions.assertEquals(iY,iMax);
    }

    @Test
    public void validZMax() {
        Integer iX = 5,iY=20, iZ = 100;
        Integer iMax = JavaGenerics.maximumInteger(iX,iY,iZ);
        Assertions.assertEquals(iZ,iMax);
    }

    // Test Cased for Float
    @Test
    public void validXMaxFloat() {
        Float xFloat = 11.3f, yFloat = 2.3f, zFloat = 9.5f;
        Float fMax = JavaGenerics.maximumFloat(xFloat,yFloat,zFloat);
        Assertions.assertEquals(xFloat,fMax);
    }

    @Test
    public void validYMaxFloat() {
        Float xFloat = 11.3f, yFloat = 21.3f, zFloat = 9.5f;
        Float fMax = JavaGenerics.maximumFloat(xFloat,yFloat,zFloat);
        Assertions.assertEquals(yFloat,fMax);
    }

    @Test
    public void validZMaxFloat() {
        Float xFloat = 11.3f, yFloat = 21.3f, zFloat = 91.5f;
        Float fMax = JavaGenerics.maximumFloat(xFloat,yFloat,zFloat);
        Assertions.assertEquals(zFloat,fMax);
    }

    //Test Case for String
    @Test
    public void validXMaxString(){
        String xString = "Car",yString ="Bat",zString="Area";
        String sMax = JavaGenerics.maximumString(xString,yString,zString);
        Assertions.assertEquals(xString,sMax);
    }

    @Test
    public void validYMaxString(){
        String xString = "Bat",yString ="Car",zString="Area";
        String sMax = JavaGenerics.maximumString(xString,yString,zString);
        Assertions.assertEquals(yString,sMax);
    }

    @Test
    public void validZMaxString(){
        String xString = "Bat",yString ="Area",zString="Car";
        String sMax = JavaGenerics.maximumString(xString,yString,zString);
        Assertions.assertEquals(zString,sMax);
    }

    // Test Case for Generic , Integer, Float and String
    @Test
    public void validXMaxGen() {
        Integer iX = 5,iY=2, iZ = 1;
        Integer iMax = JavaGenerics.calculateMax(iX,iY,iZ);
        Assertions.assertEquals(iX,iMax);
    }

    @Test
    public void validXMaxFloatGen() {
        Float xFloat = 11.3f, yFloat = 2.3f, zFloat = 9.5f;
        Float fMax = JavaGenerics.calculateMax(xFloat,yFloat,zFloat);
        Assertions.assertEquals(xFloat,fMax);
    }

    @Test
    public void validXMaxStringGen(){
        String xString = "Car",yString ="Bat",zString="Area";
        String sMax = JavaGenerics.calculateMax(xString,yString,zString);
        Assertions.assertEquals(xString,sMax);
    }

}
