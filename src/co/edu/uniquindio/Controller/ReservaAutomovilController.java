package co.edu.uniquindio.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import application.Main;
import co.edu.uniquindio.model.Automovil;
import co.edu.uniquindio.model.ReservaAutomovil;
import co.edu.uniquindio.connection.ConexionCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.StringConverter;


public class ReservaAutomovilController {


     @FXML
    private DatePicker fechaEntregaDate;

    @FXML
    private ComboBox<String> servicioAdicionalCmb;

    @FXML
    private ComboBox<Automovil> automovilcmb;

    @FXML
    private TextField tipotxt;

    @FXML
    private DatePicker fechaReservaDate;


    @FXML
    private TextField marcatxt;

    @FXML
    private Button reservarBtn;

    

    @FXML
    private TextField gamatxt;

    @FXML
    private TextField totaltxt;


    private static ConexionCliente conexion  = new ConexionCliente();

 

    @FXML
    void initialize()
	{

        cargarDatosComboBox();


    }

    @FXML
    void accionAutomovilcmb(ActionEvent event) {

        Automovil autoMostrar = automovilcmb.getValue();
        tipotxt.setText(String.valueOf(autoMostrar.getTipo()));
        marcatxt.setText(String.valueOf(autoMostrar.getMarca()));
        gamatxt.setText(String.valueOf(autoMostrar.getModelo()));

        LocalDate fecha_reserva = fechaReservaDate.getValue();
        LocalDate fecha_entrega = fechaEntregaDate.getValue();
        long diasDiferencia = ChronoUnit.DAYS.between(fecha_reserva, fecha_entrega);
        
        int valor_renta = (Math.toIntExact(diasDiferencia) * (autoMostrar.getValor_Renta()));

        totaltxt.setText(String.valueOf(valor_renta));

    }

    @FXML
    void accionServicioAdicional(ActionEvent event) {

        int total = Integer.valueOf(totaltxt.getText());
        int totalServicio = total + 20000; 
        totaltxt.setText(String.valueOf(totalServicio));

    }


    @FXML
    void reservarAccion(ActionEvent event) {

            LocalDate fecha_reserva = fechaReservaDate.getValue();
            LocalDate fecha_entrega = fechaEntregaDate.getValue();
            long diasDiferencia = ChronoUnit.DAYS.between(fecha_reserva, fecha_entrega);
            int valor_renta = (Math.toIntExact(diasDiferencia) * (Integer.valueOf(totaltxt.getText())));

            ReservaAutomovil reservaAux = insertarReservaAutomovil(fecha_reserva, fecha_entrega, valor_renta);

            int codigoAutomovil = automovilcmb.getValue().getId();

            insertarDetalle(reservaAux.getId(), codigoAutomovil);

    }


    public ReservaAutomovil insertarReservaAutomovil(LocalDate fecha_reserva, LocalDate fecha_entrega, int valor_Renta) {

         try (Connection connection = conexion.conectar()) {

            String query = "INSERT INTO reserva_automovil (id, cliente_id, agencia_automovil_id, fecha_reserva, fecha_entrega, valor_renta, valor_adicional) \r\n" + //
                    "VALUES (?,?,?,?,?,?,?)";

                    java.sql.Date fechaReservaSql = java.sql.Date.valueOf(fecha_reserva);
                    java.sql.Date fechaEntregaSql = java.sql.Date.valueOf(fecha_entrega);

            // Crea una sentencia preparada y ejecutarla    
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, 1);
                statement.setInt(2, 1);
                statement.setInt(3, 1);
                statement.setDate(4, fechaReservaSql);
                statement.setDate(5, fechaEntregaSql);
                statement.setInt(6, valor_Renta);
                statement.setInt(7, 0);

                // Ejecutar la inserción
                statement.executeUpdate();

                System.out.println("Registro insertado exitosamente.");
            }
           
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Manejar la excepción de alguna manera, por ejemplo, mostrar un mensaje de error.
        }

        ReservaAutomovil reserva = new ReservaAutomovil(1,1,1,fecha_reserva,fecha_entrega,valor_Renta,0);

        return reserva;
       
    }

     public void insertarDetalle(int reservaAutomovil, int automovil_id) {

         try (Connection connection = conexion.conectar()) {

            String query = "INSERT INTO DETALLE_RESERVA_AUTOMOVIL (id, reserva_automovil_id, automovil_id) VALUES (?,?,?)";


            // Crea una sentencia preparada y ejecutarla    
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, 1);
                statement.setInt(2, reservaAutomovil);
                statement.setInt(3, automovil_id);
                
                // Ejecutar la inserción
                statement.executeUpdate();

                System.out.println("Registro insertado exitosamente.");
            }
           
            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Manejar la excepción de alguna manera, por ejemplo, mostrar un mensaje de error.
        }
       
    }

    private void cargarDatosComboBox() {

         ObservableList<Automovil> listaAutos = FXCollections.observableArrayList();

         List<Automovil> automovilesBd = obtenerAutomovilesDesdeBD();
            
         listaAutos.addAll(automovilesBd);

        automovilcmb.setConverter(new StringConverter<Automovil>() {
            @Override
            public String toString(Automovil automovil) {
                return (automovil != null) ? automovil.getMarca() : "";
            }

            @Override
            public Automovil fromString(String string) {
                // Implementa si necesitas convertir de nuevo a un objeto Persona
                return null;
            }
   
        });

        // Configurar el ComboBox con la lista de personas
        automovilcmb.setItems(listaAutos);

        ObservableList<String> servicios = FXCollections.observableArrayList(
                "GPS",
                "SEGURO"
               
        );

        servicioAdicionalCmb.setItems(servicios);



    }

    private List<Automovil> obtenerAutomovilesDesdeBD() {

         List<Automovil> automoviles = new ArrayList<>();

        try (Connection connection = conexion.conectar()) {
            String query = "SELECT * FROM AUTOMOVIL";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                // Iterar sobre los resultados y agregarlos a la lista de personas
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    int modelo = resultSet.getInt("modelo");
                    int valor_Renta = resultSet.getInt("valor_renta");
                    int valor_Adicional = resultSet.getInt("valor_adicional");
                    String placa = resultSet.getString("placa");
                    String marca = resultSet.getString("marca");
                    String tipo = resultSet.getString("tipo_automovil");
                    String gama = resultSet.getString("gama");;
                    automoviles.add(new Automovil(id, modelo, valor_Renta, valor_Adicional, placa, marca, tipo, gama));
                }
            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Manejar la excepción de alguna manera, por ejemplo, mostrar un mensaje de error.
        }

        return automoviles;
    }

    

    public void setStage(Stage stage) {
    }

    public void setAplicacion(Main main) {
    }

    
    
}
