package bankaccount;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta("123456", 800.00, "Joao da Silva", "PF");
		conta1.depositar(100.0);
		conta1.saque(10000.00);
		
		
		System.out.println("Saldo:" + conta1.getSaldo()); 

	}

}
