public class Gato extends Animal {
    // Error de compilación: The method hacerSonido(String) of type Gato must override or implement a supertype method
    // @Override
    public void hacerSonido(String sonido) {
        System.out.println("El gato hace: " + sonido);
    }
}