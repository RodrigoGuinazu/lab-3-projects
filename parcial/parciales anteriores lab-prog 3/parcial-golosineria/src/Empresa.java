import java.util.ArrayList;

public class Empresa {
    //clase envoltoria
    protected ArrayList<Empleado> listadoEmpleados;
    protected float totalPagar;

    public float getTotalPagar() {
        return totalPagar;
    }

    public Empresa(ArrayList<Empleado> listadoEmpleados) {
        this.listadoEmpleados = listadoEmpleados;
    }

    public void agregar(Empleado agregar){
        this.listadoEmpleados.add(agregar);
    }

    public Empleado buscarPorLegajo(int legajo){
        Empleado aux = new Empleado(legajo);
        Empleado rta = new Empleado();
        for(Empleado e : this.listadoEmpleados){
            if(e.equals(aux)){
                rta = e;
            }
        }
        return rta;
    }

    public int contarEmpleados(){
        return this.listadoEmpleados.size();
    }

    public StringBuilder devolverListado(){
        StringBuilder rta = new StringBuilder();
        for(Empleado e : this.listadoEmpleados){
            rta.append(e.toString());
            rta.append("\n");
        }
        return rta;
    }

    public boolean eliminarPorLegajo(int legajo){
        Empleado aux = new Empleado(legajo);
        for(Empleado e : this.listadoEmpleados){
            if(e.equals(aux)){
                this.listadoEmpleados.remove(e);
                return true;
            }
        }
        return false;
    }

    public void calcularTotalPagar(){
        this.totalPagar = 0;
        for(Empleado e : this.listadoEmpleados){
            if(e instanceof Vendedor){
                Vendedor aux = (Vendedor) e;
                totalPagar += aux.cobrarSueldo();
            }else{
                Administrativo aux = (Administrativo) e;
                totalPagar += aux.cobrarSueldo();
            }
        }
    }
}
