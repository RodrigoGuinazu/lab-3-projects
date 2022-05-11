public class Bateria extends Instrumento{
    protected int tamboresExtra;
    protected int platillosExtra;
    protected static float precioTambor = 3000;
    protected static float precioPlatillo = 2000;

    public Bateria(String marca, int tamboresExtra, int platillosExtra) {
        super(marca);
        this.tamboresExtra = tamboresExtra;
        this.platillosExtra = platillosExtra;
        super.setPrecio(calcularPrecio(tamboresExtra, platillosExtra));
    }

    public float calcularPrecio(int tamboresExtra, int platillosExtra){
        float rta = 11000; // precio base (3 tambores + 1 platillo)
        if(tamboresExtra > 0 || platillosExtra > 0){
            if(platillosExtra > 5){ // maximo 5 platillos, si se pasa de esa cantidad automaticamente lo igualo a 5
                rta += ((tamboresExtra * Bateria.precioTambor) + (5 * Bateria.precioPlatillo));
            }else{
                rta += ((tamboresExtra * Bateria.precioTambor) + (platillosExtra * Bateria.precioPlatillo));
            }
        }
        return rta;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "tamboresExtra=" + tamboresExtra +
                ", platillosExtra=" + platillosExtra +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
