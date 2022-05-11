public interface Sueldo {
    /**
     Todos los empleados cobran un sueldo. Los empleados administrativos cobran un fijo de 15 (no importa qué o cómo).
     Los vendedores cobran un 30% de lo vendido.
     El cliente nos reveló que en un futuro los repartidores (que no son empleados de él) también van a cobrar un sueldo. Se le paga 3 por cada kilómetro recorrido.
     */
    public double cobrarSueldo();
}
