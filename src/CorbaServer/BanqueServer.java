package CorbaServer;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.text.AbstractDocument.Content;

import org.omg.CORBA.ORB;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import Service.BanqueServiceImpl;

public class BanqueServer {
	public static void main(String[] args) {
		try {
			ORB orb = ORB.init(args, null);
			Context ctx = new InitialContext();
			POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootPOA.the_POAManager().activate();
			BanqueServiceImpl od = new BanqueServiceImpl();
			ctx.rebind("BK", rootPOA.servant_to_reference(od));
			orb.run();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
