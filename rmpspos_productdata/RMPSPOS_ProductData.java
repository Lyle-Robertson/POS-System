/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rmpspos_productdata;

/**
 *
 * @author lance
 */
public class RMPSPOS_ProductData extends javax.swing.JPanel  {

    private String prodDescription;
    private float costPrice;
    private float price;
    private int inventoryQty;
    private int stockQty;
    private String supplier;

    // constructor
    /**
     *
     *
     * @param prodDescription
     * @param price
     * @param inventoryQty
     * @param stockQty
     * @param costPrice
     * @param supplier
     */
    public RMPSPOS_ProductData(String prodDescription, float costPrice, float price,
            int inventoryQty, int stockQty, String supplier) {

        this.prodDescription = prodDescription;
        this.price = price;
        this.inventoryQty = inventoryQty;
        this.stockQty = stockQty;
        this.costPrice = costPrice;
        this.supplier = supplier;
    }

    // setters
    public void setCostPrice(float newCostPrice) {
        costPrice = newCostPrice;
    }

    public void setProdDescription(String newProdDescription) {
        prodDescription = newProdDescription;
    }

    public void setPrice(float newPrice) {
        price = newPrice;
    }

    public void setInventoryQty(int newInventoryQty) {
        inventoryQty = newInventoryQty;
    }

    public void setStockQty(int newStockQty) {
        stockQty = newStockQty;
    }

    public void setSupplier(String newSupplier) {
        supplier = newSupplier;
    }

    // getters
    public String getProdDescription() {
        return prodDescription;
    }

    public float getPrice() {
        return price;
    }

    public int getInventoryQty() {
        return inventoryQty;
    }

    public int getStockQty() {
        return stockQty;
    }

    public float getCostPrice() {
        return costPrice;
    }

    public String getSupplier() {
        return supplier;
    }

    // toString method
    @Override
    public String toString() {
        return "Product Description: " + prodDescription
                + "\tCost Price: " + costPrice
                + "\tProduct Price: " + price
                + "\tInventory Qty: " + inventoryQty
                + "\tStock Qty: " + stockQty
                + "\tSupplier: " + supplier + "\t";
    }

    Object getCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
