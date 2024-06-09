import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMInterface extends JFrame implements ActionListener {
    private JLabel label2;
    private JTextField textField2;
    private JLabel label1;
    private JTextField textField1;
    private JButton checkBalanceButton, withdrawButton, depositButton, submitButton;
    private JPanel panel;

    private double balance = 1000.00; // Initial balance

    public ATMInterface() {
        //creating User interface
        label1 = new JLabel("Account:");
        textField1 = new JTextField(10);
        label2 = new JLabel("PIN:");
        textField2 = new JTextField(10);

        submitButton = new JButton("Submit");
        submitButton.setBounds(350, 150, 60, 30);
        submitButton.addActionListener(this);

        //creating panel to display elements
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(submitButton);

        add(panel);

        //editing frame size and elements
        setTitle("ATM Interface");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String id = textField1.getText();
            String pin = textField2.getText();
            if (id.equals("1234")&&pin.equals("1234")) { // simple user and pin check
                showOperations();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid PIN. Try again.");
            }
        } else if (e.getSource() == checkBalanceButton) {
            JOptionPane.showMessageDialog(this, "Your balance is: $" + balance);
        } else if (e.getSource() == withdrawButton) {
            withdraw();
        } else if (e.getSource() == depositButton) {
            deposit();
        }
    }

    private void showOperations() {
        panel.removeAll();

        checkBalanceButton = new JButton("Check Balance");
        withdrawButton = new JButton("Withdraw");
        depositButton = new JButton("Deposit");

        checkBalanceButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        depositButton.addActionListener(this);

        panel.setLayout(new GridLayout(3, 1));
        panel.add(checkBalanceButton);
        panel.add(withdrawButton);
        panel.add(depositButton);

        panel.revalidate();
        panel.repaint();
    }

    private void withdraw(){
        String Stramount = JOptionPane.showInputDialog(this,"Enter the Withdra amount: ");
        double amount = Double.parseDouble(Stramount);
        if(amount>=0 && amount<=balance){
            balance -= amount;
            JOptionPane.showMessageDialog(this, "Withdrawal is successful! New balance"+balance);
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid amount!!");
        }

    }

    private void deposit(){
        String Stramount = JOptionPane.showInputDialog(this,"Enter the Withdra amount: ");
        double amount = Double.parseDouble(Stramount);
        if(amount>=0){
            balance += amount;
            JOptionPane.showMessageDialog(this, "deposit is successful! New balance"+balance);
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid amount!!");
        }
    }


    public static void main(String[] args) {
        new ATMInterface();
    }
}

