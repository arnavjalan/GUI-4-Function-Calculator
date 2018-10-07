import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener, WindowListener {

	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;

	public AWTCounter() {

		setLayout(new FlowLayout());

		lblCount = new Label("Counter");
		add(lblCount);

		tfCount = new TextField("0", 10);
		tfCount.setEditable(false);
		add(tfCount);

		btnCount = new Button("Count");
		add(btnCount);

		btnCount.addActionListener(this);

		addWindowListener(this);

		setTitle("AWT Counter");
		setSize(250, 100);
		setVisible(true);
	}

public static void main (String[] args) {

		AWTCounter app = new AWTCounter();
	}

@Override
public void actionPerformed(ActionEvent evt) {

		++count;
		tfCount.setText(count + "");
	}

@Override
public void windowClosing(WindowEvent evt) {

	System.exit(0);
}

@Override public void windowOpened(WindowEvent evt) { }
@Override public void windowClosed(WindowEvent evt) { }
@Override public void windowIconified(WindowEvent evt) { }
@Override public void windowDeiconified(WindowEvent evt) { }
@Override public void windowActivated(WindowEvent evt) { }
@Override public void windowDeactivated(WindowEvent evt) { }
}