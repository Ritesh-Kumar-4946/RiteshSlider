package com.cit_android.riteshslider;

import java.util.ArrayList;
import java.util.List;

/**
 * User: tobiasbuchholz
 * Date: 18.09.14 | Time: 11:02
 */

public class Meme {
    public int   mTitle;
    public int      mImageResourceId;
    public String Mname;

    public static List<Meme> createSampleMemes() {
        final List<Meme> memes = new ArrayList<Meme>();
        memes.add(new Meme(R.drawable.text_events, R.drawable.bg_events,"events"));
        memes.add(new Meme(R.drawable.text_gift, R.drawable.bg_gift,"gift"));
        memes.add(new Meme(R.drawable.text_calander, R.drawable.bg_calander,"calendar"));
        memes.add(new Meme(R.drawable.text_privilage, R.drawable.bg_privilage,"privilage"));
        memes.add(new Meme(R.drawable.text_about, R.drawable.bg_about,"about"));
        memes.add(new Meme(R.drawable.text_chat, R.drawable.bg_chat,"chat"));

        return memes;
    }
    public static List<Meme> createGift() {
        final List<Meme> memes = new ArrayList<Meme>();
        memes.add(new Meme(R.drawable.text_inner_gift1, R.drawable.bg_inner_gift1,"inner"));
        memes.add(new Meme(R.drawable.text_inner_gift2, R.drawable.bg_inner_gift2,"inner"));
        memes.add(new Meme(R.drawable.text_inner_gift3, R.drawable.bg_inner_gift3,"inner"));

        return memes;
    }

    public static List<Meme> createEvents() {
        final List<Meme> memes = new ArrayList<Meme>();
        memes.add(new Meme(R.drawable.text_inner_events1, R.drawable.bg_inner_events1,"inner"));
        memes.add(new Meme(R.drawable.text_inner_events2, R.drawable.bg_inner_events2,"inner"));
        memes.add(new Meme(R.drawable.text_inner_events3, R.drawable.bg_inner_events3,"inner"));

        return memes;
    }
    public Meme(final int title, final int imageResourceId, String Mname) {
        mTitle = title;
        mImageResourceId = imageResourceId;
        this.Mname = Mname;
    }
}
