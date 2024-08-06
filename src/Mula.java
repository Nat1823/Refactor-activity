//Dividimos los vehiculos en tres clases: carro, camion y mula

public class Mula implements Vehiculo {
    private static final int LIMITE_INFERIOR = 95;
    private static final int LIMITE_INTERMEDIO = 96;
    private static final int LIMITE_SUPERIOR = 110;
    //se pasan los metodos y condiciones dados por la actividad para que se calculen con las especificaciones de la mula
    @Override
    public int calcularComparendo(int velocidad) { // llama a los metodos creados en ComparendoImpl
        if (velocidad <= LIMITE_INFERIOR) {
            return 0;
        } else if (velocidad >= LIMITE_INTERMEDIO && velocidad <= LIMITE_SUPERIOR) {
            return 1;
        }
        return 2;
    }

    @Override
    public String enviarCorreoFotomulta() {// llama a los metodos creados en ComparendoImpl
        String cuerpoMensaje = "// Enviando correo para el tipo mula.";
        String asunto = "// Asunto: Comparendo mula";
        return asunto + cuerpoMensaje;
    }
}