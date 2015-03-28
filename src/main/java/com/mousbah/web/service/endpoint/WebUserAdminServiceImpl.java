package com.mousbah.web.service.endpoint;

import javax.jws.WebService;

import com.mousbah.database.service.DatabaseServiceFactory;

@WebService(endpointInterface = "com.mousbah.web.service.endpoint.WebUserAdminService",
targetNamespace="http://web.mousbah.com/", portName="WebUserAdminService", serviceName="UserAdminService"
) 

public class WebUserAdminServiceImpl implements WebUserAdminService{

	public boolean authenticateUser(String userName, String password)throws Exception {
	return DatabaseServiceFactory.newInstance().createUserAdminService().authenticateUser(userName, password);
	}

}
