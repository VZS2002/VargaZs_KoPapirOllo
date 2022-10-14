package hu.petrik.kopapirollo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button ko;
    private Button papir;
    private Button ollo;
    private ImageView valasztas;
    private ImageView gep;
    private TextView ember;
    private TextView computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ko = findViewById(R.id.ko);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas.setImageResource(R.drawable.rock);
                int veletlen = (int)(Math.random()*3+1);
                if (veletlen ==1)
                {
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                }
                if (veletlen ==2)
                {
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    
                }
                if (veletlen ==1)
                {
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "A játékos nyert", Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button papir = findViewById(R.id.papir);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas.setImageResource(R.drawable.paper);
                int veletlen = (int)(Math.random()*3+1);
                if (veletlen ==1)
                {
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "A játékos nyert", Toast.LENGTH_SHORT).show();
                }
                if (veletlen ==2)
                {
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                }
                if (veletlen ==1)
                {
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button ollo = findViewById(R.id.ollo);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas.setImageResource(R.drawable.scissors);
                int veletlen = (int)(Math.random()*3+1);
                if (veletlen ==1)
                {
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                }
                if (veletlen ==2)
                {
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A játékos nyert", Toast.LENGTH_SHORT).show();
                }
                if (veletlen ==1)
                {
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}