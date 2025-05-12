package com.b3306;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int Q = sc.nextInt();

            int[] vetor = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                vetor[i] = sc.nextInt();
            }

            Calcular processor = new Calcular(vetor);

            for (int i = 0; i < Q; i++) {
                int tipo = sc.nextInt();
                int A = sc.nextInt();
                int B = sc.nextInt();

                if (tipo == 1) {
                    int V = sc.nextInt();
                    processor.adicionar(A, B, V);
                } else if (tipo == 2) {
                    System.out.println(processor.maximoDivisorComum(A, B));
                }
            }
        }

        sc.close();
    }
}
