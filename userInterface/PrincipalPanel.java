package userInterface;

import javax.swing.*;
import java.awt.*;

public class PrincipalPanel extends JPanel {
    private int width;
    private int height;
    private Visual visual;
    private ControlPanel controlPanel;


    public PrincipalPanel(Visual visual, ControlPanel controlPanel){
        this.visual = visual;
        this.controlPanel = controlPanel;

        width = getWidth();
        height = getHeight();
        initAll();
    }

    private void initAll() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        visual.setMinimumSize(new Dimension((width*3)/4,height));
        controlPanel.setMaximumSize(new Dimension(width/4,800));
        this.add(visual);
        this.add(controlPanel);
    }

}
