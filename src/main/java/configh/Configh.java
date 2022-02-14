package configh;

import AAA.model.Auser;
import AAA.model.Role;
import AAA.service.AuserServiseImpl;
import AAA.service.RoleServiseImpl;

public class Configh {
   
	RoleServiseImpl rols ;
	AuserServiseImpl us;
   public Configh() {
	   rols = new RoleServiseImpl();
       us = new AuserServiseImpl();
	   
	   if(rols.getByid(1) == null)
     {
    	 Role role = new Role();
    	 role.setId(1);
    	 role.setName("مدیر");
    	 role.setEnsme("modir");
    	 role.setMaxuser(2);
   
         try {
			rols.Add(role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     
     
     
     
     }
   
     if(us.getByid(1)== null)
     {
    	 Auser user = new Auser();
         user.setId(1);
         user.setHpasworld("1364");
         user.setMobile("09192410400");
         user.setEmail("jr64.naderloo@jmail.com");
         user.setNikename("flip");
         user.setRoleBean(rols.getByid(1));
         user.setUsername("root");
         
         
         
         try {
			us.Add(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
     }
   
   
   
   }	
	
	  
}
