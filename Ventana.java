import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {  // para crear interfaz click derecho en src new swing designer GUI
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JSpinner spCodigo;
    private JTextField txtNombre;
    private JSpinner spCreditosAprobados;
    private JComboBox cboCreditosActuales;
    private JCheckBox chkPagado;
    private JButton btnAgregar;
    private JTextArea txtListado;
    private JButton btnListar;
    private JButton btnExtraer;
    private ParaleloA paraleloA=new ParaleloA();

    public Ventana(){  //en el botono de interfaz AGREGAR ESTUDIANTE click derecho create listener

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo=Integer.parseInt(spCodigo.getValue().toString()); //Integer para convertir a entero // toString para convertir en string
                String nombre=txtNombre.getText();
                int cap=Integer.parseInt(spCreditosAprobados.getValue().toString());
                int cactual=Integer.parseInt(cboCreditosActuales.getSelectedItem().toString()); //para combo usar get selected item
                boolean pagado=chkPagado.isSelected()?true:false; // selected se usa para chaeck box // ?: if else verdad o falso
                Estudiante nuevo=new Estudiante(codigo,nombre,cap,cactual,pagado);//constructor corresponder con constructor clase estudiante
                paraleloA.agregar(nuevo);
                JOptionPane.showMessageDialog(null, "Estudiante agregado"); //JOpptionPane se usa para mostrar mensajes
            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtListado.setText(paraleloA.listarEstudiantes());
            }
        });
        btnExtraer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                Estudiante est1=paraleloA.desencolar();
                JOptionPane.showMessageDialog(null, "Se extrae primer elemento"+est1.toString());
                txtListado.setText(paraleloA.listarEstudiantes());
            }catch (Exception ex){
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}