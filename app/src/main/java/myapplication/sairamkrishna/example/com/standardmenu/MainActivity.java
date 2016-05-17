package myapplication.sairamkrishna.example.com.standardmenu;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater  menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu); //inflateaj mi xml u objekt menu

        return true; //ja sam obavio svoj posao
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int item_id = item.getItemId();
        switch (item_id) {
            case R.id.action_add:
                Toast.makeText(MainActivity.this, R.string.add, Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_delete:
                Toast.makeText(MainActivity.this, R.string.delete, Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_edit:
                Toast.makeText(MainActivity.this, R.string.edit, Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_hide:
                showHide(null);
                break;
        }

        return true;
    }

    public void showHide(View view) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar.isShowing()) {
            actionBar.hide();
        } else {
            actionBar.show();
        }
    }
}
