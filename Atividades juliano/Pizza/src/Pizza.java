// Classe Pizza
class Pizza {
    private String massa;
    private String tamanho;
    private StringBuilder ingredientes;

    public Pizza() {
        ingredientes = new StringBuilder();
    }
    public void setMassa(String massa) {
        this.massa = massa;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void addIngrediente(String ingrediente) {
        if (ingredientes.length() > 0) {
            ingredientes.append(", ");
        }
        ingredientes.append(ingrediente);
    }

    public String toString() {
        return "Pizza:\n" +
                "  Massa: " + massa + "\n" +
                "  Tamanho: " + tamanho + "\n" +
                "  Ingredientes: " + (ingredientes.length() > 0 ? ingredientes.toString() : "Nenhum ingrediente");
    }
}

// Classe PizzaBuilder
class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public PizzaBuilder setMassa(String massa) {
        pizza.setMassa(massa);
        return
