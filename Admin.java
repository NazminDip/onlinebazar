package tt.com;
// Generated Jan 10, 2020 9:06:32 AM by Hibernate Tools 4.3.1

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import tt.com.DAo.AdminDao;

@ManagedBean
@SessionScoped


public class Admin  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String email;
     private Integer password;

    public Admin() {
    }

    public Admin(String name, String email, Integer password) {
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
    public Integer getPassword() {
        return this.password;
    }
    
    public void setPassword(Integer password) {
        this.password = password;
    }

public String doAjam(){
AdminDao ad= new AdminDao();
ad.doAjoma(this);
return "success2";

}
public String doAde(){
AdminDao aup=new AdminDao();
aup.doAdeve(this);
return "success2";
}
public String doAb(){
AdminDao ade=new AdminDao();
ade.doAbad(this);
return "success2";
}




}


