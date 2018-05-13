
package beans;

/**
 *
 * @author marcio
 */
public class Nota {
    private double nota;
    private byte peso;

    public Nota(double nota, byte peso) {
        this.nota = nota;
        this.peso = peso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public byte getPeso() {
        return peso;
    }

    public void setPeso(byte peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nota+""; //To change body of generated methods, choose Tools | Templates.
    }
    
}
