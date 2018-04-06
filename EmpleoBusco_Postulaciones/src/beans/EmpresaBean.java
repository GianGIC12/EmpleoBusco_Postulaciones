/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author user
 */
public class EmpresaBean {

    int id_empresa, id_rubro;

    String razon_comercial, razon_social, pais;

    public EmpresaBean() {
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public String getRazon_comercial() {
        return razon_comercial;
    }

    public void setRazon_comercial(String razon_comercial) {
        this.razon_comercial = razon_comercial;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
