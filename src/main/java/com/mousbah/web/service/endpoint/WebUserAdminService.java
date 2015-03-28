package com.mousbah.web.service.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(targetNamespace="http://web.mousbah.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WebUserAdminService {

	@WebMethod
	public boolean authenticateUser(String userName, String password) throws Exception;
	
}
