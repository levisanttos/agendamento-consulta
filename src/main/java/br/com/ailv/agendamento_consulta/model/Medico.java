package br.com.ailv.agendamento_consulta.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medico implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private String especialidade;
	
	@OneToMany(mappedBy = "medico")
	private List<Consulta> consultas;
	
	@ManyToMany(mappedBy = "medicos")
	private List<Paciente> pacientes;
}
