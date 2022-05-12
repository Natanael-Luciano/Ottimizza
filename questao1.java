
public class questao1 {
	static void returnDate(String dates[]){
		int i = dates.length;
		String[] resposta = new String[i];
		int counter = 0;
		String[] aux;
  		for (String data : dates){
  			if (data.contains("/")){
  				aux = data.split("/");
  				System.out.println(aux[1] +" "+ aux[2]);
  				resposta[counter] = aux[1] +" "+ aux[2];
  				counter++;
  			}

  			if (data.contains(" ")){

  				aux = data.split(" ");
  				if(aux[0].length() == 2){
  					System.out.println(aux[1] +" "+ aux[2]);
  					resposta[counter] = aux[1] +" "+ aux[2];
  					counter++;
  				}
  				else{
  				System.out.println(aux[1] +" "+ aux[0]);
  				resposta[counter] = aux[1] +" "+ aux[0];
  				counter++;
  			    }

  			}
  			if(!data.contains("/") & !data.contains(" ")){

  			System.out.println(data.substring(2,4) + " " +data.substring(4) );
  			resposta[counter] = data.substring(2,4) + " " +data.substring(4);
  			counter++;
  		    }

  		
        }
  	 
        System.out.println(resposta);
        
	}

  public static void main(String[] args) {
  	System.out.println("Hello World");

  	returnDate(args);
  	return;
  

  }
  }