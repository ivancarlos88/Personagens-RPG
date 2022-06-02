package personagens;

public class Guerreiro extends Nick{
	protected int for�a;

	public Guerreiro(int level, int vida, int defesa, int exp, int for�a, int gaugeExp) {
		super(level, vida, defesa, exp, gaugeExp);
		this.for�a = for�a;
	}

	public int getFor�a() {
		return for�a;
	}

	public void setFor�a(int for�a) {
		this.for�a = for�a;
	}
	
	public void statusGuerreiro() {
		System.out.println("Level: " + this.level);
		System.out.println("Vida: " + this.vida);
		System.out.println("Defesa: " + this.defesa);
		System.out.println("Exp: " + this.exp);
		System.out.println("For�a: " + this.for�a);
	}
}
