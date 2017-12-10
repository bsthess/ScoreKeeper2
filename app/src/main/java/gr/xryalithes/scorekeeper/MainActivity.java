package gr.xryalithes.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare key values for saving state Bundle
    public static final String GOALS_BARCA = "goalsB";
    public static final String GOALS_REAL = "goalsR";
    public static final String OFFSIDES_BARCA = "offsidesB";
    public static final String OFFSIDES_REAL = "offsidesR";
    public static final String CORNERS_BARCA = "cornersB";
    public static final String CORNERS_REAL = "cornersR";
    public static final String FOULS_BARCA = "foulsB";
    public static final String FOULS_REAL = "foulsR";

    //declare and initialize values for score and statistics integers
    int goalsBarca = 0;
    int goalsReal = 0;
    int offsidesBarca = 0;
    int offsidesReal = 0;
    int cornersBarca = 0;
    int cornersReal = 0;
    int foulsBarca = 0;
    int foulsReal = 0;

    //
    @Override
    public void onSaveInstanceState(Bundle savedData) {
        super.onSaveInstanceState(savedData);
        // Save the user's current game state...
        // Without this, the score and other values are lost when we rotate screen or other configuration change event.
        //A Bundle object saves the values and pass them to the new activity when requested.

        savedData.putInt(GOALS_BARCA, goalsBarca);
        savedData.putInt(GOALS_REAL, goalsReal);
        savedData.putInt(OFFSIDES_BARCA, offsidesBarca);
        savedData.putInt(OFFSIDES_REAL, offsidesReal);
        savedData.putInt(CORNERS_BARCA, cornersBarca);
        savedData.putInt(CORNERS_REAL, cornersReal);
        savedData.putInt(FOULS_BARCA, foulsBarca);
        savedData.putInt(FOULS_REAL, foulsReal);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Checking for previous saved data and if there are, restore them

        if (savedInstanceState != null) {
            // Restore value of members from saved state
            goalsBarca = savedInstanceState.getInt(GOALS_BARCA);
            goalsReal = savedInstanceState.getInt(GOALS_REAL);
            cornersBarca = savedInstanceState.getInt(CORNERS_BARCA);
            cornersReal = savedInstanceState.getInt(CORNERS_REAL);
            offsidesBarca = savedInstanceState.getInt(OFFSIDES_BARCA);
            offsidesReal = savedInstanceState.getInt(OFFSIDES_REAL);
            foulsBarca = savedInstanceState.getInt(FOULS_BARCA);
            foulsReal = savedInstanceState.getInt(FOULS_REAL);
        }

        //displaying the saved data

        displayGoalsBarca(goalsBarca);
        displayGoalsReal(goalsReal);
        displayCornersBarca(cornersBarca);
        displayCornersReal(cornersReal);
        displayOffsidesBarca(offsidesBarca);
        displayOffsidesReal(offsidesReal);
        displayFoulsBarca(foulsBarca);
        displayFoulsReal(foulsReal);


    }

    //adding one goal to TeamA and display the new score
    public void addGoalBarca(View v) {
        goalsBarca = goalsBarca + 1;
        displayGoalsBarca(goalsBarca);
    }

    //adding one goal to TeamB and display the new score
    public void addGoalReal(View v) {
        goalsReal = goalsReal + 1;
        displayGoalsReal(goalsReal);
    }

    //adding one corner cick to Team A and display the new score
    public void addCornerBarca(View v) {
        cornersBarca = cornersBarca + 1;
        displayCornersBarca(cornersBarca);
    }

    //adding one corner cick to Team B and display the new score
    public void addCornerReal(View v) {
        cornersReal = cornersReal + 1;
        displayCornersReal(cornersReal);
    }

    //adding one offside to Team A and display the new score
    public void addOffsideBarca(View v) {
        offsidesBarca = offsidesBarca + 1;
        displayOffsidesBarca(offsidesBarca);
    }

    //adding one offside to Team B and display the new score
    public void addOffsideReal(View v) {
        offsidesReal = offsidesReal + 1;
        displayOffsidesReal(offsidesReal);

    }

    //adding one foul to Team A and display the new score
    public void addFoulBarca(View v) {
        foulsBarca = foulsBarca + 1;
        displayFoulsBarca(foulsBarca);
    }

    //adding one foul to Team B and display the new score
    public void addFoulReal(View v) {
        foulsReal = foulsReal + 1;
        displayFoulsReal(foulsReal);
    }

    // display the new score for Team A on board and make it blinking
    public void displayGoalsBarca(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.goals_barca_text);
        scoreView.setText(String.valueOf(goals));

        //the animation proccess here

        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(80); //You can manage the time of the blink with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(6);
        scoreView.startAnimation(anim);
    }

    // display the new score for Team A on board and make it blinking
    public void displayGoalsReal(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.goals_real_text);
        scoreView.setText(String.valueOf(goals));

        //the animation proccess here

        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(80); //You can manage the time of the blink with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(6);
        scoreView.startAnimation(anim);
    }
// these methods are displaying the statistics for both teams

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
// Reset all values to zero and display all fields

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
