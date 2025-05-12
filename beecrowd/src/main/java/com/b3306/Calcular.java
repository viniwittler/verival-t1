package com.b3306;
import java.math.BigInteger;

public class Calcular {
    private int[] vetor;

    public Calcular(int[] vetor) {
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


