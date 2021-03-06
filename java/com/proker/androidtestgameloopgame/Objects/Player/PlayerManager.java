package com.proker.androidtestgameloopgame.Objects.Player;

import android.graphics.Canvas;
import android.view.MotionEvent;

import com.proker.androidtestgameloopgame.Objects.GameObject;

import java.util.ArrayList;

public class PlayerManager implements GameObject {

    private static ArrayList<Player> players = new ArrayList<>();

    public PlayerManager(int count) {
        for (int i = 0; i <= count - 1; ++i) {
            players.add(new Player(i + 1));
        }
    }


    @Override
    public void draw(Canvas canvas) {
        for (Player player : players) {
            player.draw(canvas);
        }
    }

    @Override
    public void update() {
        for (Player player : players) {
            player.update();
        }
    }

    @Override
    public void recieveTouch(MotionEvent event) {
        for (Player player : players) {
            player.recieveTouch(event);
        }
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public static void setPlayers(ArrayList<Player> players) {
        PlayerManager.players = players;
    }

}
