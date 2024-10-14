public class Estudiante { // recordar usar alt insert o click derecho generate para usar metodos

    private int codigo; //modificador de acceso privado
    private String nombre; //atributos
    private int creditosAprobados;//atributos
    private int creditosActuales;//atributos
    private boolean creditosPagados;//atributos

    public Estudiante(int codigo, String nombre, int creditosAprobados, int creditosActuales, boolean creditosPagados) { //constructor. nombre de clase //(parametros)
        this.codigo = codigo; // se usa this por los modificadores de acceso
        this.nombre = nombre;
        this.creditosAprobados = creditosAprobados;
        this.creditosActuales = creditosActuales;
        this.creditosPagados = creditosPagados;
    }

    public int getCodigo() { // metodos // get obtener dato de la variable
        return codigo;
    }

    public void setCodigo(int codigo) { //(parametro)
        this.codigo = codigo;//establecer diferencia
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditosAprobados() {
        return creditosAprobados;
    }

    public void setCreditosAprobados(int creditosAprobados) {
        this.creditosAprobados = creditosAprobados;
    }

    public int getCreditosActuales() {
        return creditosActuales;
    }

    public void setCreditosActuales(int creditosActuales) {
        this.creditosActuales = creditosActuales;
    }

    public boolean isCreditosPagados() {
        return creditosPagados;
    }

    public void setCreditosPagados(boolean creditosPagados) {
        this.creditosPagados = creditosPagados;
    }

    @Override// formato
    public String toString() { // para cambiar datos a string
        String texto= "Estudiante{} \n" +
                "nombre:" + nombre +
                "Creditos aprobados:" + creditosAprobados;
//calculos
        String resultado=creditosPagados? texto + "Sin valores pendientes de pago:": // ? = if else : = else
                texto + "Debe pagar: " + (55*creditosActuales);
        return resultado;
    }
}
