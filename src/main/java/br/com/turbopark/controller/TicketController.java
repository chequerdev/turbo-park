package br.com.turbopark.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tickets")
public class TicketController {

    @PostMapping
    public String criarTicket() {
        return "ola mundo";
    }
}
