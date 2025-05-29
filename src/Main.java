
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarregaDados carregaDados = new CarregaDados("dados.txt");
        BubbleSort bubbleSort = new BubbleSort(carregaDados.getValores());
        System.out.println();
        InsertionSort insertionSort = new InsertionSort(carregaDados.getValores());
        System.out.println();
        HeapSort heapSort = new HeapSort(carregaDados.getValores());
    }
}