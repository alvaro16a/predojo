package co.com.sofka.predojo.model;

public class Correo {
    String correo;
    boolean enviado;

    public Correo(String correo, boolean enviado) {
        this.correo = correo;
        this.enviado = enviado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public String toString() {
        return "Correo{" +
                "correo='" + correo + '\'' +
                ", enviado=" + enviado +
                '}';
    }
}
