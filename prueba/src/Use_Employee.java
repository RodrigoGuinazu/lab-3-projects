public class Use_Employee {
    public static void main(String[] args) {
        Employee[] myEmployees = new Employee[3]; // creando un array de employees
        myEmployees[0] = new Employee("Rodrigo Guina"); // llamo al segundo constructor (lleva un solo parametro y el resto es generico)
        myEmployees[1] = new Employee("Nicolas Garcia", 50000, 20, 4, 1969);
        myEmployees[2] = new Employee("Facundo Guinaza", 35000, 22, 2, 2022);

        for(Employee e : myEmployees){ // nueva forma de hacer un ciclo for (se puede hacer de la forma comun tambien)
            e.setRaise(5);
        }

        for(Employee e : myEmployees){ // nueva forma de hacer un ciclo for (se puede hacer de la forma comun tambien)
            System.out.println(e.getName() + " Salary: $" +  e.getSalary() + " Started on: " + e.getStartDate() + " ID: " + e.getId());
        }

        Boss daBoss = new Boss("El Jefe", 90000, 01, 05, 1990, 22500);

        System.out.println(daBoss.getBossInfo());

        System.out.println("\nEl siguiente ID es: " + Employee.getNextId()); // como la variable nextId pertenece a la clase para llamar al metodo en vez de utilizar el objeto utilizamos el nombre de la clase
    }
}
