package com.sun.chat;

import com.sun.chat.view.login.ILoginMethod;
import com.sun.chat.view.login.LoginController;
import com.sun.chat.view.login.LoginView;
import javafx.stage.Stage;

/**
 * @author zcm
 */
public class Application extends javafx.application.Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        ILoginMethod login = new LoginController(
                (userId, userPassword) -> {System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
        });
        login.doShow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
