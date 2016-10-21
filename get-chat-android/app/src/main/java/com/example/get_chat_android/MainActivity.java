package com.example.get_chat_android;

import android.content.Intent;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button b2 = (Button) findViewById(R.id.btRegistraion);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
            }
        });

        buildObservable()
                .doOnNext(new Action1<News>() {
                    @Override
                    public void call(News news) {
                        Log.i("MainActivity", "title:" + news.title + ", text:" + news.text);
                    }
                }).subscribe();


    }

    Observable<News> buildObservable() {


        return Observable.create(new Observable.OnSubscribe<News>() {
            @Override
            public void call(Subscriber<? super News> subscriber) {
                News news = new News("TItle", "Text news");
                subscriber.onNext(news);
                subscriber.onCompleted();
            }
        });
    }
}