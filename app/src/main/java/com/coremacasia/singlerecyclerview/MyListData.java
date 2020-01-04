package com.coremacasia.singlerecyclerview;

class MyListData {
    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }

    public int getType() {
        return type;
    }

    private final String description;
    private final int icon;
    private final int type;

    public MyListData(String description, int icon, int type) {

        this.description = description;
        this.icon = icon;
        this.type = type;
    }
}
