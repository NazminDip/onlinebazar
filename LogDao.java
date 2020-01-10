package tt.com.DAo;



import tt.com.DAo.*;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import tt.com.Log;
import tt.com.Log;

import tt.com.NewHibernateUtil;
import tt.com.NewHibernateUtil;

/**
 *
 * @author Dipty
 */
public class LogDao {
    
    
      public Log LogUser(String email, int password) {
        Log p = null;
        List<Log> list;
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("from Log where email=:c and password=:d");
        q.setString("c", email);
        q.setInteger("d", password);
        list = q.list();
        try {
            if (list != null) {
               p= list.get(0);
            } else {
                p= null;
            }
        } catch (Exception e) {
            return p;
        }
        return p;
    }
      
     public void doUsav(Log usu){
        Session su=NewHibernateUtil.getSessionFactory().openSession();
        su.getTransaction().begin();
        su.save(usu);
        su.getTransaction().commit();
        su.close();
    }

   
     
     
     public void doUpu(Log upu){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
       s.update(upu);
        s.getTransaction().commit();
        s.close();
    }
      public void doUsd(Log udl){
        Session s=NewHibernateUtil.getSessionFactory().openSession();
        s.getTransaction().begin();
        s.delete(udl);
        s.getTransaction().commit();
        s.close();
    } 
      
    public List<Log>doShow(){
   List<Log>list= new ArrayList<>();
   Session yy=NewHibernateUtil.getSessionFactory().openSession();
   Query q=yy.createQuery("from Log");
   list=q.list();
   yy.close();
   return list;
   
   }  
      
      
    
}
