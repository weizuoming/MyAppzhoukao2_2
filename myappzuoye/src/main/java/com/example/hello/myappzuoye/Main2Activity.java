package com.example.hello.myappzuoye;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webView = (WebView) findViewById(R.id.web_view);

        //获取路径
        String url = getIntent().getStringExtra("url");

        webView.loadUrl(url);

        //设置
        webView.setWebViewClient(new WebViewClient());//不去跳转到浏览器


        WebSettings settings = webView.getSettings();

        settings.setJavaScriptCanOpenWindowsAutomatically(true);//s设置javascript弹窗

        settings.setJavaScriptEnabled(true);
    }
}
