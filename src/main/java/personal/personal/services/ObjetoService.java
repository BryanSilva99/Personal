package personal.personal.services;

import personal.personal.entities.Objeto;

import java.util.List;


public interface ObjetoService {
    public void agregarObjeto(Objeto objeto);
    public Objeto obtenerObjetoPorId(Integer id);
    public List<Objeto> obtenerObjetos();
    public void actualizarObjeto(Objeto objeto);
    public void eliminarObjetoPorId(Integer id);
}
