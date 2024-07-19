
package Template;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Jcheckbox extends Frame implements ActionListener{
    JCheckBox jb1,jb2,jb3;
    JLabel an1,an2,an3;
    boolean select1,select2,select3;
    String selection;
    Jcheckbox (String title){
        super(title);
        addWindowListener(new WindowAdapter(){
            public void WindowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setSize(450,300);
        jb1=new JCheckBox("Saro");
        jb2=new JCheckBox("Sokny");
        jb3=new JCheckBox("Chhanny");
        an1=new JLabel();
        an2=new JLabel();
        an3=new JLabel();
        jb3.setText("Cambodia");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jb1);
        add(jb2);
        add(jb3);
        add(an1);
        add(an2);
        add(an3);
        setLocationRelativeTo(null);
        setVisible(true);
      
    }
    public void actionPermed(ActionEvent ae)
    {
        select1=jb1.isSelected();
        select2=jb2.isSelected();
        select3=jb3.isSelected();
        selection="";
        if(select1){
            selection="file:///C:/Users/User/Pictures/coca1.webp";
            an1.setIcon(new ImageIcon(selection));
        }
        else{
            selection="";
            an1.setIcon(new ImageIcon(selection));
            
        }
        if(select2){
            selection="file:///C:/Users/User/Pictures/coca1.webp";
            an2.setIcon(new ImageIcon(selection));
        }
        else{
            selection="";
            an2.setIcon(new ImageIcon(selection));
            
        }
        if(select3){
            selection="file:///C:/Users/User/Pictures/coca1.webp";
            an3.setIcon(new ImageIcon(selection));
        }
        else{
            selection="";
            an3.setIcon(new ImageIcon(selection));
            
        }
        
        
    }  
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new Jcheckbox("JCheckBox on JFrame");
        
    }
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
