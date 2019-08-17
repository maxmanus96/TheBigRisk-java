/**
 * Created by msı on 2.4.2016.
 */
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import static java.lang.System.*;

public class first extends JFrame{
    public first(){
        //first j=new first();
        /*j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);*/
        super("The Big Risk");
        setLayout(new GridLayout(3,1));
        /*add(new Button("Başla!"));
        add(new Button("Çıkış"));
        setLocationRelativeTo(null);*/
        ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\jeopardy.png");
        this.setIconImage(icon.getImage());
    }

    public static void main(String [] args){
        first a=new first();
        a.setSize(500,500);
        a.setVisible(true);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton buton1=new JButton("Başla");
        JButton buton3=new JButton("Hazırlayanlar");
        JButton buton2=new JButton("Çıkış");
        a.add(buton1);
        a.add(buton3);
        a.add(buton2);
        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                second b=new second();
                b.setVisible(true);
                b.setTitle("TheBigRisk");
                b.pack();
                b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                b.setSize(800,800);
                b.setVisible(true);
                b.setResizable(false);
                b.setLocationRelativeTo(null);
                ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\jeopardy.png");
                b.setIconImage(icon.getImage());
                a.dispose();

            }
        });
        buton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
        buton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hazirlayanlar hzr=new hazirlayanlar();
            }
        });




    }



}

class hazirlayanlar extends JFrame{
    public hazirlayanlar(){
        super.setTitle("Hazırlayanlar");
        super.setVisible(true);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setSize(450,250);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        JTextArea txt1=new JTextArea();
        txt1.setText("HÜSEYİN HÜRKAN KARAMAN 1030516163" + "\n" + "SEMİH CAN BOZOK 1030516177" + "\n" + "ALİ FURKAN GEZER 1030516153" + "\n" + "EKREM KÜRŞAD DAL 1030516296" + "\n\n\n" +"Jeopardy v1.0 \n\nİzinsiz Çoğaltılamaz.");
        txt1.setFont(new Font("Times New Roman",Font.BOLD,15));
        txt1.setEditable(false);

//Eklemeler burada yapılacak.
        super.add(txt1,BorderLayout.CENTER);


    }

}



