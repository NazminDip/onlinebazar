package tt.com;

import tt.com.DAo.LogDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;




@ManagedBean
@SessionScoped

public class Log  implements java.io.Serializable {

private List<Log>list= new ArrayList<>();
     private Integer id;
     private String name;
     private String email;
     private String password;

    public Log() {
    }

    public Log(String name, String email, String password) {
       this.name = name;
       this.email = email;
       this.password = password;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
   

    

  public String dUsa(){
      LogDao mm= new LogDao();
      mm.doUsav(this);
  return "index";
  
  
  }
public String doUup(){
LogDao uup=new LogDao();
uup.doUpu(this);
return "index";
}
public String doUde(){
LogDao lde=new LogDao();
lde.doUsd(this);
return "index";
}

   public List show(){
   LogDao ush = new LogDao();
   list=ush.doShow();
   return list;
   
   }
   public List<Log> getList() {
        LogDao df= new LogDao();
        list=df.doShow();
        return list;
    }

    public void setList(List<Log> list) {
        this.list = list;
    }  
    
    
    
    



}





