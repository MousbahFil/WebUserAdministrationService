package com.mousbah.web.service;

import javax.xml.ws.Endpoint;

import com.mousbah.web.service.endpoint.WebUserAdminServiceImpl;

public class WSPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:12345/ws/userAdmin", new WebUserAdminServiceImpl());
    }
 
}