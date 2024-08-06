//Dividimos los vehiculos en tres clases: carro, camion y mula

public class Camion implements Vehiculo {
    private static final int LIMITE_INFERIOR = 75;
    private static final int LIMITE_INTERMEDIO = 76;
    private static final int LIMITE_SUPERIOR = 95;
    //se pasan los metodos y condiciones dados por la actividad para que se calculen con las especificaciones del camión
    @Override
    public int calcularComparendo(int velocidad) {// llama a los metodos creados en ComparendoImpl
        if (velocidad <= LIMITE_INFERIOR) {
            return 0;
        } else if (velocidad >= LIMITE_INTERMEDIO && velocidad <= LIMITE_SUPERIOR) {
            return 1;
        }
        return 2;
    }

    @Override
    public String enviarCorreoFotomulta() {// llama a los metodos creados en ComparendoImpl
        String cuerpoMensaje = "// Enviando correo para el tipo camión.";
        String asunto = "// Asunto: Comparendo camión";
        return asunto + cuerpoMensaje;
    }
}