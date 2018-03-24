package com6789.example.duan.daggertest;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;

        import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Person person;
    @Inject
    Person person1;
    @Inject
    Person person2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainComponent component=DaggerMainComponent.builder().mainModule(new MainModule()).build();
        component.inject(this);
        Log.i("dagger",person1.toString()+";"+person2.toString());
    }
}
