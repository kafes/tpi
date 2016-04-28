/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.clinica;

import entidades.tpi.clinica.Ingreso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kari
 */
@Local
public interface IngresoFacadeLocal {

    boolean create(Ingreso ingreso);

    boolean edit(Ingreso ingreso);

    boolean remove(Ingreso ingreso);

    Ingreso find(Object id);

    List<Ingreso> findAll();

    List<Ingreso> findRange(int[] range);

    int count();
    
}
