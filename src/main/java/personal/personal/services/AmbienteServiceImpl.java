package personal.personal.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personal.personal.entities.Ambiente;
import personal.personal.entities.Objeto;
import personal.personal.repositories.AmbienteRepository;

import java.util.List;

@Service
public class AmbienteServiceImpl implements AmbienteService {

    @Autowired
    private AmbienteRepository ambienteRepository;

    @Override
    public void agregarAmbiente(Ambiente ambiente) {
        ambienteRepository.save(ambiente);
    }

    @Override
    public Ambiente obtenerAmbientePorId(Integer id) {
        return ambienteRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Ambiente> obtenerAmbientes() {
        return ambienteRepository.findAll();
    }

    @Override
    public void actualizarAmbiente(Ambiente ambiente) {
        ambienteRepository.save(ambiente);
    }

    @Override
    public void eliminarAmbientePorId(Integer id) {
        ambienteRepository.deleteById(id);
    }
}
