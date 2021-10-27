package problemas.primero;

public class TetraedroRegular extends FiguraTridimensional {


    public final static int caras = 4;

    private double arista;


    //constructores

    public TetraedroRegular(double arista){

        this.arista = arista;

    }


    public TetraedroRegular(){

        arista = 1;

    }

    //getters y setters

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    //metodos sobreescritos heredados por FiguraTridimensional

    @Override
    public double calcularVolumen() {

        return Math.sqrt(2) * (Math.pow(arista, 3)) / 12;
    }

    @Override
    public double calcularSuperficie() {

        return Math.sqrt(3) * Math.pow(arista, 2);
    }

    //metodo toString

    public String toString(){


        return "la figura es un TetraedroRegular";
    }

}
