import java.util.*; // llamo java.util para poder usar el tipo de dato Date

public class Employee {
    private final String fullName; // con la palabra reservada final hacemos la variable inalterable (similar a constante)
    private double salary;
    private Date startDate;
    private int id;
    private static int nextId = 1; // las variables static pertenecen a las clases y no a los objetos!!!

    /**
     Tener en cuenta que existe un constructor por defecto
     Este lo que hace es setear todas las variables en NULL o en 0 dependiendo el tipo de dato
     Employee nuevoEmpleado = new Employee() => no le pasamos ningun parametro y asi accedemos al constructor por defecto
     */

    public Employee(String fullName, double salary, int day, int month, int year){ // constructor
        this.fullName = fullName; // como el nombre de la variable de la clase y el parametro son iguales para hacer referencia al fullName de la clase tengo que utilizar this.
        this. salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        // para crear una nueva fecha lo que tenemos que hacer es crear un objeto de tipo GregorianCalendar y pasarle los parametros correspondientes (al mes le restamos 1 ya que la funcionm por defecto va del 0 al 11 en vez de 1 a 12.
        startDate = calendar.getTime(); // para almacenar la fecha en la variable (tipo de dato Date), tenemos que llamar al obketo que creamos en la linea anterior Y llamar al metodo getDate(), de esta forma obtenemos la fecha para guardar.
        id = nextId;
        nextId++;
    }

    public Employee(String fullName){ // override de constructor
        // puede haber varios constructores para una misma clase, lo unico es que no se puede tener es dos constructores con el mismo orden de tipo de datos en los parametros
        this(fullName, 30000, 01, 01, 2000); // cuando usamos this hacemos referencia al otro constructor de la clase, este se da cuenta que constructor tiene que usar por los parametros que le pasamos.
    }

    public String getName(){ // getter (siempre retornan algo)
        return "Name: " + fullName; // con fullName llamamos al campo fullName del objeto al que este llamando al metodo
    }

    public double getSalary(){ // getter (siempre retornan algo)
        return salary;
    }

    public Date getStartDate(){ // getter (siempre retornan algo)
        return startDate;
    }

    public int getId(){ // getter (siempre retornan algo)
        return id;
    }

    public static int getNextId(){ // getter (como devuelve un valor de la clase hay que agregar static en la declaracion)
        return nextId;
    }

    public void setRaise(double percentage){ // setter (siempre de tipo void)
        double raise = (salary * percentage) / 100;
        salary += raise; // += agrega a salary el valor de raise
    }
}
