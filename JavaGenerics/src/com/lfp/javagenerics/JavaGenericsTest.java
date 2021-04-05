package com.lfp.javagenerics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaGenericsTest {

    @Test
    public void validXMax() {
        Integer iX = 5,iY=2, iZ = 1;
        Integer imax = JavaGenerics.maximumInteger(iX,iY,iZ);
        Assertions.assertEquals(iX,imax);
    }

    @Test
    public void validYMax() {
        Integer iX = 5,iY=20, iZ = 1;
        Integer imax = JavaGenerics.maximumInteger(iX,iY,iZ);
        Assertions.assertEquals(iY,imax);
    }

    @Test
    public void validZMax() {
        Integer iX = 5,iY=20, iZ = 100;
        Integer imax = JavaGenerics.maximumInteger(iX,iY,iZ);
        Assertions.assertEquals(iZ,imax);
    }
}
