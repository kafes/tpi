/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.clinica;

import entidades.tpi.clinica.IngresoDetalle;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author kari
 */
@Local
public interface IngresoDetalleFacadeLocal {

    boolean create(IngresoDetalle ingresoDetalle);

    boolean edit(IngresoDetalle ingresoDetalle);

    boolean remove(IngresoDetalle ingresoDetalle);

    IngresoDetalle find(Object id);

    List<IngresoDetalle> findAll();

    List<IngresoDetalle> findRange(int[] range);

    int count();
    
}
