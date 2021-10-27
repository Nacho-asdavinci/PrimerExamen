package problemas.primero;

public class Main {

    public static void main(String[] args) {


        //se instancia los objetos

        Ortoedro ortoedro = new Ortoedro(4,1,5);
        Cubo cubo = new Cubo(4);
        TetraedroRegular tetraedroRegular = new TetraedroRegular(1);


        //se imprimen los datos

        System.out.println(ortoedro.toString());
        System.out.println(ortoedro.calcularSuperficie());
        System.out.println(ortoedro.calcularVolumen());

        System.out.println(cubo.toString());
        System.out.println(cubo.calcularSuperficie());
        System.out.println(cubo.calcularVolumen());

        System.out.println(tetraedroRegular.toString());
        System.out.println(tetraedroRegular.calcularSuperficie());
        System.out.println(tetraedroRegular.calcularVolumen());



    }
}
