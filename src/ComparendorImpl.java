// ComparendorImpl.java
public class ComparendorImpl implements Comparendor {
    //Aqui creamos la clase ComparendorImpl en donde estan los métodos que se van a implementar en Comparendor

    // Limites de velocidad para diferentes tipos de vehículos
    private static final int limiteInferiorCarro = 0;
    private static final int limiteSuperiorCarro = 60;
    private static final int limiteInferiorIntermedioCarro = 61;
    private static final int limiteInferiorCamion = 0;
    private static final int limiteSuperiorCamion = 80;
    private static final int limiteInferiorIntermedioCamion = 81;
    private static final int limiteInferiorMula = 0;
    private static final int limiteSuperiorMula = 50;
    private static final int limiteInferiorIntermedioMula = 51;
// De aqui en adelanta usamos la base de la actividad solo que la acoplamos aqui
    @Override
    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int cpa = calcularComparendo(velocidad, tipoVehiculo);
        String txt = enviarCorreoFotomulta(tipoVehiculo);
        if (cpa == -1) {
            System.out.println("No hay cálculo para el tipo de vehículo " + tipoVehiculo + ". Corre: " + txt);
            //Esta opcion se ejecutará mas adelante para el vehículo avión
        } else {
            System.out.println("---- El tipo de comparendo es: " + cpa + " ---- Cuerpo del correo: " + txt);
        }
    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        switch (tipoVehiculo) {
            case "CARRO":
                if (velocidad <= limiteInferiorCarro) {
                    return 0;
                } else if (velocidad >= limiteInferiorIntermedioCarro && velocidad <= limiteSuperiorCarro) {
                    return 1;
                }
                return 2;
            case "CAMION":
                if (velocidad <= limiteInferiorCamion) {
                    return 0;
                } else if (velocidad >= limiteInferiorIntermedioCamion && velocidad <= limiteSuperiorCamion) {
                    return 1;
                }
                return 2;
            case "MULA":
                if (velocidad <= limiteInferiorMula) {
                    return 0;
                } else if (velocidad >= limiteInferiorIntermedioMula && velocidad <= limiteSuperiorMula) {
                    return 1;
                }
                return 2;
            default:
                return -1;
        }
    }

    @Override
    public String enviarCorreoFotomulta(String tipoVehiculo) {
        switch (tipoVehiculo) {
            case "CAMION":
                String cuerpoMensajeCamion = "// Enviando correo para el tipo camión.";
                String asuntoCamion = "// Asunto: Comparendo camión";
                return asuntoCamion + cuerpoMensajeCamion;
            case "CARRO":
                String cuerpoMensajeCarro = "// Enviando correo para el tipo carro.";
                String asuntoCarro = "// Asunto: Comparendo carro";
                return asuntoCarro + cuerpoMensajeCarro;
            case "MULA":
                String cuerpoMensajeMula = "// Enviando correo para el tipo mula.";
                String asuntoMula = "// Asunto: Comparendo mula";
                return asuntoMula + cuerpoMensajeMula;
            default:
                return "Enviando correo con vehículo desconocido";
        }
    }
}