# Beecrowd 3306 - Consulta e Alteração

## Descrição

Dado um vetor com N elementos responda Q queries dos tipos:
- 1 A B V: Somar V em todos os elementos da posição A até a posição B do vetor.
- 2 A B: Retorna o Máximo Divisor Comum de todos os elementos das posições A até B no vetor

Entrada:
- A entrada consiste em diversos casos de teste. A primeira linha de cada caso de teste contém dois inteiros N Q, representando respectivamente o tamanho do vetor e a quantidade de queries. A segunda linha da entrada contém N inteiros representando os elementos do vetor. As próximas Q linhas contém as queries como descrito anteriormente.

Limites:
- 1 ≤ N; Q ≤ 10/\5

Saída:
- Para cada query do tipo dois imprima o MDC de todas as posições do vetor que estão no intervalo AB

https://judge.beecrowd.com/pt/problems/view/3306

---


## Ferramentas e Tecnologias

- Java 
- Maven
- JUnit
- JaCoCo

---

### Executando casos de test:

Dentro da pasta beecrowd executar o comando pelo terminal:

```bash
mvn clean verify
```
---
## Relatorios dos resultados

- Para certificar que os casos de teste estão funcionando, injetamos erros no codigo: https://github.com/viniwittler/verival-t1/issues/9

---
## Testes Aplicados

### 1. Partições de Equivalência
| Entrada             | Saída Esperada |
|---------------------|----------------|
| `{4, 6, 8}`          | `2`            |
| `{5, 9, 14}`         | `1`            |
| `{6, 6, 6}`          | `6`            |

https://github.com/viniwittler/verival-t1/issues/5

---

### 2. Valor-Limite
- **Limites Definidos:** `1 ≤ N, Q ≤ 100.000`
- **Exemplo de Entrada:** Vetor com `100.000` elementos

https://github.com/viniwittler/verival-t1/issues/6

---

### 3. Contrato
- **Pré-condição:** `0 ≤ a ≤ b < vetor.length`  
- **Pós-condição:** O resultado deve ser o **maior divisor comum** de todos os valores no intervalo `[a, b]`

https://github.com/viniwittler/verival-t1/issues/7

---

### 4. Propriedade
- **Entrada:** `{5, 8}`  
- **Saída Esperada:** `5, 8`

https://github.com/viniwittler/verival-t1/issues/8
