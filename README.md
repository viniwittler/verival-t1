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

![Texto alternativo](https://private-user-images.githubusercontent.com/105309416/444284348-2e55c2be-11f5-43a3-a5f2-2cad65837af5.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3NDczNDE2MDcsIm5iZiI6MTc0NzM0MTMwNywicGF0aCI6Ii8xMDUzMDk0MTYvNDQ0Mjg0MzQ4LTJlNTVjMmJlLTExZjUtNDNhMy1hNWYyLTJjYWQ2NTgzN2FmNS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjUwNTE1JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI1MDUxNVQyMDM1MDdaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yMDA1ZWQyNTg0NjIxZjdhMDEwNmUwMGRiY2Q2MGY2OWQ5MTllNjAxNGEwODRiYTExZmUxZWJmNjUxY2VjNWRhJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.gs6s1zEcDw2KjM7u1F6mCSncn0iRt3lFQIvnTGUVb7Y)

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
