package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import util.Coordinate;

public class CellGUI extends JPanel{
	
	public static final int CELL_SIZE = 1;
    private Coordinate coord;

    public CellGUI (int x, int y) {
        coord = new Coordinate(x, y);
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(CELL_SIZE, CELL_SIZE));
    }

	public Coordinate getCoord() {
		return coord;
	}

	public void setCoord(Coordinate coord) {
		this.coord = coord;
	}
}
