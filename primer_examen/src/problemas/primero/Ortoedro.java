package problemas.primero;

public class Ortoedro extends FiguraTridimensional{


    public final static int caras = 6;

    private double ancho;
    private double base;
    private double altura;


    //constructores

    public Ortoedro(double ancho, double base, double altura){

        this.ancho = ancho;
        this.base = base;
        this.altura = altura;

    }


    public Ortoedro(){

        ancho = 1;
        base = 1;
        altura = 1;

    }

    //getters y setters

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //metodos sobreescritos heredados por FiguraTridimensional

    @Override
    public double calcularVolumen() {

        return ancho*base*altura;
    }

    @Override
    public double calcularSuperficie() {

        return 2*(ancho*base) + 2*(ancho*altura) + 2*(base*altura);
    }

    //metodo toString

    public String toString(){


        return "la figura es un Ortoedro";
    }


}
