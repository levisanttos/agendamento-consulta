package br.com.ailv.agendamento_consulta.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Paciente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String sobrenome;
	
	private String cpf;
	
	private String email;
	
	private String telefone;
	
	private String nomeConvenio;
	
	@OneToMany(mappedBy = "paciente")
	private List<Consulta> consultas;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "paciente_medico", 
			joinColumns = @JoinColumn(name = "paciente_id", referencedColumnName = "id"), 
			inverseJoinColumns = @JoinColumn(name = "medico_id", referencedColumnName = "id"))
	private List<Medico> medicos;
	
}
