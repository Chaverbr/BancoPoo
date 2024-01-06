public class Main {
      public static void main(String[] args) {
            Cliente jailton = new Cliente();
            ContaPoupanca conta = new ContaPoupanca(jailton);
            conta.depositar(200);
            
      }
}
