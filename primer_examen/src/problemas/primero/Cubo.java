package problemas.primero;

public class Cubo extends FiguraTridimensional {

    public final static int caras = 6;

    private double lado;


    //constructores

    public Cubo(double arista){

        this.lado = lado;

    }


    public Cubo(){

        lado = 1;

    }

    //getters y setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    //metodos sobreescritos heredados por FiguraTridimensional

    @Override
    public double calcularVolumen() {

        return Math.pow(lado, 3);
    }

    @Override
    public double calcularSuperficie() {

        return caras * (Math.pow(lado, 2));
    }

    //metodo toString

    public String toString(){


        return "la figura es un Cubo";
    }


}
