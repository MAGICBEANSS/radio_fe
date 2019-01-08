package custom;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.meeting.pro.Entity.Rooms;

public class RoomIDGenerator implements IdentifierGenerator {

	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		// TODO Auto-generated method stub
		String prefix = "ROOM_";
		//Query q =  session.createNamedQuery("current_count");
	//	Integer count = (Integer) q.uniqueResult();
		System.out.println(object);
		Rooms temproom = (Rooms) object;
		if(temproom.getR_id() != null) 
			return temproom.getR_id();
		prefix= prefix+new Date().toString();
		System.out.println("returning "+prefix);
		return prefix;
	}

}
