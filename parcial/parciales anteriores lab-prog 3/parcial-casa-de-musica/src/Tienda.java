import java.util.ArrayList;

public class Tienda {
    ArrayList<Instrumento> instrumentos;

    public Tienda() {
        this.instrumentos = new ArrayList<Instrumento>();
    }

    public void cargarArreglo(){
        Bateria bateria1 = new Bateria("Remo", 2, 6);
        Bateria bateria2 = new Bateria("Pearl", 0, 0);
        Bateria bateria3 = new Bateria("Tama", 4, 4);
        Bajo bajo1 = new Bajo(200000, "Fender", "JazzBass");
        Bajo bajo2 = new Bajo(100000, "Squier", "50's");
        Bajo bajo3 = new Bajo(125000, "Epiphone", "Flying V");
        Guitarra guitarra1 = new Guitarra(300000, "Giobson", "Les Paul");
        Guitarra guitarra2 = new Guitarra(250000, "Fender", "Stratocaster");
        Guitarra guitarra3 = new Guitarra(1900000, "Jackson", "King V");
        Acustica acustica1 = new Acustica(200000, "Taylor", Madera.CAOBA);
        Acustica acustica2 = new Acustica(100000, "Yamaha", Madera.NOGAL);
        Acustica acustica3 = new Acustica(200000, "Gibson", Madera.CAOBA);

        this.instrumentos.add(bateria1);
        this.instrumentos.add(bateria2);
        this.instrumentos.add(bateria3);
        this.instrumentos.add(bajo1);
        this.instrumentos.add(bajo2);
        this.instrumentos.add(bajo3);
        this.instrumentos.add(guitarra1);
        this.instrumentos.add(guitarra2);
        this.instrumentos.add(guitarra3);
        this.instrumentos.add(acustica1);
        this.instrumentos.add(acustica2);
        this.instrumentos.add(acustica3);
    }

    public StringBuilder mostrarInstrumentos(){
        StringBuilder rta = new StringBuilder();
        for(Instrumento i : this.instrumentos){
            rta.append(i.toString());
            rta.append("\n");
        }
        return rta;
    }

    public StringBuilder amplificar(){
        StringBuilder rta = new StringBuilder();
        for(Instrumento i : this.instrumentos){
            if(i instanceof Electrica){
                rta.append(((Electrica) i).sonidoAmplificado());
                rta.append("\n");
            }
        }
        return rta;
    }

    public StringBuilder aumentarPrecios(){
        StringBuilder rta = new StringBuilder();
        for(Instrumento i : this.instrumentos){
            if(i instanceof Guitarra){
                rta.append("\nPrecio original: \n");
                rta.append(i);
                i.setPrecio(i.getPrecio() * (float)1.05);
                rta.append("\nPrecio actualizado: \n");
                rta.append(i);
            }else if(i instanceof Bajo){
                rta.append("\nPrecio original: \n");
                rta.append(i);
                i.setPrecio(i.getPrecio() * (float)1.20);
                rta.append("\nPrecio actualizado: \n");
                rta.append(i);
            }else if(i instanceof Acustica){
                rta.append("\nPrecio original: \n");
                rta.append(i);
                i.setPrecio(i.getPrecio() * (float)1.10);
                rta.append("\nPrecio actualizado: \n");
                rta.append(i);
            }else if(i instanceof Bateria){
                rta.append("\nPrecio original: \n");
                rta.append(i);
                i.setPrecio(i.getPrecio() * (float)1.15);
                rta.append("\nPrecio actualizado: \n");
                rta.append(i);
            }
        }
        return rta;
    }
}