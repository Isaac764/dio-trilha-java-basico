public class Operadores {

    public static void main(String[] args){
      String nomeUm = "Isaac";
      String nomeDois = new String("Isaac");

      System.out.println(nomeUm.equals(nomeDois));

      int numero1 = 1;
      int numero2 = 2;

      boolean SimNao = numero1 == numero2;

      if (numero1 < numero2) {
        System.out.println("a nossa condicao é verdadeira");
      }
       
System.out.println("numero1 é igual a numero2? " + SimNao);

SimNao = numero1 != numero2;

System.out.println("numero1 é diferente de numero2? " + SimNao);

SimNao = numero1 > numero2;

System.out.println("numero1 é maior que numero2? " + SimNao);
    }
  }