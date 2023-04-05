public class CVAtividade1 {
   public static void main(String[] args) {
      int idade = 66;

      if (idade < 16) {
         System.out.println("Não pode votar.");
      } else if (idade >= 16 && idade <= 17 || idade > 65) {
         System.out.println("Voto facultativo.");
      } else {
         System.out.println("Voto obrigatório.");
      }
   }
}