package builder;

public class Pizza {

    private final int tamanho;
    private final boolean queijo;
    private final boolean tomate;
    private final boolean bacon;

    private Pizza(Builder builder) {
        tamanho = builder.tamanho;
        queijo = builder.queijo;
        tomate = builder.tomate;
        bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza{" + "tamanho=" + tamanho + ", queijo=" + queijo + ", tomate=" + tomate + ", bacon=" + bacon + '}';
    }

    public static class Builder {

        private final int tamanho;
        private boolean queijo;
        private boolean tomate;
        private boolean bacon;

        public Builder(int tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijo() {
            queijo = true;
            return this;
        }

        public Builder tomate() {
            tomate = true;
            return this;
        }

        public Builder bacon() {
            bacon = true;
            return this;
        }

        public Pizza criarPizza() {
            return new Pizza(this);
        }
    }
}
