package teoria.math;

public class ClaseMath {
    public static void main(String[] args) {
        System.out.println("El número e: " + Math.E);
        System.out.println("El número pi: " + Math.PI);
        double anguloGrados = 45;
        double anguloRadianes = Math.toRadians(anguloGrados);
        System.out.println("Ángulo en radianes: " + anguloRadianes);

        double resultado = 0;
        int anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de " + anguloEnGrados + " grados es: "+ resultado);
    }
}
