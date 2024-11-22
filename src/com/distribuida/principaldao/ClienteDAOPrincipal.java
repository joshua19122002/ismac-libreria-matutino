package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		                                         //nombre del BEAN la primera es con minuscula
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		List<Cliente> clientes = clienteDAO.findAll();
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());
		}
		
		context.close();
	}
 
}
 