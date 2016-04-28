/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.clinica;


import beans.clinica.CentroFacadeLocal;
import entidades.tpi.clinica.Centro;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author kari
 */
@ManagedBean
@ViewScoped
//muajajajajajajaj
public class centroController implements Serializable {

    List<Centro> centroList;
    @EJB
    CentroFacadeLocal centroEJB;
    @PostConstruct
    public void llenarLista() {
        try {
            centroList=centroEJB.findAll();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public List<Centro> getCentroList() {
        return centroList;
    }

    public void setCentroList(List<Centro> centroList) {
        this.centroList = centroList;
    }
    
    
}
