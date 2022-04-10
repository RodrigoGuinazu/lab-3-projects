public class Boss extends Employee{ // palabra reservada extends para marcar que Boss hereda de Employee
    private double incentivo;

    // super clase = Employee
    // sub clase = Boss => Boss hereda de Employee, por eso decimos que Employee es la super clase
    public Boss(String fullName, double salary, int day, int month, int year, double incentivo){
        super(fullName, salary, day, month, year); // con super llamamos al constructor de la super clase (Employee)
        this.incentivo = incentivo;
    }

    public double getSalary(){ // getter (override de metodo)
        double bossSalary = super.getSalary(); // con super. lo que hago es llamar al metodo de la clase padre (Employee)
        return bossSalary + incentivo;
    }

    public String getBossInfo(){
        // super. llama a las funciones de la clase padre (Employee)
        return "\nFull Name: " + super.getName() + "\nSalary: " + super.getSalary() + "\nSalary + Incentive: " + getSalary() + "\nStarted On: " + super.getStartDate() + "\nID: " + super.getId();
    }

}
