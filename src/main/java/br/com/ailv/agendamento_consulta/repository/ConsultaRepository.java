package br.com.ailv.agendamento_consulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ailv.agendamento_consulta.model.Consulta;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

}
