package com.example.dell.tabdots;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;

/**
 * Created by DELL on 13-Mar-17.
 */

public class Database6 extends Fragment implements  View.OnClickListener {


    TextView t,tt;
    Button e,ee;
    ImageView imgView;
    public static int RESULT_LOAD_IMG=1;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.database6, container, false);

        t=(TextView)view.findViewById(R.id.t1);
         imgView = (ImageView)view.findViewById(R.id.imageView);

        e=(Button) view.findViewById(R.id.b1);
        ee=(Button) view.findViewById(R.id.b2);
        e.setOnClickListener(this);
        ee.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.b1:
                Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
                break;
            case R.id.b2:
                Intent galleryIntent = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                galleryIntent.setType("image/*");
                // Start the Intent
                startActivityForResult(galleryIntent, RESULT_LOAD_IMG);
                break;
            default:
                break;
        }
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            // When an Image is picked
            if (resultCode == Activity.RESULT_OK) {
                final Uri imageUri = data.getData();
                final InputStream imageStream = getActivity().getContentResolver().openInputStream(imageUri);
                final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                imgView.setImageBitmap(selectedImage);
                imgView.setBackgroundResource(R.drawable.border_grey3);
                Toast.makeText(this.getActivity(), "Image Loaded!!",Toast.LENGTH_LONG).show();

            } else {

                Toast.makeText(this.getActivity(), "You haven't picked Image",
                        Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(this.getActivity(), "Something went wrong", Toast.LENGTH_LONG)
                    .show();
        }

    }
}