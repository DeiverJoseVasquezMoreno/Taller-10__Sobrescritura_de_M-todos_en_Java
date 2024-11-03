public class Perro extends Animal {
    // Sin usar @Override
    // Aunque el código compila y funciona, no usar @Override es una mala práctica, 
    // ya que dificulta la detección de errores en la sobrescritura 
    // y puede llevar a inconsistencias si se realizan cambios en la clase base.
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}