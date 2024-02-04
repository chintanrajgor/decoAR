package com.example.secondar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.ar.core.Anchor;
import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.ar.sceneform.ux.TransformableNode;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.Stack;

public class Arplotter extends AppCompatActivity {


    private ArFragment arFragment;
    private ArrayList<Integer> imagesPath = new ArrayList<Integer>();
    private ArrayList<String> namesPath = new ArrayList<>();
    private ArrayList<String> modelNames = new ArrayList<>();
    AnchorNode anchorNode;
    private Button btnRemove;
//    private Button btnHome;
//    private Button btnOffice;
//    private Button btnSchool;
//    private Button btnElectronics;
//    Office o=new Office();
//    private Button btnmeetingroom;
//    private Button btnlargeconferrence;
//    private Button btncubicals;
//    private Button btnkitchen;
//    private Button btnprivatecabin;
//    private Button btnreception;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//      setContentView(R.layout.activity_main);
//        arFragment = (ArFragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
//        btnRemove = (Button)findViewById(R.id.remove);
//        getImages();
//
//        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
//
//            Anchor anchor = hitResult.createAnchor();
//
//            ModelRenderable.builder()
//                .setSource(this,Uri.parse(Common.model))
//                .build()
//                .thenAccept(modelRenderable -> addModelToScene(anchor,modelRenderable));
//
//        });
//
//
//        btnRemove.setOnClickListener(view -> removeAnchorNode(anchorNode));
//    }

//    private void getImages() {
//
//        imagesPath.add(R.drawable.table);
//        imagesPath.add(R.drawable.bookshelf);
//        imagesPath.add(R.drawable.lamp);
//        imagesPath.add(R.drawable.odltv);
//        imagesPath.add(R.drawable.clothdryer);
//        imagesPath.add(R.drawable.woodchair);
//        namesPath.add("Table");
//        namesPath.add("BookShelf");
//        namesPath.add("Lamp");
//        namesPath.add("Old Tv");
//        namesPath.add("Cloth Dryer");
//        namesPath.add("Chair");
//        modelNames.add("table.sfb");
//        modelNames.add("model.sfb");
//        modelNames.add("lamp.sfb");
//        modelNames.add("tv.sfb");
//        modelNames.add("cloth.sfb");
//        modelNames.add("woodchair.sfb");
//
//        initaiteRecyclerview();
//    }

    //Edited code
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        setContentView(R.layout.firstscreen);
//        btnHome = (Button)findViewById(R.id.Homebtn);
//        btnOffice = (Button)findViewById(R.id.Officebtn);
//        btnSchool = (Button)findViewById(R.id.Schoolbtn);
//        btnElectronics = (Button)findViewById(R.id.Electronicsbtn);
//        btnHome.setOnClickListener(view -> Home());
//        btnOffice.setOnClickListener(view -> Office());
//        btnSchool.setOnClickListener(view -> School());
//        btnElectronics.setOnClickListener(view -> Electronics());

//        System.out.println(Office.btnclick);
        setContentView(R.layout.activity_main);

        arFragment = (ArFragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
        btnRemove = (Button)findViewById(R.id.remove);
        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
            Anchor anchor = hitResult.createAnchor();
            ModelRenderable.builder()
                    .setSource(this,Uri.parse(Common.model))
                    .build()
                    .thenAccept(modelRenderable -> addModelToScene(anchor,modelRenderable));
        });
        btnRemove.setOnClickListener(view -> removeAnchorNode(anchorNode));
//        initaiteRecyclerview();
        if("Meetingroom".equalsIgnoreCase(Office.btnclick)){
            getmeeting();
        }
        else if("Custom".equalsIgnoreCase(Office.btnclick)){
            getcustom();
        }
        else if("Cafeteria".equalsIgnoreCase(Office.btnclick)){
            getcafeteria();
        }
        else if("Reception".equalsIgnoreCase(Office.btnclick)){
            getreception();
        }
        else if("Privatecabin".equalsIgnoreCase(Office.btnclick)){
            getprivatecabin();
        }
        else if("Cubicals".equalsIgnoreCase(Office.btnclick)){
            getcubicals();
        }
        else if("Bedroom".equalsIgnoreCase(Home.btnclick)){
            getbedroom();
        }
        else if("Customh".equalsIgnoreCase(Home.btnclick)){
            getcustomh();
        }
        else if("Kitchen".equalsIgnoreCase(Home.btnclick)){
            getkitchen();
        }
        else if("Hall".equalsIgnoreCase(Home.btnclick)){
            gethall();
        }
        else if("Gallery".equalsIgnoreCase(Home.btnclick)){
            getgallery();
        }
        else if("Livingroom".equalsIgnoreCase(Home.btnclick)){
            getlivingroom();
        }
        else if("Classroom".equalsIgnoreCase(School.btnclick)){
            getclassroom();
        }
        else if("Customs".equalsIgnoreCase(School.btnclick)){
            getcustoms();
        }
        else if("Library".equalsIgnoreCase(School.btnclick)){
            getlibrary();
        }
        else if("Principalcabin".equalsIgnoreCase(School.btnclick)){
            getprincipalcabin();
        }
        else if("Officeroom".equalsIgnoreCase(School.btnclick)){
            getofficeroom();
        }
        else if("Staffroom".equalsIgnoreCase(School.btnclick)){
            getstaffroom();
        }
    }
//    private void loadAr(){
//        setContentView(R.layout.activity_main);
//        arFragment = (ArFragment)getSupportFragmentManager().findFragmentById(R.id.fragment);
//        btnRemove = (Button)findViewById(R.id.remove);
//        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {
//            Anchor anchor = hitResult.createAnchor();
//            ModelRenderable.builder()
//                    .setSource(this,Uri.parse(Common.model))
//                    .build()
//                    .thenAccept(modelRenderable -> addModelToScene(anchor,modelRenderable));
//        });
//        btnRemove.setOnClickListener(view -> removeAnchorNode(anchorNode));
//    }

//    private void Office() {
//        setContentView(R.layout.office);
//        btnmeetingroom = (Button)findViewById(R.id.meetingroom);
//        btnlargeconferrence = (Button)findViewById(R.id.largeconferencerooms);
//        btnkitchen = (Button)findViewById(R.id.kitchen);
//        btncubicals = (Button)findViewById(R.id.cubicals);
//        btnprivatecabin = (Button)findViewById(R.id.privatecabin);
//        btnreception = (Button)findViewById(R.id.reception);
//
//        btnmeetingroom.setOnClickListener(view -> Meetingroom());
//        btnlargeconferrence.setOnClickListener(view -> Largeconference());
//        btnkitchen.setOnClickListener(view -> Kitchen());
//        btncubicals.setOnClickListener(view -> Cubicals());
//        btnprivatecabin.setOnClickListener(view -> Privatecabin());
//        btnreception.setOnClickListener(view -> Reception());
//
////        loadAr();
////        getOffice();
//    }
//    private void Meetingroom() {
//        loadAr();
//        getHome();
//    }
//    private void Largeconference() {
//        loadAr();
//        getOffice();
//    }
//    private void Kitchen() {
//        loadAr();
//        getHome();
//    }
//    private void Cubicals() {
//        loadAr();
//        getElectronics();
//    }
//    private void Privatecabin() {
//        loadAr();
//        getSchool();
//    }
//    private void Reception() {
//        loadAr();
//        getHome();
//    }
//
//    private void Home() {
//        loadAr();
//        getHome();
//    }
//    private void School() {
//        loadAr();
//        getSchool();
//    }
//    private void Electronics() {
//        loadAr();
//        getElectronics();
//    }

    ///////////////////////////    For Office //////////////////////////////
    private void getmeeting(){

        imagesPath.add(R.drawable.armchair);
        namesPath.add("Leather Chair");
        modelNames.add("armchair.sfb");

        imagesPath.add(R.drawable.netchair);
        namesPath.add("Broad Chair");
        modelNames.add("netchair.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Round Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        initaiteRecyclerview();


    }
    private void getcustom(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa Set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("Couch.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void getreception(){
        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("Couch.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa Set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.mismarttv);
        namesPath.add("Smart TV");
        modelNames.add("MISMARTTV.sfb");

        imagesPath.add(R.drawable.vase);
        namesPath.add("Vase");
        modelNames.add("Vase01.sfb");

        initaiteRecyclerview();
    }
    private void getcafeteria(){

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("Couch.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.mismarttv);
        namesPath.add("MI Smart TV");
        modelNames.add("MISMARTTV.sfb");

        imagesPath.add(R.drawable.toaster);
        namesPath.add("Toaster");
        modelNames.add("toaster.sfb");

        imagesPath.add(R.drawable.vase);
        namesPath.add("Vase");
        modelNames.add("Vase01.sfb");

        initaiteRecyclerview();
    }
    private void getprivatecabin(){

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.mismarttv);
        namesPath.add("MI Smart TV");
        modelNames.add("MISMARTTV.sfb");

        imagesPath.add(R.drawable.vase);
        namesPath.add("Vase");
        modelNames.add("Vase01.sfb");

        imagesPath.add(R.drawable.armchair);
        namesPath.add("Leather Chair");
        modelNames.add("armchair.sfb");

        imagesPath.add(R.drawable.netchair);
        namesPath.add("Broad Chair");
        modelNames.add("netchair.sfb");
        initaiteRecyclerview();
    }
    private void getcubicals(){
        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.vase);
        namesPath.add("Vase");
        modelNames.add("Vase01.sfb");

        imagesPath.add(R.drawable.armchair);
        namesPath.add("Leather Chair");
        modelNames.add("armchair.sfb");

        imagesPath.add(R.drawable.netchair);
        namesPath.add("Broad Chair");
        modelNames.add("netchair.sfb");

        initaiteRecyclerview();
    }
/////////////////////////////////  For Home //////////////////////////

    private void getcustomh(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa Set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("Couch.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void getbedroom(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.drawer);
        namesPath.add("Drawer");
        modelNames.add("drawer.sfb");

        imagesPath.add(R.drawable.cupboards);
        namesPath.add("Cupboards");
        modelNames.add("cupboards.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void gethall(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.drawer);
        namesPath.add("Drawer");
        modelNames.add("drawer.sfb");

        imagesPath.add(R.drawable.shoerack);
        namesPath.add("Rack");
        modelNames.add("ShoeRack.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Sqaure Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.marbletable);
        namesPath.add("Marble Table");
        modelNames.add("marbletable.sfb");

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("couch.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void getgallery(){

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");

        initaiteRecyclerview();

    }
    private void getkitchen(){
        imagesPath.add(R.drawable.toaster);
        namesPath.add("Toaster");
        modelNames.add("toaster.sfb");

        imagesPath.add(R.drawable.vase);
        namesPath.add("Vase");
        modelNames.add("Vase01.sfb");

        initaiteRecyclerview();
    }
    private void getlivingroom(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.drawer);
        namesPath.add("Drawer");
        modelNames.add("drawer.sfb");

        imagesPath.add(R.drawable.shoerack);
        namesPath.add("Rack");
        modelNames.add("ShoeRack.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Sqaure Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.marbletable);
        namesPath.add("Marble Table");
        modelNames.add("marbletable.sfb");

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("couch.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }

    ///////////////////////////////////// For School ////////////////////////////////

    private void getcustoms(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa Set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("Couch.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void getclassroom(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");


        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void getprincipalcabin(){
        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa Set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("Couch.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void getlibrary(){
        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.netchair);
        namesPath.add("Chair");
        modelNames.add("netchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa Set");
        modelNames.add("Compo.sfb");

        imagesPath.add(R.drawable.couch);
        namesPath.add("Couch");
        modelNames.add("Couch.sfb");

        imagesPath.add(R.drawable.shelf);
        namesPath.add("Shelf");
        modelNames.add("shelf.sfb");

        imagesPath.add(R.drawable.plantset);
        namesPath.add("Plantset");
        modelNames.add("Plantset.sfb");
        initaiteRecyclerview();
    }
    private void getstaffroom(){

        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        imagesPath.add(R.drawable.roundtable);
        namesPath.add("Round Table");
        modelNames.add("roundtable.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.woodchair);
        namesPath.add("Chair");
        modelNames.add("woodchair.sfb");

        imagesPath.add(R.drawable.netchair);
        namesPath.add("Chair");
        modelNames.add("netchair.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.combo);
        namesPath.add("Sofa Set");
        modelNames.add("Compo.sfb");
        initaiteRecyclerview();
    }
    private void getofficeroom(){
        imagesPath.add(R.drawable.armchair);
        namesPath.add("Leather Chair");
        modelNames.add("armchair.sfb");

        imagesPath.add(R.drawable.netchair);
        namesPath.add("Broad Chair");
        modelNames.add("netchair.sfb");

        imagesPath.add(R.drawable.table);
        namesPath.add("Round Table");
        modelNames.add("table.sfb");

        imagesPath.add(R.drawable.sqtable);
        namesPath.add("Square Table");
        modelNames.add("sqtable.sfb");

        imagesPath.add(R.drawable.laptop);
        namesPath.add("Laptop");
        modelNames.add("laptop.sfb");

        imagesPath.add(R.drawable.lamp);
        namesPath.add("Lamp");
        modelNames.add("lamp.sfb");

        initaiteRecyclerview();
    }

    private void initaiteRecyclerview() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerviewAdapter adapter = new RecyclerviewAdapter(this,namesPath,imagesPath,modelNames);
        recyclerView.setAdapter(adapter);

    }

    private void addModelToScene(Anchor anchor, ModelRenderable modelRenderable) {

        anchorNode = new AnchorNode(anchor);
        TransformableNode node = new TransformableNode(arFragment.getTransformationSystem());
        node.setParent(anchorNode);
        node.setRenderable(modelRenderable);
        arFragment.getArSceneView().getScene().addChild(anchorNode);
        node.select();
    }

    public void removeAnchorNode(AnchorNode nodeToremove) {
            arFragment.getArSceneView().getScene().removeChild(nodeToremove);
            nodeToremove.getAnchor().detach();
            nodeToremove.setParent(null);
            nodeToremove = null;
            nodeToremove.getAnchor().detach();
    }
//    private fun removeAnchorNode(nodeToRemove: AnchorNode) {
//        //Remove an Anchor node
//        arFragment.getArSceneView().getScene().removeChild(nodeToRemove);
//        nodeToRemove.getAnchor()?.detach();
//        nodeToRemove.setParent(null);
//        nodeToRemove.renderable = null
//    }

}
