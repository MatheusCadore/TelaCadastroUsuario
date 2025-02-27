import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTela extends JFrame {
    private JPanel contentPanel;
    private JTextField nome;
    private JTextField sobrenome;
    private JTextField idade;
    private JTextField cpf;
    private JTextField telefone;
    private JTextField email;
    private JTextField senha;
    private JButton voltaBtn;
    private JButton salvaBtn;
    private Controler controler;


    public CadastroTela(){
        setContentPane(contentPanel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 300);

/*
        salvaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (controler.validaCadastro()){
                    controler.criaUsuario();
                    JOptionPane.showMessageDialog(contentPanel,"Model.Usuario cadastrado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(contentPanel,"Cadastro invalido verificar" + controler.mostraErros() );
                }
            }
        });
*/
        voltaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                PrimeiraTela primeiraTela = new PrimeiraTela();
            }
        });
    }



}

