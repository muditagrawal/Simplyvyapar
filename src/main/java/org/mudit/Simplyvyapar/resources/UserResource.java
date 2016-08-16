package org.mudit.Simplyvyapar.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.mudit.Simplyvyapar.dao.UserDAO;
import org.mudit.Simplyvyapar.model.User;

@Path("user")
public class UserResource {
	//Admin level resource to get all the users that exist in the system.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsers() {
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.getAllUser();
	}
	
	//Unsecured Resource to register a new user in the system.
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	private User createUser() {
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.createUser();
	}
	
	//Secured resource to get details of the user who makes request.
	@Path("/me")
	public User getCurrentUser() {
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.getUserById();
	}
	
	//Secured resource to update details of the user who makes request.
	@Path("/me")
	@POST
	private User updateCurrentUser() {
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.updateUserById();
	}
	
	//Secured resource to delete user from the system.
	@Path("/me")
	@DELETE
	private User deleteCurrentUser() {
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.deleteUserById();
	}
	
	//Admin Level Secured Resource to get a particular user in the system by Id.
	@Path("/id")
	@GET
	public User getUserById(@PathParam("id") int id) {
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.getUserById();
	}
	
	//Admin Level Secured resource to get a particular user in the system by username.
	@Path("/byname/username")
	@GET
	public User getUserByUserName(@PathParam("username") int id) {
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.getUserByUserName();
	}
	
	@Path("/check/username")
	@GET
	public boolean checkUserName(@PathParam("username") String username){
		UserDAO myUserDAO = new UserDAO();
		return myUserDAO.checkUserNameExist();
	}
}
