import java.util.UUID;

public class Copia{
    protected boolean disponible;
    protected UUID id;

    public Copia() {
        this.disponible = true;
        this.id = UUID.randomUUID();
    }

    public void alquilar(){
        this.disponible = false;
    }

    public void devolver(){
        this.disponible = true;
    }

    public boolean getDisponible(){
        return this.disponible;
    }
    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Copia{" +
                "disponible=" + disponible +
                ", id=" + id +
                '}';
    }
}
