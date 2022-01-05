package arrays;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;

public class Main {
		
	
	public static void main (String [] args) {
		
		ArrayList <Jobs> ListaDeJobs = new ArrayList();
		
		Jobs j1 = new Jobs ();
		j1.setID(1);
		j1.setDescricao("Importação de arquivos de fundos");
		j1.setDataConclusao(LocalDateTime.of(2019, 11, 10, 12, 0));
		j1.setTempoEstimado(Duration.ofHours(2));
		j1.setPeriodoExecucao("2019-11-10T09:00:00 até 2019-11-11T12:00:00");
		ListaDeJobs.add(j1);
		
		Jobs j2 = new Jobs ();
		j2.setID(2);
		j2.setDescricao("Importação de dados da Base Legada");
		j2.setDataConclusao(LocalDateTime.of(2019, 11, 11, 12, 0));
		j2.setTempoEstimado(Duration.ofHours(4));
		j2.setPeriodoExecucao("2019-11-10T09:00:00 até 2019-11-11T12:00:00");
		ListaDeJobs.add(j2);
		
		Jobs j3 = new Jobs ();
		j3.setID(3);
		j3.setDescricao("Importação de dados de integração");
		j3.setDataConclusao(LocalDateTime.of(2019, 11, 11, 8, 0));
		j3.setTempoEstimado(Duration.ofHours(6));		
		j3.setPeriodoExecucao("2019-11-10T09:00:00 até 2019-11-11T12:00:00");
		ListaDeJobs.add(j3);
		
						
		System.out.println(j1.toString());
		System.out.println(j3.toString());
		System.out.println(j2.toString());
		
		
	}

}
										

	

