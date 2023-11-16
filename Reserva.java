public class Reserva {
    private String fechaVuelo;
    private int cantidadBoletos;
    private boolean tipoDeVuelo;
    private String aerolinea;
    private Usuario usuario;
    // private int numeroTarjeta;
    // private int cuotas;
    // private boolean claseVuelo;
    // private int numeroAsiento;
    // private int cantidadMaletas;

    // Constructor
    public Reserva(String fechaVuelo, int cantidadBoletos, boolean tipoDeVuelo, String aerolinea, Usuario usuario) {
        this.fechaVuelo = fechaVuelo;
        this.cantidadBoletos = cantidadBoletos;
        this.tipoDeVuelo = tipoDeVuelo;
        this.aerolinea = aerolinea;
        this.usuario = usuario;
        // this.numeroTarjeta = numeroTarjeta;
        // this.cuotas = cuotas;
        // this.claseVuelo = claseVuelo;
        // this.numeroAsiento = numeroAsiento;
        // this.cantidadMaletas = cantidadMaletas;
    }


    
    /** 
     * @return String
     */
    public String getFechaVuelo() {
        return this.fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public int getCantidadBoletos() {
        return this.cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public boolean isTipoDeVuelo() {
        return this.tipoDeVuelo;
    }

    public boolean getTipoDeVuelo() {
        return this.tipoDeVuelo;
    }

    public void setTipoDeVuelo(boolean tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getAerolinea() {
        return this.aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // public int getNumeroTarjeta() {
    //     return this.numeroTarjeta;
    // }

    // public void setNumeroTarjeta(int numeroTarjeta) {
    //     this.numeroTarjeta = numeroTarjeta;
    // }

    // public int getCuotas() {
    //     return this.cuotas;
    // }

    // public void setCuotas(int cuotas) {
    //     this.cuotas = cuotas;
    // }

    // public boolean isClaseVuelo() {
    //     return this.claseVuelo;
    // }

    // public boolean getClaseVuelo() {
    //     return this.claseVuelo;
    // }

    // public void setClaseVuelo(boolean claseVuelo) {
    //     this.claseVuelo = claseVuelo;
    // }

    // public int getNumeroAsiento() {
    //     return this.numeroAsiento;
    // }

    // public void setNumeroAsiento(int numeroAsiento) {
    //     this.numeroAsiento = numeroAsiento;
    // }

    // public int getCantidadMaletas() {
    //     return this.cantidadMaletas;
    // }

    // public void setCantidadMaletas(int cantidadMaletas) {
    //     this.cantidadMaletas = cantidadMaletas;
    // }
    

}

