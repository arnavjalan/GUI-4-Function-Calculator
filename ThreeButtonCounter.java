import java.awt.*;
import java.awt.event.*;

public class ThreeButtonCounter extends Frame implements WindowListener {

	private Label counter;
	private Button countUp;
	private Button countDown;
	private Button reset;
	private TextField tf;
	private int count = 0;

	public ThreeButtonCounter() {

		setLayout(new FlowLayout());

		counter = new Label("Counter: ");
		add(counter);

		tf = new TextField(10);
		add(tf);

		countUp = new Button("Count Up");
		add(countUp);

		countUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				++count;
				tf.setText(count + "");
			}
		});

		countDown = new Button("Count Down");
		add(countDown);

		countDown.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				--count;
				tf.setText(count + "");
			}
		});

		reset = new Button("Reset");
		add(reset);

		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {

				count = 0;
				tf.setText(count + "");
			}
		});

		addWindowListener(this);

		setTitle("Counter");
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ThreeButtonCounter();
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