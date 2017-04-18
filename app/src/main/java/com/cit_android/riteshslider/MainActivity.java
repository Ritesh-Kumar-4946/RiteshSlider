package com.cit_android.riteshslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mmin18.widget.RealtimeBlurView;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {


    RealtimeBlurView blurView;
    /*SeekBar blurRadius;
    TextView blurRadiusText;*/
    TextView textView;


    private SlidingUpPanelLayout mLayout;
    private static final String TAG = "MainAcitvity";
    List<String> array_list;
    ListView listview;
    String
            pannerfind = "",
            slidevalue = "",
            PannerState = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        blurView = (RealtimeBlurView) findViewById(R.id.blur_view);
        updateRadius();

        init();            // call init method
        panelListener(); // Call paneListener method


    }

    private void updateRadius() {
        blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 0, getResources().getDisplayMetrics()));
//        blurRadiusText.setText(blurRadius.getProgress() + "dp");
    }


    public void init() {

        mLayout = (SlidingUpPanelLayout) findViewById(R.id.sliding_layout);
        textView = (TextView) findViewById(R.id.list_main);
        listview = (ListView) findViewById(R.id.list);
    }


    public List<String> array_list() {
        array_list = Arrays.asList(
                "This",
                "Is",
                "An",
                "Example",
                "ListView",
                "That",
                "You",
                "Can",
                "Scroll",
                ".",
                "It",
                "Shows",
                "How",
                "Any",
                "Scrollable",
                "View",
                "Can",
                "Be",
                "Included",
                "As",
                "A",
                "Child",
                "Of",
                "SlidingUpPanelLayout"
        );
        return array_list;
    }


    public void panelListener() {

        mLayout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                Log.e(TAG, "onPanelSlide, offset " + "slideOffset :" + "" + slideOffset);

                if (String.valueOf(slideOffset).contains("0.0")) {
                    Log.e("PannerState Slide:", "0.00");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 0, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.01")) {
//                    Log.e("PannerState Slide:", "0.02");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.02")) {
//                    Log.e("PannerState Slide:", "0.10");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.03")) {
//                    Log.e("PannerState Slide:", "0.15");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 3, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.04")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.05")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 5, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.06")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 6, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.07")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 7, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.08")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.09")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 9, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.10")) {
                    Log.e("PannerState Slide:", "0.10");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.11")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 11, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.12")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 12, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.13")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 13, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.14")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 14, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.15")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.16")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.17")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 17, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.18")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 18, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.19")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 19, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.20")) {
                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 20, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.21")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 21, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.22")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 22, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.23")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 23, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.24")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 24, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.25")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 25, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.26")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 26, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.27")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 27, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.28")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 28, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.29")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 29, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.30")) {
                    Log.e("PannerState Slide:", "0.30");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 30, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.31")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 31, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.32")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 32, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.33")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 33, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.34")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 34, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.35")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 35, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.36")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 36, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.37")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 37, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.38")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 38, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.39")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 39, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.40")) {
                    Log.e("PannerState Slide:", "0.40");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 40, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.41")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 41, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.42")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 42, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.43")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 43, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.44")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 44, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.45")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 45, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.46")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 46, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.47")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 47, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.48")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 48, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.49")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 49, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.50")) {
                    Log.e("PannerState Slide:", "0.50");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 50, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.51")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 51, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.52")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 52, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.53")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 53, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.54")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 54, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.55")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 55, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.56")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 56, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.57")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 57, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.58")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 58, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.59")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 59, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.60")) {
                    Log.e("PannerState Slide:", "0.60");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 60, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.61")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 61, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.62")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 62, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.63")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 63, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.64")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 64, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.65")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 65, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.66")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 66, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.67")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 67, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.68")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 68, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.69")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 69, getResources().getDisplayMetrics()));
                }

                if (String.valueOf(slideOffset).contains("0.70")) {
                    Log.e("PannerState Slide:", "0.70");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 70, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.71")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 71, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.72")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 72, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.73")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 73, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.74")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 74, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.75")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 75, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.76")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 76, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.77")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 77, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.78")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 78, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.79")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 79, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.80")) {
                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 80, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.81")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 81, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.82")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 82, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.83")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 83, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.84")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 84, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.85")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 85, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.86")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 86, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.87")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 87, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.88")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 88, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.89")) {
//                    Log.e("PannerState Slide:", "0.20");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 89, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.90")) {
                    Log.e("PannerState Slide:", "0.90");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 90, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.91")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 91, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.92")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 92, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.93")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 93, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.94")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 94, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.95")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 95, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.96")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 96, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.97")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 97, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.98")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 98, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("0.99")) {
//                    Log.e("PannerState Slide:", "0.80");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 99, getResources().getDisplayMetrics()));
                }
                if (String.valueOf(slideOffset).contains("1.0")) {
                    Log.e("PannerState Slide:", "1.0");
                    blurView.setBlurRadius(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics()));
                }

            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {
                Log.e(TAG, "onPanelStateChanged " + "NewState :" + "" + newState);

                pannerfind = String.valueOf(newState);
                Log.e("pannerfind Changed:", "" + pannerfind);

                if (pannerfind.equalsIgnoreCase("DRAGGING")) {
                    blurView.setVisibility(View.VISIBLE);
                }

                PannerState = String.valueOf(mLayout.getPanelState());
                Log.e("PannerState Changed:", "" + PannerState);
            }


        });


    }


    @Override
    public void onBackPressed() {
        if (mLayout != null &&
                (mLayout.getPanelState() == SlidingUpPanelLayout.PanelState.EXPANDED || mLayout.getPanelState() == SlidingUpPanelLayout.PanelState.ANCHORED)) {
            mLayout.setPanelState(SlidingUpPanelLayout.PanelState.COLLAPSED);
        } else {
            super.onBackPressed();
        }
    }


}
