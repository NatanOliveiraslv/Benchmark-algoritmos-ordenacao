import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CarregaDados {

    private int[] valores;

    public CarregaDados(String nomeArq){
        String nomeArq1 = Paths.get("src", nomeArq).toString();
        valores = new int[qtdValores(nomeArq1)];
        try(BufferedReader br = new BufferedReader(new FileReader(nomeArq1))) {
            String linha;
            int i = 0;
            while ((linha = br.readLine()) != null){
                valores[i] = Integer.parseInt(linha);
                i++;
            }
        }catch (IOException e){
            System.out.println("Deu erro: " + e);
        }
    }

    private int qtdValores(String nomeArq1){
        int qtd = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(nomeArq1))) {
            while (br.readLine() != null){
                qtd++;
            }
        }catch (IOException e){
            System   .out.println("Deu erro: " + e);
        }
        return qtd;
    }

    public int[] getValores() {
        return valores;
    }
}
