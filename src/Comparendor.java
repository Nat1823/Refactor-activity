public interface Comparendor {//para organizarlo mejor se crean dos interfaces, esta es la primera que es Comparendor
    //se llaman los metodos que se hicieron en ComparendoImpl
    // Método para construir la fotomulta
    void construirFotoMulta(int velocidad, String tipoVehiculo);

    // Método para calcular el comparendo
    int calcularComparendo(int velocidad, String tipoVehiculo);

    // Método para enviar el correo de la fotomulta
    String enviarCorreoFotomulta(String tipoVehiculo);
}