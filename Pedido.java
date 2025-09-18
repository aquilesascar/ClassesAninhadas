
package classeinternas;
public class Pedido {
    private int id;
    public Pedido(int id){
         this.id = id;
    }
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + '}';
    }
    public class Item{
        private String descricao;

        public Item(String descricao) {
            this.descricao = descricao;
        }
          @Override
        public String toString() {
            return Pedido.this.toString()+
                    " descricao=" + descricao + "\n";
        }
    }
    public static void main(String[] args) {
         Pedido p1 = new Pedido(1);
         Pedido.Item item1 = p1.new Item("produto1");
         Pedido.Item item2 = p1.new Item("produto2");
         Pedido.Item item3 = p1.new Item("produto3");
         System.out.println(""+item2 + item1 + item3);
    }

    public int getId() {
        return id;
    }

}
