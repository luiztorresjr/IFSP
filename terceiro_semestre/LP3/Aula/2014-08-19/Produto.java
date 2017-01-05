package Aula_06_08;


public class Produto implements Comparable{
    String nome,descricao;
    float preco;
    long codigo;
    public Produto(){

    }
    public String getnome(){
        return nome;
    }
    public String getdescricao(){
        return descricao;
    }
    public float  getpreco(){
        return preco;
    }
    public long getcodigo(){
        return codigo;
    }
    public void setnome(String nome1){
        nome = nome1;

    }
     public void setdescricao(String descri){
        descricao = descri;

    }
     public void setpreco(float pt1){
        preco = pt1;

    }
        public void setcodigo(long cod){
        codigo = cod;

    }
//		@Override

//		public int compareTo(Object p) {
//			Produto p1 = (Produto)p;
//			if(this.codigo == p1.getcodigo()){
//			return 0;
//			}
//			else if(this.codigo < p1.getcodigo()){
//				return -1;
//			}
//			else
//				return 1;
//		}

//        Compara


//        public int compareTo(Object p) {
//			Produto p1 = (Produto)p;
//			if(this.preco == p1.getpreco()){
//			return 0;
//			}
//			else if(this.preco < p1.getpreco()){
//				return -1;
//			}
//			else
//				return 1;
//		}

        public int compareTo(Object p) {
			Produto p1 = (Produto)p;
			return this.nome.compareTo(((Produto) p).getnome());
		}

}
