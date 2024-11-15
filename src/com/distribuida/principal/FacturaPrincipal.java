package com.distribuida.principal;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente =new Cliente (1," 2200385389","joshua","tumbaco","0995333314","jfsy43@gmail.com" );
		Factura factura = new Factura();
		
		factura.setIdFactura(1);
		factura.setfecha(new Date());
		factura.setNumFactura("FAC-0001");
		factura.setTotalNeto(100.25);
		factura.setIva(15025);
		factura.setTotal(116.25);
		
		//inyeccion de dependencias
		factura.setCliente(cliente);
		
		System.out.println(factura.toString());
		

	}

}
