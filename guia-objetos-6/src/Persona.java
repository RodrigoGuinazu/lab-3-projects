import java.util.Objects;

public class Persona {
    protected String nombre;
    protected int edad;
    protected String dni = "";
    protected Character sexo = 'H'; // (H hombre, M mujer)
    protected double peso;
    protected double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, Character sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = (this.peso/(altura*altura));
        if(imc < 20.0){
            System.out.println("El paciente se encuentra bajo el peso ideal");
            return -1;
        }else if(imc >= 20 && imc <= 25){
            System.out.println("El paciente se encuentra en peso ideal");
            return 0;
        }else{
            System.out.println("El paciente se encuentra sobre el peso ideal");
            return 1;
        }
    }

    public boolean mayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }
        return false;
    }

    private char comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            return sexo;
        }else{
            System.out.println("El sexo ingresado no es validos, seteando H por defecto...");
            sexo = 'H';
            return sexo;
        }
    }

    private void generarDNI(){
        // De esta manera generamos un numero entre 1 a 50000000.
        int rta = (int) (Math.random()*50000000+1);
        this.dni = Integer.toString(rta);
    }

    @Override
    public boolean equals(Object o) { // los atributos que usamos para conciderar igualdad entre 2 objetos en el equals tienen que ser los mismos para el hashCode()
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return dni.equals(persona.dni);
    }

    @Override
    public int hashCode() { // los atributos que usamos para conciderar igualdad entre 2 objetos en el equals tienen que ser los mismos para el hashCode()
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
