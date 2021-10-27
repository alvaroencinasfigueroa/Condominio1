/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominio.modelo;

/**
 *
 * @author Alvaro_Encinas_Figueroa el_Leticio
 */
public class PersonaEntrante {
    
    private int idEntrante; //este identificador lo vamos a asignar de forma aleatoria con un número de seis dígitos 
    private String nombreE;
    private String apellidoE;
    private int CI_Entrante;
    private int numeroLicenciaE;
    private String sexoE;
    private String fechaNacimientoE;
    private String nacionalidadE;
    private String lugarNacimientoE;
    private String placaVehiculoE;
    private boolean viveAqui;
    private int contadorEntradas;
    
    public PersonaEntrante(int idEntrante, String nombreE, String apellidoE, int CI_Entrante, int numeroLicenciaE, String sexoE,
            String fechaNacimientoE, String nacionalidadE, String lugarNacimientoE, String placaVehiculoE, boolean viveAqui, int contadorEntradas){
        
        this.idEntrante = idEntrante;
        this.nombreE = nombreE;
        this.apellidoE = apellidoE;
        this.CI_Entrante = CI_Entrante;
        this.numeroLicenciaE = numeroLicenciaE;
        this.sexoE = sexoE;
        this.fechaNacimientoE = fechaNacimientoE;
        this.nacionalidadE = nacionalidadE;
        this.lugarNacimientoE = lugarNacimientoE;
        this.placaVehiculoE = placaVehiculoE;
        this.viveAqui = viveAqui;
        this.contadorEntradas = contadorEntradas;
    }

    /**
     * @return the idEntrante
     */
    public int getIdEntrante() {
        return idEntrante;
    }

    /**
     * @param idEntrante the idEntrante to set
     */
    public void setIdEntrante(int idEntrante) {
        this.idEntrante = idEntrante;
    }

    /**
     * @return the nombreE
     */
    public String getNombreE() {
        return nombreE;
    }

    /**
     * @param nombreE the nombreE to set
     */
    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    /**
     * @return the apellidoE
     */
    public String getApellidoE() {
        return apellidoE;
    }

    /**
     * @param apellidoE the apellidoE to set
     */
    public void setApellidoE(String apellidoE) {
        this.apellidoE = apellidoE;
    }

    /**
     * @return the CI_Entrante
     */
    public int getCI_Entrante() {
        return CI_Entrante;
    }

    /**
     * @param CI_Entrante the CI_Entrante to set
     */
    public void setCI_Entrante(int CI_Entrante) {
        this.CI_Entrante = CI_Entrante;
    }

    /**
     * @return the numeroLicenciaE
     */
    public int getNumeroLicenciaE() {
        return numeroLicenciaE;
    }

    /**
     * @param numeroLicenciaE the numeroLicenciaE to set
     */
    public void setNumeroLicenciaE(int numeroLicenciaE) {
        this.numeroLicenciaE = numeroLicenciaE;
    }

    /**
     * @return the sexoE
     */
    public String getSexoE() {
        return sexoE;
    }

    /**
     * @param sexoE the sexoE to set
     */
    public void setSexoE(String sexoE) {
        this.sexoE = sexoE;
    }

    /**
     * @return the fechaNacimientoE
     */
    public String getFechaNacimientoE() {
        return fechaNacimientoE;
    }

    /**
     * @param fechaNacimientoE the fechaNacimientoE to set
     */
    public void setFechaNacimientoE(String fechaNacimientoE) {
        this.fechaNacimientoE = fechaNacimientoE;
    }

    /**
     * @return the nacionalidadE
     */
    public String getNacionalidadE() {
        return nacionalidadE;
    }

    /**
     * @param nacionalidadE the nacionalidadE to set
     */
    public void setNacionalidadE(String nacionalidadE) {
        this.nacionalidadE = nacionalidadE;
    }

    /**
     * @return the lugarNacimientoE
     */
    public String getLugarNacimientoE() {
        return lugarNacimientoE;
    }

    /**
     * @param lugarNacimientoE the lugarNacimientoE to set
     */
    public void setLugarNacimientoE(String lugarNacimientoE) {
        this.lugarNacimientoE = lugarNacimientoE;
    }

    /**
     * @return the placaVehiculoE
     */
    public String getPlacaVehiculoE() {
        return placaVehiculoE;
    }

    /**
     * @param placaVehiculoE the placaVehiculoE to set
     */
    public void setPlacaVehiculoE(String placaVehiculoE) {
        this.placaVehiculoE = placaVehiculoE;
    }

    /**
     * @return the viveAqui
     */
    public boolean isViveAqui() {
        return viveAqui;
    }

    /**
     * @param viveAqui the viveAqui to set
     */
    public void setViveAqui(boolean viveAqui) {
        this.viveAqui = viveAqui;
    }

    /**
     * @return the contadorEntradas
     */
    public int getContadorEntradas() {
        return contadorEntradas;
    }

    /**
     * @param contadorEntradas the contadorEntradas to set
     */
    public void setContadorEntradas(int contadorEntradas) {
        this.contadorEntradas = contadorEntradas;
    }
    
}
