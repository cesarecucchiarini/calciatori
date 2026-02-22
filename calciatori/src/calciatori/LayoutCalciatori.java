/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author sergi
 */
public class LayoutCalciatori extends JPanel{
    
    public LayoutCalciatori(ArrayList<Calciatore> calciatori){        
        this.setLayout(new GridLayout(calciatori.size()+1, 5, 0, 10));

        this.add(new JLabel("Nome"));
        this.add(new JLabel("Nazionalita"));
        this.add(new JLabel("Nascita"));
        this.add(new JLabel("Segno"));
        this.add(new JLabel("Goals"));
        for(Calciatore c : calciatori){
            this.add(new JLabel(c.getNome()));
            this.add(new JLabel(c.getNazionalita()));
            this.add(new JLabel(c.getNascitaString()));
            this.add(new JLabel(c.getSegno()));
            this.add(new JLabel(c.getGoal()+""));
        }
    }
}
