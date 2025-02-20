import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;


public class InicioTela extends JFrame {
    private JPanel contentPane;
    private JTextField userNome;
    private JTextField userSenha;
    private JButton acessarUsuario;
    private JButton sairDaTela;

    public InicioTela(){
        setContentPane(contentPane);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400,200);
        acessarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}