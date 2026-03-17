public class Cliente {
   String nome;
   String id;
   String endereco;

   public Cliente() {
   }

   public void exibir() {
      System.out.println("Nome: " + this.nome);
      System.out.println("ID: " + this.id);
      System.out.println("Endereço: " + this.endereco);
   }
}
