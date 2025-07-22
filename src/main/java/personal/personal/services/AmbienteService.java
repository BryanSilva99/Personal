package personal.personal.services;

import personal.personal.entities.Ambiente;
import personal.personal.entities.Objeto;

import java.util.List;

public interface AmbienteService {
    public void agregarAmbiente(Ambiente ambiente);
    public Ambiente obtenerAmbientePorId(Integer id);
    public List<Ambiente> obtenerAmbientes();
    public void actualizarAmbiente(Ambiente ambiente);
    public void eliminarAmbientePorId(Integer id);
}
