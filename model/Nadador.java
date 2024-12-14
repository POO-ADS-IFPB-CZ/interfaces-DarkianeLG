package model;

public interface Nadador {
    public void nada();

    class Pessoa {
        private String nome;
        private String endereco;

        public Pessoa(String nome, String endereco) {
            this.nome = nome;
            this.endereco = this.endereco;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
    }
}
