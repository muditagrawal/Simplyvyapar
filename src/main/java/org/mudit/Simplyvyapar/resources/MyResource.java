package org.mudit.Simplyvyapar.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.mudit.Simplyvyapar.configuration.MySessionFactory;
import org.mudit.Simplyvyapar.model.Address;
import org.mudit.Simplyvyapar.model.PIN;
import org.mudit.Simplyvyapar.model.User;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	Session mySession = MySessionFactory.getMy_factory().openSession();
    	mySession.beginTransaction();
    	PIN myPin = new PIN();
    	
    	Address myAddress = new Address();
    	User myUser = new User("username","firstname","lastname","password","email");
    	mySession.save(myUser);
    	mySession.getTransaction().commit();
    	mySession.close();
        return "Got it!";
    }
}
