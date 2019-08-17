import com.sun.org.apache.bcel.internal.generic.GOTO;
import javafx.scene.control.CheckBox;

import javafx.scene.control.RadioButton;
import org.omg.CORBA.Object;
import org.omg.CORBA.portable.Streamable;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.*;
/**
 * Created by msı on 2.4.2016.
 */


import java.awt.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class second extends JFrame {
    //private int puan;
    private JButton but[][] = new JButton[5][5];
    private String [][] answers = new String[5][5];
    private String [][] quest=new String[5][5];
    private String [] topicss=new String[5];
    ArrayList<String> liste=new ArrayList<String>();
    ArrayList<String> cevapliste=new ArrayList<String>();
    static ArrayList<Integer> say=new ArrayList<Integer>();
    //int h=0;


    public int puanbirinci=0;
    public int puanikinci=0;
    public int puanucuncu=0;

    public static JRadioButton rdr1;
    public static JRadioButton rdr2;
    public static JRadioButton rdr3;
    public static JRadioButton rdr4;
    public static JRadioButton rdr5;
    public static JRadioButton rdr6;


    public static JTextField text1;
    public static JTextField text2;
    public static JTextField text3;


    private final List<JButton> list = new ArrayList<JButton>();


    public second(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new GridLayout(4,1));

        JPanel pnl2=new JPanel(new GridLayout(1,5));


       /* JButton btn1=new JButton();
        JButton btn2=new JButton();
        JButton btn3=new JButton();
        JButton btn4=new JButton();
        JButton btn5=new JButton();*/
        //JLabel lbl1=new JLabel();
        JTextArea txt1=new JTextArea();
        JTextArea txt2=new JTextArea();
        JTextArea txt3=new JTextArea();
        JTextArea txt4=new JTextArea();
        JTextArea txt5=new JTextArea();
        //pnl2.add(btn1);
        pnl2.add(txt1);
        pnl2.add(txt2);
        pnl2.add(txt3);
        pnl2.add(txt4);
        pnl2.add(txt5);
        add(pnl2);
        //add(createGridPanel());


        BufferedReader br = null;
        BufferedReader br1=null;
        BufferedReader br2=null;
        BufferedReader br3=null;
        BufferedReader br4=null;
        BufferedReader br5=null;
        try {
            br = new BufferedReader(
                    new FileReader(new File("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\Questions.txt")));
            br1=new BufferedReader(
                    new FileReader(new File("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\Questions.txt")));
            br2=new BufferedReader(
                    new FileReader(new File("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\Questions.txt")));
            br3=new BufferedReader(
                    new FileReader(new File("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\Questions.txt")));
            br4=new BufferedReader(
                    new FileReader(new File("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\Questions.txt")));
            br5=new BufferedReader(
                    new FileReader(new File("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\Questions.txt")));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }


        String line;


        String[] topics = new String[10];
        //String[][] quests = new String[5][5];

        try {

            int z = 0;

            while ((line = br.readLine()) != null ) {
                if (line.contains("topic")) {

                    if (line != null && z <= 9) {
                        topics[z] = line.split(":")[1];
                        z++;
                    }
                }
            }


            Random random=new Random();


            while(say.size()!=5)
            {
                int d=random.nextInt(10);
                if(!say.contains(d))
                    say.add(d);
            }


            /*for (Integer in:
                    say) {
                System.out.println(say);
            }
            for (String s:
                 topics) {
                System.out.println(s);
            }*/


            for (Integer in:
                    say) {
                System.out.println(in);
            }

            txtayarla(txt1);
            txt1.setText("\t\t\t\t\t\t\t\t\t\t\t"+topics[say.get(0)]);

            System.out.println(txt1);
            System.out.println(topics[say.get(0)]);


            txtayarla(txt2);
            txt2.setText("\t\t\t\t\t\t\t\t\t\t\t"+topics[say.get(1)]);

            System.out.println(txt2);
            System.out.println(topics[say.get(1)]);

            txtayarla(txt3);
            txt3.setText("\t\t\t\t\t\t\t\t\t\t\t"+topics[say.get(2)]);

            System.out.println(txt3);
            System.out.println(topics[say.get(2)]);

            txtayarla(txt4);
            txt4.setText("\t\t\t\t\t\t\t\t\t\t\t"+topics[say.get(3)]);

            System.out.println(txt4);
            System.out.println(topics[say.get(3)]);

            txtayarla(txt5);
            txt5.setText("\t\t\t\t\t\t\t\t\t\t\t"+topics[say.get(4)]);

            System.out.println(txt5);
            System.out.println(topics[say.get(4)]);








            while((line = br1.readLine()) != null ){

               if(line.contains(topics[say.get(0)])) {
                    for (int i = 0; i < 5; i++) {
                        if (line.contains(topics[say.get(i)]) && line.contains("quest&answer:") && !(liste.contains(line.split(":")[2]))) {
                            System.out.println(0);
                            //h++;
                            System.out.println(i);
                            System.out.println(say.get(i));
                            System.out.println(say.get(0));
                            System.out.println(topics[say.get(i)]);
                            System.out.println(topics[say.get(0)]);
                            System.out.println(topics[say.get(1)]);
                            System.out.println(topics[say.get(2)]);
                            System.out.println(topics[say.get(3)]);
                            System.out.println(topics[say.get(4)]);
                            //System.out.println(topics[a1]);
                            liste.add(line.split(":")[2]);
                            cevapliste.add(line.split(":")[3]);



                        }



                    }
                }


            }
            while((line = br2.readLine()) != null){
                if(line.contains(topics[say.get(1)])) {
                    for (int i = 0; i < 5; i++) {
                        if (line.contains(topics[say.get(i)]) && line.contains("quest&answer:") && !(liste.contains(line.split(":")[2]))) {
                            System.out.println(1);
                            //h++;
                            System.out.println(i);
                            System.out.println(say.get(i));
                            System.out.println(say.get(1));
                            System.out.println(topics[say.get(i)]);
                            System.out.println(topics[say.get(0)]);
                            System.out.println(topics[say.get(1)]);
                            System.out.println(topics[say.get(2)]);
                            System.out.println(topics[say.get(3)]);
                            System.out.println(topics[say.get(4)]);
                            //System.out.println(topics[a1]);
                            liste.add(line.split(":")[2]);
                            cevapliste.add(line.split(":")[3]);



                        }



                    }
                }
            }
            while((line = br3.readLine()) != null){
                if(line.contains(topics[say.get(2)])) {
                    for (int i = 0; i < 5; i++) {
                        if (line.contains(topics[say.get(i)]) && line.contains("quest&answer:") && !(liste.contains(line.split(":")[2]))) {
                            System.out.println(2);
                            //h++;
                            System.out.println(i);
                            System.out.println(say.get(i));
                            System.out.println(say.get(2));
                            System.out.println(topics[say.get(i)]);
                            System.out.println(topics[say.get(0)]);
                            System.out.println(topics[say.get(1)]);
                            System.out.println(topics[say.get(2)]);
                            System.out.println(topics[say.get(3)]);
                            System.out.println(topics[say.get(4)]);
                            //System.out.println(topics[a1]);
                            liste.add(line.split(":")[2]);
                            cevapliste.add(line.split(":")[3]);



                        }



                    }
                }
            }
            while((line = br4.readLine()) != null){
                if(line.contains(topics[say.get(3)])) {
                    for (int i = 0; i < 5; i++) {
                        if (line.contains(topics[say.get(i)]) && line.contains("quest&answer:") && !(liste.contains(line.split(":")[2]))) {
                            System.out.println(3);
                            //h++;
                            System.out.println(i);
                            System.out.println(say.get(i));
                            System.out.println(say.get(3));
                            System.out.println(topics[say.get(i)]);
                            System.out.println(topics[say.get(0)]);
                            System.out.println(topics[say.get(1)]);
                            System.out.println(topics[say.get(2)]);
                            System.out.println(topics[say.get(3)]);
                            System.out.println(topics[say.get(4)]);
                            //System.out.println(topics[a1]);
                            liste.add(line.split(":")[2]);
                            cevapliste.add(line.split(":")[3]);



                        }



                    }
                }
            }
            while((line = br5.readLine()) != null){
                if(line.contains(topics[say.get(4)])) {
                    for (int i = 0; i < 5; i++) {
                        if (line.contains(topics[say.get(i)]) && line.contains("quest&answer:") && !(liste.contains(line.split(":")[2]))) {
                            System.out.println(4);
                            //h++;
                            System.out.println(i);
                            System.out.println(say.get(i));
                            System.out.println(say.get(4));
                            System.out.println(topics[say.get(i)]);
                            System.out.println(topics[say.get(0)]);
                            System.out.println(topics[say.get(1)]);
                            System.out.println(topics[say.get(2)]);
                            System.out.println(topics[say.get(3)]);
                            System.out.println(topics[say.get(4)]);
                            //System.out.println(topics[a1]);
                            liste.add(line.split(":")[2]);
                            cevapliste.add(line.split(":")[3]);



                        }



                    }
                }
            }




            for (String i:liste) {
                System.out.println(i);
            }
            for(String i:cevapliste)
            {
                System.out.println(i);
            }



            int g=0;
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    quest[i][j]=liste.get(g);
                    g++;
                }
            }


            int p=0;
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    answers[i][j]=cevapliste.get(p);
                    p++;
                }
            }



            topicss=topics;
        } catch (IOException e) {
            e.printStackTrace();
        }










        JPanel pnl1=new JPanel(new GridLayout(5,5));


        for(int i=0;i<5;i++)
        {

            for(int j=0;j<5;j++){
                but[i][j] = new JButton();
                if(i==0){
                    but[i][j].setText("$100");
                    but[i][j].putClientProperty("sütun",i);
                    but[i][j].putClientProperty("satır",j);

                }


                else if(i==1){
                    but[i][j].setText("$200");
                    but[i][j].putClientProperty("sütun",i);
                    but[i][j].putClientProperty("satır",j);

                }

                else if(i==2){
                    but[i][j].setText("$300");
                    but[i][j].putClientProperty("sütun",i);
                    but[i][j].putClientProperty("satır",j);

                }

                else if(i==3){
                    but[i][j].setText("$400");
                    but[i][j].putClientProperty("sütun",i);
                    but[i][j].putClientProperty("satır",j);
                }

                else if(i==4){
                    but[i][j].setText("$500");
                    but[i][j].putClientProperty("sütun",i);
                    but[i][j].putClientProperty("satır",j);

                }
                pnl1.add(but[i][j]);
                but[i][j].addActionListener(new buttonClk());
                //but[i][j].putClientProperty("column",j);
                //but[i][j].putClientProperty("row",i);
                list.add(j,but[i][j]);

            }


        }

       add(pnl1);


        rdr1=new JRadioButton("1.Round");
        rdr2=new JRadioButton("2.Round");
        rdr3=new JRadioButton("FİNAL");
        JPanel pnl3=new JPanel(new GridLayout(1,3));

        rdr1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdr1.isSelected()){
                    rdr2.setEnabled(false);
                    rdr3.setEnabled(false);
                }
                else{
                    rdr2.setEnabled(true);
                    rdr3.setEnabled(true);
                }


            }
        });
        rdr2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdr2.isSelected()){
                    rdr1.setEnabled(false);
                    rdr3.setEnabled(false);
                }
                else{
                    rdr1.setEnabled(true);
                    rdr3.setEnabled(true);
                }

            }
        });
        rdr3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdr3.isSelected()){
                    rdr1.setEnabled(false);
                    rdr2.setEnabled(false);
                }
                else{
                    rdr1.setEnabled(true);
                    rdr2.setEnabled(true);
                }



            }
        });

        pnl3.add(rdr1);
        pnl3.add(rdr2);
        pnl3.add(rdr3);
        add(pnl3);




        JPanel pnl4=new JPanel(new GridLayout(2,3));
         rdr4=new JRadioButton("1.Grup");
         rdr5=new JRadioButton("2.Grup");
         rdr6=new JRadioButton("3.Grup");
        pnl4.add(rdr4);
        pnl4.add(rdr5);
        pnl4.add(rdr6);
        add(pnl4);


        rdr4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdr4.isSelected()){
                    rdr5.setEnabled(false);
                    rdr6.setEnabled(false);

                }
                else{
                    rdr5.setEnabled(true);
                    rdr6.setEnabled(true);
                }
            }
        });
        rdr5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdr5.isSelected()){
                    rdr4.setEnabled(false);
                    rdr6.setEnabled(false);

                }
                else{
                    rdr4.setEnabled(true);
                    rdr6.setEnabled(true);
                }
            }
        });
        rdr6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rdr6.isSelected()){
                    rdr4.setEnabled(false);
                    rdr5.setEnabled(false);

                }
                else{
                    rdr4.setEnabled(true);
                    rdr5.setEnabled(true);
                }
            }
        });


        text1=new JTextField();
        text2=new JTextField();
        text3=new JTextField();
        text1.setEditable(false);
        text2.setEditable(false);
        text3.setEditable(false);
        text1.setSize(10,10);
        text2.setSize(10,10);
        text3.setSize(10,10);




        pnl4.add(text1);
        pnl4.add(text2);
        pnl4.add(text3);


        text1.setText(String.valueOf(puanbirinci));
        text2.setText(String.valueOf(puanikinci));
        text3.setText(String.valueOf(puanucuncu));




    }
    public static void main(String[] args){

        second s=new second();
        s.setTitle("TheBigRisk");
        s.pack();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setSize(800,800);
        s.setVisible(true);
        s.setResizable(false);
        s.setLocationRelativeTo(null);
        ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\jeopardy.png");
        s.setIconImage(icon.getImage());

    }

    public void txtayarla(JTextArea txt){
        Font fnt=new Font("Times New Roman",Font.BOLD,15);
        txt.setEnabled(true);
        txt.setFont(fnt);
        txt.setEditable(false);
        txt.setLineWrap(true);
        txt.setWrapStyleWord(true);
        txt.setAlignmentX(CENTER_ALIGNMENT);
        txt.setAlignmentY(CENTER_ALIGNMENT);
        txt.setLayout(new BorderLayout());
        txt.setBorder(new LineBorder(Color.BLACK,1,false));
    }

    public String[][] getQuest(){
        return quest;
    }
    public String[][] getAns(){
        return answers;
    }
    public int Index(int j){
        return j;
    }
    public JButton[][] getButtons(){
        return but;
    }
    public String getTopic(JButton button){
        int i=0;
        String tpc="";
        if(i<=4)
           tpc= topicss[0];
        else if(i>4 && i<=9)
            tpc=topicss[1];
        else if(i>9&&i<=15)
            tpc=topicss[1];
        else if(i>15&&i<=20)
            tpc=topicss[2];
        else if(i>20&&i<=25)
            tpc=topicss[3];


        return tpc;
    }
    public List<JButton> getlist(){
        return list;
    }
    public ArrayList<String> getliste(){return liste;}

    public JRadioButton rdrchck(){
        if(rdr1.isSelected())
            return rdr1;
        else if(rdr2.isSelected())
            return rdr2;
        else
            return rdr3;
    }
    public boolean rdrchecket(JRadioButton rdr){
        if(rdr.isSelected())
            return true;
        else
            return false;
    }








}

class buttonClk extends  JFrame implements ActionListener{


    static int a=0;
    static  int b=0;

    public static second sec=new second();
    static int sayac=0;




    ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\dollar.png");

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);

        String[][] quest=sec.getQuest();





        String[][] ans=sec.getAns();
        List<JButton> liste=sec.getlist();JButton btn=(JButton) e.getSource();
        ArrayList<String> sorun=sec.getliste();

        JButton[][] but=sec.getButtons();





        int x=0;
        int y=0;
        x=(int)btn.getClientProperty("satır");
        y=(int)btn.getClientProperty("sütun");

        JRadioButton rdrx=sec.rdrchck();

        devam:

        if(sec.rdr1.isSelected()||sec.rdr2.isSelected()||sec.rdr3.isSelected()) {

            if (sec.rdr4.isSelected() || sec.rdr5.isSelected() || sec.rdr6.isSelected()) {


                String cvp = (String) JOptionPane.showInputDialog(quest[x][y]);

               while(cvp==null||(cvp != null && ("".equals(cvp))))
                {
                    JOptionPane.showMessageDialog(null,"Cevap boş geçilemez lütfen geçerli bir cevap giriniz!");
                    cvp=(String)JOptionPane.showInputDialog(quest[x][y]);
                }

                btn.setEnabled(false);
                sayac++;

                System.out.println(ans[x][y]);


                /*if (sec.rdrchecket(rdrx))
                    System.out.println("1 secili");
                else
                    System.out.println("Secili degil");*/

                    /*System.out.println(ans[x][y]);
                    System.out.println(cvp);*/
                    /*if(cvp.equalsIgnoreCase(ans[x][y]))
                        System.out.println("Eşit");
                    else
                    System.out.println("DEĞİL");*/


                if (cvp.equalsIgnoreCase(ans[x][y])) {
                    System.out.println(ans[x][y]);
                    System.out.println(cvp);
                    String text = btn.getText().substring(1);

                    System.out.println(text);

                    //DOĞRU puansallar
                    if (sec.rdr4.isSelected()) {
                        if (sec.rdr1.isSelected()) {
                            sec.puanbirinci += Integer.parseInt(btn.getText().substring(1));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text1.setText(String.valueOf(sec.puanbirinci));

                        }
                        if (sec.rdr2.isSelected()) {
                            sec.puanbirinci += 2 * (Integer.parseInt(btn.getText().substring(1)));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text1.setText(String.valueOf(sec.puanbirinci));
                        }
                        if (sec.rdr3.isSelected()) {
                    /*String miktar=(String) JOptionPane.showInputDialog("Kullanmak istediğiniz miktarı giriniz:  ");
                    int mik=Integer.parseInt(miktar);
                    if(sec.puanbirinci>mik){
                        sec.puanbirinci+=2*(mik);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Yeterli miktar bulunmamaktadır.Lütfen yeniden deneyiniz.");
                        sec.rdr3.setSelected(true);
                    }*/
                            sec.puanbirinci += 3 * (Integer.parseInt(btn.getText().substring(1)));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text1.setText(String.valueOf(sec.puanbirinci));
                        }

                    }
                    if (sec.rdr5.isSelected()) {
                        if (sec.rdr1.isSelected()) {
                            sec.puanikinci += Integer.parseInt(btn.getText().substring(1));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text2.setText(String.valueOf(sec.puanikinci));
                        }
                        if (sec.rdr2.isSelected()) {
                            sec.puanikinci += 2 * (Integer.parseInt(btn.getText().substring(1)));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text2.setText(String.valueOf(sec.puanikinci));
                        }
                        if (sec.rdr3.isSelected()) {

                            sec.puanikinci += 3 * (Integer.parseInt(btn.getText().substring(1)));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text2.setText(String.valueOf(sec.puanikinci));
                        }

                    }
                    if (sec.rdr6.isSelected()) {
                        if (sec.rdr1.isSelected()) {
                            sec.puanucuncu += Integer.parseInt(btn.getText().substring(1));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text3.setText(String.valueOf(sec.puanucuncu));
                        }
                        if (sec.rdr2.isSelected()) {
                            sec.puanucuncu += 2 * (Integer.parseInt(btn.getText().substring(1)));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text3.setText(String.valueOf(sec.puanucuncu));
                        }
                        if (sec.rdr3.isSelected()) {
                            sec.puanucuncu += 3 * (Integer.parseInt(btn.getText().substring(1)));
                            btn.setIcon(icon);
                            btn.repaint();
                            sec.text3.setText(String.valueOf(sec.puanucuncu));
                        }

                    }

                }

            }
            else
                JOptionPane.showMessageDialog(null,"Bir grup seçmediniz.Lütfen bir grup seçip yeniden deneyiniz.");
        }

        else
        JOptionPane.showMessageDialog(null,"Bir round seçmediniz.Lütfen bir round seçip yeniden deneyiniz.");


        System.out.println(sec.puanbirinci);
        System.out.println(sec.puanikinci);
        System.out.println(sec.puanucuncu);

        Integer[] puanlar={sec.puanbirinci,sec.puanikinci,sec.puanucuncu};


        int max = puanlar[0];

        for (int i = 1; i < puanlar.length; i++) {
            if (puanlar[i] > max) {
                max = puanlar[i];
            }
        }
        //JOptionPane.showMessageDialog(null,"TEBRİKLER KAZANDINIZ","KAZANAN",JOptionPane.INFORMATION_MESSAGE,icon);
        //sayac=25;
        if(sayac==25){
            ImageIcon icon=new ImageIcon("C:\\Users\\msı\\IdeaProjects\\TheBigRisk\\src\\first-place-medal.png");
            if(max==sec.puanbirinci){
                JOptionPane.showMessageDialog(null,"TEBRİKLER KAZANDINIZ","KAZANAN 1.GRUP",JOptionPane.INFORMATION_MESSAGE,icon);
            }
            else if(max==sec.puanikinci){
                JOptionPane.showMessageDialog(null,"TEBRİKLER KAZANDINIZ","KAZANAN 2.GRUP",JOptionPane.INFORMATION_MESSAGE,icon);
            }
            else if(max==sec.puanucuncu){
                JOptionPane.showMessageDialog(null,"TEBRİKLER KAZANDINIZ","KAZANAN 3.GRUP",JOptionPane.INFORMATION_MESSAGE,icon);
            }
        }
        //find büyük
        //Kazanan büyük:




    }


}








