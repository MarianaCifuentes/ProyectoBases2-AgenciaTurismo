package co.edu.uniquindio.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.edu.uniquindio.Modelo.App;
import co.edu.uniquindio.Modelo.Automovil;
import co.edu.uniquindio.Modelo.ReservaAutomovil;
import co.edu.uniquindio.connection.ConexionServidor;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.StringConverter;
import oracle.sql.DATE;

public class ReservasServidorController {


    @FXML
    private TableColumn<ReservaAutomovil, Integer> total_reserva;

    @FXML
    private TableColumn<ReservaAutomovil, Integer> codigo_reserva;

    @FXML
    private TableView<ReservaAutomovil> reservasTable;

    @FXML
    private TableColumn<ReservaAutomovil, Integer> id_cliente;

    @FXML
    private TableColumn<ReservaAutomovil, Date> fecha_entrega;

    @FXML
    private TableColumn<ReservaAutomovil, Date> fecha_reserva;

    private static ConexionServidor conexion  = new ConexionServidor();



    @FXML
    void initialize()
	{
         codigo_reserva.setCellValueFactory(cellData -> {
            Integer codigo = cellData.getValue().getId();
            return new SimpleObjectProperty<>(codigo);
        });
         total_reserva.setCellValueFactory(cellData -> {
            Integer valor = cellData.getValue().getValor_renta();
            return new SimpleObjectProperty<>(valor);
        });
         id_cliente.setCellValueFactory(cellData -> {
            Integer id = cellData.getValue().getIdCliente();
            return new SimpleObjectProperty<>(id);
        });
        fecha_reserva.setCellValueFactory(new PropertyValueFactory<>("fecha_reserva"));
        
        fecha_entrega.setCellValueFactory(new PropertyValueFactory<>("fecha_entrega"));

         
        llenartabla();


    }


    private void llenartabla() {

        ObservableList<ReservaAutomovil> listaReservas = FXCollections.observableArrayList();

        List<ReservaAutomovil> reservas_bd = obtenerReservasServidor();
            
        listaReservas.addAll(reservas_bd);

        reservasTable.setItems(listaReservas);


        


    }


    private List<ReservaAutomovil> obtenerReservasServidor() {
        
         List<ReservaAutomovil> reservas = new ArrayList<>();

        try (Connection connection = conexion.conectar()) {
            String query = "SELECT * FROM RESERVA_AUTOMOVIL";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                // Iterar sobre los resultados y agregarlos a la lista de personas
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    int cliente = resultSet.getInt("cliente_id");
                    int agencia = resultSet.getInt("agencia_automovil_id");
                    java.sql.Date fecha_reservaaux = resultSet.getDate("fecha_reserva");
                    java.sql.Date fecha_entregaaux = resultSet.getDate("fecha_entrega");
                    int valor_renta = resultSet.getInt("valor_renta");
                    int valor_adicional = resultSet.getInt("valor_adicional");

                    LocalDate fecha_reserva = fecha_reservaaux.toLocalDate();
                    LocalDate fecha_entrega = fecha_entregaaux.toLocalDate();

                    
                    reservas.add(new ReservaAutomovil(id,cliente,agencia, fecha_reserva, fecha_entrega, valor_renta, valor_adicional));
                }
            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Manejar la excepción de alguna manera, por ejemplo, mostrar un mensaje de error.
        }

        return reservas;
    }


    public void setAplicacion(App app) {
    }

    


    
}
