# ПР 1


## Код класу Customer:

```java
package domain;
public class Customer {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;

    public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000;
    }

    public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        }
    }

    public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }

    public void setTotal(double total) {
        if (total >= 0) {
            this.total = total;
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Customer is new: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
```
## Фото виконання файлу CustomerTest

![](https://github.com/ppc-ntu-khpi/java-1-AlexRubanUa/blob/main/Solution/advanced.png)



