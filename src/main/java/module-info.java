module com.example.officialmemorygame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.officialmemorygame to javafx.fxml;
    exports com.example.officialmemorygame;
}