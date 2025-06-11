import java.io.File;

public class Main {
    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        HeapSort heapSort = new HeapSort();

        File pasta = new File("C:\\Users\\12922114821\\IdeaProjects\\Benchmark_algoritmos_ordenacao\\src\\dados");
        File[] arquivos = pasta.listFiles();

        System.out.println("-------------- Tempo de execução em nanosegundos --------------");
        System.out.println();

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                CarregaDados carregaDados = new CarregaDados("dados" + "\\" + arquivo.getName());
                int[] dadosOriginais = carregaDados.getValores();

                System.out.println("Nome do arquivo: " + arquivo.getName());
                System.out.printf("BubbleSort: %.6f \n", bubbleSort.testaAlgoritmo(dadosOriginais.clone()));
                System.out.printf("InsertionSort: %.6f \n", insertionSort.testaAlgoritmo(dadosOriginais.clone()));
                System.out.printf("HeapSort: %.6f \n", heapSort.testaAlgoritmo(dadosOriginais.clone()));
                System.out.println();
            }
        } else {
            System.out.println("A pasta está vazia ou não pode ser lida.");
        }
    }
}
