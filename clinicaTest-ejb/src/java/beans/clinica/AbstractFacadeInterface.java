/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.clinica;

import java.util.List;

/**
 *
 * @author kari
 */
public interface AbstractFacadeInterface<T> {

    boolean create(T diagnostico);

    boolean edit(T diagnostico);

    boolean remove(T diagnostico);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    int count();
}
