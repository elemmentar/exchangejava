package com.example.exchange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumberDecimal;
    TextView textView;
    Button eur1,dol,ron1,leu;
    Button leu1,dol1,eur,ron;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        textView=findViewById(R.id.textView);
        eur1=findViewById(R.id.eur1);
        dol=findViewById(R.id.dol);
        leu1=findViewById(R.id.leu1);
        ron1=findViewById(R.id.ron1);
        leu=findViewById(R.id.leu);
        dol1=findViewById(R.id.dol1);
        eur=findViewById(R.id.eur);
        ron=findViewById(R.id.ron);
        leu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                    if (leu.isClickable())
                        leu.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                float num=Float.parseFloat(editTextNumberDecimal.getText().toString());
                                float rez=num*1;
                                textView.setText(String.valueOf(rez));
                            }
                        });
                    if(dol.isClickable())
                        dol.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                                float rez=num*0.06f;


                                textView.setText(String.valueOf(rez));
                            }
                        });

                   if (eur1.isClickable())
                   eur1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                           float rez=num*(0.05f);
                           textView.setText(String.valueOf(rez));
                       }
                   });



                   if (ron1.isClickable())
                   ron1.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {
                           float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                           float rez=num*0.23f;
                           textView.setText(String.valueOf(rez));
                       }

                   });
                   if(leu.isClickable())
                       leu.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View v) {
                               float num=Float.parseFloat(editTextNumberDecimal.getText().toString());
                               float rez=num;
                               textView.setText(String.valueOf(rez));
                           }
                       });








                }
            }
        });

        dol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eur1.isClickable())
                    eur1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*(0.82f);
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if(dol.isClickable())
                    dol.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num;
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (ron1.isClickable())
                    ron1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*4.05f;
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (leu.isClickable())
                    
                    leu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*17.69f;
                            textView.setText(String.valueOf(rez));
                        }

                    });

            }
        });

        eur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eur1.isClickable())
                    eur1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num;
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (dol.isClickable())
                    dol.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*(1.22f);
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (ron1.isClickable())
                    ron1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*(4.92f);
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (leu.isClickable())
                    leu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*(21.52f);
                            textView.setText(String.valueOf(rez));
                        }
                    });
            }
        });

        ron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eur1.isClickable())
                    eur1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*(0.20f);
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (dol.isClickable())
                    dol.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*(0.25f);
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (ron1.isClickable())
                    ron1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num;
                            textView.setText(String.valueOf(rez));
                        }
                    });
                if (leu.isClickable())
                    leu.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            float num = Float.parseFloat(editTextNumberDecimal.getText().toString());
                            float rez=num*(4.37f);
                            textView.setText(String.valueOf(rez));
                        }
                    });
            }
        });




    }


}