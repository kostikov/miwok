package com.example.android.miwok;


import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public MediaPlayer mediaPlayer;
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColorResourceId = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }

        final Word currentWord = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageViewPicture);

        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResource());
            imageView.setBackgroundResource(R.color.image_background);
        } else {
            imageView.setVisibility(View.GONE);
        }


        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.backgroundWords);
        linearLayout.setBackgroundResource(mColorResourceId);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textViewMiwokTranslation);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.textViewDefaultTranslation);
        defaultTextView.setText(currentWord.getDefaultTranslation());


        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer = MediaPlayer.create(getContext(), currentWord.getAudioResourceID());
                mediaPlayer.start();
            }
        });

        return listItemView;

    }


}

