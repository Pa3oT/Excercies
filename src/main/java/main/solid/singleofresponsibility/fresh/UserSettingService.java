package main.solid.singleofresponsibility.fresh;

import main.jdbc.dao.bean.User;

public class UserSettingService {
	public void changeEmail(User user) {
		if(SecurityService.checkAccess(user)) {
			//Grant option to change
		}
	}
}
