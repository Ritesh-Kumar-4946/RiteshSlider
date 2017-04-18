package com.cit_android.riteshslider;


import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.sothree.slidinguppanel.SlidingUpPanelLayout;


public class MemeViewPagerItemFragment extends Fragment {
    private static final String BUNDLE_KEY_TITLE = "bundle_key_title";
    private static final String BUNDLE_KEY_IMAGE_RESOURCE_ID = "bundle_key_image_resource_id";
    private static final String BUNDLE_KEY_NAME = "bundle_key_name";
    public static boolean isFirst = false;
    public static boolean isRun = false;

    private String tag_json_obj = "jobj_req", tag_json_arry = "jarray_req";

    private ProgressDialog pDialog;

    private int mTitle;
    private int mImageResourceId;
    private String Sname;

    private SlidingUpPanelLayout mLayout;
    private LinearLayout dragView;
    private TextView titleText;
    private ImageView TVtitle;
    private ImageView backgroundImage;
    public ImageView left, right;
    private RelativeLayout reletive;


    public static MemeViewPagerItemFragment instantiateWithArgs(final Context context, final Meme meme) {
        final MemeViewPagerItemFragment fragment = (MemeViewPagerItemFragment) instantiate(context, MemeViewPagerItemFragment.class.getName());
        final Bundle args = new Bundle();
        args.putInt(BUNDLE_KEY_TITLE, meme.mTitle);
        args.putInt(BUNDLE_KEY_IMAGE_RESOURCE_ID, meme.mImageResourceId);
        args.putString(BUNDLE_KEY_NAME, meme.Mname);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initArguments();
        pDialog = new ProgressDialog(getActivity());
        pDialog.setMessage("Loading...");
        pDialog.setCancelable(false);

    }

    private void initArguments() {
        final Bundle arguments = getArguments();
        if (arguments != null) {
            mTitle = arguments.getInt(BUNDLE_KEY_TITLE);
            mImageResourceId = arguments.getInt(BUNDLE_KEY_IMAGE_RESOURCE_ID);
            Sname = arguments.getString(BUNDLE_KEY_NAME);

        }
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.meme_view_pager_item_fragment, container, false);
        initViews(view);
        return view;
    }

    private void initViews(final View view) {
        initText(view);
        initImage(view);
        initSlidingLayout(view);
//        left = (ImageView) getActivity().findViewById(R.id.moreleft);
//        right= (ImageView) getActivity().findViewById(R.id.more);
        left.setVisibility(View.GONE);
        right.setVisibility(View.GONE);
        buttonVisible();


    }

    private void initText(final View view) {

        TVtitle = (ImageView) view.findViewById(R.id.meme_view_pager_item_fragment_text);
        titleText = (TextView) view.findViewById(R.id.text_event);

        if (Sname.equalsIgnoreCase("events")) {
            TVtitle.setVisibility(View.GONE);
            titleText.setVisibility(View.VISIBLE);
//            makeJsonArryReq(Const.URL_OUTER_EVENTS);
        } else {
            TVtitle.setVisibility(View.VISIBLE);
            titleText.setVisibility(View.GONE);
            TVtitle.setImageResource(mTitle);

        }

        titleText.setBackgroundColor(0x00000000);

//
//        titleText.setText(mTitle);
//        titleText.setImageResource(mTitle);
    }

    private void initImage(final View view) {
        backgroundImage = (ImageView) view.findViewById(R.id.image);
        backgroundImage.setImageResource(mImageResourceId);
        backgroundImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonVisible();

            }
        });
    }

    public void buttonVisible() {
        left.setVisibility(View.GONE);
        right.setVisibility(View.GONE);

        if (!isRun) {
            isRun = true;
            Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    left.setVisibility(View.VISIBLE);
                    right.setVisibility(View.VISIBLE);
                    isRun = false;
                }
            }, 7000);
        } else {

        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void initSlidingLayout(View view) {
        mLayout = (SlidingUpPanelLayout) view.findViewById(R.id.sliding_layout);
        dragView = (LinearLayout) view.findViewById(R.id.dragView);

        reletive = (RelativeLayout) view.findViewById(R.id.reletive);

        dragView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(),"click",Toast.LENGTH_LONG).show();
                buttonVisible();
            }
        });

//        final Bundle bndlanimation = ActivityOptions.makeCustomAnimation(getActivity(), R.anim.slide_up, R.anim.slide_up2).toBundle();

        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fram);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                buttonVisible();
//                Toast.makeText(getActivity(),"asdfasdf",Toast.LENGTH_LONG).show();
            }
        });
        mLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(),"show click",Toast.LENGTH_LONG).show();
            }
        });


        if (Sname.equalsIgnoreCase("privilage")) {
            mLayout.setTouchEnabled(false);
        } else if (Sname.equalsIgnoreCase("inner")) {
            mLayout.setTouchEnabled(false);

        } else {
            mLayout.setTouchEnabled(true);
        }

        /*mLayout.addPanelSlideListener(new SlidingUpPanelLayout.PanelSlideListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onPanelSlide(View panel, float slideOffset) {
                buttonVisible();
                if (slideOffset > 0.20) {
                    if (!isFirst) {
                        isFirst = true;
                        if (Sname.equalsIgnoreCase("events")) {
                            Intent i = new Intent(getActivity(), EventsActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i, bndlanimation);
                        } else if (Sname.equalsIgnoreCase("gift")) {
                            Intent i = new Intent(getActivity(), GiftActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i, bndlanimation);
                        } else if (Sname.equalsIgnoreCase("calendar")) {
                            Intent i = new Intent(getActivity(), CalanderActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i, bndlanimation);
                        } else if (Sname.equalsIgnoreCase("privilage")) {
                            Intent i = new Intent(getActivity(), PrivilageActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i, bndlanimation);
                        } else if (Sname.equalsIgnoreCase("about")) {
                            Intent i = new Intent(getActivity(), UserActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i, bndlanimation);
                        } else if (Sname.equalsIgnoreCase("chat")) {
                            Intent i = new Intent(getActivity(), ChatActivity.class);
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i, bndlanimation);
                        } else if (Sname.equalsIgnoreCase("")) {
                        }
                        getActivity().finish();
                    }
                } else {
                    if (Sname.equalsIgnoreCase("events")) {
//                        calculateAndZoom();


                        if (String.valueOf(slideOffset).contains("0.02")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_events1);
                        } else if (String.valueOf(slideOffset).contains("0.05")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_events2);
                        } else if (String.valueOf(slideOffset).contains("0.08")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_events3);
                        } else if (String.valueOf(slideOffset).contains("0.12")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_events4);
//                        }else if (String.valueOf(slideOffset).contains("0.16")){
                        } else if (String.valueOf(slideOffset).contains("0.15")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_events5);
                        }
                    } else if (Sname.equalsIgnoreCase("gift")) {
                        if (String.valueOf(slideOffset).contains("0.02")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_gift1);
                        } else if (String.valueOf(slideOffset).contains("0.05")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_gift2);
                        } else if (String.valueOf(slideOffset).contains("0.08")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_gift3);

                        } else if (String.valueOf(slideOffset).contains("0.12")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_gift4);
                        } else {
//                            image.setImageResource(R.mipmap.bg_blur_gift5);
                        }
                    } else if (Sname.equalsIgnoreCase("calendar")) {
                        if (String.valueOf(slideOffset).contains("0.02")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_calander1);
                        } else if (String.valueOf(slideOffset).contains("0.05")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_calander2);
                        } else if (String.valueOf(slideOffset).contains("0.08")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_calander3);
                        } else if (String.valueOf(slideOffset).contains("0.12")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_calander4);
                        } else if (String.valueOf(slideOffset).contains("0.15")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_calander5);
                        }
                    } else if (Sname.equalsIgnoreCase("privilage")) {
                        if (String.valueOf(slideOffset).contains("0.02")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_privileges1);
                        } else if (String.valueOf(slideOffset).contains("0.05")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_privileges2);
                        } else if (String.valueOf(slideOffset).contains("0.08")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_privileges3);
                        } else if (String.valueOf(slideOffset).contains("0.12")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_privileges4);
                        } else if (String.valueOf(slideOffset).contains("0.15")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_privileges5);
                        }
                    } else if (Sname.equalsIgnoreCase("about")) {
                        if (String.valueOf(slideOffset).contains("0.02")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_about1);
                        } else if (String.valueOf(slideOffset).contains("0.05")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_about2);
                        } else if (String.valueOf(slideOffset).contains("0.08")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_about3);
                        } else if (String.valueOf(slideOffset).contains("0.12")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_about4);
                        } else if (String.valueOf(slideOffset).contains("0.15")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_about5);
                        }
                    } else if (Sname.equalsIgnoreCase("chat")) {
                        if (String.valueOf(slideOffset).contains("0.02")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_chat1);
                        } else if (String.valueOf(slideOffset).contains("0.05")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_chat2);

                        } else if (String.valueOf(slideOffset).contains("0.08")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_chat3);
                        } else if (String.valueOf(slideOffset).contains("0.12")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_chat4);
                        } else if (String.valueOf(slideOffset).contains("0.15")) {
                            backgroundImage.setImageResource(R.mipmap.bg_blur_chat5);
                        }
                    } else if (Sname.equalsIgnoreCase("")) {
                    }
                    setAlpha((1 - (slideOffset * 2)));
                    if (slideOffset == 0) {
                        buttonVisible();
                        backgroundImage.setImageResource(mImageResourceId);
                    }
                }
            }

            @Override
            public void onPanelStateChanged(View panel, SlidingUpPanelLayout.PanelState previousState, SlidingUpPanelLayout.PanelState newState) {
                backgroundImage.setVisibility(View.VISIBLE);
            }
        });*/
    }

    private void setAlpha(Float a) {
        dragView.setAlpha(a);
    }

    private void calculateAndZoom() {
        Matrix m = backgroundImage.getImageMatrix();
        RectF drawableRect = new RectF(0, 0, backgroundImage.getWidth() + 1000, backgroundImage.getHeight() + 1000);
        RectF viewRect = new RectF(0, 0, backgroundImage.getWidth(), backgroundImage.getHeight());
        m.setRectToRect(drawableRect, viewRect, Matrix.ScaleToFit.CENTER);
        backgroundImage.setImageMatrix(m);
    }


    /*private void makeJsonArryReq(String url) {
        showProgressDialog();
        JsonArrayRequest req = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
//                        msgResponse.setText(response.toString());


                        try {
                            JSONObject jsonObject = response.getJSONObject(0);
                            String content = jsonObject.getString("outerContent");
//                            String dis = MyUtills.HTMLHead +content+ "</html>";
//                            titleText.loadData(dis, "text/html", null);

                            titleText.setText(content);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                        hideProgressDialog();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                hideProgressDialog();
            }
        });

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(req,
                tag_json_arry);

        // Cancelling request
        // ApplicationController.getInstance().getRequestQueue().cancelAll(tag_json_arry);
    }*/


    private void showProgressDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hideProgressDialog() {
        if (pDialog.isShowing())
            pDialog.hide();
    }
}
