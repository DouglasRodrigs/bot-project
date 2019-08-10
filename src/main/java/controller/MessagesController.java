package controller;

import model.Messages;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.MessagesRepository;

import java.util.List;

@RestController
@RequestMapping({"/messages"})
public class MessagesController {

    private MessagesRepository repository;

    MessagesController(MessagesRepository messagesRepository) {
        this.repository = messagesRepository;
    };

    @GetMapping
    public List findAll(){
        return repository.findAll();
    }

    @GetMapping(path = {"/{conversationId}"})
    public ResponseEntity findById(@PathVariable long conversationId){
        return repository.findById(conversationId)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Messages create(@RequestBody Messages messages){
        return repository.save(messages);
    }
}
