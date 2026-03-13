package com.mycompany.rgttuckshop;

/**
 * RGT Tuck Shop Management System - Tier 2 Implementation
 * Includes: Loops, Switch statements, Logic operators, and Prefix/Postfix tests.
 */
public class RGTTuckShop {

    public static void main(String[] args) {
        // --- Constants --- [cite: 29-34]
        final double VAT_RATE = 0.15;
        final double DISCOUNT_RATE = 0.10;
        final int LOW_STOCK = 20;
        final String SHOP_NAME = "RGT Tuck Shop";

        // --- Task 1.1: Product Parallel Arrays --- [cite: 42, 48]
        String[] productNames = {"Cheese Puff Snack", "Chocolate Bar", "Bottled Water (500ml)", "Energy Drink", "Meat Pie"};
        double[] productPrices = {6.50, 12.00, 8.00, 22.50, 18.00};
        int[] stockLevels = {48, 30, 60, 20, 15};
        String[] categories = {"Snack", "Snack", "Beverage", "Beverage", "Hot Food"};
        boolean[] vatApplicable = {false, false, false, true, true};

        double grandTotal = 0.0; // [cite: 192]

        System.out.println("==== " + SHOP_NAME + " - Full Inventory Report ====");

        // --- Task 4.1: Automated Product Processing Loop --- [cite: 222-226]
        for (int i = 0; i < productNames.length; i++) {
            // Arithmetic Calculations [cite: 51-52]
            double stockValue = productPrices[i] * stockLevels[i];
            grandTotal += stockValue; // Accumulate grand total [cite: 60]
            
            double vatAmount = vatApplicable[i] ? (productPrices[i] * VAT_RATE) : 0.0;
            double priceWithVAT = productPrices[i] + vatAmount;

            // Product Summary Output [cite: 63-87]
            System.out.println("Product [" + i + "]: " + productNames[i]);
            System.out.println("Category    : " + categories[i]);
            System.out.println("Price       : R" + productPrices[i]);
            System.out.println("Stock       : " + stockLevels[i] + " units");
            System.out.println("Stock Value : R" + stockValue);
            
            if (vatApplicable[i]) {
                System.out.printf("VAT Amount  : R%.2f\n", vatAmount);
                System.out.printf("Price incl VAT: R%.2f\n", priceWithVAT);
            } else {
                System.out.println("Price incl VAT: R" + productPrices[i] + " (no VAT applied)");
            }

            // Task 2.1: Stock Status (if/else if/else) [cite: 101]
            if (stockLevels[i] == 0) {
                System.out.println("STATUS: OUT OF STOCK - Print urgent warning do not sell");
            } else if (stockLevels[i] <= LOW_STOCK) {
                System.out.println("STATUS: LOW STOCK - Print reorder reminder");
            } else if (stockLevels[i] <= LOW_STOCK * 2) {
                System.out.println("STATUS: MODERATE - Print no action needed");
            } else {
                System.out.println("STATUS: WELL STOCKED - Print all good");
            }

            // Task 3: Category Handling Switch [cite: 129]
            switch (categories[i]) {
                case "Snack":
                    System.out.println("HANDLING: Store in dry goods shelf - no refrigeration");
                    double bulkPrice = productPrices[i] * 3 * (1 - DISCOUNT_RATE);
                    System.out.printf("Bulk price (3 units, 10%% off): R%.2f\n", bulkPrice);
                    break;
                case "Beverage":
                    System.out.println("HANDLING: Store upright in refrigerator below 10°C");
                    if (vatApplicable[i]) {
                        System.out.println("VAT applies at 15%.");
                    } else {
                        System.out.println("No VAT on this beverage.");
                    }
                    break;
                case "Hot Food":
                    System.out.println("HANDLING: Must be sold within 4 hours of preparation.");
                    System.out.println("HEALTH WARNING: Do not sell if preparation time unknown.");
                    break;
                default:
                    System.out.println("Unknown category flag for manager: " + categories[i]);
            }
            System.out.println("----------------------------------------");
        }
        System.out.printf("GRAND TOTAL STOCK VALUE: R%.2f\n", grandTotal); // [cite: 88]

        // --- Task 4.2: Premium Report (using continue) --- [cite: 248-250]
        System.out.println("\n--- PREMIUM REPORT (Stock > LOW_STOCK) ---");
        for (int i = 0; i < productNames.length; i++) {
            if (stockLevels[i] <= LOW_STOCK) {
                continue; 
            }
            System.out.println("Premium Item: " + productNames[i] + " - R" + productPrices[i]);
        }

        // --- Task 4.3: First Out-of-Stock Search (using break) --- [cite: 263-265]
        System.out.println("\n--- OUT-OF-STOCK ALERT SEARCH ---");
        boolean anyOutOfStock = false;
        for (int i = 0; i < productNames.length; i++) {
            if (stockLevels[i] == 0) {
                System.out.println("PRIORITY REORDER ALERT: " + productNames[i] + " is OUT OF STOCK!");
                anyOutOfStock = true;
                break; 
            }
        }
        if (!anyOutOfStock) {
            System.out.println("All products currently in stock.");
        }

        // --- Task 5.1: while Loop - Cash Register Simulation --- [cite: 268-298]
        System.out.println("\n--- CUSTOMER RECEIPT ---");
        int[] basket = {0, 2, 1, 3, 2};
        int[] quantities = {3, 2, 5, 1, 4};
        int itemIdx = 0;
        double receiptTotal = 0.0;

        while (itemIdx < basket.length) {
            int pIdx = basket[itemIdx];
            int qty = quantities[itemIdx];
            double lineTotal = productPrices[pIdx] * qty;
            
            if (vatApplicable[pIdx]) {
                lineTotal *= (1 + VAT_RATE);
            }
            receiptTotal += lineTotal;
            System.out.printf("%s x%d = R%.2f\n", productNames[pIdx], qty, lineTotal);
            itemIdx++; 
        }

        boolean hasLoyaltyCard = true;
        if (hasLoyaltyCard && receiptTotal > 100) {
            receiptTotal -= (receiptTotal * DISCOUNT_RATE); 
            System.out.println("Loyalty discount applied!");
        }
        System.out.printf("RECEIPT TOTAL: R%.2f\n", receiptTotal);

        // --- Task 5.2: do-while Loop - Input Validation Simulation --- [cite: 302-325]
        System.out.println("\n--- INPUT VALIDATION SIMULATION ---");
        int[] inputs = {7, -1, 3}; // Simulated inputs [cite: 308]
        int attempt = 0;
        int selected;
        
        do {
            selected = inputs[attempt];
            System.out.println("Input received: " + selected);
            if (selected < 0 || selected > 4) {
                System.out.println("Invalid index - must be 0 to 4. Try again.");
            }
            attempt++;
        } while ((selected < 0 || selected > 4) && attempt < inputs.length);

        // Student Explanation for Task 5.2 [cite: 327-328, 367]: 
        // Value must be read before it can be validated; do-while ensures at least one execution.
        if (selected >= 0 && selected <= 4) {
            System.out.println("Valid product selected: " + productNames[selected]);
        }

        // --- Task 6.1: Prefix vs Postfix Challenge --- [cite: 331-343]
        System.out.println("\n--- PREFIX/POSTFIX TEST ---");
        int x = stockLevels[2]; // Starts at 60 [cite: 337]
        int a = ++x; // Prediction: x becomes 61, then a becomes 61 (prefix) [cite: 367]
        int b = x++; // Prediction: b gets 61, then x becomes 62 (postfix) [cite: 367]
        
        System.out.println("x = " + x + " // Final value after both increments");
        System.out.println("a = " + a + " // Value assigned using prefix");
        System.out.println("b = " + b + " // Value assigned using postfix");

        // --- Task 6.2: Modulus Operator Odd/Even Stock --- [cite: 346-350]
        System.out.println("\n--- MODULUS REPACKAGING ALERTS ---");
        for (int i = 0; i < productNames.length; i++) {
            if (stockLevels[i] % 2 != 0) { // Modulus used for odd check [cite: 368]
                System.out.println("REPACKAGING ALERT: " + productNames[i] + " has odd stock (" + stockLevels[i] + " units).");
            } else {
                System.out.println(productNames[i] + ": stock is even - OK.");
            }
        }
    }
}