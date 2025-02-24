import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;


public class PrimeiraTela extends JFrame {
    private JPanel contentPane;
    private JTextField userNome;
    private JTextField userSenha;
    private JButton acessarUsuario;
    private JButton cadastrarUsuario;
    private Controler controler;


    public PrimeiraTela() {
        // Configurando a tela
        setContentPane(contentPane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 200);

        // Construindo a classe Controler
        controler = new Controler();

        // Ações do botão
        acessarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (controler.validaUsuario(userNome.getText(), userSenha.getText())) {

                } else {

                }

            }
        });

        cadastrarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                CadastroTela cadastroTela = new CadastroTela();
            }
        });
    }
}