package com.java.inherMtd.internal;

class Film {
    private String title;
    private int duration;

    protected Film(String title, int duration) {
        System.out.println("running inside the Film CONST");
        this.title = title;
        this.duration = duration;
    }

    void setFilm(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public void play() {
        System.out.println("running inside the play method");
    }

    @Override
    public String toString() {
        return "Film{" + "title='" + title + '\'' + ", duration=" + duration + " mins}";
    }
}
