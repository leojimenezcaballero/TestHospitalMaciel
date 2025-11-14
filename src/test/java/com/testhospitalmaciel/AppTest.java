package com.testhospitalmaciel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class AppTest {
 @Test
 void CasosCriticosTest() {
    
    int[] h1 = new int[]{4,11};
    Hospital hospitaltest = new Hospital(h1);
     // 4 y 5 sintomas

    assertTrue(hospitaltest.CasosCriticos()==1);

 
 }

 @Test
 void MayorCantidadSintomaTest(){
    int[] h1 = new int[]{4,11};
    Hospital hospitaltest = new Hospital(h1);
    assertTrue(hospitaltest.MayorCantidadSintoma()==11);
 }
}
