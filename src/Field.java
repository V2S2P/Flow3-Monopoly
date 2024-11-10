public class Field {
    private String label;
    private int ID;
    private int cost;
    private int income;
    private String option;
    public Field(int ID, String label, int cost, int income){
        this.ID = ID;
        this.label = label;
        this.cost = cost;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Field{" +
                "label='" + label + '\'' +
                ", ID=" + ID +
                ", cost=" + cost +
                ", income=" + income +
                ", option='" + option + '\'' +
                '}';
    }
    public String onLand(Player p){
        return "";
    }
    public String processResponse(Player p){
        return "";
    }
    protected String onAccept(Player p){
        return "";
    }
    protected String onReject(Player p){
        return "";
    }
}
