/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author kim
 */
public class Calculadora extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     *
     */
    JButton bt_mc, bt_mr, bt_ms, bt_mMais, bt_mMenos, bt_seta, bt_ce, bt_c, bt_maisMenos, bt_raiz, bt_7, bt_8, bt_9, bt_div, bt_perc, bt_4, bt_5, bt_6, bt_mult, bt_umx, bt_1, bt_2, bt_3, bt_sub, bt_zero, bt_virgula, bt_adicao, bt_igual;
    JMenuBar barra_menu;
    JMenu menu_Exibir, menu_Editar, menu_ajuda;
    JMenuItem menuitem_Padrao;
    JTextField tf_visor, tf_historico;
    JLabel lb_autor, lb_data, lb_hora;

    public double vl_visor, vl_anterior, resultado;
    public boolean primeiraoperacao, botaoIgual;
    int operacao;

    Resposta obj_resposta = new Resposta();
    
    public Calculadora() {
        inicializarComponents();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        JFrame calcula = new Calculadora();
        calcula.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent arg) {

        if (arg.getSource() == bt_mc) {
        }
        if (arg.getSource() == bt_mr) {
        }
        if (arg.getSource() == bt_ms) {
        }
        if (arg.getSource() == bt_mMais) {
        }
        if (arg.getSource() == bt_maisMenos) {
        }
        if (arg.getSource() == bt_seta) {
            int qtd = tf_visor.getText().length();
            if (qtd > 0) {
                tf_visor.setText(tf_visor.getText().substring(0, qtd - 1));
            }
        }
        if (arg.getSource() == bt_ce) {
            tf_historico.setText("");
        }
        if (arg.getSource() == bt_c) {
            tf_visor.setText("");
        }
        if (arg.getSource() == bt_maisMenos) {
        }
        if (arg.getSource() == bt_raiz) {
        }
        if (arg.getSource() == bt_perc) {
        }
        if (arg.getSource() == bt_umx) {
        }
        if (arg.getSource() == bt_1) {
            tf_visor.setText(tf_visor.getText() + 1);
        }
        if (arg.getSource() == bt_2) {
            tf_visor.setText(tf_visor.getText() + 2);
        }
        if (arg.getSource() == bt_3) {
            tf_visor.setText(tf_visor.getText() + 3);
        }
        if (arg.getSource() == bt_4) {
            tf_visor.setText(tf_visor.getText() + 4);
        }
        if (arg.getSource() == bt_5) {
            tf_visor.setText(tf_visor.getText() + 5);
        }
        if (arg.getSource() == bt_6) {
            tf_visor.setText(tf_visor.getText() + 6);
        }
        if (arg.getSource() == bt_7) {
            tf_visor.setText(tf_visor.getText() + 7);
        }
        if (arg.getSource() == bt_8) {
            tf_visor.setText(tf_visor.getText() + 8);
        }
        if (arg.getSource() == bt_9) {
            tf_visor.setText(tf_visor.getText() + 9);
        }
        if (arg.getSource() == bt_zero) {
            tf_visor.setText(tf_visor.getText() + 0);

        }
        if (arg.getSource() == bt_adicao) {
            adicao();
        }
        if (arg.getSource() == bt_sub) {
            subtrair();
        }
        if (arg.getSource() == bt_mult) {
            multiplicar();
        }
        if (arg.getSource() == bt_div) {
            dividir();
        }
        if (arg.getSource() == bt_virgula) {

        }
        if (arg.getSource() == bt_igual) {
            retorna_resultado();
        }
    }

    public void inicializarComponents() {
        setTitle("Calculadora");
        setSize(307, 325);
        setLocation(150, 180);
        setResizable(false);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        barra_menu = new JMenuBar();
        setJMenuBar(barra_menu);

        menu_Exibir = new JMenu("Exibir");
        menu_Editar = new JMenu("Editar");
        menu_ajuda = new JMenu("Ajuda");
        barra_menu.add(menu_Exibir);
        barra_menu.add(menu_Editar);
        barra_menu.add(menu_ajuda);

        menuitem_Padrao = new JMenuItem("Padrão");
        menu_Exibir.add(menuitem_Padrao);

        tf_visor = new JTextField();
        tf_historico = new JTextField();

        bt_mc = new JButton("MC");
        bt_mr = new JButton("MR");
        bt_ms = new JButton("MS");
        bt_mMais = new JButton("M+");
        bt_mMenos = new JButton("M-");
        bt_seta = new JButton("<--");
        bt_ce = new JButton("CE");
        bt_c = new JButton("C");
        bt_maisMenos = new JButton("±");
        bt_raiz = new JButton("#");
        bt_7 = new JButton("7");
        bt_8 = new JButton("8");
        bt_9 = new JButton("9");
        bt_div = new JButton("/");
        bt_perc = new JButton("%");
        bt_4 = new JButton("4");
        bt_5 = new JButton("5");
        bt_6 = new JButton("6");
        bt_mult = new JButton("*");
        bt_umx = new JButton("1/x");
        bt_1 = new JButton("1");
        bt_2 = new JButton("2");
        bt_3 = new JButton("3");
        bt_sub = new JButton("-");
        bt_zero = new JButton("0");
        bt_virgula = new JButton(",");
        bt_adicao = new JButton("+");
        bt_igual = new JButton("=");

        bt_zero.setForeground(Color.BLUE);
        bt_1.setForeground(Color.BLUE);
        bt_2.setForeground(Color.BLUE);
        bt_3.setForeground(Color.BLUE);
        bt_4.setForeground(Color.BLUE);
        bt_5.setForeground(Color.BLUE);
        bt_6.setForeground(Color.BLUE);
        bt_6.setForeground(Color.BLUE);
        bt_7.setForeground(Color.BLUE);
        bt_8.setForeground(Color.BLUE);
        bt_9.setForeground(Color.BLUE);

        bt_mc.setForeground(Color.RED);
        bt_mr.setForeground(Color.RED);
        bt_ms.setForeground(Color.RED);
        bt_mMais.setForeground(Color.RED);
        bt_mMenos.setForeground(Color.RED);
        bt_maisMenos.setForeground(Color.blue);
        bt_seta.setForeground(Color.RED);
        bt_raiz.setForeground(Color.blue);
        bt_div.setForeground(Color.RED);
        bt_perc.setForeground(Color.blue);
        bt_mult.setForeground(Color.RED);
        bt_umx.setForeground(Color.blue);
        bt_sub.setForeground(Color.RED);
        bt_adicao.setForeground(Color.red);
        bt_ce.setForeground(Color.RED);
        bt_c.setForeground(Color.RED);
        bt_igual.setForeground(Color.RED);
        tf_historico.setBorder(null);
        tf_visor.setBorder(null);

        getContentPane().add(bt_mc);
        getContentPane().add(bt_mr);
        getContentPane().add(bt_ms);
        getContentPane().add(bt_mMais);
        getContentPane().add(bt_mMenos);
        getContentPane().add(bt_seta);
        getContentPane().add(bt_ce);
        getContentPane().add(bt_c);
        getContentPane().add(bt_maisMenos);
        getContentPane().add(bt_raiz);
        getContentPane().add(bt_7);
        getContentPane().add(bt_8);
        getContentPane().add(bt_9);
        getContentPane().add(bt_div);
        getContentPane().add(bt_perc);
        getContentPane().add(bt_4);
        getContentPane().add(bt_5);
        getContentPane().add(bt_6);
        getContentPane().add(bt_mult);
        getContentPane().add(bt_umx);
        getContentPane().add(bt_1);
        getContentPane().add(bt_2);
        getContentPane().add(bt_3);
        getContentPane().add(bt_sub);
        getContentPane().add(bt_zero);
        getContentPane().add(bt_virgula);
        getContentPane().add(bt_adicao);
        getContentPane().add(bt_igual);

        getContentPane().add(tf_visor);
        getContentPane().add(tf_historico);

        tf_historico.setBounds(10, 10, 275, 30);
        tf_visor.setBounds(10, 38, 275, 30);

        bt_mc.setBounds(10, 70, 55, 30);
        bt_mc.addActionListener(this);
        bt_mr.setBounds(65, 70, 55, 30);
        bt_mr.addActionListener(this);
        bt_ms.setBounds(120, 70, 55, 30);
        bt_ms.addActionListener(this);
        bt_mMais.setBounds(175, 70, 55, 30);
        bt_mMais.addActionListener(this);
        bt_mMenos.setBounds(230, 70, 55, 30);
        bt_mMenos.addActionListener(this);
        bt_seta.setBounds(10, 100, 55, 30);
        bt_seta.addActionListener(this);
        bt_ce.setBounds(65, 100, 55, 30);
        bt_ce.addActionListener(this);
        bt_c.setBounds(120, 100, 55, 30);
        bt_c.addActionListener(this);
        bt_maisMenos.setBounds(175, 100, 55, 30);
        bt_maisMenos.addActionListener(this);
        bt_raiz.setBounds(230, 100, 55, 30);
        bt_raiz.addActionListener(this);
        bt_7.setBounds(10, 130, 55, 30);
        bt_7.addActionListener(this);
        bt_8.setBounds(65, 130, 55, 30);
        bt_8.addActionListener(this);
        bt_9.setBounds(120, 130, 55, 30);
        bt_9.addActionListener(this);
        bt_div.setBounds(175, 130, 55, 30);
        bt_div.addActionListener(this);
        bt_perc.setBounds(230, 130, 55, 30);
        bt_perc.addActionListener(this);
        bt_4.setBounds(10, 160, 55, 30);
        bt_4.addActionListener(this);
        bt_5.setBounds(65, 160, 55, 30);
        bt_5.addActionListener(this);
        bt_6.setBounds(120, 160, 55, 30);
        bt_6.addActionListener(this);
        bt_mult.setBounds(175, 160, 55, 30);
        bt_mult.addActionListener(this);
        bt_umx.setBounds(230, 160, 55, 30);
        bt_umx.addActionListener(this);
        bt_1.setBounds(10, 190, 55, 30);
        bt_1.addActionListener(this);
        bt_2.setBounds(65, 190, 55, 30);
        bt_2.addActionListener(this);
        bt_3.setBounds(120, 190, 55, 30);
        bt_3.addActionListener(this);
        bt_sub.setBounds(175, 190, 55, 30);
        bt_sub.addActionListener(this);
        bt_zero.setBounds(10, 220, 110, 30);
        bt_zero.addActionListener(this);
        bt_virgula.setBounds(120, 220, 55, 30);
        bt_virgula.addActionListener(this);
        bt_adicao.setBounds(175, 220, 55, 30);
        bt_adicao.addActionListener(this);
        bt_igual.setBounds(230, 190, 55, 60);
        bt_igual.addActionListener(this);
    }

    public void adicao() {
        operacao = 1;
        if (primeiraoperacao) {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            if (botaoIgual) {
                tf_historico.setText(tf_historico.getText() + tf_visor.getText());
            }
            tf_visor.setText("");
            //operacao =" + ";
            primeiraoperacao = true;
        } else {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "+");
            tf_visor.setText("");

        }

    }

    public void subtrair() {
        operacao = 2;
        if (primeiraoperacao) {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            if (botaoIgual) {
                tf_historico.setText(tf_historico.getText() + tf_visor.getText());
            }
            tf_visor.setText("");
            //operacao =" + ";
            primeiraoperacao = true;
        } else {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "-");
            tf_visor.setText("");

        }

    }

    public void dividir() {
        operacao = 3;
        if (primeiraoperacao) {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            if (botaoIgual) {
                tf_historico.setText(tf_historico.getText() + tf_visor.getText());
            }
            tf_visor.setText("");
            //operacao =" + ";
            primeiraoperacao = true;
        } else {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "/");
            tf_visor.setText("");

        }
    }

    public void multiplicar() {
        operacao = 4;
        if (primeiraoperacao) {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            if (botaoIgual) {
                tf_historico.setText(tf_historico.getText() + tf_visor.getText());
            }
            tf_visor.setText("");
            //operacao =" + ";
            primeiraoperacao = true;
        } else {
            vl_anterior = Double.parseDouble(tf_visor.getText());
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "*");
            tf_visor.setText("");

        }
    }

    public void retorna_resultado() {
        if (operacao == 1) {
            resultado = obj_resposta.somar(vl_anterior, Double.parseDouble(tf_visor.getText()));
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "=");
            tf_visor.setText(String.valueOf(resultado));
            tf_historico.setText(tf_historico.getText() + String.valueOf(resultado));

        }
        if (operacao == 2) {
            resultado = obj_resposta.subtrair(vl_anterior, Double.parseDouble(tf_visor.getText()));
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "=");
            tf_visor.setText(String.valueOf(resultado));
            tf_historico.setText(tf_historico.getText() + String.valueOf(resultado));

        }
        if (operacao == 3) {
            resultado = obj_resposta.dividir(vl_anterior, Double.parseDouble(tf_visor.getText()));
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "=");
            tf_visor.setText(String.valueOf(resultado));
            tf_historico.setText(tf_historico.getText() + String.valueOf(resultado));

        }
        if (operacao == 4) {
            resultado = obj_resposta.multiplicar(vl_anterior, Double.parseDouble(tf_visor.getText()));
            tf_historico.setText(tf_historico.getText() + tf_visor.getText() + "=");
            tf_visor.setText(String.valueOf(resultado));
            tf_historico.setText(tf_historico.getText() + String.valueOf(resultado));

        }
    }

}
