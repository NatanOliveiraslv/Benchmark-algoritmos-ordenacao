public class BubbleSort {
    private int[] valores;

    public BubbleSort() {
    }

    public double testaAlgoritmo(int[] valores) {
        this.valores = valores;
        long tempoInicial = System.nanoTime();
        ordena();
        long tempoFinal = System.nanoTime();
        return (tempoFinal - tempoInicial) / 1_000_000_000.0;
    }

    private void ordena(){
        for(int i = 0; i < valores.length; i++) {
            for(int j = 0; j < valores.length - i - 1; j++){
                if(valores[j] > valores[j + 1]){
                    int temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                }
            }
        }
    }

    public void imprimiValores(){
        for(int valor : valores) {
            System.out.print(valor + " ");
        }
    }

}
