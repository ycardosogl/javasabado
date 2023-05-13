import java.util.Scanner;

public class tarefa {

    public static void main(String[] args) {
        //ler um numero e mostrar o numero digitado 
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite um numero: ");
        String numero = sc.nextLine();
 
        System.out.println("O numero digitado foi:"+numero);
        sc.close();
    }
    
}
