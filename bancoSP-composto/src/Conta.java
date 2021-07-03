class Conta { // atributos da conta s�o suas especificacoes (caracteristicas):
	private double saldo = 10;
	int agencia;
	int numero;
	Cliente titular;

	/*
	 * "this" chama o saldo que � uma caracteristica de Conta. Ou seja, verbalizando
	 * a linha de c�digo fica assim: Saldo atual � > Saldo atual + o double valor
	 * tempor�rio que ser� recebido no metodo 'depositaDinero'.
	 */
	public void depositaDinero(double valor) {
		this.saldo += valor;

	}

	/* n�o existe m�todo dentro de m�todo. */
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


