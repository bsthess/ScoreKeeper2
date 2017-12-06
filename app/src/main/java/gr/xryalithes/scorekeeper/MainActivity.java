package gr.xryalithes.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsBarca = 0;
    int goalsReal = 0;
    int offsidesBarca = 0;
    int offsidesReal = 0;
    int cornersBarca = 0;
    int cornersReal = 0;
    int foulsBarca = 0;
    int foulsReal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalBarca(View v) {
        goalsBarca = goalsBarca + 1;
        displayGoalsBarca(goalsBarca);
    }

    public void addGoalReal(View v) {
        goalsReal = goalsReal + 1;
        displayGoalsReal(goalsReal);
    }


    public void addCornerBarca(View v) {
        cornersBarca = cornersBarca + 1;
        displayCornersBarca(cornersBarca);
    }

    public void addCornerReal(View v) {
        cornersReal = cornersReal + 1;
        displayCornersReal(cornersReal);
    }

    public void addOffsideBarca(View v) {
        offsidesBarca = offsidesBarca + 1;
        displayOffsidesBarca(offsidesBarca);
    }

    public void addOffsideReal(View v) {
        offsidesReal = offsidesReal + 1;
        displayOffsidesReal(offsidesReal);

    }

    public void addFoulBarca(View v) {
        foulsBarca = foulsBarca + 1;
        displayFoulsBarca(foulsBarca);
    }

    public void addFoulReal(View v) {
        foulsReal = foulsReal + 1;
        displayFoulsReal(foulsReal);
    }

    public void displayGoalsBarca(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.goals_barca_text);
        scoreView.setText(String.valueOf(goals));
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(80); //You can manage the time of the blink with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(6);
        scoreView.startAnimation(anim);
    }

    public void displayGoalsReal(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.goals_real_text);
        scoreView.setText(String.valueOf(goals));
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(80); //You can manage the time of the blink with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(6);
        scoreView.startAnimation(anim);
    }

    public void displayCornersBarca(int corners) {
        TextView scoreView = (TextView) findViewById(R.id.corners_barca_text);
        scoreView.setText(String.valueOf(corners));
    }

    public void displayCornersReal(int corners) {
        TextView scoreView = (TextView) findViewById(R.id.corners_real_text);
        scoreView.setText(String.valueOf(corners));
    }

    public void displayOffsidesBarca(int offsides) {
        TextView scoreView = (TextView) findViewById(R.id.offsides_barca_text);
        scoreView.setText(String.valueOf(offsides));
    }

    public void displayOffsidesReal(int offsides) {
        TextView scoreView = (TextView) findViewById(R.id.offsides_real_text);
        scoreView.setText(String.valueOf(offsides));
    }

    public void displayFoulsBarca(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_barca_text);
        scoreView.setText(String.valueOf(fouls));
    }

    public void displayFoulsReal(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_real_text);
        scoreView.setText(String.valueOf(fouls));
    }

    public void resetAll(View v) {
        goalsBarca = 0;
        goalsReal = 0;
        cornersReal = 0;
        cornersBarca = 0;
        offsidesReal = 0;
        offsidesBarca = 0;
        foulsBarca = 0;
        foulsReal = 0;
        displayGoalsBarca(goalsBarca);
        displayGoalsReal(goalsReal);
        displayCornersBarca(cornersBarca);
        displayCornersReal(cornersReal);
        displayOffsidesBarca(offsidesBarca);
        displayOffsidesReal(offsidesReal);
        displayFoulsBarca(foulsBarca);
        displayFoulsReal(foulsReal);
    }


}
