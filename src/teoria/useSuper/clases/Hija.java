package teoria.useSuper.clases;

public class Hija extends Padre {

    /*Es llamada desde la clase principal*/
    public void saludarTest() {
        /*Llama al método de saludar de padre*/
        super.saludar();
    }
}
