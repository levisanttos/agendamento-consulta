package br.com.ailv.agendamento_consulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailv.agendamento_consulta.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
