/*
 * Deborah Lewis
 * IT351: Advanced Java Programming
 * Colorado Technical University
 */
package DeborahLewis_AdvancedJavaProgramming;

import java.io.Serializable;

public class DataRequest implements Serializable {

    //declare variables
    private int dataType;
    public static final int CUSTOMERS = 0;
    public static final int PRODUCTS = 1;

    //getters & setters
    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public static int getCUSTOMERS() {
        return CUSTOMERS;
    }

    public static int getPRODUCTS() {
        return PRODUCTS;
    }

} //end class