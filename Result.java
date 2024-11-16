package com.org.dl.bo;

public enum Result {
    PASS("pass"),
    FAIL("fail");
    private String title;

    Result(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
