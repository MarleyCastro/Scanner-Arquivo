import java.io.File; //leitua de arquivos
import java.io.FileNotFoundException; //Tratar um arquivo não encontrado
import java.util.Scanner;
public class letText {
    public static void main(String args []){
        try{ //leitura do arquivo
            File arquivo = new File("dados.txt"); //nome do objeto cirado é 'arquivo'
            Scanner scanner = new Scanner(arquivo); //dentro do metodo scanner caminho do arquivo
        while(scanner.hasNextLine()){ //metodo do file que me permite ler a proxima linha
            String linha = scanner.nextLine(); //criando uma váriavel para ler a linha
            System.out.printf("%s%n", linha); //imprimir e formatar a linha
        }
    }catch(FileNotFoundException ex){ //seção de arquivo não encontrado (erro caso o arquivo não seja encontrado)
        System.out.printf("Erro abertura do arquivo: %s.%n",ex.getMessage());
        }
    }
}