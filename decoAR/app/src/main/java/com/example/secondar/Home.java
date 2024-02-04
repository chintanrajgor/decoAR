package com.example.secondar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    //    private ArrayList<Integer> imagesPath = new ArrayList<Integer>();
//    private ArrayList<String> namesPath = new ArrayList<>();
//    private ArrayList<String> modelNames = new ArrayList<>();
    private Button btnbedroom;
    private Button btncustomh;
    private Button btnhall;
    private Button btngallery;
    private Button btnliving;
    private Button btnkitchen;
    public static String btnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btnbedroom = (Button) findViewById(R.id.bedroom);
        btncustomh = (Button) findViewById(R.id.customh);
        btnkitchen = (Button) findViewById(R.id.kitchen);
        btnliving = (Button) findViewById(R.id.livingroom);
        btnhall = (Button) findViewById(R.id.hall);
        btngallery = (Button) findViewById(R.id.gallery);

        btnbedroom.setOnClickListener(view -> Bedroom());
        btncustomh.setOnClickListener(view -> Customh());
        btnkitchen.setOnClickListener(view -> Kitchen());
        btnliving.setOnClickListener(view -> Livingroom());
        btnhall.setOnClickListener(view -> Hall());
        btngallery.setOnClickListener(view -> Gallery());

    }
    private void Bedroom() {
//        loadAr();
//        getOffice();
        this.btnclick="Bedroom";
//        System.out.println(namesPath);
//        System.out.println(namesPath);
//        System.out.println(namesPath);
//        System.out.println(namesPath);
//        System.out.println(namesPath);
//        System.out.println(namesPath);
//        System.out.println(namesPath);
//        System.out.println(namesPath);
//        System.out.println(namesPath);
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Customh() {
//        loadAr();
        this.btnclick="Customh";
//        getOffice();
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Kitchen() {
//        loadAr();
//        getOffice();
        this.btnclick="Kitchen";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Gallery() {
//        loadAr();
//        getOffice();
        this.btnclick="Gallery";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Livingroom() {
//        loadAr();
//        getOffice();
        this.btnclick="Livingroom";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Hall() {
//        loadAr();
//        getOffice();
        this.btnclick="Hall";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
//    private void getOffice(){
//        imagesPath.add(R.drawable.lamp);
//        namesPath.add("Lamp");
//        modelNames.add("lamp.sfb");
//
//        imagesPath.add(R.drawable.table);
//        namesPath.add("Table");
//        modelNames.add("table.sfb");
//
//        imagesPath.add(R.drawable.bookshelf);
//        namesPath.add("BookShelf");
//        modelNames.add("model.sfb");
//
//        imagesPath.add(R.drawable.odltv);
//        namesPath.add("Old Tv");
//        modelNames.add("tv.sfb");
//
//        imagesPath.add(R.drawable.clothdryer);
//        namesPath.add("Cloth Dryer");
//        modelNames.add("cloth.sfb");
//
//        imagesPath.add(R.drawable.clothdryer);
//        namesPath.add("Couch");
//        modelNames.add("couch.sfb");
//
//        imagesPath.add(R.drawable.chair);
//        namesPath.add("Chair");
//        modelNames.add("chair.sfb");
//
//        imagesPath.add(R.drawable.chair);
//        namesPath.add("Ablum");
//        modelNames.add("album.sfb");
//
//        imagesPath.add(R.drawable.lamp);
//        namesPath.add("Frame");
//        modelNames.add("frameset.sfb");
//
//        imagesPath.add(R.drawable.table);
//        namesPath.add("Round Table");
//        modelNames.add("roundtable.sfb");
//
//        imagesPath.add(R.drawable.bookshelf);
//        namesPath.add("Unique Chair");
//        modelNames.add("uniquechair.sfb");
//
//        imagesPath.add(R.drawable.odltv);
//        namesPath.add("Wallclock");
//        modelNames.add("wallclock.sfb");
//
//        imagesPath.add(R.drawable.clothdryer);
//        namesPath.add("Watch");
//        modelNames.add("watch.sfb");
////        initaiteRecyclerview();
//    }


}
