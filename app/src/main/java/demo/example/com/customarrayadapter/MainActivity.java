package demo.example.com.customarrayadapter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private AndroidFlavorAdapter flavorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Populate the androidFlavors array with AndroidFlavor objects
        AndroidFlavor[] androidFlavors = {
                new AndroidFlavor("Cupcake", "1.5", R.drawable.cupcake),
                new AndroidFlavor("Donut", "1.6", R.drawable.donut),
                new AndroidFlavor("Eclair", "2.0-2.1", R.drawable.eclair),
                new AndroidFlavor("Froyo", "2.2-2.2.3", R.drawable.froyo),
                new AndroidFlavor("GingerBread", "2.3-2.3.7", R.drawable.gingerbread),
                new AndroidFlavor("Honeycomb", "3.0-3.2.6", R.drawable.honeycomb),
                new AndroidFlavor("Ice Cream Sandwich", "4.0-4.0.4", R.drawable.icecream),
                new AndroidFlavor("Jelly Bean", "4.1-4.3.1", R.drawable.jellybean),
                new AndroidFlavor("KitKat", "4.4-4.4.4", R.drawable.kitkat),
                new AndroidFlavor("Lollipop", "5.0-5.1.1", R.drawable.lollipop)
        };

            //Instantiate a custom adapter called flavorAdapter
            flavorAdapter = new AndroidFlavorAdapter(this, Arrays.asList(androidFlavors));

            // Get a reference to the ListView, and attach the adapter to the listView.
            ListView listView = (ListView) findViewById(R.id.listview_flavor);
            listView.setAdapter(flavorAdapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
