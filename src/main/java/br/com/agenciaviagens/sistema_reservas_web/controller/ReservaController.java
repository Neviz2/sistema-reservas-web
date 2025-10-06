package br.com.agenciaviagens.sistema_reservas_web.controller;

import br.com.agenciaviagens.sistema_reservas_web.repository.ReservaRepository;
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
        model.addAttribute("listaDeReservas", reservaRepository.findAll());
        return "reservas-lista"; 
    }
}