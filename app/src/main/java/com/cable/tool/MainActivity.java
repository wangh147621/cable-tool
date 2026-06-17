package com.cable.tool;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
public class MainActivity extends Activity{
@Override protected void onCreate(Bundle b){
super.onCreate(b);
WebView wv=new WebView(this);
WebSettings ws=wv.getSettings();
ws.setJavaScriptEnabled(true);
ws.setDomStorageEnabled(true);
ws.setAllowFileAccess(true);
wv.setWebViewClient(new WebViewClient());
wv.loadUrl("https://wangh147621.github.io/cable-tool/");
setContentView(wv);
}}
