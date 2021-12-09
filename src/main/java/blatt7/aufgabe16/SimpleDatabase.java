package blatt7.aufgabe16;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SimpleDatabase extends Frame
		implements ActionListener {
	/** Set aller Komponenten der Anwendung */
	protected TextField zstand = new TextField("0");
	protected TextField text = new TextField("");
	protected Label zurueck = new Label("Speicherplatz:");
	protected Button save = new Button("Speichern");
	protected Button load = new Button("Laden");
	protected Button ende = new Button("Beenden");

	protected HashMap<Integer, String> database = new HashMap<Integer, String>();

	/**
	 * Konstruktor, welcher alle Komponenten initialisiert.
	 * Zusaetzlich werden die ActionListener registriert.
	 */
	public SimpleDatabase() {
		setBounds(400, 400, 250, 300);
		setLayout(new GridBagLayout());
		setBackground(Color.white);
		setFont(Font.getFont(Font.SANS_SERIF));
		setTitle("Simple Database");
		put(zstand,1,1,1);
		put(zurueck,0,1,1);
		put(text,0,2,3);
		put(save,0,3,1);
		put(load,1,3,1);
		put(ende,2,3,1);
		ende.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
		zstand.addActionListener(this);
		text.addActionListener(this);
		pack();
		setVisible(true);
	}

	/**
	 * Ermoeglicht das Setzen einer Komponente auf dem Frame
	 * @param comp Komponente die gesetzt werden soll.
	 * @param x x-Koordinaten auf dem GridBagLayout.
	 * @param y y-Koordinaten auf dem GridBagLayout.
	 * @param w Breite der komponente auf dem GridBagLayout.
	 */
	private void put(Component comp,
			int x, int y, int w) {
		GridBagLayout g = (GridBagLayout) this.getLayout();
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = w;
		c.gridheight = 1;
		c.weightx = 0.0;
		c.weighty = 0.0;
		this.add(comp);
		g.setConstraints(comp, c);
	}

	/**
	 * Behandelt die Aktionen beim Klick der 5 Buttons
	 * @param event
	 */
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == save) {
			String currentText = text.getText();
			int wert = Integer.parseInt(
					zstand.getText());
			database.put(wert, currentText);
		} else if (event.getSource() == load) {
			int wert = Integer.parseInt(
					zstand.getText());
			text.setText(database.get(wert));
		} else if (event.getSource() == ende){
			dispose();
		}else if (event.getSource() == text){
			String currentText = text.getText();
			int wert = Integer.parseInt(
					zstand.getText());
			database.put(wert, currentText);
		}else if (event.getSource() == zstand){
			int wert = Integer.parseInt(
					zstand.getText());
			text.setText(database.get(wert));
		}
	}

	/**
	 * Started die Anwendung
	 * @param args
	 */
	public static void main(String[] args) {
		new SimpleDatabase();
	}
}
