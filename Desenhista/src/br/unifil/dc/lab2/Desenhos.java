package br.unifil.dc.lab2;

import java.awt.Dimension;
import java.awt.Graphics2D;


/**
 * Write a description of class Desenhos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desenhos
{
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {
        // Números mágicos, coisa de programador feio!
        /*pincel.drawLine(50,50,100,100);
        pincel.drawLine(50,100,100,50);
        pincel.drawLine(75,50,75,100);*/

        //int exemploTypeCasting = (int) .5f;

        final int[] superiorEsquerdoAsterisco = { (int) (.1f * dim.width), (int) (.1f * dim.height) }; // x,y
        final int[] dimensoesAsterisco = { (int) (.5f * dim.width), (int) (.5f * dim.height) }; // w,h
        final int X = 0, Y = 1, W = 0, H = 1;
        pincel.drawLine(superiorEsquerdoAsterisco[X], superiorEsquerdoAsterisco[Y],
                superiorEsquerdoAsterisco[X] + dimensoesAsterisco[W],
                superiorEsquerdoAsterisco[Y] + dimensoesAsterisco[H]);
        pincel.drawLine(superiorEsquerdoAsterisco[X] + dimensoesAsterisco[W], superiorEsquerdoAsterisco[Y],
                superiorEsquerdoAsterisco[X],
                superiorEsquerdoAsterisco[Y]+dimensoesAsterisco[H]);
        pincel.drawLine(superiorEsquerdoAsterisco[X]+dimensoesAsterisco[W]/2, superiorEsquerdoAsterisco[Y],
                superiorEsquerdoAsterisco[X]+dimensoesAsterisco[W]/2,
                superiorEsquerdoAsterisco[Y]+dimensoesAsterisco[H]);
    }
    
    public static void desenharAsterisco(Graphics2D g2d) {
        throw new UnsupportedOperationException("O aluno ainda não implementou este método.");
    }
    
}
