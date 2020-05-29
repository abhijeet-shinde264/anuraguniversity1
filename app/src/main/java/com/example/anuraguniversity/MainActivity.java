package com.example.anuraguniversity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout dLayout;
    ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dLayout = findViewById(R.id.drawerlayout);
        mToggle = new ActionBarDrawerToggle(MainActivity.this,dLayout,R.string.open,R.string.close);
        dLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = findViewById(R.id.nview);
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id =menuItem.getItemId();
        switch (id){
            case R.id.clubs:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.chapters:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.event:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.placment:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.inteship:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.map:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.achivements:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.developer:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(this, "Clicked:"+menuItem, Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
