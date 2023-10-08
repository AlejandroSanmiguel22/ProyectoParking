package com.sanmigueltech.menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class SubMenuItem extends JButton {

    private final RippleEffect rippleEffect = new RippleEffect(this);

    public SubMenuItem(String text) {
        super(text);
        setContentAreaFilled(false);
        setHorizontalAlignment(SwingConstants.LEFT);
        initStyle();
    }

private void initStyle() {
    setBackground(new Color(7, 40, 33));
    setForeground(Color.WHITE);
    Font currentFont = getFont();
    float newSize = currentFont.getSize() + 4f;  // Aumenta el tamaño en 10 puntos
    setFont(currentFont.deriveFont(newSize));

}

    @Override
    public void updateUI() {
        super.updateUI();
        if (rippleEffect != null) {
            initStyle();
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        rippleEffect.reder(grphcs, new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        super.paintComponent(grphcs);
    }
}
