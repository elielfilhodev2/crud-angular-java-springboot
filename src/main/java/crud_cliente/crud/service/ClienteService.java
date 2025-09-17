package crud_cliente.crud.service;

import crud_cliente.crud.domain.Cliente;
import crud_cliente.crud.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public List<Cliente> listar() {
        return repo.findAll();
    }

    public Cliente obter(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Cliente salvar(Cliente c) {
        return repo.save(c);
    }

    public void remover(Long id) {
        repo.deleteById(id);
    }
}
