package com.pointhub;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;


import com.pointhub.EarnBillAmountActivity;
import com.pointhub.R;

/**
 * Created by Venu on 03-05-2016.
 */
public class EarnRedeem extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    //ViewPageAdapter viewPagerAdapter;

    Button earnButton,redeemButton;
    String storeName = "";
    Layout la;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.earn_redeem);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        /*viewPagerAdapter = new ViewPageAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragments(new EarnBillAmountActivity(), "EARN");
        viewPagerAdapter.addFragments(new RedeemBillAmountActivity(), "REDEEM");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);*/

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            storeName = extras.getString("storeName");
        }

        addListenerOnEarnButton();
        addListenerOnRedeemButton();

    }

    /**
     * Earn Button click listener.
     *
     */
    public void addListenerOnEarnButton() {

        //earnButton = (Button) findViewById(R.id.earnButton);
        earnButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                Intent i = new Intent(EarnRedeem.this, EarnBillAmountActivity.class);
                i.putExtra("storeName",storeName);
                startActivity(i);
            }

        });

    }

    /**
     * Earn Button click listener.
     *
     */
    public void addListenerOnRedeemButton() {

        //redeemButton = (Button) findViewById(R.id.redeemButton);

        redeemButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent i = new Intent(EarnRedeem.this, RedeemBillAmountActivity.class);
                i.putExtra("storeName",storeName);
                startActivity(i);
            }

        });
    }
}
