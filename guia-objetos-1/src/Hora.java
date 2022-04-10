/**
 5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo. Tenga en cuenta el rango de valores aceptados para cada uno de estos.
 a. Hora:0...23
 b. Minuto: 0 ... 59
 c. Segundo: 0 ... 59
 Considere el siguiente comportamiento:
 1. Un método que imprima la hora bajo el siguiente formato ​hh:mm:ss
 usando zero a la izquierda ejemplo 13:04:22 .
 2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
 3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
 4. Instanciar el objeto y probar los métodos creados.
 */

public class Hora {
    int hora, minuto, segundo;

    Hora(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public String getHora(){
        return (this.hora + " : " + this.minuto + " : " + this.segundo);
    }

    public void aumentarSegundo(){
        if(this.segundo != 59){
            this.segundo += 1;
        }else{
            this.segundo = 0;
            if(this.minuto != 59){
                this.minuto += 1;
            }else{
                this.minuto = 0;
                if(this.hora != 23){
                    this.hora += 1;
                }else{
                    this.hora = 0;
                }
            }
        }
    }

    public void restarSegundo(){
        if(this.segundo != 0){
            this.segundo -= 1;
        }else{
            this.segundo = 59;
            if(this.minuto != 0){
                this.minuto -= 1;
            }else{
                this.minuto = 59;
                if(this.hora != 0){
                    this.hora -= 1;
                }else{
                    this.hora = 23;
                }
            }
        }
    }
}
