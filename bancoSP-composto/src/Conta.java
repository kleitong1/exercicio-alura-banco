class Conta { // atributos da conta são suas especificacoes (caracteristicas):
	private double saldo = 10;
	int agencia;
	int numero;
	Cliente titular;

	/*
	 * "this" chama o saldo que é uma caracteristica de Conta. Ou seja, verbalizando
	 * a linha de código fica assim: Saldo atual é > Saldo atual + o double valor
	 * temporário que será recebido no metodo 'depositaDinero'.
	 */
	public void depositaDinero(double valor) {
		this.saldo += valor;

	}

	/* não existe método dentro de método. */
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositaDinero(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
}


