
public abstract class Veiculo {

	public String marca; //Se ficar como private, nao consigo associar ao carro.
	public int velocidade; //Se ficar como private, nao consigo associar ao carro.
	public int potencia; //Se ficar como private, nao consigo associar ao carro.
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
