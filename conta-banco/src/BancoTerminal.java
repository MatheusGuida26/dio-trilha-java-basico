import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    double saldo = 15.0;
    double valorSolicitado = 22.0;

    if (saldo > valorSolicitado) {
        saldo -= valorSolicitado;
    }
    else {
        System.out.println("Saldo insuficiente");
    }
    System.out.println("Saldo atualizado: R$ " + saldo);
    sc.close();}
}
