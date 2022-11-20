package buscaminas;

import javax.swing.JButton;

public class Celda extends JButton {
    
    private boolean mina;
    
    public Celda() 
    {
        super();
        double aleatorio = Math.random();
        if(aleatorio>0.80)
            mina = true;
        else
            mina = false;
    }
    public boolean estaMinado()
    {
        return mina;
    }
}
