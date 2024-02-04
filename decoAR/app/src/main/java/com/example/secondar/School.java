package com.example.secondar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class School extends AppCompatActivity {
    //    private ArrayList<Integer> imagesPath = new ArrayList<Integer>();
//    private ArrayList<String> namesPath = new ArrayList<>();
//    private ArrayList<String> modelNames = new ArrayList<>();
    private Button btnclassroom;
    private Button btnstaffroom;
    private Button btnofficeroom;
    private Button btnprincipalcabin;
    private Button btnlibrary;
    private Button btncustoms;
    public static String btnclick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.school);
        btnclassroom = (Button) findViewById(R.id.classroom);
        btncustoms = (Button) findViewById(R.id.customs);
        btnstaffroom = (Button) findViewById(R.id.staffroom);
        btnofficeroom = (Button) findViewById(R.id.office);
        btnprincipalcabin = (Button) findViewById(R.id.principaloffice);
        btnlibrary = (Button) findViewById(R.id.library);

        btnclassroom.setOnClickListener(view -> Classroom());
        btncustoms.setOnClickListener(view -> Customs());
        btnstaffroom.setOnClickListener(view -> Staffroom());
        btnofficeroom.setOnClickListener(view -> Officeroom());
        btnprincipalcabin.setOnClickListener(view -> Principalcabin());
        btnlibrary.setOnClickListener(view -> Library());

    }
    private void Classroom() {
//        loadAr();
//        getOffice();
        this.btnclick="Classroom";
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
    private void Customs() {
//        loadAr();
        this.btnclick="Customs";
//        getOffice();
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Staffroom() {
//        loadAr();
//        getOffice();
        this.btnclick="Staffroom";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Officeroom() {
//        loadAr();
//        getOffice();
        this.btnclick="Officeroom";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Principalcabin() {
//        loadAr();
//        getOffice();
        this.btnclick="Principalcabin";
        startActivity(new Intent(getApplicationContext(),Arplotter.class));
    }
    private void Library() {
//        loadAr();
//        getOffice();
        this.btnclick="Library";
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
