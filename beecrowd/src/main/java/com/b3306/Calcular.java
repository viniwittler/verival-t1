package com.b3306;
import java.math.BigInteger;

public class Calcular {
    private static final int LIMITE = 100_000;
    private int[] vetor;

    public Calcular(int[] vetor) {
        if (vetor.length > LIMITE) {
            throw new IllegalArgumentException("O vetor excede o limite de 100.000 elementos.");
        }
        this.vetor = vetor;
    }

    public void adicionar(int a, int b, int v) {
        for (int i = a; i <= b; i++) {
            vetor[i] += v;
        }
    }

    public int maximoDivisorComum(int a, int b) {
        int mdc = vetor[a];
        for (int i = a + 1; i <= b; i++) {
            mdc = BigInteger.valueOf(mdc).gcd(BigInteger.valueOf(vetor[i])).intValue();
            if (mdc == 1) break;
        }
        return mdc;
    }
}


