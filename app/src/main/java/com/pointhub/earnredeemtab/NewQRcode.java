package com.pointhub.earnredeemtab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.pointhub.PointListActivity;
import com.pointhub.R;

public class NewQRcode extends AppCompatActivity  {

    Button points;
    ImageView share;
    private static final int PERMISSION_REQUEST_CAMERA = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.qrcode);
        points = (Button) findViewById(R.id.pointsbutton);

        share = (ImageView) findViewById(R.id.share);
        //share.setBackgroundResource(R.drawable.whatsappicon);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 /* Intent intent = new Intent();
                intent.setAction(android.content.Intent.ACTION_SEND);
                intent.putExtra(android.content.Intent.EXTRA_TEXT, "");
                intent.setPackage("com.whatsapp");
                intent.setType("text/plain");
                startActivity(intent);
                */

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("image/jpg");
                String imagePath = "http://www.ijaitra.com/womenswear/kurtis/image2/image2a.jpg";
                //File imagefiletoshare = new File(imagePath);
                //Uri uri = Uri.fromFile(imagefiletoshare);
                //sharingIntent.putExtra(Intent.EXTRA_STREAM, uri);
                // Uri screenshotUri = Uri.parse("http://www.ijaitra.com/womenswear/kurtis/image2/image2f.jpg");
                //  sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
                startActivity(Intent.createChooser(sharingIntent, "Share image using"));


            }
        });
        points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(NewQRcode.this, com.pointhub.db.Createdb.class);
                startActivity(i);

            }
        });


    }


}


