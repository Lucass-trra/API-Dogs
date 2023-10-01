package learning.DesignPatterns_SpringBoot.controller;

import learning.DesignPatterns_SpringBoot.model.Client;
import learning.DesignPatterns_SpringBoot.service.impl.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clients")
public class ClientsController {
    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> searchAll() {
        return ResponseEntity.ok(clientService.searchAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Client> searchForId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(clientService.searchForId(id));
    }

    @PostMapping
    public ResponseEntity<Client> insert(@RequestBody Client client) {
        clientService.insert(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping("{id}")
    public ResponseEntity<Client> update(@PathVariable("id") Long id, @RequestBody Client client) {
        clientService.update(id, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Client> delete(@PathVariable("id") Long id) {
        clientService.delete(id);
        return ResponseEntity.ok().build();

    }

}
