package gestion;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

public class Gestion_clientes {

    private List<Cliente> lista_clientes = new ArrayList<Cliente>();

    public List<Cliente> getLista_clientes() {
        return lista_clientes;
    }

    public void setLista_clientes(List<Cliente> lista_clientes) {
        this.lista_clientes = lista_clientes;
    }

    public void imprimeLista() {
        for (int i = 0; i < lista_clientes.size(); i++) {
            System.out.println(lista_clientes.get(i).toString());
        }
    }

    public Cliente buscar(int id) {
        for (int i = 0; i < lista_clientes.size(); i++) {
            Cliente buscado = lista_clientes.get(i);
            if (buscado.getId() == id) {
                return buscado;
            }
        }
        return null;
    }
    
    public Cliente buscar(String nombre,String apaterno, String amaterno) {
        for (int i = 0; i < lista_clientes.size(); i++) {
            Cliente buscado = lista_clientes.get(i);
            if (buscado.getNombre().equals(nombre) && buscado.getApaterno().equals(apaterno)&& buscado.getAmaterno().equals(amaterno)) {
                return buscado;
            }
        }
        return null;
    }
    
    public boolean agrega(Cliente clienteAagregar){
        return lista_clientes.add(clienteAagregar);
    }
    
    public boolean elimina(Cliente clienteAborrar){
        return lista_clientes.remove(clienteAborrar);
    }
    
    public boolean cambia(int clienteAcambiar, Cliente clienteCambiado){
        Cliente buscado=buscar(clienteAcambiar);
        if (buscado!=null) {
            buscado.setNombre(clienteCambiado.getNombre());
            buscado.setApaterno(clienteCambiado.getApaterno());
            buscado.setAmaterno(clienteCambiado.getAmaterno());
            buscado.setTipo(clienteCambiado.getTipo());
            buscado.setTelefono(clienteCambiado.getTelefono());
            buscado.setCorreo(clienteCambiado.getCorreo());
            return true;
        }
        return false;
    }
    
}
