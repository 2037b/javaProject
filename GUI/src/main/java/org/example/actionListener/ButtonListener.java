package org.example.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonListener {

  public static void main(String[] args) {
    JFrame jf = new JFrame("Listener");
    jf.setLocation(400, 400);
    jf.setSize(1000, 1000);
    jf.setLayout(null);
    final JLabel jl = new JLabel();
    ImageIcon img = new ImageIcon("src/main/java/org/example/actionListener/pic.png");
    jl.setIcon(img);
    jl.setBounds(50, 50, img.getIconWidth(), img.getIconHeight());
    JButton jb = new JButton("隐藏图片");
    jb.setBounds(700, 700, 100, 30);
    jb.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        jl.setVisible(false);
      }
    });
    jf.add(jl);
    jf.add(jb);
    jf.setDefaultCloseOperation(3);
    jf.setVisible(true);
  }

}
