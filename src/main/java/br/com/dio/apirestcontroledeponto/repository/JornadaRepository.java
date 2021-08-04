package br.com.dio.apirestcontroledeponto.repository;

import br.com.dio.apirestcontroledeponto.models.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
    JornadaTrabalho findById(long idJornada);
}
