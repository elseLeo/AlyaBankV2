import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel jpMenu;
    private JButton btnPessoaFisica;
    private JButton btnContaCorrente;
    private JLabel lblCadastro;
    private JLabel lblPessoaFisica;
    private JLabel lblContaCorrente;
    public Menu() {
        iniciarComponentes();
        botoes();

    }
    public void iniciarComponentes(){
        setTitle("Menu");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(jpMenu);
        setVisible(true);
    }

    public void botoes(){
    btnPessoaFisica.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            TelaCadastroPessoaFisica telaCadastroPessoaFisica = new TelaCadastroPessoaFisica();
        }
    });

        btnContaCorrente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaContaCorrente telaContaCorrente = new TelaContaCorrente();
            }
        });
}

    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}



