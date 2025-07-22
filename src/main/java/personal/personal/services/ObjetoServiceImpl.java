package personal.personal.services;

import personal.personal.entities.Objeto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personal.personal.repositories.ObjetoRepository;

import java.util.List;

@Service
public class ObjetoServiceImpl implements ObjetoService{

    @Autowired
    private ObjetoRepository objetoRepository;

    @Override
    public void agregarObjeto(Objeto objeto) {
        objetoRepository.save(objeto);
    }

    @Override
    public Objeto obtenerObjetoPorId(Integer id) {
        return objetoRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Objeto> obtenerObjetos() {
        return objetoRepository.findAll();
    }

    @Override
    public void actualizarObjeto(Objeto objeto) {
        objetoRepository.save(objeto);
    }

    @Override
    public void eliminarObjetoPorId(Integer id) {
        objetoRepository.deleteById(id);
    }
}
