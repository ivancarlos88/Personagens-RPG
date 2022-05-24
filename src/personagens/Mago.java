package personagens;

public class Mago extends Nick {
	protected int inteligencia;

	public Mago(int level, int vida, int defesa, int exp, int inteligencia, int gaugeExp) {
		super(level, vida, defesa, exp, gaugeExp);
		this.inteligencia = inteligencia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public void LevelMago() {
		
	}
}
