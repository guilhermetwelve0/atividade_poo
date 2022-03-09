package bankaccount;

import java.text.DecimalFormat;

public class Conta {
      private String titular;
      private Double saldo;
      private String num_cont;
      private String tipo_cont;
      private Integer numeroSaques = 0;
      
      public Conta(String titular, Double saldo, String num_cont, String tipo_cont) {
    	  this.tipo_cont = tipo_cont;
    	  this.titular = titular;
    	  this.saldo = saldo;
    	  this.num_cont = num_cont;
      }
      
      public void depositar(Double valor) {
    	  if(tipo_cont.equals("PF")) {
    		  valor -= valor * 0.02;
    	  } else {
    		  valor -= valor * 0.01;
    	  }
    	  saldo = saldo + valor;
    	  imprimeSaldo();
      }
      
      public Double sacar(Double valor) {
    	  Double valorSacado = valor;
    	  if(valor > saldo && tipo_cont.equals("PF")) {
    		  valor = 0.0;
    		  System.out.println("Não permitido saque maior que o valor da conta de " + getSaldoFormatado());
    	  } else {
    		  saldo = saldo - valor;
    		  if(numeroSaques > 3) {
    			  if(tipo_cont == ("PF")){
    				   valorSacado -= valorSacado * 0.02;
    			  } else {
    				  valorSacado -= valorSacado * 0.01;
    			  }
    		  }
    		  imprimeSaldo();
    	  }
    	  numeroSaques++;
		return valorSacado;
      }
      

	private String getSaldoFormatado() {
		// TODO Auto-generated method stub
		return new DecimalFormat("#0.00").format(saldo);
	}

	private void imprimeSaldo() {
		// TODO Auto-generated method stub
		System.out.println(titular + "tem R$" + getSaldoFormatado() + " na conta.");
	}
	
	public String getNomeTitular() {
		return titular;
	}
	
	public void setNomeTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldoConta() {
		return saldo;
	}
	public void setSaldoConta(Double saldo) {
		this.saldo = saldo;
	}
	public String getNumeroConta() {
		return num_cont;
	}
	public void setNumeroConta(String num_cont) {
		this.num_cont = num_cont;
	}
	public String getTipoConta() {
		return tipo_cont;
	}

	public void setTipoConta(String tipo_cont) {
		this.tipo_cont = tipo_cont;
	}

	public String getNome() {
		return titular;
	}

	public void setNome(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void saque(double d) {
		// TODO Auto-generated method stub
		
	}
	
      
 
      
}
