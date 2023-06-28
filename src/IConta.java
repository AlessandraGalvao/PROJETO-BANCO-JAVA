
public interface IConta {

	void sacar(double valor);
	
	void depositar(double valor);
	
	void trasnferir(double valor, Conta contadestino);
	
	void imprimirExtrato ();
}
