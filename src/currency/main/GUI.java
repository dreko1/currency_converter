package currency.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class GUI {
  private final JComboBox<String> choices;
  private final JComboBox<String> choices1;
  private String input_choice;

  public GUI(Map<String, Double> map) {
    //Creating the Frame
    JFrame frame = new JFrame("Currency Converter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(450, 100);

    //Creating the input boxes
    JPanel panel = new JPanel();
    this.choices = new JComboBox<>(map.keySet().toArray(new String[0]));
    this.choices.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        //System.out.println(choices.getItemAt(choices.getSelectedIndex()));
        choices.setSelectedItem(choices.getItemAt(choices.getSelectedIndex()));
      }
    });
    JTextField input = new JTextField(10);
    JButton submit = new JButton("Convert to");
    this.choices1 = new JComboBox<>(map.keySet().toArray(new String[0]));
    this.choices1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        //System.out.println(choices.getItemAt(choices.getSelectedIndex()));
        choices1.setSelectedItem(choices1.getItemAt(choices1.getSelectedIndex()));
      }
    });
    JLabel output = new JLabel("need to do");

    panel.add(this.choices);
    panel.add(input);
    panel.add(submit);
    panel.add(this.choices1);
    panel.add(output);

    //Adding Components to the frame.
    frame.getContentPane().add(BorderLayout.CENTER, panel);
    frame.setVisible(true);
  }

  public String getInput() {
    return (String) this.choices.getSelectedItem();
  }

  public String getOutput() {
    return (String) this.choices1.getSelectedItem();
  }
}
