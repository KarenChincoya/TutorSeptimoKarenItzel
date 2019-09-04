package controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Ejercicio1 {

	
	public static void main(String[] args){
        Ejercicio1 clase = new Ejercicio1();
        Date date = new Date();
        System.out.println("Ejercicio 1: "+clase.fechaEnCadena(date));
        System.out.println("Ejercicio 2: "+clase.aleatorioTresDigitos());
        System.out.println("Ejercicio 3: "+clase.operacionDosNumeros(4, 6, 3));

        List<String> lista = new ArrayList<String>();
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		lista.add("cuatro");
		lista.add("cinco");
		lista.add("tres");
		lista.add("uno");
		lista.add("dos");
		lista.add("tres");
		lista.add("tres");
		
		System.out.println(clase.ordenarLista(lista));
        
    }

    public String fechaEnCadena(Date date){
        //Regresa su equivalente en formato dd-MM-yyyy
        String dd = String.valueOf(date.getDate());
		String MM = String.valueOf(date.getMonth());
		String yyyy = String.valueOf(date.getYear()+1900);
        String d = dd+"-"+MM+"-"+yyyy;
        return d;
    }

    public long aleatorioTresDigitos(){
        long r = Math.round(Math.random()*(999 - 100) + 100);
        return r;
    }

    public Double operacionDosNumeros(Integer n1, Integer n2, int opcion){
        //1:suma, 2: resta, 3:dividir, 4:multiplicar
        Double resultado = 0.0;
        switch(opcion){
            case 1: resultado = (double) (n1+n2);
                break;
            case 2: resultado = (double) (n1-n2);
                break;
            case 3: resultado = (double) (n1*n2);
                break;
            case 4: resultado = (double) (n1/n2);
                break;
        }
        return resultado;
    }

    public String ordenarLista(List<String> lista){
        //Data una lista de 10 cadenas, eliminar duplicados, regresar un string separado por comas
        String resultado = "";
        
        HashMap<String, Integer> words = new HashMap<String, Integer>();
        
        for(int i=0; i<lista.size(); i++) {
        	Integer r = words.get(lista.get(i));
        	if(r==null) {
        		words.put(lista.get(i), i+1);
            }
        }
        for (String i : words.keySet()) {
        	resultado = resultado.concat(i+", ");        	
        }
        return resultado;        
    }

}
