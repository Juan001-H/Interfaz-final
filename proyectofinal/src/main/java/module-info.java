module co.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens co.uniquindio.proyectofinal to javafx.fxml;
    exports co.uniquindio.proyectofinal;

    opens co.uniquindio.proyectofinal.controller;
    exports co.uniquindio.proyectofinal.controller;
}
