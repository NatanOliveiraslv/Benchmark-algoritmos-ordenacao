public class HeapSort {
    private int[] valores;

    public HeapSort(int[] valores) {
        this.valores = valores;
        ordena();
        imprimiValores();
    }

    private void ordena(){
        int n = valores.length;
        for(int i = n / 2 - 1; i >= 0; i--){
            aplicarHeap(n, i);
        }
        for(int j = n-1; j > 0; j--) {
            int aux = valores[0];
            valores[0] = valores[j];
            valores[j] = aux;

            aplicarHeap(j, 0);
        }
    }

    private void aplicarHeap(int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && valores[esquerda] > valores[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && valores[direita] > valores[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            int aux = valores[i];
            valores[i] = valores[raiz];
            valores[raiz] = aux;

            aplicarHeap(n, raiz);
        }
    }

    private void imprimiValores(){
        for(int valor : valores) {
            System.out.print(valor + " ");
        }
    }

}
