package com.example.secondar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Office extends AppCompatActivity {
//    private ArrayList<Integer> imagesPath = new ArrayList<Integer>();
//    private ArrayList<String> namesPath = new ArrayList<>();
//    private ArrayList<String> modelNames = new ArrayList<>();
    private Button btnmeetingroom;
    private Button btncustom;
    private Button btncubicals;
    private Button btncafeteria;
    private Button btnprivatecabin;
    private Button btnreception;
    public static String btnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.office);
        btnmeetingroom = (Button) findViewById(R.id.meetingroom);
        btncustom = (Button) findViewById(R.id.customo);
        btncafeteria = (Button) findViewById(R.id.cafeteria);
        btncubicals = (Button) findViewById(R.id.cubicals);
        btnprivatecabin = (Button) findViewById(R.id.privatecabin);
        btnreception = (Button) findViewById(R.id.reception);

        btnmeetingroom.setOnClickListener(view -> Meetingroom());
        btncustom.setOnClickListener(view -> Custom());
        btncafeteria.setOnClickListener(view -> Cafeteria());
        btncubicals.setOnClickListener(view -> Cubicals());
        btnprivatecabin.setOnClickListener(view -> Privatecabin());
        btnreception.setOnClickListener(view -> Reception());

    }
    private void Meetingroom() {
//        loadAr();
//        getOffice();
        this.btnclick="Meetingroom";
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
    private void Custom() {
//        loadAr();
        this.btnclick="Custom";
//        getOffice();
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Cafeteria() {
//        loadAr();
//        getOffice();
        this.btnclick="Cafeteria";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Cubicals() {
//        loadAr();
//        getOffice();
        this.btnclick="Cubicals";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Privatecabin() {
//        loadAr();
//        getOffice();
        this.btnclick="Privatecabin";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Reception() {
//        loadAr();
//        getOffice();
        this.btnclick="Reception";
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
