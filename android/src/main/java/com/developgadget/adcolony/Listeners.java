package com.developgadget.adcolony;

import android.util.Log;

import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;

public class Listeners extends AdColonyInterstitialListener implements AdColonyRewardListener {



    @Override
    public void onRequestFilled(AdColonyInterstitial adColonyInterstitial){
        AdcolonyPlugin.Ad.add(adColonyInterstitial);
        Log.i("AdColony", "onRequestFilled");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onRequestFilled" , adColonyInterstitial.getZoneID());
    }

    public void onRequestNotFilled(AdColonyZone adColonyInterstitial) {
        Log.i("AdColony", "onRequestNotFilled");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onRequestNotFilled" , adColonyInterstitial.getZoneID());
    }

    public void onOpened(AdColonyInterstitial ad) {
        Log.i("AdColony", "onOpened");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onOpened" , ad.getZoneID());
    }

    public void onClosed(AdColonyInterstitial ad) {
        Log.i("AdColony", "onClosed");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onClosed" , ad.getZoneID());
    }

    public void onIAPEvent(AdColonyInterstitial ad, String product_id, int engagement_type) {
        Log.i("AdColony", "onIAPEvent");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onIAPEvent" , ad.getZoneID());
    }

    public void onExpiring(AdColonyInterstitial ad) {
        Log.i("AdColony", "onExpiring");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onExpiring" , ad.getZoneID());
    }

    public void onLeftApplication(AdColonyInterstitial ad) {
        Log.i("AdColony", "onLeftApplication");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onLeftApplication" , ad.getZoneID());
    }

    public void onClicked(AdColonyInterstitial ad) {
        Log.i("AdColony", "onClicked");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onClicked" , ad.getZoneID());
    }

    @Override
    public void onReward(AdColonyReward adColonyReward) {
        Log.i("AdColony", "onReward");
        AdcolonyPlugin.getInstance().OnMethodCallHandler("onReward" , adColonyReward.getZoneID());
    }

}
