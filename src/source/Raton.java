package source;

/**
 * Clase Raton
 *
 * @author Antonio Mejorado
 * @version 1.00 2008/6/13
 */
import java.awt.Image;

public class Raton extends Animal {

    private int speed = 2;
        
    /**
     * Metodo constructor que hereda los atributos de la clase
     * <code>Animal</code>.
     *
     * @param posX es la <code>posiscion en x</code> del objeto raton.
     * @param posY es el <code>posiscion en y</code> del objeto raton.
     * @param image es la <code>imagen</code> del objeto raton.
     */
    public Raton(int posX, int posY, Image image) {
        super(posX, posY, image);
    }
    /**
     * This method checks whether the mouse has collided or not with an animal
     * and updates its speed accordingly...                                                                                                                                                                                                                                                                                                                                                                    
     */
    public void accelerate(){
            
        speed+=1; 
    }
    
    /**
     * Source: Anas Mosaad
     * http://bytes.com/topic/java/answers/946160-make-object-follow-another-object-slowly
     * @param followed 
     */         
    public void follow(Animal followed) {
        int change_in_y = followed.getPosY() - getPosY();
        int change_in_x = followed.getPosX() - getPosX();

        double h = (int) Math.sqrt(Math.pow(change_in_x, 2) + Math.pow(change_in_y, 2));

        int xMove = (int) (change_in_x / h * speed);
        int yMove = (int) (change_in_y / h * speed);

        setPosX(getPosX(                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    )+xMove);
        setPosY(getPosY()+yMove);
    }
}
