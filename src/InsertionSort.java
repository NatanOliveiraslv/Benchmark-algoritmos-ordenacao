public class InsertionSort {

    private int[] valores;
    private long tempoDeExecucao;

    public InsertionSort() {
    }

    public double testaAlgoritmo(int[] valores) {
        this.valores = valores;
        long tempoInicial = System.nanoTime();
        ordena();
        long tempoFinal = System.nanoTime();
        return (tempoFinal - tempoInicial) / 1_000_000_000.0;
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

    public void imprimiValores(){
        for(int valor : valores) {
            System.out.print(valor + " ");
        }
    }

}
