package models;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.avaje.ebean.Model;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;
@Entity
public class Orden extends Model{
	   private static final long serialVersionUID = 1L;

		@Id
	    public Long id;
	    
	    @Constraints.Required
	    public String descripcion;
	    
	    public String total;
	    public String mesa;
	    
	  
	    
	   public static Find<Long,Orden> find = new Find<Long,Orden>(){};
		public static List<Orden> list() {
			// TODO Auto-generated method stub
			return find.all();
		}
	    
	}

