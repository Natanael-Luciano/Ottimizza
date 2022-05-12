public class questao3{
	static int maiorInt(int[] numbers){
	int maior = numbers[0];
	for (int i = 1; i< numbers.length; i++){
		if (numbers[i]> maior){
			maior = numbers[i];
		}
		//System.out.println(maior);
	}
	System.out.println(maior);
	return maior;

    }

public static void main(String[] args){
	int string_array_length = args.length;
    int []  integer_array = new int [string_array_length];
      for(int i=0; i<string_array_length; i++) {
         integer_array[i] = Integer.parseInt(args[i]);
      }
	maiorInt(integer_array);
	return;



	

}
}