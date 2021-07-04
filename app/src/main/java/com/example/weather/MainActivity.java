package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.logging.Handler;


public class MainActivity extends AppCompatActivity {
    public int coffee_quantity = 0;
    public int tea_quantity = 0;
    public int soup_quantity = 0;
    public int hotChocolate_quantity = 0;
    public int coldcoffee_quantity = 0;
    public int jaljeera_quantity = 0;
    public int nimbuPaani_quantity = 0;
    public int krushers_quantity = 0;


    public int[] tempPrice = new int[100000];
    public int price_coffe_cup = 20;
    public int price_tea_cup = 10;
    public int price_soup = 100;
    public int price_hotChocolate = 70;
    public int price_coldcoffee = 60;
    public int price_jaljeera = 40;
    public int price_nimbupaani = 30;
    public int price_krushers = 140;
    int[] price_per_cup = {price_coffe_cup, price_tea_cup, price_soup, price_hotChocolate, price_coldcoffee,
            price_jaljeera, price_nimbupaani, price_krushers};
    public int[] quantity = {coffee_quantity, tea_quantity, soup_quantity, hotChocolate_quantity,
            coldcoffee_quantity, jaljeera_quantity, nimbuPaani_quantity, krushers_quantity};
    String[] beverage_name = {"COFFEE", "TEA", "SOUP", "HOT CHOCOLATE", "COLD COFFEE", "JALJEERA",
            "NIMBUPAANI", "KRUSHERS"};
    //    String[] addresses={"deepakverma34@yahoo.co.in"};
    EditText name_edit_text;
    String name_of_customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("IN MAIN", "then");

        name_edit_text = findViewById(R.id.name_edit_text);
    }

    /*
    This funtions for coffee
     */
    public void increment_coffee(View view) {
        if (coffee_quantity <= 99) {
            coffee_quantity += 1;
            displayQuantityCoffee(coffee_quantity);

        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of coffee cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_coffee(View view) {
        if (coffee_quantity >= 1) {
            coffee_quantity -= 1;
            displayQuantityCoffee(coffee_quantity);

        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of coffee cannot be lesser than 1", duration);
            toast.show();
        }
    }

    private void displayQuantityCoffee(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_coffee_text_view);
        quantityTextView.setText("" + number);
        int index = 0;
        quantity[index] = coffee_quantity;
        tempPrice[index] = coffee_quantity * price_coffe_cup;
        displaytempPrice(index);
    }

    /*
    This funtions for tea
     */

    public void increment_tea(View view) {
        if (tea_quantity <= 99) {
            tea_quantity += 1;
            displayQuantityTea(tea_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of tea cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_tea(View view) {
        if (tea_quantity >= 1) {
            tea_quantity -= 1;
            displayQuantityTea(tea_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of tea cannot be lesser than 1", duration);
            toast.show();
        }

    }

    private void displayQuantityTea(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_tea_text_view);
        quantityTextView.setText("" + number);
        int index = 1;
        quantity[index] = tea_quantity;
        tempPrice[index] = tea_quantity * price_tea_cup;
        displaytempPrice(index);
    }

    /*
    This funtions for soup
     */
    public void increment_soup(View view) {
        if (soup_quantity <= 99) {
            soup_quantity += 1;
            displayQuantitySoup(soup_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of soup cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_soup(View view) {
        if (soup_quantity >= 1) {
            soup_quantity -= 1;
            displayQuantitySoup(soup_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of soup cannot be lesser than 1", duration);
            toast.show();
        }

    }

    private void displayQuantitySoup(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_soup_text_view);
        quantityTextView.setText("" + number);
        int index = 2;
        quantity[index] = soup_quantity;
        tempPrice[index] = soup_quantity * price_soup;
        displaytempPrice(index);
    }


    /*
    This funtions for hotChocolate
     */

    public void increment_hotChocolate(View view) {
        if (hotChocolate_quantity <= 99) {
            hotChocolate_quantity += 1;
            displayQuantityhotChocolate(hotChocolate_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of Hot Chocolate cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_hotChocolate(View view) {
        if (hotChocolate_quantity >= 1) {
            hotChocolate_quantity -= 1;
            displayQuantityhotChocolate(hotChocolate_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of Hot Chocolate cannot be lesser than 1", duration);
            toast.show();
        }

    }

    private void displayQuantityhotChocolate(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_hotChocolate_text_view);
        quantityTextView.setText("" + number);
        int index = 3;
        quantity[index] = hotChocolate_quantity;
        tempPrice[index] = hotChocolate_quantity * price_hotChocolate;
        displaytempPrice(index);
    }

    // start----------------------------------------------------------------------------------------------------------
    /*
    This funtions for coldcoffee
     */
    public void increment_coldcoffee(View view) {
        if (coldcoffee_quantity <= 99) {
            coldcoffee_quantity += 1;
            displayQuantitycoldcoffee(coldcoffee_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of coldcoffee cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_coldcoffee(View view) {
        if (coldcoffee_quantity >= 1) {
            coldcoffee_quantity -= 1;
            displayQuantitycoldcoffee(coldcoffee_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of coldcoffee cannot be lesser than 1", duration);
            toast.show();
        }
    }

    private void displayQuantitycoldcoffee(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_coldcoffee_text_view);
        quantityTextView.setText("" + number);
        int index = 4;
        quantity[index] = coldcoffee_quantity;
        tempPrice[index] = coldcoffee_quantity * price_coldcoffee;
        displaytempPrice(index);
    }

    /*
    This funtions for jaljeera
     */

    public void increment_jaljeera(View view) {
        if (jaljeera_quantity <= 99) {
            jaljeera_quantity += 1;
            displayQuantityjaljeera(jaljeera_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of jaljeera cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_jaljeera(View view) {
        if (jaljeera_quantity >= 1) {
            jaljeera_quantity -= 1;
            displayQuantityjaljeera(jaljeera_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of jaljeera cannot be lesser than 1", duration);
            toast.show();
        }

    }

    private void displayQuantityjaljeera(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_jaljeera_text_view);
        quantityTextView.setText("" + number);
        int index = 5;
        quantity[index] = jaljeera_quantity;
        tempPrice[index] = jaljeera_quantity * price_jaljeera;
        displaytempPrice(index);

    }

    /*
    This funtions for nimbuPaani
     */
    public void increment_nimbuPaani(View view) {
        if (nimbuPaani_quantity <= 99) {
            nimbuPaani_quantity += 1;
            displayQuantitynimbuPaani(nimbuPaani_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of nimbuPaani cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_nimbuPaani(View view) {
        if (nimbuPaani_quantity >= 1) {
            nimbuPaani_quantity -= 1;
            displayQuantitynimbuPaani(nimbuPaani_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of nimbuPaani cannot be lesser than 1", duration);
            toast.show();
        }

    }

    private void displayQuantitynimbuPaani(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_nimbuPaani_text_view);
        quantityTextView.setText("" + number);
        int index = 6;
        quantity[index] = nimbuPaani_quantity;
        tempPrice[index] = nimbuPaani_quantity * price_nimbupaani;
        displaytempPrice(index);
    }


    /*
    This funtions for krushers
     */

    public void increment_krushers(View view) {
        if (krushers_quantity <= 99) {
            krushers_quantity += 1;
            displayQuantitykrushers(krushers_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of Krushers cannot be greater than 100", duration);
            toast.show();
        }
    }

    public void decrement_krushers(View view) {
        if (krushers_quantity >= 1) {
            krushers_quantity -= 1;
            displayQuantitykrushers(krushers_quantity);
        } else {
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(getApplicationContext(), "No. of Krushers cannot be lesser than 1", duration);
            toast.show();
        }

    }

    private void displayQuantitykrushers(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_krushers_text_view);
        quantityTextView.setText("" + number);
        int index = 7;
        quantity[index] = krushers_quantity;
        tempPrice[index] = krushers_quantity * price_krushers;
        displaytempPrice(index);
    }


    /*
    This function will display the temporarry price of substances
     */
    public void displaytempPrice(int number) {
        int price = 0;
        for (int i = 0; i <= 7; i++) {
            price += tempPrice[i];
        }
        TextView quantityTextView = (TextView) findViewById(R.id.price_text_view);
        quantityTextView.setText("\u20B9 " + price);
    }



    //10+2
    public void displayOrderSummary()
    {   int total_quantity=0;
        int total_price=0;
        StringBuilder order_item_name= new StringBuilder();
        order_item_name.append("ITEM NAME\n");
        StringBuilder order_item_quantity= new StringBuilder("QUANTITY\n");
        StringBuilder order_item_ratepc= new StringBuilder("RATE PER CUP\n");
        StringBuilder order_price= new StringBuilder("TOTAL RATE\n");
        for(int i=0;i<(beverage_name.length);i++)
        {
            if(quantity[i]>0) {
                order_item_name.append(beverage_name[i]).append("\n");
                order_item_quantity.append(quantity[i]).append("\n");
                order_item_ratepc.append("\u20B9").append(price_per_cup[i]).append("\n");
                order_price.append("\u20B9").append(tempPrice[i]).append("\n");
                total_quantity+=quantity[i];
                total_price+=tempPrice[i];

            }
        }
        order_item_name.append(getString(R.string.total)).append("\n").append(getString(R.string.total));
        order_item_quantity.append(total_quantity);
        order_price.append("\u20B9").append(total_price);

        TextView nameTextView = (TextView) findViewById(R.id.item_name);
        nameTextView.setText("" +order_item_name);
        TextView quantityTextView = (TextView) findViewById(R.id.item_quantity);
        quantityTextView.setText("" +order_item_quantity);
        TextView pricepcTextView = (TextView) findViewById(R.id.item_rateppc);
        pricepcTextView.setText("" +order_item_ratepc);
        TextView priceTextView = (TextView) findViewById(R.id.item_price);
        priceTextView.setText("" +order_price);
    }

    /*
    this function is printing bill after ordering
     */
    public void submitOrder(View view)
    {   String order_details="";
        name_of_customer = name_edit_text.getText().toString().trim().toUpperCase();
        order_details+=getString(R.string.ordersumm)+"\n"+getString(R.string.name)+name_of_customer + "\n";
        TextView quantityTextView = (TextView) findViewById(R.id.pricetext_text_view);
        quantityTextView.setText(""+order_details);
        TextView temppriceTextView = (TextView) findViewById(R.id.price_text_view);
        temppriceTextView.setText("");
        displayOrderSummary();
    }
    public void composeEmail(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"prernaverma200214@gmail.com"});
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    public void open_phone(View view)
    {
        Intent intent1 = new Intent(Intent.ACTION_SEND);
        intent1.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
        intent1.putExtra("address", new String("9876307580")); //txtMobile.getText().toString())
        if (intent1.resolveActivity(getPackageManager()) != null)
        {
            startActivity(intent1);
        }
    }






}

//    public void displaymessagetextview(String message)
//    {
//        TextView quantityTextView = (TextView) findViewById(R.id.price_text_view);
//        quantityTextView.setText("" +message);
//    }
//    public void displayOrderSummary() {
//        StringBuilder order_item_name = new StringBuilder("ITEM NAME\n");
//        StringBuilder order_item_quantity = new StringBuilder("QUANTITY\n");
//        StringBuilder order_item_ratepc = new StringBuilder("RATE PER CUP\n");
//        StringBuilder order_price = new StringBuilder("TOTAL RATE\n");
//        {
//            int total_quantity = 0;
//            int total_price = 0;
//
//            for (int i = 0; i < (beverage_name.length); i++) {
//                if (quantity[i] > 0) {
//                    order_item_name.append(beverage_name[i]).append("\n");
//                    order_item_quantity.append(quantity[i]).append("\n");
//                    order_item_ratepc.append("\u20B9").append(price_per_cup[i]).append("\n");
//                    order_price.append("\u20B9").append(tempPrice[i]).append("\n");
//                    total_quantity += quantity[i];
//                    total_price += tempPrice[i];
//
//                }
//            }
//            order_item_name.append(getString(R.string.total)).append("\n").append(getString(R.string.total));
//            order_item_quantity.append(total_quantity);
//            order_price.append("\u20B9").append(total_price);
//        }
//
//
//
//    /*
//    this function is printing bill after ordering
//     */
//        public void displayOrderSummary ()
//        {
//            int total_quantity = 0;
//            int total_price = 0;
//            StringBuilder order_item_name = new StringBuilder();
//            order_item_name.append("ITEM NAME\n");
//            StringBuilder order_item_quantity = new StringBuilder("QUANTITY\n");
//            StringBuilder order_item_ratepc = new StringBuilder("RATE PER CUP\n");
//            StringBuilder order_price = new StringBuilder("TOTAL RATE\n");
//            for (int i = 0; i < (beverage_name.length); i++) {
//                if (quantity[i] > 0) {
//                    order_item_name.append(beverage_name[i]).append("\n");
//                    order_item_quantity.append(quantity[i]).append("\n");
//                    order_item_ratepc.append("\u20B9").append(price_per_cup[i]).append("\n");
//                    order_price.append("\u20B9").append(tempPrice[i]).append("\n");
//                    total_quantity += quantity[i];
//                    total_price += tempPrice[i];
//
//                }
//            }
//            order_item_name.append(getString(R.string.total)).append("\n").append(getString(R.string.total));
//            order_item_quantity.append(total_quantity);
//            order_price.append("\u20B9").append(total_price);
//
//            TextView nameTextView = (TextView) findViewById(R.id.item_name);
//            nameTextView.setText("" + order_item_name);
//            TextView quantityTextView = (TextView) findViewById(R.id.item_quantity);
//            quantityTextView.setText("" + order_item_quantity);
//            TextView pricepcTextView = (TextView) findViewById(R.id.item_rateppc);
//            pricepcTextView.setText("" + order_item_ratepc);
//            TextView priceTextView = (TextView) findViewById(R.id.item_price);
//            priceTextView.setText("" + order_price);
//        }
//
//    /*
//    this function is printing bill after ordering
//     */
//        public void submitOrder (View view)
//        {
//            String order_details = "";
//            name_of_customer = name_edit_text.getText().toString().trim().toUpperCase();
//            order_details += getString(R.string.ordersumm) + "\n" + getString(R.string.name) + name_of_customer + "\n";
//            TextView quantityTextView = (TextView) findViewById(R.id.pricetext_text_view);
//            quantityTextView.setText("" + order_details);
//            TextView temppriceTextView = (TextView) findViewById(R.id.price_text_view);
//            temppriceTextView.setText("");
//            displayOrderSummary();
//        }
//        public void composeEmail () {
//            Intent intent = new Intent(Intent.ACTION_SENDTO);
//            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
//            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"prernaverma200214@gmail.com"});
//            if (intent.resolveActivity(getPackageManager()) != null) {
//                startActivity(intent);
//            }
//            public void open_phone (String string)
//            {
//                Intent intent1 = new Intent(Intent.ACTION_SEND);
//                intent.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
//                intent.putExtra("address", new String("9876307580")); //txtMobile.getText().toString())
//                if (intent.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intent);
//                }
//            }
//
//
//        }
////    public void submitOrder(View view)
////    {   String order_details="";
////        name_of_customer = name_edit_text.getText().toString().trim().toUpperCase();
////        order_details+=getString(R.string.ordersumm)+"\n"+getString(R.string.name)+name_of_customer + "\n";
////        TextView quantityTextView = (TextView) findViewById(R.id.pricetext_text_view);
////        quantityTextView.setText(""+order_details);
////        TextView temppriceTextView = (TextView) findViewById(R.id.price_text_view);
////        temppriceTextView.setText("");
////        displayOrderSummary();
////    }
////
////
//////
//////    public void submitOrder(View view)
//////    {
//////        TextView nameTextView = (TextView) findViewById(R.id.item_name_oa);
//////        nameTextView.setText("" +order_item_name);
//////        Log.v("ORDERACt",order_item_name);
//////        TextView quantityTextView = (TextView) findViewById(R.id.item_quantity_oa);
//////        quantityTextView.setText("" +order_item_quantity);
//////        TextView pricepcTextView = (TextView) findViewById(R.id.item_rateppc_oa);
//////        pricepcTextView.setText("" +order_item_ratepc);
//////        TextView priceTextView = (TextView) findViewById(R.id.item_price_oa);
//////        priceTextView.setText("" +order_price);
//////    }
////
////        public void composeEmail(View view) {
////        Intent intent = new Intent(Intent.ACTION_SENDTO);
////        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
////        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"prernaverma200214@gmail.com"});
////        if (intent.resolveActivity(getPackageManager()) != null) {
////            startActivity(intent);
////        }
////    }
////        public void open_phone(View view)
////        {
////            Intent intent1 = new Intent(Intent.ACTION_SEND);
////            intent1.setData(Uri.parse("smsto:"));  // This ensures only SMS apps respond
////            intent1.putExtra("address", new String("9876307580")); //txtMobile.getText().toString())
////            if (intent1.resolveActivity(getPackageManager()) != null)
////            {
////                startActivity(intent1);
////            }
////        }
//
//    }}
