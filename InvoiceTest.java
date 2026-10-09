
package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(
                "A101",
                "Hammer",
                3,
                12.50
        );

        System.out.println("Part Number: "
                + invoice.getPartNumber());

        System.out.println("Part Description: "
                + invoice.getPartDescription());

        System.out.println("Quantity: "
                + invoice.getQuantity());

        System.out.println("Price Per Item: "
                + invoice.getPricePerItem());

        System.out.println("Invoice Amount: "
                + invoice.getInvoiceAmount());

        //setters
        invoice.setPartNumber("A102");
        invoice.setPartDescription("Screwdriver");
        invoice.setQuantity(5);
        invoice.setPricePerItem(10.0);

        System.out.println("\nAfter updating values:");

        System.out.println("Part Number: "
                + invoice.getPartNumber());

        System.out.println("Part Description: "
                + invoice.getPartDescription());

        System.out.println("Invoice Amount: "
                + invoice.getInvoiceAmount());

        //invalid values
        invoice.setQuantity(-2);
        invoice.setPricePerItem(-5.0);

        System.out.println("\nAfter setting invalid values:");

        System.out.println("Quantity: "
                + invoice.getQuantity());

        System.out.println("Price Per Item: "
                + invoice.getPricePerItem());

        System.out.println("Invoice Amount: "
                + invoice.getInvoiceAmount());
    }
}

