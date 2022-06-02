package personagens;

public class Nick {
	protected int level;
	protected int vida;
	protected int defesa;
	protected int exp;
	protected int gaugeExp;
	
	
	public Nick(int level, int vida, int defesa, int exp, int gaugeExp) {
		
		this.level = level;
		this.vida = vida;
		this.defesa = defesa;
		this.exp = exp;
		this.gaugeExp = gaugeExp;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}

	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public int getDefesa() {
		return defesa;
	}


	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}


	public double getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
	public int getGaugeExp() {
		return gaugeExp;
	}
	

	public void setGaugeExp(int gaugeExp) {
		this.gaugeExp = gaugeExp;
	}
	
	public void nextLevel() {
		if(exp >= gaugeExp) {
			level++;
			System.out.println("LEVEL UP!");
		}
	}
	
	
	
}
