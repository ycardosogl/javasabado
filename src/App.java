import java.util.Scanner;

;public class App {
    public static void main(String[] args) throws Exception {
       String curso = "Java";
       int ch = 36;

       //System.out.printf("hoje iniciamos %s",curso);
       //System.out.printf(" o curso tem %d de carga horaria ",ch);

       System.out.printf("Hoje iniciamos %s o curso tem %d de carga horaria ",curso,ch);

       double valor = 5.1234;
       System.out.printf("\nDuas casas decimais: %.2f",valor);

       //leitura de dados no terminal
       Scanner sc = new Scanner(System.in);
       System.out.print("\nInforme seu nome: ");
       String nome = sc.nextLine();
       System.out.print("\nInforme sua idade: ");
       String idade = sc.nextLine();

       System.out.println("O nome digitado foi:"+nome);
       System.out.println("A idade digitada foi:"+idade);
       
       sc.close();
    }
}
