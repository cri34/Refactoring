public class OrderItem {
   private int productID;
   private String description;
   private Integer quantity;
   private Float price;
   private Float discount;
    public OrderItem(int productID,String description,Integer quantity,Float price,Float discount){
        this.productID=productID;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
        this.discount=discount;
    }
    public int getProductID(){
        return productID;
    }
    public String getDescription(){
        return description;
    }
    public Integer getQuantity(){
        return quantity;
    }
    public float getPrice(){
        return price;
    }
    public float getDiscount(){
        return discount;
    }

}