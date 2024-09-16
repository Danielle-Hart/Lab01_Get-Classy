public class Product {
    private String Name;
    private String Description;
    private String ID;
    private double Cost;

    /**CONSTRUCTOR FOR PRODUCT CLASS*/
    public Product(String Name, String Description, String ID, double Cost) {
        this.Name = Name;
        this.Description = Description;
        this.ID = ID;
        this.Cost = Cost;
    }

    //GETTERS
    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getID() {
        return ID;
    }

    public double getCost() {
        return Cost;
    }

    //SETTERS
    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCost(double cost, double productCost, double v) {
        Cost = cost;
    }

    /** RETURN CSV OF PRODUCT */
    public String toCSV(){
        return String.format("%s,%s,%s,%.2f", ID, Name, Description, Cost);
    }

    /** RETURN JSON OF PRODUCT */
    public String toJSON(){
        return String.format("{\"ID\":\"%s\",\"Name\":\"%s\",\"Description\":\"%s\",\"Cost\":%.2f}", ID, Name, Description, Cost);
    }

    /** RETURN XML OF PRODUCT */
    public String toXML(){
        return String.format("<product><ID>%s</ID><Name>%s</Name><Description>%s</Description><Cost>%.2f</Cost></product>", ID, Name, Description, Cost);
    }

    @Override
    public String toString(){
        return String.format("Product{ID='%s', Name='%s', Description='%s', Cost=%.2f}", ID, Name, Description, Cost);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Double.compare(product.Cost, Cost) == 0 &&
                Name.equals(product.Name) &&
                Description.equals(product.Description) &&
                ID.equals(product.ID);
    }
}
