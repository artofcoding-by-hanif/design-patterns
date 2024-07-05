package com.artofcofing.state.abuse;

import com.artofcofing.state.SelectionTool;

public class Stopwatch {
    private State currentState = new StoppedState(this);

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    private boolean isRunning;
    public void click() {
        currentState.click();
    }
}
