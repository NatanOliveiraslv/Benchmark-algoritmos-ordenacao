
# 📊 Análise de Algoritmos de Ordenação em Java

Este projeto compara o desempenho dos algoritmos **Bubble Sort**, **Insertion Sort** e **Heap Sort** em diferentes cenários de ordenação e tamanhos de entrada. Os dados utilizados variam entre listas aleatórias, ordenadas e inversamente ordenadas, com quantidades de elementos que vão de 10 até 1.000.000.

## 🧠 Objetivo

Analisar e comparar o tempo de execução dos algoritmos de ordenação mais comuns, utilizando como base arquivos de entrada com diferentes características e tamanhos, para verificar qual algoritmo se mostra mais eficiente em cada contexto.

## 🧪 Algoritmos Implementados

- [x] Bubble Sort (`BubbleSort.java`)
- [x] Insertion Sort (`InsertionSort.java`)
- [x] Heap Sort (`HeapSort.java`)
- [x] Sistema de carregamento de dados (`CarregaDados.java`)
- [x] Execução principal (`Main.java`)

## 📁 Arquivos de Entrada

As entradas foram separadas em três categorias:

- `aleatoria_X.txt` — Dados em ordem aleatória
- `ordenada_X.txt` — Dados em ordem crescente
- `reversa_X.txt` — Dados em ordem decrescente (reversa)

Em que `X` representa a quantidade de elementos: 10, 1000, 10000, 100000, 1000000.

## ⏱️ Resultados (Tempo em segundos)

### ➤ Entradas Aleatórias

| Tamanho     | Bubble Sort  | Insertion Sort | Heap Sort   |
|-------------|--------------|----------------|-------------|
| 10          | 0,000004     | 0,000003       | 0,000006    |
| 1.000       | 0,004467     | 0,001838       | 0,000326    |
| 10.000      | 0,088857     | 0,021175       | 0,001359    |
| 100.000     | 12,294142    | 1,858773       | 0,011459    |
| 1.000.000   | 1220,394178  | 190,107226     | 0,128425    |

### ➤ Entradas Ordenadas

| Tamanho     | Bubble Sort  | Insertion Sort | Heap Sort   |
|-------------|--------------|----------------|-------------|
| 10          | 0,000001     | 0,000000       | 0,000042    |
| 1.000       | 0,000165     | 0,000002       | 0,000087    |
| 10.000      | 0,015757     | 0,000015       | 0,000616    |
| 100.000     | 1,586901     | 0,000144       | 0,006081    |
| 1.000.000   | 156,961298   | 0,001464       | 0,067595    |

### ➤ Entradas Reversas

| Tamanho     | Bubble Sort  | Insertion Sort | Heap Sort   |
|-------------|--------------|----------------|-------------|
| 10          | 0,000001     | 0,000001       | 0,000009    |
| 1.000       | 0,000668     | 0,000425       | 0,000046    |
| 10.000      | 0,068508     | 0,037153       | 0,000545    |
| 100.000     | 7,020583     | 3,986541       | 0,006542    |
| 1.000.000   | 694,597749   | 374,988394     | 0,072687    |

## 📈 Análise Comparativa

| Critério               | Bubble Sort     | Insertion Sort   | Heap Sort        |
|------------------------|-----------------|------------------|------------------|
| **Melhor caso**        | O(n)            | O(n)             | O(n log n)       |
| **Médio caso**         | O(n²)           | O(n²)            | O(n log n)       |
| **Pior caso**          | O(n²)           | O(n²)            | O(n log n)       |
| **Estabilidade**       | ✅ Sim           | ✅ Sim            | ❌ Não            |
| **Uso de memória**     | Constante       | Constante        | Logarítmico      |
| **Facilidade**         | Muito simples   | Simples          | Mais complexa    |

## 🏁 Conclusão

- **Bubble Sort**: Extremamente ineficiente para entradas grandes; útil apenas para fins educacionais.
- **Insertion Sort**: Razoável para pequenas entradas ou listas quase ordenadas.
- **Heap Sort**: Apresentou o **melhor desempenho geral**, especialmente em grandes volumes de dados e entradas desordenadas.

📌 **Recomendação final**:
- Use **Insertion Sort** para listas pequenas ou já ordenadas.
- Use **Heap Sort** como escolha padrão para grandes volumes ou quando a eficiência for prioridade.
