package custom;

import java.io.Serializable;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class RoomIDGenerator implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		String prefix = "ROOM_";
		//Query q =  session.createNamedQuery("current_count");
	//	Integer count = (Integer) q.uniqueResult();
		prefix= prefix+0;
		System.out.println("returning "+prefix);
		return prefix;
	}

}
