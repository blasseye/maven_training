package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

class SampleTest {

    @org.junit.jupiter.api.Test
    void op_somme() {
        Sample s = new Sample();
        int resultat = 16;
        int test = s.op(Sample.Operation.ADD,5,11);
        Assertions.assertEquals(test,resultat);
    }

    @org.junit.jupiter.api.Test
    void op_somme2() {
        Sample s = new Sample();
        int resultat = 48;
        int test = s.op(Sample.Operation.ADD, 45, 3);
        Assertions.assertEquals(test, resultat);
    }

    @org.junit.jupiter.api.Test
    void op_multiplacation() {
        Sample s = new Sample();
        int resultat = 55;
        int test = s.op(Sample.Operation.MULT,5,11);
        Assertions.assertEquals(test,resultat);
    }

    @org.junit.jupiter.api.Test
    void op_multiplacation2() {
        Sample s = new Sample();
        int resultat = 150;
        int test = s.op(Sample.Operation.MULT,10,15);
        Assertions.assertEquals(test,resultat);
    }

    @Test
    void fact_positif() {
        Sample s = new Sample();
        int resultat = 120;
        int test = s.fact(5);
        Assertions.assertEquals(test,resultat);
    }
    @Test
    void fact_negatif() throws IllegalArgumentException {
        Sample s = new Sample();
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> s.fact(-5));
    }

    @Test
    void fact_0() {
        Sample s = new Sample();
        int resultat = 1;
        int test = s.fact(0);
        Assertions.assertEquals(test,resultat);
    }
}