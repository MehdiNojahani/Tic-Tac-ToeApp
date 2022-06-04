package com.example.tic_tac_toe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, restart_btn;
    private TextView player_turn;
    private int draw = 1;
    private int turn = 1;
    private View view;
    private String Xs = "X";
    private String Os = "O";
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        player_turn.setText(String.format("%s Player turn ", Xs));
        player_turn.setTextColor(getResources().getColor(R.color.yellow500));

        reset_Game();
        //game_Animation();
        btn_Clicked();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }

    //find view_id by fvb method
    private void init() {
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        restart_btn = findViewById(R.id.restart_game);
        player_turn = findViewById(R.id.player_turn);
        constraintLayout = findViewById(R.id.constraint_layout);

    }

    //btn clicked and set X or O
    private void btn_Clicked() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn1.setText(Xs);
                        btn1.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));
                    } else if (turn == 2) {
                        turn = 1;
                        btn1.setText(Os);
                        btn1.setTextColor(getResources().getColor(R.color.orange600));

                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn2.setText(Xs);
                        btn2.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));

                    } else if (turn == 2) {
                        turn = 1;
                        btn2.setText(Os);
                        btn2.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn3.setText(Xs);
                        btn3.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));

                    } else if (turn == 2) {
                        turn = 1;
                        btn3.setText(Os);
                        btn3.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn4.setText(Xs);
                        btn4.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));
                    } else if (turn == 2) {
                        turn = 1;
                        btn4.setText(Os);
                        btn4.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn5.setText(Xs);
                        btn5.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));
                    } else if (turn == 2) {
                        turn = 1;
                        btn5.setText(Os);
                        btn5.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn6.setText(Xs);
                        btn6.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));
                    } else if (turn == 2) {
                        turn = 1;
                        btn6.setText(Os);
                        btn6.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn7.setText(Xs);
                        btn7.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));
                    } else if (turn == 2) {
                        turn = 1;
                        btn7.setText(Os);
                        btn7.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (btn8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn8.setText(Xs);
                        btn8.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));
                    } else if (turn == 2) {
                        turn = 1;
                        btn8.setText(Os);
                        btn8.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {

                if (btn9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        btn9.setText(Xs);
                        btn9.setTextColor(getResources().getColor(R.color.yellow500));
                        player_turn.setText(String.format("%s Player turn ", Os));
                        player_turn.setTextColor(getResources().getColor(R.color.orange600));
                    } else if (turn == 2) {
                        turn = 1;
                        btn9.setText(Os);
                        btn9.setTextColor(getResources().getColor(R.color.orange600));
                        player_turn.setText(String.format("%s Player turn ", Xs));
                        player_turn.setTextColor(getResources().getColor(R.color.yellow500));
                    }
                }

                endGame();
                draw++;
                reset_Game();
            }
        });
    }

    //constraint layout animation
    private void game_Animation() {
        ValueAnimator animator = ValueAnimator.ofObject(new ArgbEvaluator(),
                ContextCompat.getColor(this, R.color.black),
                ContextCompat.getColor(this, R.color.gray400),
                ContextCompat.getColor(this, R.color.white));

        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                constraintLayout.setBackgroundColor((Integer) valueAnimator.getAnimatedValue());
            }
        });

        animator.setStartDelay(2000);
        animator.setDuration(5000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.start();
    }

    //draw or win(X or O) when button to become a triple
    private void endGame() {

        String one, two, three, four, five, six, seven, eight, nine;
        boolean isOkay = false;

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        one = btn1.getText().toString();
        two = btn2.getText().toString();
        three = btn3.getText().toString();

        four = btn4.getText().toString();
        five = btn5.getText().toString();
        six = btn6.getText().toString();

        seven = btn7.getText().toString();
        eight = btn8.getText().toString();
        nine = btn9.getText().toString();


        //row one when x wins
        if (one.equals("X") && two.equals("X") && three.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();


        }

        //row two when x wins
        if (four.equals("X") && five.equals("X") && six.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();

        }

        //row three when x wins
        if (seven.equals("X") && eight.equals("X") && nine.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();

        }

        //backslash one when x wins
        if (one.equals("X") && five.equals("X") && nine.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();

        }

        //backslash two when x wins
        if (three.equals("X") && five.equals("X") && seven.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();

        }

        //column one when x win
        if (one.equals("X") && four.equals("X") && seven.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();

        }

        //column two when x win
        if (two.equals("X") && five.equals("X") && eight.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();

        }

        //column three when x win
        if (three.equals("X") && six.equals("X") && nine.equals("X")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player X is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_x).show();

        }

        ////////////////////////////////////////////////////////////////////////////////

        //row one when o wins
        if (one.equals("O") && two.equals("O") && three.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        //row two when o wins
        if (four.equals("O") && five.equals("O") && six.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        //row three when o wins
        if (seven.equals("O") && eight.equals("O") && nine.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        //backslash one when o wins
        if (one.equals("O") && five.equals("O") && nine.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        //backslash two when o wins
        if (three.equals("O") && five.equals("O") && seven.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        //column one when x win
        if (one.equals("O") && four.equals("O") && seven.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        //column two when x win
        if (two.equals("O") && five.equals("O") && eight.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        //column three when x win
        if (three.equals("O") && six.equals("O") && nine.equals("O")) {

            isOkay = true;

            builder.setTitle("Winner!").setMessage("Player O is Win!")
                    .setIcon(R.drawable.ic_baseline_insert_emoticon_o).show();

        }

        if (isOkay) {
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

            restart_btn.setEnabled(true);


        }

        if (draw == 9 && !isOkay) {
            builder.setTitle("Draw :(").setMessage("Game is Draw...")
                    .setIcon(R.drawable.icon_draw_64).show();

            restart_btn.setVisibility(view.VISIBLE);
            reset_Game();

        }
    }

    //reset game when click restart btn
    private void reset_Game() {

        restart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                restart_btn.setVisibility(view.VISIBLE);
                finish();
            }
        });
    }
}