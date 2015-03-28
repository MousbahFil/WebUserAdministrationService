package com.mousbah.web.service.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.mousbah.web.service.endpoint.WebUserAdminService;

public class WebUserAdminClient{
 
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:12345/ws/userAdmin?wsdl");
        QName qname = new QName("http://web.mousbah.com/", "UserAdminService");
        Service service = Service.create(url, qname);
        WebUserAdminService hello = service.getPort(WebUserAdminService.class);
        System.out.println(hello.authenticateUser("mse27", "123456"));
    }
 
}