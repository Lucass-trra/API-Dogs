package learning.DesignPatterns_SpringBoot.service.impl;

import learning.DesignPatterns_SpringBoot.model.Client;
import learning.DesignPatterns_SpringBoot.model.Dog;
import learning.DesignPatterns_SpringBoot.repository.ClientRepository;
import learning.DesignPatterns_SpringBoot.repository.DogRepository;
import learning.DesignPatterns_SpringBoot.service.DogApiConnect;
import learning.DesignPatterns_SpringBoot.service.ServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClientServiceImpl implements ServiceImplements<Client> {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private DogRepository dogRepository;
    @Autowired
    private DogApiConnect dogApiConnect;

    @Value("${dog.api.key}")
    private String apiKey;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Client> searchAll() {
        //Buscar todos os clientes
        return clientRepository.findAll();
    }
    @Override
    public Client searchForId(Long id) {
        //Buscar cliente por ID
        Optional<Client> client = clientRepository.findById(id);
        return client.orElse(null);
    }
    @Override
    public void insert(Client client) {
        //Adicionar um novo cliente, se ele não existir na base de dados
        saveClientWithDog(client);

    }
    @Override
    public void update(Long id, Client client) {
        //Atualizar as informações de um cliente específico, se ele existir na base de dados
        Optional<Client> clientOptional = clientRepository.findById(id);

        if(clientOptional.isPresent()) {
            saveClientWithDog(client);
        }

    }
    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void saveClientWithDog(Client client) {
        //Verificar se o cachorro do cliente ja existe (pelo nome)
        String name = client.getDog().getName();
        final Dog[] dogFound = new Dog[1];

        Dog dog = dogRepository.findById(name).orElseGet(() -> {
        //caso não exista, integrar com o api-ninjas e persistir o retorno

            Dog[] newDog = dogApiConnect.queryDog(name,apiKey);
            for (Dog d : newDog) {
                dogFound[0] = d;
                dogRepository.save(d);

            }
            return dogFound[0];
        });
        client.setDog(dog);
        //inserir cliente, vinculando o cachorro (novo ou existente)
        clientRepository.save(client);
    }
}
