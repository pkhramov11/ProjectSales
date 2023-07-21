import Entity.Sales;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main extends JFrame {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static List<Sales> allOrders = null;
    public static void main(String[] args) {
        logger.info("Это сообщение информационного уровня.");
        logger.warn("Это предупреждение.");
        logger.error("Это сообщение об ошибке.");

        Sales sales = new Sales();
        JFrame jFrame = new JFrame();
        jFrame.add((new Form()).getPanel1());
        jFrame.setSize(750, 400);
        jFrame.setDefaultCloseOperation(3);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }

    public static String showAllOrders (){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Sales.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        allOrders = session.createQuery("from Sales", Sales.class).getResultList();

        session.getTransaction().commit();

        session.close();
        String result = allOrders.toString();
        if(result.isEmpty()){
            result="База данных пустая";
        }
        System.out.println(result);
        return result.replaceAll("^\\[|\\]$", "").replaceAll(",", "");
    }
    public static void addNewOrder (Sales a){

                SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Sales.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        session.save(a);

        session.getTransaction().commit();

        session.close();

        showAllOrders();
    }
    public static void deleteOrder (int a){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Sales.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Sales ex = new Sales();
        ex =  session.load(Sales.class, a);
        session.delete(ex);

        session.getTransaction().commit();

        session.close();
        Main.showAllOrders();

    }
    public static void updateOrder (String a, int b){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Sales.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        Sales ex = new Sales();
        ex =  session.load(Sales.class, b);
        ex.setStatus(a);
        session.update(ex);

        session.getTransaction().commit();

        session.close();
        Main.showAllOrders();
    }

}
