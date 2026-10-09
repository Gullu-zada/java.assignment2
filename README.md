# Exercise 2 — Invoice UML Class Diagram

```text
------------------------------------------------
                    Invoice
------------------------------------------------
- partNumber: String
- partDescription: String
- quantity: int
- pricePerItem: double
------------------------------------------------
+ Invoice(partNumber: String,
          partDescription: String,
          quantity: int,
          pricePerItem: double)
+ getPartNumber(): String
+ setPartNumber(partNumber: String): void
+ getPartDescription(): String
+ setPartDescription(partDescription: String): void
+ getQuantity(): int
+ setQuantity(quantity: int): void
+ getPricePerItem(): double
+ setPricePerItem(pricePerItem: double): void
+ getInvoiceAmount(): double
------------------------------------------------
```
