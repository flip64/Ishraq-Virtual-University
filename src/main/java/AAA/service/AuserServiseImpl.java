package AAA.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import AAA.dao.AuserDao;
import AAA.model.Auser;
import common.sfInjector;

public class AuserServiseImpl implements AuserServise{
	
	AuserDao dao;
	sfInjector sf ;
	Session session;
	 
	public AuserServiseImpl() {

		   dao = new AuserDao();
		   sf = new sfInjector();
		    this.session = sf.getSession();
		    dao.setSession(session);
		
	
	}
	
	
	
	

	@Override
	public Auser Add(Auser t) throws Exception {
		  try { 
			   session.getTransaction().begin();	
			   dao.setSession(session);
			   dao.Insert(t);
			   session.getTransaction().commit();
			
			  
			  }catch(Exception e){
					session.getTransaction().rollback();
					throw new Exception("Error,Do not Inserted!!");
				}
			
				  
			  
			  
		      
			   return t;
			

		
		
		
		
		
	}

	@Override
	public void Remove(Auser t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Auser Edit(Auser t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Auser> GetAll() {

		List<Auser> list = new  ArrayList<Auser>();
		session.getTransaction().begin();
		  list = dao.selectAll();
		session.getTransaction().commit();
		
		return list;
		
		
	}





	@Override
	public Auser getByid(int id) {

        Auser user = new Auser();
        session.getTransaction().begin();	
		  
          user = session.get(Auser.class, id);
		   
	    session.getTransaction().commit();	
			  
		
		return user;
	}
	
	
	public Auser getUserByUsername(String username) {		
		List<Auser> list =  this.GetAll();
		if(list != null && !list.isEmpty()) 
				for (Auser auser : list) 
			      if(auser.getUsername().equals(username))
			    	  return auser;
			      
			      
		return null;	      
			
		}





	
	
	
	public boolean isUserName(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	

}
