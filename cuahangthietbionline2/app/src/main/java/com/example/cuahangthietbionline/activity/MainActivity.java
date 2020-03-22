package com.example.cuahangthietbionline.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
//mport android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.example.cuahangthietbionline.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerViewmanghinhchinh;
    NavigationView navigationView;
    ListView listViewmanghinhchinh;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ActionBar();

    }
    private  void ActionBar(){
      setSupportActionBar(toolbar);
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
      toolbar.setNavigationOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              drawerLayout.openDrawer(GravityCompat.START);
          }
      });
    }
    private void Anhxa(){
        toolbar =findViewById(R.id.toolbarmanghinhchinh);
        recyclerViewmanghinhchinh=findViewById(R.id.recyclerview);
        navigationView =findViewById(R.id.navigstionview);
        listViewmanghinhchinh=findViewById(R.id.listviewmanghinhchinh);
        drawerLayout =findViewById(R.id.drawerlayout);

    }



}
