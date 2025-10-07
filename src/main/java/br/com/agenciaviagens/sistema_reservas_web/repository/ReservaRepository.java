package br.com.agenciaviagens.sistema_reservas_web.repository;

import br.com.agenciaviagens.sistema_reservas_web.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservaRepository extends MongoRepository<Reserva, String> {
    // Vazio! O Spring faz a mágica.
}