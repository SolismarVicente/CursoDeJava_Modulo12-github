package br.com.cursodejava.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		//Ctrl + shift + o: apaga as dependências que não estão usando
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(data1));
		
		//Acrescentar 4 horas na data anterior
		Calendar calendario = Calendar.getInstance();	
		calendario.setTime(data1);
		
		//pegar minutos da data1 - 2018-06-25T15:42:07Z
		int minutos = calendario.get(Calendar.MINUTE);
		//pegar o mês da data1 - 2018-06-25T15:42:07Z
		//Como o Calendar começa contar o mês a partir de 0 (zero)
		//(exemplo: janeiro = 0) tenho que soma 1
		int mes = 1 + calendario.get(Calendar.MONTH);
		
		System.out.println("Qtde de minutos da data 1: " + minutos);
		System.out.println("Mês da data 1: " + mes);
		//HOUR_OF_DAY: hora do dia
		calendario.add(Calendar.HOUR_OF_DAY, 4);
		Date data2 = calendario.getTime();
		System.out.println("4 horas a mais: " + sdf.format(data2));
		
		
	}
	

}
