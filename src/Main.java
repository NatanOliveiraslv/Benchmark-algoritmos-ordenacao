import java.io.File;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        HeapSort heapSort = new HeapSort();

        String[] pastas = {
                "aleatoria_10.txt",
                "aleatoria_1000.txt",
                "aleatoria_10000.txt",
                "aleatoria_100000.txt",
                "aleatoria_1000000.txt",
                "ordenada_10.txt",
                "ordenada_1000.txt",
                "ordenada_10000.txt",
                "ordenada_100000.txt",
                "ordenada_1000000.txt",
                "reversa_10.txt",
                "reversa_1000.txt",
                "reversa_10000.txt",
                "reversa_100000.txt",
                "reversa_1000000.txt",
        };

        System.out.println("-------------- Tempo de execução em segundos --------------");
        System.out.println();

        for (String pasta : pastas) {
            CarregaDados carregaDados = new CarregaDados(Paths.get("dados", pasta).toString());
            int[] dadosOriginais = carregaDados.getValores();

            System.out.println("Nome do arquivo: " + pasta);
            System.out.printf("BubbleSort: %.6f \n", bubbleSort.testaAlgoritmo(dadosOriginais.clone()));
            System.out.printf("InsertionSort: %.6f \n", insertionSort.testaAlgoritmo(dadosOriginais.clone()));
            System.out.printf("HeapSort: %.6f \n", heapSort.testaAlgoritmo(dadosOriginais.clone()));
            System.out.println();
        }
    }
}
