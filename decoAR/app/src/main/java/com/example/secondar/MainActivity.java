package com.example.secondar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {


//    private ArFragment arFragment;
//    private ArrayList<Integer> imagesPath = new ArrayList<Integer>();
//    private ArrayList<String> namesPath = new ArrayList<>();
//    private ArrayList<String> modelNames = new ArrayList<>();
//    AnchorNode anchorNode;
//    private Button btnRemove;
    private Button btnHome;
    private Button btnOffice;
    private Button btnSchool;
//    private Button btnElectronics;
//
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
//        imagesPath.add(R.drawable.chair);
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
//        modelNames.add("chair.sfb");
//
//        initaiteRecyclerview();
//    }

    //Edited code
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstscreen);

        btnHome = (Button)findViewById(R.id.Homebtn);
        btnOffice = (Button)findViewById(R.id.Officebtn);
        btnSchool = (Button)findViewById(R.id.Schoolbtn);
//        btnElectronics = (Button)findViewById(R.id.Electronicsbtn);
        btnHome.setOnClickListener(view -> Home());
        btnOffice.setOnClickListener(view -> Office());
        btnSchool.setOnClickListener(view -> School());
//        btnElectronics.setOnClickListener(view -> Electronics());
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
    private void Home() {
        try {
            startActivity(new Intent(getApplicationContext(),Home.class));
        } catch ( ActivityNotFoundException e) {
            e.printStackTrace();
        }

//        loadAr();
//        getHome();
    }
    private void School() {
        startActivity(new Intent(getApplicationContext(),School.class));
//        loadAr();
//        getSchool();
    }
    private void Office() {
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
        startActivity(new Intent(getApplicationContext(),Office.class));
//        loadAr();
//        getOffice();
    }
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
//
//    private void Electronics() {
//        loadAr();
//        getElectronics();
//    }
//    private void getHome(){
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
//        imagesPath.add(R.drawable.oldtv);
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
//        imagesPath.add(R.drawable.oldtv);
//        namesPath.add("Wallclock");
//        modelNames.add("wallclock.sfb");
//
//        imagesPath.add(R.drawable.clothdryer);
//        namesPath.add("Watch");
//        modelNames.add("watch.sfb");
//        initaiteRecyclerview();
//
//
//    }
//    private void getOffice(){
//        imagesPath.add(R.drawable.chair);
//        namesPath.add("Chair");
//        modelNames.add("chair.sfb");
//        initaiteRecyclerview();
//    }
//    private void getSchool(){
//        imagesPath.add(R.drawable.table);
//        namesPath.add("Table");
//        modelNames.add("table.sfb");
//        initaiteRecyclerview();
//    }
//    private void getElectronics(){
//        imagesPath.add(R.drawable.laptop);
//        namesPath.add("Laptop");
//        modelNames.add("laptop.sfb");
//
//
//        imagesPath.add(R.drawable.mismarttv);
//        namesPath.add("MI Smart TV");
//        modelNames.add("MISMARTTV.sfb");
//        initaiteRecyclerview();
//    }
//
//    private void initaiteRecyclerview() {
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
//        recyclerView.setLayoutManager(layoutManager);
//        RecyclerviewAdapter adapter = new RecyclerviewAdapter(this,namesPath,imagesPath,modelNames);
//        recyclerView.setAdapter(adapter);
//
//    }
//
//    private void addModelToScene(Anchor anchor, ModelRenderable modelRenderable) {
//
//        anchorNode = new AnchorNode(anchor);
//        TransformableNode node = new TransformableNode(arFragment.getTransformationSystem());
//        node.setParent(anchorNode);
//        node.setRenderable(modelRenderable);
//        arFragment.getArSceneView().getScene().addChild(anchorNode);
//        node.select();
//    }
//
//    public void removeAnchorNode(AnchorNode nodeToremove) {
//        if (nodeToremove != null) {
//            arFragment.getArSceneView().getScene().removeChild(nodeToremove);
//            nodeToremove.getAnchor().detach();
//            nodeToremove.setParent(null);
//            nodeToremove = null;
//        }
//    }
}
