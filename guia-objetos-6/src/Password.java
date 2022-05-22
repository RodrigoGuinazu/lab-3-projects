import java.util.Objects;

public class Password implements Comparable<Password>{
    protected int longitud = 8;
    protected String password;

    public Password() {
        generarPassword(this.longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword(this.longitud);
    }

    public boolean esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for(int i = 0; i < this.password.length(); i++){
            if(Character.isUpperCase(this.password.charAt(i))){
                mayusculas++;
            }else if(Character.isLowerCase(this.password.charAt(i))){
                minusculas++;
            }else if(Character.isDigit(this.password.charAt(i))){
                numeros++;
            }
        }
        if(mayusculas > 2 && minusculas > 1 && numeros > 5){
            return true;
        }
        return false;
    }

    public void generarPassword(int caracteres){
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(caracteres);

        for (int i = 0; i < caracteres; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random()); // genera un nro al azar hasta la cantidad de caracteres que hay en AlphaNumericString
            sb.append(AlphaNumericString.charAt(index));
        }
        this.password = sb.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public String getPassword() {
        return password;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password1 = (Password) o;
        return Objects.equals(password, password1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    @Override
    public int compareTo(Password o) {
        return this.password.compareTo(o.getPassword());
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitud=" + longitud +
                ", password='" + password + '\'' +
                '}';
    }
}
