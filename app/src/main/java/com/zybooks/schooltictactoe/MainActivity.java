package com.zybooks.schooltictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn1row1, btn2row1, btn3row1, btn1row2, btn2row2, btn3row2, btn1row3, btn2row3, btn3row3;

    private boolean b1r1 = false;
    private boolean b2r1 = false;
    private boolean b3r1 = false;
    private boolean b1r2 = false;
    private boolean b2r2 = false;
    private boolean b3r2 = false;
    private boolean b1r3 = false;
    private boolean b2r3 = false;
    private boolean b3r3 = false;

    private int check_b1r1 = 0;
    private int check_b2r1 = 0;
    private int check_b3r1 = 0;
    private int check_b1r2 = 0;
    private int check_b2r2 = 0;
    private int check_b3r2 = 0;
    private int check_b1r3 = 0;
    private int check_b2r3 = 0;
    private int check_b3r3 = 0;

    private final String GAME_STATE = "gameState";

    private TicTacToe mGame;
    private GridLayout mBoxGrid;
    private int mBoxOnSelected;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1row1 = (ImageButton) findViewById(R.id.btn1row1);
        btn2row1 = (ImageButton) findViewById(R.id.btn2row1);
        btn3row1 = (ImageButton) findViewById(R.id.btn3row1);
        btn1row2 = (ImageButton) findViewById(R.id.btn1row2);
        btn2row2 = (ImageButton) findViewById(R.id.btn2row2);
        btn3row2 = (ImageButton) findViewById(R.id.btn3row2);
        btn1row3 = (ImageButton) findViewById(R.id.btn1row3);
        btn2row3 = (ImageButton) findViewById(R.id.btn2row3);
        btn3row3 = (ImageButton) findViewById(R.id.btn3row3);

        mBoxGrid = findViewById(R.id.box_grid);

        mBoxOnSelected = ContextCompat.getColor(this, R.color.white);

        count=1;

        mGame = new TicTacToe();

        if (savedInstanceState == null) {
            startGame();
        }
        else {
            String gameState = savedInstanceState.getString(GAME_STATE);
            mGame.setState(gameState);
            setButtonPicturesFirst();
        }

        btn1row1.setOnClickListener(arg0 -> {
            if (count == 1 && !b1r1) {
                count = 2;
                btn1row1.setBackgroundResource(R.drawable.nighthawk_button);
                b1r1 = true;
                check_b1r1 = 1;
                isGameOver();
            } else if (count == 2 && !b1r1) {
                count = 1;
                btn1row1.setBackgroundResource(R.drawable.building_button);
                b1r1 = true;
                check_b1r1 = 2;
                isGameOver();
            }
        });
        btn1row2.setOnClickListener(arg0 -> {
            if (count == 1 && !b1r2) {
                count = 2;
                btn1row2.setBackgroundResource(R.drawable.nighthawk_button);
                b1r2 = true;
                check_b1r2 = 1;
                isGameOver();
            } else if (count == 2 && !b1r2) {
                count = 1;
                btn1row2.setBackgroundResource(R.drawable.building_button);
                b1r2 = true;
                check_b1r2 = 2;
                isGameOver();
            }
        });
        btn1row3.setOnClickListener(arg0 -> {
            if (count == 1 && !b1r3) {
                count = 2;
                btn1row3.setBackgroundResource(R.drawable.nighthawk_button);
                b1r3 = true;
                check_b1r3 = 1;
                isGameOver();
            } else if (count == 2 && !b1r3) {
                count = 1;
                btn1row3.setBackgroundResource(R.drawable.building_button);
                b1r3 = true;
                check_b1r3 = 2;
                isGameOver();
            }
        });
        btn2row1.setOnClickListener(arg0 -> {
            if (count == 1 && !b2r1) {
                count = 2;
                btn2row1.setBackgroundResource(R.drawable.nighthawk_button);
                b2r1 = true;
                check_b2r1 = 1;
                isGameOver();
            } else if (count == 2 && !b2r1) {
                count = 1;
                btn2row1.setBackgroundResource(R.drawable.building_button);
                b2r1 = true;
                check_b2r1 = 2;
                isGameOver();
            }
        });
        btn2row2.setOnClickListener(arg0 -> {
            if (count == 1 && !b2r2) {
                count = 2;
                btn2row2.setBackgroundResource(R.drawable.nighthawk_button);
                b2r2 = true;
                check_b2r2 = 1;
                isGameOver();
            } else if (count == 2 && !b2r2) {
                count = 1;
                btn2row2.setBackgroundResource(R.drawable.building_button);
                b2r2 = true;
                check_b2r2 = 2;
                isGameOver();
            }
        });
        btn2row3.setOnClickListener(arg0 -> {
            if (count == 1 && !b2r3) {
                count = 2;
                btn2row3.setBackgroundResource(R.drawable.nighthawk_button);
                b2r3 = true;
                check_b2r3 = 1;
                isGameOver();
            } else if (count == 2 && !b2r3) {
                count = 1;
                btn2row3.setBackgroundResource(R.drawable.building_button);
                b2r3 = true;
                check_b2r3 = 2;
                isGameOver();
            }
        });
        btn3row1.setOnClickListener(arg0 -> {
            if (count == 1 && !b3r1) {
                count = 2;
                btn3row1.setBackgroundResource(R.drawable.nighthawk_button);
                b3r1 = true;
                check_b3r1 = 1;
                isGameOver();
            } else if (count == 2 && !b3r1) {
                count = 1;
                btn3row1.setBackgroundResource(R.drawable.building_button);
                b3r1 = true;
                check_b3r1 = 2;
                isGameOver();
            }
        });
        btn3row2.setOnClickListener(arg0 -> {
            if (count == 1 && !b3r2) {
                count = 2;
                btn3row2.setBackgroundResource(R.drawable.nighthawk_button);
                b3r2 = true;
                check_b3r2 = 1;
                isGameOver();
            } else if (count == 2 && !b3r2) {
                count = 1;
                btn3row2.setBackgroundResource(R.drawable.building_button);
                b3r2 = true;
                check_b3r2 = 2;
                isGameOver();
            }
        });
        btn3row3.setOnClickListener(arg0 -> {
            if (count == 1 && !b3r3) {
                count = 2;
                btn3row3.setBackgroundResource(R.drawable.nighthawk_button);
                b3r3 = true;
                check_b3r3 = 1;
                isGameOver();
            } else if (count == 2 && !b3r3) {
                count = 1;
                btn3row3.setBackgroundResource(R.drawable.building_button);
                b3r3 = true;
                check_b3r3 = 2;
                isGameOver();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(GAME_STATE, mGame.getState());
    }

    public void onHelpClick(View view) {
        Intent intent = new Intent(this, HelpActivity.class);
        startActivity(intent);
    }

    private void startGame() {
        mGame.newGame();
        setButtonPicturesFirst();
    }

    public void isGameOver(){
        if ((check_b1r1 == 1) && (check_b2r1 == 1) && (check_b3r1 == 1)){
            gameOverPlayer1();
        }
        if ((check_b1r2 == 1) && (check_b2r2 == 1) && (check_b3r2 == 1)){
            gameOverPlayer1();
        }
        if ((check_b1r3 == 1) && (check_b2r3 == 1) && (check_b3r3 == 1)){
            gameOverPlayer1();
        }

        // Down
        if ((check_b1r1 == 1) && (check_b1r2 == 1) && (check_b1r3 == 1)){
            gameOverPlayer1();
        }
        if ((check_b2r1 == 1) && (check_b2r2 == 1) && (check_b2r3 == 1)){
            gameOverPlayer1();
        }
        if ((check_b3r1 == 1) && (check_b3r2 == 1) && (check_b3r3 == 1)){
            gameOverPlayer1();
        }

        // Diagonal
        if ((check_b1r1 == 1) && (check_b2r2 == 1) && (check_b3r3 == 1)){
            gameOverPlayer1();
        }
        if ((check_b3r1 == 1) && (check_b2r2 == 1) && (check_b1r3 == 1)){
            gameOverPlayer1();
        }



        // Across
        if ((check_b1r1 == 2) && (check_b2r1 == 2) && (check_b3r1 == 2)){
            gameOverPlayer2();
        }
        if ((check_b1r2 == 2) && (check_b2r2 == 2) && (check_b3r2 == 2)){
            gameOverPlayer2();
        }
        if ((check_b1r3 == 2) && (check_b2r3 == 2) && (check_b3r3 == 2)){
            gameOverPlayer2();
        }

        // Down
        if ((check_b1r1 == 2) && (check_b1r2 == 2) && (check_b1r3 == 2)){
            gameOverPlayer2();
        }
        if ((check_b2r1 == 2) && (check_b2r2 == 2) && (check_b2r3 == 2)){
            gameOverPlayer2();
        }
        if ((check_b3r1 == 2) && (check_b3r2 == 2) && (check_b3r3 == 2)){
            gameOverPlayer2();
        }

        // Diagonal
        if ((check_b1r1 == 2) && (check_b2r2 == 2) && (check_b3r3 == 2)){
            gameOverPlayer2();
        }
        if ((check_b3r1 == 2) && (check_b2r2 == 2) && (check_b1r3 == 2)){
            gameOverPlayer2();
        }
    }

    public void gameOverPlayer1() {
        Toast.makeText(this, R.string.player1, Toast.LENGTH_SHORT).show();

        b1r1 = true;
        b2r1 = true;
        b3r1 = true;
        b1r2 = true;
        b2r2 = true;
        b3r2 = true;
        b1r3 = true;
        b2r3 = true;
        b3r3 = true;
    }
    public void gameOverPlayer2() {
        Toast.makeText(this, R.string.player2, Toast.LENGTH_SHORT).show();

        b1r1 = true;
        b2r1 = true;
        b3r1 = true;
        b1r2 = true;
        b2r2 = true;
        b3r2 = true;
        b1r3 = true;
        b2r3 = true;
        b3r3 = true;
    }

    /*public void onLightButtonClick(View view) {
        // Find the button's row and col
        int buttonIndex = mBoxGrid.indexOfChild(view);
        int row = buttonIndex / TicTacToe.GRID_SIZE;
        int col = buttonIndex % TicTacToe.GRID_SIZE;

        mGame.selectBox(row, col);
    }*/

    private void setButtonPicturesFirst() {
        for (int row = 0; row < TicTacToe.GRID_SIZE; row++) {
            for (int col = 0; col < TicTacToe.GRID_SIZE; col++) {

                // Find the button in the grid layout at this row and col
                int buttonIndex = row * TicTacToe.GRID_SIZE + col;
                ImageButton gridButton = (ImageButton) mBoxGrid.getChildAt(buttonIndex);

                gridButton.setBackgroundColor(mBoxOnSelected);
            }
        }
    }

    public void onNewGameClick(View view) {
        //startGame();
        b1r1 = false;
        b2r1 = false;
        b3r1 = false;
        b1r2 = false;
        b2r2 = false;
        b3r2 = false;
        b1r3 = false;
        b2r3 = false;
        b3r3 = false;

        check_b1r1 = 0;
        check_b2r1 = 0;
        check_b3r1 = 0;
        check_b1r2 = 0;
        check_b2r2 = 0;
        check_b3r2 = 0;
        check_b1r3 = 0;
        check_b2r3 = 0;
        check_b3r3 = 0;

        count = 1;

        setButtonPicturesFirst();
    }
}