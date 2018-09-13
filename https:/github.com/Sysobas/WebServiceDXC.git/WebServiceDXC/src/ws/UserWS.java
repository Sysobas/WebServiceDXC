package ws;

import java.util.*;
import entities.*;
import model.UserModel;

public class UserWS {
	
	public List<UserEntity> findAll(){
		UserModel um = new UserModel();
		List<UserEntity> result = new ArrayList<UserEntity>(); 
		for(User u : um.findAll()) 
		result.add(new UserEntity(u.getId(), u.getName(), u.getBirthdate()));	
		return result;
	}

}
