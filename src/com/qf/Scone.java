package com.qf;

public  class Scone {
    private int englishScore;
    private int mathScore;

    public Scone() {
    }

    public Scone(int englishScore, int mathScore) {
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    @Override
    public String toString() {
        return "Scone{" +
                "englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                '}';
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}