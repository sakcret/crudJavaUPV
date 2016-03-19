package listaobjeto;

import entidades.Cliente;
import gestion.Gestion_clientes;
import vistas.Frm_clientes;

public class ListaObjeto {

    public static void main(String[] args) {
        Gestion_clientes gc = new Gestion_clientes();
        Cliente c1 = new Cliente(1, "Julia", "Morales", "Saldaña");
        Cliente c2 = new Cliente(2, "Adrian", "Ruiz", "");
        Cliente c3 = new Cliente(3, "Beto", "Rodríguez", "Hernández");

        gc.imprimeLista();
        gc.agrega(c1);
        gc.imprimeLista();
        c1.setTelefono("1234");
        gc.agrega(c2);
        gc.agrega(c3);
        gc.imprimeLista();

        Frm_clientes miventana = new Frm_clientes(gc);
        miventana.setVisible(true);
        
    }

}
