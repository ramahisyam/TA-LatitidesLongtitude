package com.tgsiak.rizky.longtitude;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Button btn_odc,btn_Stop,btm_odp,btn_tiang;
    AlertDialog.Builder dialog;
    LayoutInflater inflater;
    View dialogView;
    EditText txt_odc,txt_file,txt_odp,txt_tiang;

    String odc,odp,file,tiang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_odc = (Button) findViewById(R.id.btn_odc);
        btm_odp = (Button) findViewById(R.id.btn_odp);
        btn_tiang = (Button) findViewById(R.id.btn_tiang);
        btn_Stop = (Button) findViewById(R.id.btn_stop);

        btn_odc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogOdc();
            }
        });
        btm_odp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogOdp();
            }
        });
        btn_tiang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogTiang();
            }
        });
        btn_Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogStop();
            }
        });
    }


    private void DialogOdc() {
        dialog = new AlertDialog.Builder(MainActivity.this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.odc, null);
        dialog.setView(dialogView);
        dialog.setCancelable(true);
        dialog.setTitle("Label ODC");

        dialog.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                odc    = txt_odc.getText().toString();
                dialog.dismiss();
            }
        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void DialogOdp() {
        dialog = new AlertDialog.Builder(MainActivity.this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.odp, null);
        dialog.setView(dialogView);
        dialog.setCancelable(true);
        dialog.setTitle("Label ODP");

        dialog.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                odp    = txt_odp.getText().toString();
                dialog.dismiss();
            }
        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void DialogTiang() {
        dialog = new AlertDialog.Builder(MainActivity.this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.tiang, null);
        dialog.setView(dialogView);
        dialog.setCancelable(true);
        dialog.setTitle("Label TIANG");

        dialog.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                tiang    = txt_tiang.getText().toString();
                dialog.dismiss();
            }
        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void DialogStop() {
        dialog = new AlertDialog.Builder(MainActivity.this);
        inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.stop, null);
        dialog.setView(dialogView);
        dialog.setCancelable(true);
        dialog.setTitle("Simpan File");

        dialog.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                file    = txt_file.getText().toString();
                dialog.dismiss();
            }
        });

        dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

}
