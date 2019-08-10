package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.BotRepository;

@RestController
@RequestMapping({"/bots"})
public class BotController {

    private BotRepository repository;

    BotController(BotRepository botRepository) {
        this.repository = botRepository;
    };
}
