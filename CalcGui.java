import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3327306622772163775L;
	private JPanel contentPane;
	private JTextField txtHeight;
	private JTextField txtWidth;
	private JTextField txtRadius;
	private JTextField txtLength;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGui frame = new CalcGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem() == "Square"){
					txtWidth.setEnabled(false);
					txtHeight.setEnabled(false);
					txtRadius.setEnabled(false);
					txtLength.setEnabled(true);
				}else if (comboBox.getSelectedItem() == "Triangle"){
					txtLength.setEnabled(false);
					txtRadius.setEnabled(false);
					txtWidth.setEnabled(true);
					txtHeight.setEnabled(true);
				}else if (comboBox.getSelectedItem() == "Rectangle"){
					txtLength.setEnabled(false);
					txtRadius.setEnabled(false);
					txtWidth.setEnabled(true);
					txtHeight.setEnabled(true);
				}else if (comboBox.getSelectedItem() == "Circle"){
					txtLength.setEnabled(false);
					txtRadius.setEnabled(true);
					txtWidth.setEnabled(false);
					txtHeight.setEnabled(false);
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Square", "Triangle", "Rectangle", "Circle"}));
		comboBox.setBounds(147, 11, 95, 20);
		contentPane.add(comboBox);
		
		JLabel lblChooseAShape = new JLabel("Choose a shape:");
		lblChooseAShape.setBounds(10, 11, 127, 14);
		contentPane.add(lblChooseAShape);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setBounds(10, 55, 46, 14);
		contentPane.add(lblHeight);
		
		txtHeight = new JTextField();
		txtHeight.setBounds(147, 52, 86, 20);
		contentPane.add(txtHeight);
		txtHeight.setColumns(10);
		
		JLabel lblWidth = new JLabel("Width:");
		lblWidth.setBounds(10, 90, 46, 14);
		contentPane.add(lblWidth);
		
		txtWidth = new JTextField();
		txtWidth.setBounds(147, 87, 86, 20);
		contentPane.add(txtWidth);
		txtWidth.setColumns(10);
		
		JLabel lblRadius = new JLabel("Radius:");
		lblRadius.setBounds(10, 121, 46, 14);
		contentPane.add(lblRadius);
		
		txtRadius = new JTextField();
		txtRadius.setBounds(147, 118, 86, 20);
		contentPane.add(txtRadius);
		txtRadius.setColumns(10);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setBounds(10, 153, 46, 14);
		contentPane.add(lblLength);
		
		txtLength = new JTextField();
		txtLength.setBounds(147, 150, 86, 20);
		contentPane.add(txtLength);
		txtLength.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(10, 227, 89, 23);
		contentPane.add(btnCalculate);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(120, 231, 46, 14);
		contentPane.add(lblArea);
		
		final JLabel lblAreaValue = new JLabel("0");
		lblAreaValue.setBounds(163, 231, 73, 14);
		contentPane.add(lblAreaValue);
		
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comboBox.getSelectedItem() == "Square"){
					Square areaSquare = new Square();
					areaSquare.setLength(Integer.parseInt(txtLength.getText()));
					lblAreaValue.setText("" + areaSquare.sumSquare());
				}else if (comboBox.getSelectedItem() == "Triangle"){
					Triangle areaTriangle = new Triangle();
					areaTriangle.setBase(Integer.parseInt(txtWidth.getText()));
					areaTriangle.setHeight(Integer.parseInt(txtHeight.getText()));
					lblAreaValue.setText("" + areaTriangle.sumTriangle());
				}else if (comboBox.getSelectedItem() == "Rectangle"){
					Rectangle areaRectangle = new Rectangle();
					areaRectangle.setBase(Integer.parseInt(txtWidth.getText()));
					areaRectangle.setHeight(Integer.parseInt(txtHeight.getText()));
					lblAreaValue.setText("" + areaRectangle.sumRectangle());
				}else if (comboBox.getSelectedItem() == "Circle"){
					Circle areaCircle = new Circle();
					areaCircle.setRadius(Integer.parseInt(txtRadius.getText()));
					lblAreaValue.setText("" + areaCircle.sumCircle());
				}
			}
		});
	}
}
