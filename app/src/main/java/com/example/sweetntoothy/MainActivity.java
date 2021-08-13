package com.example.sweetntoothy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, onClickInterface {

    RecyclerView recyclerView;
    androidx.appcompat.widget.AppCompatSpinner spinner;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this, R.array.dessert, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        spinner.setOnItemSelectedListener(this);


    }

    public void init() {
        recyclerView = findViewById(R.id.recyclerview_details);
        spinner = findViewById(R.id.spinner);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:
                adapter = new Adapter(getSundaas(), this);
                break;
            case 1:
                adapter = new Adapter(getWaffles(), this);
                break;
            case 2:
                adapter = new Adapter(getCrepes(), this);
                break;
            case 3:
                adapter = new Adapter(getCookieDough(), this);
                break;
            case 4:
                adapter = new Adapter(getGelatoScoops(), this);
                break;
            case 5:
                adapter = new Adapter(getHotPuddings(), this);
                break;
            case 6:
                adapter = new Adapter(getCakes(), this);
                break;
            case 7:
                adapter = new Adapter(getMilkshakes(), this);
                break;
        }

        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private Model[] getSundaas() {

        return new Model[]{
                new Model("Great Knickerbocker Glory Sundae", "Sliced fruits with strawberry and chocolate gelato, soft vanilla ice cream, whipped cream and drizzled with luxury strawberry syrup.", 9.05),
                new Model("Very Cherry Sundae", "Cherry gelato,topped with soft vanilla ice cream, whipped cream, drizzled with a mouth watering cherry syrup", 7.75),
                new Model("Bananaberry Sundae", "Whole banana on a bed of strawberry slices, soft vanilla ice cream, luxury strawberry syrup, sprinkled with Belgian white chocolate flakes", 9.05),
                new Model("Classic Banana Split Sundae", "Whole banana with soft vanilla ice cream, sprinkled with chopped nuts, milk chocolate flakes, fudge cubes, topped off with whipped cream drizzled with toffee sauce.", 9.05),
                new Model("Chocoholic Sundae", "Italian wafer basket filled with chocolate and caramel gelato and topped with soft vanilla ice cream, sprinkled with nuts, milk chocolate sauce and served with a chocolate cup and whipped cream.", 9.05),
                new Model("Mango Mania Sundae", "Real Alphonso mango sorbet,soft vanilla ice cream, mango fruit pieces, layered with a special mango syrup.", 8.45),
                new Model("After Eight Mint Choc Sundae", "Mint choc-chip and chocolate gelato, topped off with whipped cream, luxury mint syrup and After Eight ® chocolates.", 9.05),
                new Model("Cookies & Cream Sundae with Oreo Cookies®", "Cookies and cream gelato, soft vanilla ice cream, luxury chocolate sauce, topped with glorious crushed Oreo® Cookies.", 9.05),
                new Model("Coconut Heaven Sundae", "Coconut and raspberry ripple gelato topped with whipped cream, raspberry syrup and sprinkled with coconut shavings.", 9.05),
                new Model("Coffee Bean Sundae", "Cappuccino and caramel dulce-de-leche gelato,covered with whipped cream, sprinkled with milk chocolate flakes, drizzled with a light coffee syrup and toped with chocolate coffee beans", 8.45),
                new Model("Hazelnut Choc Deluxe Sundae with Ferrero Rocher®", "Irresistible chocolate hazelnut gelato, combined with soft vanilla ice cream, topped with milk chocolate flakes, Ferrero Rocher® and luxury choco-nut sauce.", 9.05),
                new Model("Strawberry Sundae", "Strawberry gelato, swirled soft vanilla ice cream, embedded with strawberry slices, topped off with whipped cream an drizzled with strawberry syrup.", 9.70),
                new Model("Tropical Paradise Sundae", "Banana,coconut and mango gelato with kiwi, strawberry and pineapple fruit pieces, topped off with whipped cream and an appetizing blend of kiwi and peach syrup.", 9.70),
                new Model("Bubblelicious Sundae", "Bubblegum and strawberry gelato, topped with soft vanilla ice crream, strawbbery and bubblegum sauce, sprinkled  with colourful sugar strands.", 8.45),
                new Model("Giant Tutti Frutti Sundae", "Giant glass bowl of raspberry, passion fruit, mango and cherry gelato nested under fresh fruits and drizzled with an array of high fruit content syrups. Topped off with soft vanilla ice cream", 16.70),
                new Model("Hot Fudge Sundae", "A delighful combination of warm fudge cake pieces, chocolate gelato, swirled soft vanilla ice cream and luxury chocolate syrup.", 9.70),
                new Model("Fruit Sorbetto (Gluten Free) Sundae", "A gorgeous fusion of mango, passion fruit and raseberry sorbet, topped off with fresh kiwi, strawberry and banana fruit pieces, drizzled with an exquisite raspberry syrup.", 9.05),
                new Model("Caramel Crunch Sundae", "Toffee butterscotch and vanilla pod gelato, drizzled with luxury caramel syrup, topped off with whipped cream and crushed digestives..", 9.05),
                new Model("Pistachio Nut Delight Sundae", "Hazelnut and pistachio gelato, swirled soft vanilla ice cream,luxury choco-nut sauce, sprinkled with nuts", 8.45),
                new Model("The Screwball Sundae", "Classic raspberry ripple and cherry gelato, topped off with soft vannilla ice cream and drizzled with raspberry syrup. Find the hidden Gumball!", 7.75),
                new Model("Caramel Choc Bombe Sundae", "Luxury chocolate and vanilla gelato, soft vanilla ice cream, covered with a delicious caramel syrup and finished  with instantset-hard chocolate.", 9.05),
                new Model("Strawberry Cheesecake Sundae", "An irresistible fusion of white chocolateand strawberry cheesecake gelato, whipped cream, crushed digestives, drizzled with strawberry and white chocolate syrups.", 9.70),

        };
    }


    private Model[] getWaffles() {

        return new Model[]{
                new Model("Bueno Waffle", "Fresh waffle served with Kinder Bueno® pieces, luxury choco-hazelnut sauce, white chocolate flakes and drizzled with Kaspa's unique white choco-nut spread.", 9.05),
                new Model("Bueno White Waffle", "Fresh waffle served with Kinder Bueno White® pieces, luxury choco-hazelnut sauce, white chocolate flakes and drizzled with Kaspa's unique white choco-nut spread.", 9.05),
                new Model("Canadian Maple Waffle", "Fresh waffle lightly dusted with cinnamon powder and drizzled with maple syrup.", 6.45),
                new Model("Caramel Shortcake Waffle", "Fresh waffle served crushed digestives, drizzled with caramel and our irresistible melted chocolate sauce.", 8.45),
                new Model("Choco-Tella Spread Waffle", "Fresh waffle served with our luxurious choco-nut spread and a topping of your choice. (CONTAINS NUT)", 7.75),
                new Model("Strawberry Delight Waffle", "Fresh waffle served with strawberry slices, drizzled with our mouth-watering strawberry syrup", 7.75),
                new Model("Strawberry N' Butterscotch Waffle", "Fresh waffle served with strawberry slices, drizzled with melted chocolate sauce and sprinkled with milk chocolate flakes.", 7.75),
                new Model("Strawberry Indulgence Waffle", "Fresh waffle served with strawberry slices, drizzled with melted chocolate sauce and sprinkled with milk chocolate flakes", 8.45),
                new Model("The M&M Chocolate Waffle", "Fresh baked M&M®Waffle base, drizzled with our luxurious chocolate sauce and topped off with more M&Ms®", 9.05),
                new Model("The M&M Peanut Waffle", "Fresh baked M&M®Waffle base, drizzled with our luxurious chocolate sauce and topped off with more M&Ms®", 9.05),
                new Model("White Chocolate Indulgence Waffle", "Fresh waffle served with banana and strawberry slices, drizzled with a luxurious white chocolate sauce and white chocolate flakes.", 8.45),
                new Model("Banoffee-Tella Waffle", "Fresh waffle served with our luxurious choco-nut spread, sliced banana and drizzled with a toffee sauce.", 8.45),
                new Model("Waffle Crumble", "Fresh waffle served with warm apple crumble pieces, drizzled with maple syrup and dusted with cinnamon.", 9.05),
                new Model("Peanut Butter Choc Waffle", "Fresh waffle served with banana and peanut butter spread, drizzled with our lavish choco-hazelnut sauce.", 9.05),
                new Model("The Brownie Waffle", "Fresh waffle topped with fudge brownie pieces, drizzled with melted chocolate sauce and finished with pouring cream.", 9.70),
                new Model("Oreo® Crunch Waffle", "Fresh waffle served with crushed Oreo® cookie crumbles, drizzled with our lavish white chocolate sauce and sprinkled with white chocolate flakes.", 8.45),
                new Model("Nuts About Choc Waffle", "Fresh waffle served with nuts and chocolate flakes, drizzled with our luxury  choco-hazelnnut sauce. ( CONTAINS NUT)", 7.75),
                new Model("Choc-A-Lot Waffle", "Fresh waffle sprinkled with Belgian milk and white chocolate flakes, drizzled with our luxury chocolate sauce.", 7.75),
                new Model("Strawberry Shortcake Waffle", "Fresh waffle served with fresh strawberry  slices, crushed digestives, drizzled with white chocolate sauce..", 8.45),
                new Model("Banoffee Waffle", "Fresh waffle served with banana slices and  drizzled with our delightful luxury toffee sauce.", 8.45)
        };
    }

    private Model[] getCrepes() {

        return new Model[]{
                new Model("Traditional Sweet & Simple Crepe", "Freshly baked crepe spread with butter and lightly dusted with sugar.", 5.85),
                new Model("Sicilian Zest Lemon Crepe", "Freshly baked crepe, spread with butter and lightly dusted with sugar and drizzled with lemon juice.", 5.85),
                new Model("Belgian Milk Chocolate Crepe", "", 6.45),
                new Model("Belgian White Chocolate Crepe", "Freshly baked crepe, drizzled with white chocolate sauce and sprinkled with white chocolate flakes.", 6.45),
                new Model("Banoffee Crepe", "Freshly baked crepe served with banana slices and drizzled with our delightful toffee sauce.", 6.45),
                new Model("Strawberry & Cream Crepe", "Freshly baked crepe with strawberry slices, drizzled with our mouth-watering strawberry syrup and served  whipped cream and soft vanilla ice cream.", 7.75),
                new Model("Bananaberry Crepe", "Freshly baked crepe served with banana and strawberry slices, drizzled with melted chocolate sauce and sprinkled with milk chocolate flakes", 7.75),
                new Model("Maple Temptation", "Freshly baked crepe served with strawberry slices and drizzled with maple syrup.", 6.45),
                new Model("Strawberry Indulgence Crepe", "Freshly baked crepe served with strawberry slices, drizzled with melted chocolate sauce and sprinkled with milk chocolate flakes.", 7.15),
                new Model("Choco-Tella Crepe", "Freshly baked crepe served with our luxury choco-nut spread and served with a topping of your choice. ( CONTAINS NUT)", 7.15),
                new Model("White Choco-Berry", "Freshly baked crepe sprinkled with white chocolate flakes and drizzled with raspberry and white chocolate sauce.", 6.45),
                new Model("Caramel Choc Crepe", "Freshly baked crepe sprinkled with milk chocolate flakes and drizzled with an irresistible caramel sauce.", 6.45),
        };
    }

    private Model[] getCookieDough() {

        return new Model[]{
                new Model("Chunky Milk Choc Hot Cookie Dough", "", 7.15),
                new Model("White Choc Chip Hot Cookie Dough", "", 7.15),
                new Model("Smarties Hot Cookie Dough", "", 7.15),
                new Model("Fudge Brownie Hot Cookie Dough", "", 7.15),
                new Model("Banoffee Hot Cookie Dough", "", 8.45),
                new Model("Bueno Hot Cookie Dough", "", 9.05),
        };
    }

    private Model[] getGelatoScoops() {

        return new Model[]{
                new Model("Scoop of Gelato", "", 2.50),
        };
    }

    private Model[] getHotPuddings() {

        return new Model[]{
                new Model("Peanut Butter Stack", "Sweet and salty peanut butter crunch, light and creamy milk chocolate and buttery caramel, all layered twice on a brownie cake. Finished with crunchy honey-roasted peanuts.", 5.85),
                new Model("Luxury Sticky Toffee (Gluten Free)", "A rich soft sponge soaked in a hot and toffee and butterscotch.", 5.85),
                new Model("Oreo® Cookie Bash Cake", "An OREO® cookie universe of white n' milk chocolate cream, with OREO®  chunks, and showered with dark chocolate drizzle.", 5.85)
        };
    }

    private Model[] getCakes() {

        return new Model[]{
                new Model("New York Vanilla Cheesecake (Gluten Free)", "Deliciously soft cheesecake made with madagascan vanilla bean, baked on a gluten free cookie crumble crust.", 4.55),
                new Model("Hot Apple Crumble", "Juicy apple inside a delicious light shortcrust base topped with a golden  crumble.", 4.55),
                new Model("Triple Choc Fudge", "Layer of chocolate sponge, cream icing wrapped in a layer of chocolate fudge- topped  with delicious white chocolate flakes.", 4.55),
                new Model("American Pecan Pie", "American pecan nuts wrapped in a scrumptious sticky toffee base.", 4.55),
                new Model("Carrot Cake (Gluten Free)", "Deliciously  moist carrot cake, layered with icing and topped with walnuts.", 4.55),
                new Model("Black Forest Gateau", "", 4.55),
                new Model("Rainbow Cake", "", 4.55),
                new Model("Fresh Gateau Cakes Strawberry", "", 4.55),
                new Model("Fresh Gateau Cakes Bubblegum", "", 4.55),
                new Model("Fresh Gateau Cakes Choco-Nut", "", 4.55),
                new Model("Chocolate Dipped Strawberries White Choc", "", 6.45),
                new Model("Chocolate Dipped Strawberries Milk Choc", "", 6.45),
                new Model("Chocolate Dipped Strawberries Choco-Tella", "", 6.45),
                new Model("Golden Salted Caramel Tart", "A chocolate pastry case filled with a layer of salted caramel and dark chocolate filling, sprinkled with a gold dusting.", 4.55),
        };
    }

    private Model[] getMilkshakes() {

        return new Model[]{
                new Model("Oreo Cookies ® Shake", "", 5.00),
                new Model("Oreo Cookies ® Shake", "", 5.00),
                new Model("After Eight ® Shake", "", 5.00),
                new Model("SChoco-Tella Shake", "", 5.00),
                new Model("Jammie Dodgers® Shake", "", 5.00),
                new Model("Cherry Bakewell® Shake", "", 5.00),
                new Model("Peanut Butter Shake", "", 5.00),
                new Model("Salted Caramel Shake", "", 5.00),
                new Model("Hershey's Cookie 'n' Crème® Shake", "", 5.00),
                new Model("Reese's Peanut Butter Cups® Shake", "", 5.00),
                new Model("Strawberry Cheesecake Shake", "", 5.00),
                new Model("Choc Chip Cookie Shake", "", 5.00),
        };
    }

    @Override
    public void passdata(Model model) {

        String nameValue;
        String descriptionValue;
        double priceValue;

        nameValue = model.getName();
        descriptionValue = model.getDescription();
        priceValue = model.getPrice();

        startActivity(new Intent(getApplicationContext(), PopUp_Activity.class)
                .putExtra("name", nameValue)
                .putExtra("description", descriptionValue)
                .putExtra("price", String.valueOf(priceValue)));


    }
}