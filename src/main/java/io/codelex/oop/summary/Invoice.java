package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Invoice {
    private final Order order;
    private final String invoiceNr;
    private InvoiceStatus status;
    private final BigDecimal price;
    private final BigDecimal priceWithVAT;
    private List<SellableThing> sellableThingList;

    public Invoice(Order order, String invoiceNr) throws WrongOrderException {
        if (order.showOrderItems().length() == 0) {
            throw new WrongOrderException("Order is empty!");
        } else {
            this.order = order;
            this.invoiceNr = invoiceNr;
            this.status = InvoiceStatus.APPROVED;
            this.price = order.calculatePrice();
            this.priceWithVAT = this.price.multiply(new BigDecimal("1.21")).setScale(2, RoundingMode.HALF_UP);
        }
    }

    public void send() {
        this.status = InvoiceStatus.SENT;
    }


    public String printInvoice() {
        int length = 60;
        return "=".repeat(length) + "\n"
                + "= INVOICE NUMBER: " + invoiceNr + " ".repeat(length - invoiceNr.length() - 19) + "=\n"
                + "= STATUS: " + status + " ".repeat(length - status.toString().length() - 11) + "=\n"
                + order.showOrderItems() + "\n"
                + "= SUM: " + price + " EUR" + " ".repeat(length - price.toString().length() - 12) + "=\n"
                + "= VAT (21%): " + priceWithVAT.subtract(price) + " EUR" + " ".repeat(length - priceWithVAT.subtract(price).toString().length() - 18) + "=\n"
                + "= TOTAL: " + priceWithVAT + " EUR" + " ".repeat(length - priceWithVAT.toString().length() - 14) + "=\n"
                + "=".repeat(length);
    }
}
