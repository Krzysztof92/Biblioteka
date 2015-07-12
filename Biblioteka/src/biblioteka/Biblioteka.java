package biblioteka;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Biblioteka extends JFrame
{
    
    JFrame oknoBiblioteki;
    JButton bDodajKsiazke;
    JButton bWyswietlZawartosc;
    JLabel lTytul;
    JLabel lAutor;
    JLabel lRok;
    JTextField tTytul;
    JTextField tAutor;
    JTextField tRok;
    
    JRadioButton userButton = new JRadioButton("Dodaj Uzytkowniika");
    JRadioButton rentButton = new JRadioButton("Wypozyczanie Ksiazek");
    JRadioButton returnButton = new JRadioButton("Zwrot Ksiazek");    
    
    public Biblioteka()
    {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());        
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS ));
        add(buttonPanel, BorderLayout.SOUTH);
        
        
        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.PAGE_AXIS));
        labelPanel.setSize(200, 300);
        labelPanel.setBackground(Color.YELLOW);
        JPanel labelPanelDIV = new JPanel();
        labelPanelDIV.setLayout(new GridLayout(2,1));
        labelPanelDIV.add(labelPanel);
        add(labelPanelDIV, BorderLayout.WEST);
       
        
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.PAGE_AXIS));
        add(textPanel, BorderLayout.CENTER);   
        JPanel textPanelDIV = new JPanel();
        textPanelDIV.setLayout(new GridLayout(2,1));
        textPanelDIV.add(textPanel);
        add(textPanelDIV, BorderLayout.CENTER);
                
        JPanel welcomePanel = new JPanel();
        welcomePanel.setLayout(new BoxLayout(welcomePanel, BoxLayout.PAGE_AXIS));
        add(welcomePanel, BorderLayout.NORTH);
        JPanel titlePanel = new JPanel();
        welcomePanel.add(titlePanel, BorderLayout.NORTH);
        JPanel modePanel = new JPanel();
        modePanel.setLayout(new BoxLayout(modePanel, BoxLayout.LINE_AXIS));
        welcomePanel.add(modePanel, BorderLayout.NORTH);        
        
        JLabel tytul = new JLabel("BIBLIOTEKA");
        titlePanel.add(tytul);
        
        
        
        modePanel.add(userButton);
        modePanel.add(rentButton);
        modePanel.add(returnButton);
        
        bDodajKsiazke = new JButton("Dodaj ksiazke");
        bDodajKsiazke.setSize(100,20);
        buttonPanel.add(bDodajKsiazke, BorderLayout.SOUTH);
        buttonPanel.add(Box.createHorizontalGlue());       
        bWyswietlZawartosc = new JButton("Wyswietl zawartosc");
        buttonPanel.add(bWyswietlZawartosc, BorderLayout.SOUTH);
        
        lTytul = new JLabel("Tytul");
        labelPanel.add(lTytul, BorderLayout.WEST);
        labelPanel.add(Box.createVerticalGlue());
        lAutor = new JLabel("Autor");
        labelPanel.add(lAutor, BorderLayout.WEST);
        labelPanel.add(Box.createVerticalGlue());
        lRok = new JLabel("Rok");
        labelPanel.add(lRok, BorderLayout.WEST);
        
        tTytul = new JTextField();
        textPanel.add(tTytul, BorderLayout.CENTER);
        textPanel.add(Box.createVerticalGlue());
        tAutor = new JTextField();
        textPanel.add(tAutor, BorderLayout.CENTER);
        textPanel.add(Box.createVerticalGlue());
        tRok = new JTextField();
        textPanel.add(tRok, BorderLayout.CENTER);
        
        userButton.setSelected(true);
        userButton.addItemListener(new RadioButtonSelection());
        rentButton.addItemListener(new RadioButtonSelection());
        returnButton.addItemListener(new RadioButtonSelection());
        
    }
        private void selectRadioButton(boolean active)
        {
            userButton.setEnabled(active);
            rentButton.setEnabled(active);
            returnButton.setSelected(active);
        }

        private class RadioButtonSelection implements ItemListener
        {
             @Override
            public void itemStateChanged(ItemEvent ie)
            {
//                if (ie.getStateChange()==ItemEvent.SELECTED)
//                {
//                    JRadioButton button = (JRadioButton) ie.getItemSelectable();
//                    //if (button==userButton)
//                        
//                }
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
       }   
        
        
    
    
public static void main(String[] args){
        
        Biblioteka okno = new Biblioteka();
             
        
    }
   
}
   