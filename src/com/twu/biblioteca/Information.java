package com.twu.biblioteca;

public class Information {
    protected String name;
    protected String author;
    protected String year;
    protected boolean isCheckout = false;

    public String displayDetail() {
        String detail = this.name + "    " + this.author + "    " + this.year + "\n";
        return detail;
    }

    public boolean getIsCheckout() {
        return isCheckout;
    }

    public void setIsCheckout(boolean isCheckout) {
        this.isCheckout = isCheckout;
    }
}
