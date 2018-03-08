package com.example.skovgaard.androidgeoquiz;

/**
 * Created by Skovgaard on 08-03-2018.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;


    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textRedId, boolean answerTrue) {
        mTextResId = textRedId;
        mAnswerTrue = answerTrue;
    }

}
