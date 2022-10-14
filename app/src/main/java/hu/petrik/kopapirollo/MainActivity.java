package hu.petrik.kopapirollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
    private int szamlalo1;
    private int szamlalo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ko = findViewById(R.id.ko);
        valasztas = findViewById(R.id.valasztas);
        gep = findViewById(R.id.gep);
        ember = findViewById(R.id.ember);
        computer = findViewById(R.id.computer);
        papir = findViewById(R.id.papir);
        ollo = findViewById(R.id.ollo);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas.setImageResource(R.drawable.rock);
                int veletlen = (int) (Math.random() * 3 + 1);
                if (veletlen == 1) {
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                }
                if (veletlen == 2) {
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    szamlalo2++;
                    computer.setText("Computer: " + szamlalo2);

                }
                if (veletlen == 3) {
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "A játékos nyert", Toast.LENGTH_SHORT).show();
                    szamlalo1++;
                    ember.setText("Ember: " + szamlalo1);
                }


                if (szamlalo1 ==3 || szamlalo2 ==3)
                {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    if (szamlalo1 == 3) {
                        alert.setTitle("Győzelem!");
                    }
                    else{
                        alert.setTitle("Vereség!");
                    }

                    alert.setMessage("Szeretne új játékot kezdeni?");
                    alert.setCancelable(false);

                    alert.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            szamlalo1 =0;
                            szamlalo2 =0;
                            valasztas.setImageResource(R.drawable.rock);
                            gep.setImageResource(R.drawable.rock);
                            ember.setText("Ember: 0 ");
                            computer.setText("Computer: 0");
                        }
                    });

                    alert.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            finish();
                        }
                    });
                    alert.create().show();
                }



            }
        });

        papir = findViewById(R.id.papir);
        papir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas.setImageResource(R.drawable.paper);
                int veletlen = (int) (Math.random() * 3 + 1);
                if (veletlen == 1) {
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "A játékos nyert", Toast.LENGTH_SHORT).show();
                    szamlalo1++;
                    ember.setText("Ember: " + szamlalo1);
                }
                if (veletlen == 2) {
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                }
                if (veletlen == 3) {
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    szamlalo2++;
                    computer.setText("Computer: " + szamlalo2);
                }


                if (szamlalo1 ==3 || szamlalo2 ==3)
                {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    if (szamlalo1 == 3) {
                        alert.setTitle("Győzelem!");
                    }
                    else{
                        alert.setTitle("Vereség!");
                    }

                    alert.setMessage("Szeretne új játékot kezdeni?");
                    alert.setCancelable(false);

                    alert.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            szamlalo1 =0;
                            szamlalo2 =0;
                            valasztas.setImageResource(R.drawable.rock);
                            gep.setImageResource(R.drawable.rock);
                            ember.setText("Ember: 0 ");
                            computer.setText("Computer: 0");
                        }
                    });

                    alert.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            finish();
                        }
                    });
                    alert.create().show();
                }

            }

        });
        ollo = findViewById(R.id.ollo);
        ollo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valasztas.setImageResource(R.drawable.scissors);
                int veletlen = (int) (Math.random() * 3 + 1);
                if (veletlen == 1) {
                    gep.setImageResource(R.drawable.rock);
                    Toast.makeText(MainActivity.this, "A gép nyert", Toast.LENGTH_SHORT).show();
                    szamlalo2++;
                    computer.setText("Computer: " + szamlalo2);
                }
                if (veletlen == 2) {
                    gep.setImageResource(R.drawable.paper);
                    Toast.makeText(MainActivity.this, "A játékos nyert", Toast.LENGTH_SHORT).show();
                    szamlalo1++;
                    ember.setText("Ember: " + szamlalo1 + " ");
                }
                if (veletlen == 3) {
                    gep.setImageResource(R.drawable.scissors);
                    Toast.makeText(MainActivity.this, "Döntetlen", Toast.LENGTH_SHORT).show();
                }
                if (szamlalo1 ==3 || szamlalo2 ==3)
                {
                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    if (szamlalo1 == 3) {
                        alert.setTitle("Győzelem!");
                    }
                    else{
                        alert.setTitle("Vereség!");
                    }

                    alert.setMessage("Szeretne új játékot kezdeni?");
                    alert.setCancelable(false);

                    alert.setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            szamlalo1 =0;
                            szamlalo2 =0;
                            valasztas.setImageResource(R.drawable.rock);
                            gep.setImageResource(R.drawable.rock);
                            ember.setText("Ember: 0 ");
                            computer.setText("Computer: 0");
                        }
                    });

                    alert.setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                            finish();
                        }
                    });
                    alert.create().show();
                }


            }


        });


    }
}