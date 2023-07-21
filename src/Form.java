import Entity.Sales;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeListener;


public class Form {
    private JPanel panel1;
    private JTextField названиеТовараTextField;
    private JTextField датаЗаказаTextField;
    private JTextField статусЗаказаTextField;
    private JButton создатьНовыйЗаказButton;
    private JTextField IDTextField;
    private JTextField новыйСтатусTextField;
    private JButton обновитьСтатусЗаказаПоButton;
    private JTextField IDTextField1;
    private JButton удалитьЗаказПоIDButton;
    private JTable table1;
    private Sales addNewSale = new Sales();
    private Sales updateSale = new Sales();
    private Sales deleteSale = new Sales();

    public JPanel getPanel1() {
        return panel1;
    }

    public void updateTable() {
        Object[] id = new Object[Main.allOrders.size()];
        Object[] name = new Object[Main.allOrders.size()];
        Object[] date = new Object[Main.allOrders.size()];
        Object[] status = new Object[Main.allOrders.size()];

        for (int i = 0; i < Main.allOrders.size(); i++) {
            id[i] = Main.allOrders.get(i).getId();
            name[i] = Main.allOrders.get(i).getProjectName();
            date[i] = Main.allOrders.get(i).getRequestDate();
            status[i] = Main.allOrders.get(i).getStatus();
        }

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table1.setModel(model);
        model.addColumn("ID", id);
        model.addColumn("Название товара", name);
        model.addColumn("Дата создания заявки", date);
        model.addColumn("Статус заявки", status);
    }

    public Form() {


        Main.showAllOrders();

        названиеТовараTextField.setText("Название товара");

        названиеТовараTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // При получении фокуса удаляем placeholder и возвращаем цвет текста
                if (названиеТовараTextField.getText().equals("Название товара")) {
                    названиеТовараTextField.setText("");
                    названиеТовараTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // При потере фокуса возвращаем placeholder, если поле пустое
                if (названиеТовараTextField.getText().isEmpty()) {
                    названиеТовараTextField.setForeground(Color.BLACK);
                    названиеТовараTextField.setText("Название товара");
                }
            }
        });

        датаЗаказаTextField.setText("Дата заказа");

        датаЗаказаTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // При получении фокуса удаляем placeholder и возвращаем цвет текста
                if (датаЗаказаTextField.getText().equals("Дата заказа")) {
                    датаЗаказаTextField.setText("");
                    датаЗаказаTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // При потере фокуса возвращаем placeholder, если поле пустое
                if (датаЗаказаTextField.getText().isEmpty()) {
                    датаЗаказаTextField.setForeground(Color.BLACK);
                    датаЗаказаTextField.setText("Дата заказа");
                }
            }
        });

        статусЗаказаTextField.setText("Статус заказа");

        статусЗаказаTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // При получении фокуса удаляем placeholder и возвращаем цвет текста
                if (статусЗаказаTextField.getText().equals("Статус заказа")) {
                    статусЗаказаTextField.setText("");
                    статусЗаказаTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // При потере фокуса возвращаем placeholder, если поле пустое
                if (статусЗаказаTextField.getText().isEmpty()) {
                    статусЗаказаTextField.setForeground(Color.BLACK);
                    статусЗаказаTextField.setText("Статус заказа");
                }
            }
        });

        IDTextField.setText("ID");

        IDTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // При получении фокуса удаляем placeholder и возвращаем цвет текста
                if (IDTextField.getText().equals("ID")) {
                    IDTextField.setText("");
                    IDTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // При потере фокуса возвращаем placeholder, если поле пустое
                if (IDTextField.getText().isEmpty()) {
                    IDTextField.setForeground(Color.BLACK);
                    IDTextField.setText("ID");
                }
            }
        });

        новыйСтатусTextField.setText("Новый статус");

        новыйСтатусTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // При получении фокуса удаляем placeholder и возвращаем цвет текста
                if (новыйСтатусTextField.getText().equals("Новый статус")) {
                    новыйСтатусTextField.setText("");
                    новыйСтатусTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // При потере фокуса возвращаем placeholder, если поле пустое
                if (новыйСтатусTextField.getText().isEmpty()) {
                    новыйСтатусTextField.setForeground(Color.BLACK);
                    новыйСтатусTextField.setText("Новый статус");
                }
            }
        });

        новыйСтатусTextField.setText("Новый статус");

        новыйСтатусTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // При получении фокуса удаляем placeholder и возвращаем цвет текста
                if (новыйСтатусTextField.getText().equals("Новый статус")) {
                    новыйСтатусTextField.setText("");
                    новыйСтатусTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // При потере фокуса возвращаем placeholder, если поле пустое
                if (новыйСтатусTextField.getText().isEmpty()) {
                    новыйСтатусTextField.setForeground(Color.BLACK);
                    новыйСтатусTextField.setText("Новый статус");
                }
            }
        });

        IDTextField1.setText("ID");

        IDTextField1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // При получении фокуса удаляем placeholder и возвращаем цвет текста
                if (IDTextField1.getText().equals("ID")) {
                    IDTextField1.setText("");
                    IDTextField1.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // При потере фокуса возвращаем placeholder, если поле пустое
                if (IDTextField1.getText().isEmpty()) {
                    IDTextField1.setForeground(Color.BLACK);
                    IDTextField1.setText("ID");
                }
            }
        });


        updateTable();


        создатьНовыйЗаказButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override

            public void actionPerformed(ActionEvent e) {
                addNewSale.setProjectName(названиеТовараTextField.getText());

                addNewSale.setRequestDate(датаЗаказаTextField.getText());

                addNewSale.setStatus(статусЗаказаTextField.getText());


                try{
                    Main.addNewOrder(addNewSale);
                }
                catch (Throwable ex){
                    JOptionPane.showMessageDialog(new Form().getPanel1(), "Вы ввели некорректную дату. Вводите дату в шаблоне год-месяц-число.",
                            "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                }
                addNewSale.setProjectName("");
                addNewSale.setRequestDate("");
                addNewSale.setStatus("");
                updateTable();
                названиеТовараTextField.setText("Название товара");
                датаЗаказаTextField.setText("Дата заказа");
                статусЗаказаTextField.setText("Статус заказа");
            }
        });


        обновитьСтатусЗаказаПоButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                updateSale.setStatus(новыйСтатусTextField.getText());
                updateSale.setId(Integer.parseInt(IDTextField.getText()));
                try{
                Main.updateOrder(updateSale.getStatus(), updateSale.getId());
                }catch (Throwable ex){
                    JOptionPane.showMessageDialog(new Form().getPanel1(), "Вы ввели некорректный ID. Введите существующий ID из таблицы",
                            "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                }
                updateTable();
                новыйСтатусTextField.setText("Новый статус");
                IDTextField.setText("ID");
            }
        });

        удалитьЗаказПоIDButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(IDTextField1.getText());

                try{
                    Main.deleteOrder(a);
                }catch (Throwable ex){
                    JOptionPane.showMessageDialog(new Form().getPanel1(), "Вы ввели некорректный ID. Введите существующий ID из таблицы.",
                            "Ошибка", JOptionPane.INFORMATION_MESSAGE);
                }
                updateTable();
                IDTextField1.setText("ID");
            }
        });


    }
}
