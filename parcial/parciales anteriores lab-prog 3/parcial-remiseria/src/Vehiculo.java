public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected String combustible;
    protected String patente;
    protected boolean libre;

    public Vehiculo(String marca, String modelo, String combustible, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.patente = patente;
        this.libre = true;
    }

    public abstract double precioViaje(double kmRecorridos);

    public boolean getLibre(){
        return this.libre;
    }

    public void setLibre(){
        if(this.libre){
            this.libre = false;
        }else{
            this.libre = true;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", combustible='" + combustible + '\'' +
                ", patente='" + patente + '\'' +
                ", libre=" + libre +
                '}';
    }
}
