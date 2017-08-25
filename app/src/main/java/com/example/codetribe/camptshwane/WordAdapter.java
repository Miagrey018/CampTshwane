package com.example.codetribe.camptshwane;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by codetribe on 7/12/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    Context context;

    public WordAdapter(Context context, ArrayList<Word> words){
        super(context,0,words);
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being refused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,parent,false);
        }

        Word currentWord = getItem(position);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        TextView webView = (TextView) listItemView.findViewById(R.id.default_text_views);


        ImageView imageView =(ImageView) listItemView.findViewById(R.id.image);
        imageView.setTag(position);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int pos = (Integer) v.getTag();

                Word currentWord = getItem(pos);
                Log.i("Ygritte",currentWord.getmURL());

                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentWord.getmURL()));
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(context, "No application can handle this request." + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResource());

            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;

    }

}
