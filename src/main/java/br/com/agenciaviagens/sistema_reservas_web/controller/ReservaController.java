package br.com.agenciaviagens.sistema_reservas_web.controller;

import br.com.agenciaviagens.sistema_reservas_web.model.Reserva;
import br.com.agenciaviagens.sistema_reservas_web.repository.ReservaRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

  @GetMapping("/reservas")
    public String listarReservas(Model model) {

    List<Reserva> todasAsReservas = reservaRepository.findAll();

    // ================== LINHA DE DEBUG FINAL ==================
    if (todasAsReservas != null && !todasAsReservas.isEmpty()) {
        System.out.println("### DEBUG: DADOS DO PRIMEIRO ITEM DA LISTA: " + todasAsReservas.get(0).toString());
    } else {
        System.out.println("### DEBUG: A LISTA RETORNADA PELO findAll() ESTÁ VAZIA OU NULA.");
    }
    // ==========================================================

    model.addAttribute("listaDeReservas", todasAsReservas);
    return "reservas-lista"; 
}
}

    
}