import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
        int primeiroNumero = terminal.nextInt();
        int segundoNumero = terminal.nextInt();

        try{
            contar(primeiroNumero, segundoNumero);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro.!!");
        }

        
    terminal.close();
}
static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
    if(primeiroNumero > segundoNumero){
        throw new ParametrosInvalidosException();
    }
    int contagem = segundoNumero - primeiroNumero;
    for(int i=1; i<=contagem;i++){
        System.out.println("Imprimindo número: " + i);
    }
}

}