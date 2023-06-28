
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente Alessandra = new Cliente();
		Alessandra.setNome("Alessandra");
 		Conta cc = new ContaCorrente(Alessandra);
		Conta cp = new ContaPoupanca(Alessandra);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
