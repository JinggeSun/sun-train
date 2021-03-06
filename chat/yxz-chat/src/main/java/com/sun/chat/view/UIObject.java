package com.sun.chat.view;

import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Arrays;

public abstract class UIObject extends Stage {

    protected Parent root;
    private double xOffset;
    private double yOffset;

    public  <T> T $(String id, Class<T> clazz) {
        return (T) root.lookup("#" + id);
    }

    public void clearViewListSelectedAll(ListView<Pane>... listViews) {
        Arrays.stream(listViews).forEach(paneListView -> {
            paneListView.getSelectionModel().clearSelection();
        });
    }

    public void move() {
        root.setOnMousePressed(event -> {xOffset = getX() - event.getScreenX();
            yOffset = getY()- event.getScreenY();
            root.setCursor(Cursor.CLOSED_HAND);
        });
        root.setOnMouseDragged(event -> {setX(event.getScreenX() + xOffset);
            setY(event.getScreenY() + yOffset);});
        root.setOnMouseReleased(event -> {root.setCursor(Cursor.DEFAULT);
        });}

    // 初始化页面
    public abstract void initView();

    // 初始化事件定义
    public abstract void initEventDefine();
}
