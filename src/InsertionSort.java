public class InsertionSort {

    private int[] valores;

    public InsertionSort(int[] valores) {
        this.valores = valores;
        ordena();
        imprimiValores();
    }

    private void ordena(){
        for(int i = 1; i < valores.length; i++) {
            int chave = valores[i];
            int j = i - 1;
            while(j >= 0 && valores[j] > chave){
                valores[j + 1] = valores[j];
                j--;
            }
            valores[j + 1] = chave;
        }
    }

    private void imprimiValores(){
        for(int valor : valores) {
            System.out.print(valor + " ");
        }
    }

}
