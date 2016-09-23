package view.interfaces;

import layout.TableLayout;
/**
 * Dieses Interface beinhaltet die Defaultabstände für das TableLayout.
 * 
 * 16.09.2016 gafner	File erstellt.
 * 
 * 
 * @author Severin Gafner
 *
 */
public interface TabelDefinition {
	/**
	 * Abstand vom linken Rand des Fensters zur Componente.
	 */
	public static final int LEFT = 4;
	/**
	 * Abstand vom rechten Rand des Fensters zur Componente.
	 */
	public static final int RIGHT = 4;
	/**
	 * Abstand vom oberen Rand des Fensters zur Componente.
	 */
	public static final int TOP = 6;
	/**
	 * Abstand vom unteren Rand des Fensters zur Componente.
	 */
	public static final int BOTTOM = 8;

	public static final double FILL= TableLayout.FILL;

	/**
	 * Standartbreite aller Felder, z. B.: JTextField, JComboBox
	 */
	public static final int DEFAULT_FELD_WIDTH = 100;
	/**
	 * Standarthöhe aller Felder, z. B.: JTextField, JComboBox
	 */
	public static final int DEFAULT_FELD_HEIGHT = 22;
}
