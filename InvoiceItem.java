package homework1;

public class InvoiceItem {

        private String id;
        private String desc;
        private int qty;
        private double unitPrice;

        // Constructor
        public InvoiceItem(String id, String desc, int qty, double unitPrice) {
            this.id = id;
            this.desc = desc;
            this.qty = qty;
            this.unitPrice = unitPrice;
        }

        // Getter for id
        public String getId() {
            return id;
        }

        // Getter for description
        public String getDesc() {
            return desc;
        }

        // Getter for quantity
        public int getQty() {
            return qty;
        }

        // Setter for quantity
        public void setQty(int qty) {
            this.qty = qty;
        }

        // Getter for unit price
        public double getUnitPrice() {
            return unitPrice;
        }

        // Setter for unit price
        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }

        // Calculate total
        public double getTotal() {
            return qty * unitPrice;
        }

        // toString
        public String toString() {
            return "InvoiceItem[id=" + id
                    + ",desc=" + desc
                    + ",qty=" + qty
                    + ",unitPrice=" + unitPrice + "]";
        }
    }


   class TestMain {

    public static void main(String[] args) {

        // Test constructor and toString()
        InvoiceItem inv1 =
                new InvoiceItem("A101", "Pen Red", 888, 0.08);

        System.out.println(inv1);

        // Test Setters and Getters
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);

        System.out.println(inv1);

        System.out.println("id is: " + inv1.getId());
        System.out.println("desc is: " + inv1.getDesc());
        System.out.println("qty is: " + inv1.getQty());
        System.out.println("unitPrice is: " + inv1.getUnitPrice());

        // Test getTotal()
        System.out.println("The total is: " + inv1.getTotal());
    }
}
