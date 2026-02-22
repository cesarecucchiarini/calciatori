/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calciatori;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

/**
 *
 * @author sergi
 */
public class LayoutSegni extends JPanel{
    
    public LayoutSegni(Map<String, Integer> mappa){
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 0, 5, 10); // spacing between components
        gbc.weighty = 1.0;
        gbc.gridy = -1;
        
        for(Map.Entry<String, Integer> set : mappa.entrySet()){
            JLabel label = new JLabel();
            JProgressBar progressbar = new JProgressBar();
            
            gbc.gridy++;
            
            gbc.gridx = 0;
            gbc.weightx = 0.25;
            this.add(label, gbc);

            gbc.gridx = 1;
            gbc.weightx = 0.75;
            this.add(progressbar, gbc);
            
            label.setText(set.getKey());
            label.setHorizontalAlignment(JLabel.CENTER);
            progressbar.setValue(set.getValue());
        }
    }
}
