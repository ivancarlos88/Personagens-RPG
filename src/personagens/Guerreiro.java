package personagens;

public class Guerreiro extends Nick{
	protected int força;

	public Guerreiro(int level, int vida, int defesa, int exp, int força, int gaugeExp) {
		super(level, vida, defesa, exp, gaugeExp);
		this.força = força;
	}

	public int getForça() {
		return força;
	}

	public void setForça(int força) {
		this.força = força;
	}
	
	public void statusGuerreiro() {
		System.out.println("Level: " + this.level);
		System.out.println("Vida: " + this.vida);
		System.out.println("Defesa: " + this.defesa);
		System.out.println("Exp: " + this.exp);
		System.out.println("Força: " + this.força);
	}
}
