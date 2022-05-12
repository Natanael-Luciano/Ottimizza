public class questao2 {
	static String returnString(String[] names){
		String resposta = names[0];
		for (int i = 1; i < names.length ; i++){
			resposta +=  " " + names[i];
		} 
		System.out.println(resposta);
		return resposta;
	}


public static void main(String[] args){
	returnString(args);
	return;





}
}