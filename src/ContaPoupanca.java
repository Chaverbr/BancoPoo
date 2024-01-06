import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ContaPoupanca extends Conta {

      public ContaPoupanca(Cliente cliente) {
            super(cliente);
      }

      private double juros = (8/100)/12;
      
      private Calendar data = Calendar.getInstance();
      // private int mes = data.get(Calendar.MONTH);
      private int mes;
      private int mesUltimoDeposito;

      public void depositar(double valor) {
            mesUltimoDeposito = data.get(Calendar.MONTH);
            saldo += valor;
      }

      private void adicionaJuros() {
            saldo += saldo*juros;
      }

      public void verificaData() {
            if (mes + 1 == mesUltimoDeposito) {
                  adicionaJuros();
            }
      }

      public int getMes() {
            return mes;
      }

      public void setMes(String mes) {
            String[] listaMes = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
            
            List<String> listaMeses = Arrays.asList(listaMes);
            int indice = listaMeses.indexOf(mes);

            if (indice != -1) {
                  this.mes = indice;
            } else {
                System.out.println("Mês fornecido é inválido!");
            }
      }

      public int getMesUltimoDeposito() {
            return mesUltimoDeposito;
      }

      public void imprimirExtrato() {
            System.out.println("Extrato da conta poupança");
            super.imprimirInfosComuns();
      }

}
