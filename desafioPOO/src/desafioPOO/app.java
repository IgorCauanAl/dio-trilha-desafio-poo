package desafioPOO;

public class app {
	public static void main(String[] args) {
      Devs dev1 = new Devs();
      dev1.setNome("Igor");
      
      Curso curso1 = new Curso();
      Curso curso2 = new Curso();
      curso1.setTitulo("Curso Java");
      curso2.setTitulo("Curso SpringBoot");
      curso1.setCargaHoraria(4);
      curso2.setCargaHoraria(5);
      
      Mentorias mentoria = new Mentorias();
      mentoria.setTitulo("Mentoria Java");
      mentoria.setDescricao("Mentoria para java");
      
      BootCamp bootcamp = new BootCamp();
      bootcamp.setNome("BootCamp Java Claro");
      bootcamp.setDescricao("Bootcamp da java patrocinado pela Claro");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);
      
      
      dev1.inscreverBootCamp(bootcamp);
      dev1.progredir();
      dev1.progredir();
      dev1.progredir();
      dev1.exibirTodosOsCursosInscritos();
      System.out.println("Total de xp: " + dev1.calcularTotalXp());
      System.out.println("Todos os cursos concluidos: " + dev1.getConteudosConcluidos());
      System.out.println(mentoria.toString());
      
      
	}
}
