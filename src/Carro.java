//Dividimos los vehiculos en tres clases: carro, camion y mula

    public class Carro implements Vehiculo {
        private static final int LIMITE_INFERIOR = 65;
        private static final int LIMITE_INTERMEDIO = 66;
        private static final int LIMITE_SUPERIOR = 85;

        //se pasan los metodos y condiciones dados por la actividad para que se calculen con las especificaciones del carro
        @Override// llama a los metodos creados en ComparendoImpl
        public int calcularComparendo(int velocidad) {
            if (velocidad <= LIMITE_INFERIOR) {
                return 0;
            } else if (velocidad >= LIMITE_INTERMEDIO && velocidad <= LIMITE_SUPERIOR) {
                return 1;
            }
            return 2;
        }

        @Override
        public String enviarCorreoFotomulta() {// llama a los metodos creados en ComparendoImpl
            String cuerpoMensaje = "// Enviando correo para el tipo carro.";
            String asunto = "// Asunto: Comparendo carro";
            return asunto + cuerpoMensaje;
        }
    }

