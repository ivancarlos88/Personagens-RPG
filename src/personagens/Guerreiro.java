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
	
	public void LevelGuerreiro() {
		
	}

	
}
