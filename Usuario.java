public class Usuario {
    private String usuario;
    private String contraseña;
    private String tipo;

    // Constructor
    public Usuario(String usuario, String contraseña, String tipo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    
    /** 
     * @return String
     */
    public String getUsuario() {
        return usuario;
    }

    
    /** 
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    /** 
     * @return String
     */
    public String getContraseña() {
        return contraseña;
    }

    
    /** 
     * @param contraseña
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    
    /** 
     * @return String
     */
    public String getTipo() {
        return tipo;
    }

    
    /** 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " usuario='" + getUsuario() + "'" +
            ", contraseña='" + getContraseña() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }

}