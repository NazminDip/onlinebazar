/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tt.com.DAo;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import tt.com.Admin;
import tt.com.Log;
import tt.com.NewHibernateUtil;

/**
 *
 * @author Dipty
 */
public class AdminDao {
     public Log aSt(String email, int password) {
        Log u= null;
        List<Log> list;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Admin where email=:a and password=:b");
        q.setString("a", email);
        q.setInteger("b", password);
        list = q.list();
        try {
            if (list != null) {
               u = list.get(0);
            } else {
                u = null;
            }
        } catch (Exception e) {
            return u;
        }
        return u;
    }
     public void doAjoma(Admin asa){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.save(asa);
        s.getTransaction().commit();
        s.close();
    }
     public void doAdeve(Admin upda){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
      s.update(upda);
        s.getTransaction().commit();
        s.close();
    }
      public void doAbad(Admin da){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.delete(da);
        s.getTransaction().commit();
        s.close();
    }
}
