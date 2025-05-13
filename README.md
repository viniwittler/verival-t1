# Beecrowd 3306 - Consulta e Alteração

## Descrição
Dado um vetor com N elementos responda Q queries dos tipos:
- 1 A B V: Somar V em todos os elementos da posição A até a posição B do vetor.
- 2 A B: Retorna o Máximo Divisor Comum de todos os elementos das posições A até B no vetor

https://judge.beecrowd.com/pt/problems/view/3306

---
## Teste Aplicados

1. **Partições de Equivalência**
- Entrada: {4, 6, 8}
- Saida Esperada: 2

- Entrada: {5, 9, 14}
- Saida Esperada: 1

- Entrada: {6, 6, 6}
- Saida Esperada: 6

2. **Valor-Limite**
- Valor Limite: 1 ≤ N, Q ≤ 100.000
- Entrada: vetor de 100_000

3. **Contrato**
- Pré-condição: 0 <= a <= b < vetor.length

- Pós-condição: O resultado deve ser o maior número que divide todos os valores do intervalo [a, b]

4. **Cobertura de Código**

---

## Ferramentas e Tecnologias

- Java 
- Maven
- JUnit
- JaCoCo

---
