package net.vrgsoft.videocrop;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;

import androidx.appcompat.app.AppCompatActivity;

import net.vrgsoft.videcrop.VideoCropActivity;


public class MainActivity extends AppCompatActivity {
    private static final int CROP_REQUEST = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        /storage/self/primary/DCIM/Camera/20180201_155445.mp4

        String inputPath = Environment.getExternalStorageDirectory() + "20180201_155445.mp4" ;
        String outputPath = "/storage/emulated/0/YDXJ08599.mp4";
        startActivityForResult(VideoCropActivity.createIntent(this, inputPath, outputPath), CROP_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CROP_REQUEST && resultCode == RESULT_OK) {
            //crop successful
        }
    }
}
