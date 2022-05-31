import java.util.ArrayList;
import java.util.Scanner;

public class Colegio {
    private ArrayList<Alumno> alumnos;

    public Colegio(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumno() throws CampoVacioException{
        Scanner scan = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Nacionalidad: ");
        String nacionalidad = scan.nextLine();
        if(nombre.isBlank() || nacionalidad.isBlank()){
            throw new CampoVacioException();
        }else{
            Alumno aux = new Alumno(nombre, nacionalidad);
            this.alumnos.add(aux);
        }
    }

    public void verNacionalidad(String nacionalidad){
        int i = 0;
        for(Alumno a : this.alumnos){
            if(a.getNacionalidad().equalsIgnoreCase(nacionalidad)){
                i++;
            }
        }
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Cantidad de alumnos de esa nacionalidad: " + i);
    }

    public ArrayList<String> todasLasNacionalidades(){
        int flag = 0;
        ArrayList<String> nacionalidades = new ArrayList<String>();
        for(Alumno a : this.alumnos){
            for(String s : nacionalidades){
                if(a.getNacionalidad().equalsIgnoreCase(s)){
                    flag = 1;
                }
            }
            if(flag == 0){
                nacionalidades.add(a.getNacionalidad());
            }else{
                flag = 0;
            }
        }
        return nacionalidades;
    }

    public int cuantos(){
        ArrayList<String> nacionalidades = this.todasLasNacionalidades();
        return nacionalidades.size();
    }

    public void borrar(Alumno aux){
        this.alumnos.remove(aux);
    }

    public Alumno buscar(String buscar) throws AlumnoNoExisteException{
        for(Alumno a : this.alumnos){
            if(a.getNombre().equalsIgnoreCase(buscar)){
                return a;
            }
        }
        throw new AlumnoNoExisteException();
    }

    public StringBuilder verTodos(){
        StringBuilder rta = new StringBuilder();
        int contador = 0;
        ArrayList<String> nacionalidades = this.todasLasNacionalidades();
        for(String s : nacionalidades){
            for(Alumno a : this.alumnos){
                if(a.getNacionalidad().equalsIgnoreCase(s)){
                    contador++;
                }
            }
            rta.append("Hay " + contador + " alumnos de la nacionalidad: " + s + "\n");
            contador = 0;
        }
        return rta;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
}