package br.com.agenciaviagens.sistema_reservas_web.controller;

import br.com.agenciaviagens.sistema_reservas_web.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; // Importe esta classe

@Controller
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    /**
     * URL: /reservas
     * Lista TODAS as reservas.
     */
    @GetMapping("/reservas")
    public String listarReservas(Model model) {
        model.addAttribute("listaDeReservas", reservaRepository.findAll());
        return "reservas-lista";
    }

    /**
     * URL: /reservas/{id} (Ex: /reservas/abc-123-xyz)
     * Busca UMA reserva específica pelo seu ID, que vem na URL.
     */
    // CORREÇÃO 1: A URL agora espera um ID.
    @GetMapping("/reservas/{idDaReserva}")
    // CORREÇÃO 2: O método agora recebe o ID da URL como um parâmetro.
    public String buscarUmaReserva(@PathVariable String idDaReserva, Model model) {
        // Agora a variável "idDaReserva" existe e pode ser usada na busca.
        model.addAttribute("reservaEncontrada", reservaRepository.findById(idDaReserva));
        return "reserva-detalhe";
    }

    /**
     * URL: /reservas/nova
     * Mostra a página com o formulário para criar uma nova reserva.
     */
    @GetMapping("/reservas/nova")
    public String formularioNovaReserva() {
        return "reserva-formulario";
    }
    
    /**
     * URL: /
     * Mostra a página inicial com o menu.
     */
    @GetMapping("/")
    public String paginaInicial() {
        return "index";
    }
}