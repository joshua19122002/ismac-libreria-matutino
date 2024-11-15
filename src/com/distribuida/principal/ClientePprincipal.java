package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePprincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente =new Cliente (1," 2200385389","joshua","tumbaco","0995333314","jfsy43@gmail.com" );
		Cliente cliente2 =new Cliente (2," 2200485149","carlos","tumbaco","09912433314","gsdu3@gmail.com" );
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
		

	}

}
