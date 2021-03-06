package com.proker.androidtestgameloopgame.StatsFrames.Quest;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

import com.proker.androidtestgameloopgame.Engine.Constants;
import com.proker.androidtestgameloopgame.StatsFrames.StatsFrame;

public class QuestStatsFrame implements StatsFrame {
    private Paint paint;

    public QuestStatsFrame() {
        paint = new Paint();
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Canvas canvas) {
        paint.setColor(Color.rgb(80, 80, 80));
        canvas.drawRect(0, (int) (Constants.SCREEN_HEIGHT * 0.7), Constants.SCREEN_WIDTH, (int) (Constants.SCREEN_HEIGHT), paint);
    }

    @Override
    public void recieveTouch(MotionEvent event) {

    }
}
