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
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private int CI_Usuario;
    private String cargoUsuario;
    
    public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, int CI_Usuario, String cargoUsuario){
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.CI_Usuario = CI_Usuario;
        this.cargoUsuario = cargoUsuario;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the apellidoUsuario
     */
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    /**
     * @param apellidoUsuario the apellidoUsuario to set
     */
    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    /**
     * @return the CI_Usuario
     */
    public int getCI_Usuario() {
        return CI_Usuario;
    }

    /**
     * @param CI_Usuario the CI_Usuario to set
     */
    public void setCI_Usuario(int CI_Usuario) {
        this.CI_Usuario = CI_Usuario;
    }

    /**
     * @return the cargoUsuario
     */
    public String getCargoUsuario() {
        return cargoUsuario;
    }

    /**
     * @param cargoUsuario the cargoUsuario to set
     */
    public void setCargoUsuario(String cargoUsuario) {
        this.cargoUsuario = cargoUsuario;
    }
    
    
}
