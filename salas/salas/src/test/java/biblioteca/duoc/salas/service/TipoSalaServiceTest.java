package biblioteca.duoc.salas.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import biblioteca.duoc.salas.repository.TipoSalaRepository;

@ExtendWith(MockitoExtension.class) //iniciar los mocks de mockito
public class TipoSalaServiceTest {

    @Mock //declarando del mock de repo
    private TipoSalaRepository Repo;

    @InjectMocks // creando objeto de testeo con mock inyectados
    private TipoSalaService service;

    @Test //se usa para cada testeo unitario
    void findAll_returnListFromRepo(){
        
    }
}
