package desafioPOO;

import java.time.LocalDate;

public class Mentorias extends Conteudo{

	private LocalDate dataMentoria = LocalDate.now();  
	
	@Override
	public double calcularXp() {
		
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "[ Mentoria: " + titulo + ", Data Mentoria: " + dataMentoria + ", Descricao: " + descricao + "]";
	}
	
	
    
	
}
