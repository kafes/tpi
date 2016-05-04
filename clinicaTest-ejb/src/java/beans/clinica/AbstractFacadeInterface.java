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

    boolean create(T enitity);

    boolean edit(T enitity);

    boolean remove(T enitity);

    T find(Object id);

    List<T> findAll();

    List<T> findRange(int[] range);

    int count();
}
