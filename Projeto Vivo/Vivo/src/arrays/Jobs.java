package arrays;

import java.time.Duration;
import java.time.LocalDateTime;

public class Jobs {
	
	public int ID;
	public String Descricao;
	public LocalDateTime DataConclusao;
	public Duration TempoEstimado;
	public String PeriodoExecucao;
	
								
	public Jobs () {
		
	}
	
	public Jobs(int iD, String descricao, LocalDateTime dataConclusao, Duration tempoEstimado, String periodoExecucao) {
		super();
		ID = iD;
		Descricao = descricao;
		DataConclusao = dataConclusao;
		TempoEstimado = tempoEstimado;
		PeriodoExecucao = periodoExecucao;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public LocalDateTime getDataConclusao() {
		return DataConclusao;
	}

	public void setDataConclusao(LocalDateTime dataConclusao) {	
		DataConclusao = dataConclusao;
	}

	public Duration getTempoEstimado() {
		return TempoEstimado;
	}

	public void setTempoEstimado(Duration tempoEstimado) {
		TempoEstimado = tempoEstimado;
	}

	
	public String getPeriodoExecucao() {
		return PeriodoExecucao;
	}

	public void setPeriodoExecucao(String periodoExecucao) {
		PeriodoExecucao = periodoExecucao;
	}
		
		
	@Override
	public String toString() {
		return "Jobs [Periodo de Execucao: " + PeriodoExecucao + "\nID: " + ID + ", Descricao: " + Descricao + ", Data de Conclusao: " + DataConclusao + ", Tempo Estimado: "
				+ TempoEstimado + "]";
	}

	
}
