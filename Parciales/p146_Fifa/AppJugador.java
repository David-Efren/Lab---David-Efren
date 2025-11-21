package p146_Fifa;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class AppJugador extends JFrame {

    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private ArrayList<Jugador> listaJugadores;
    
    // Componentes de entrada
    private JTextField txtNombre;
    private JTextField txtNacionalidad;
    private JTextField txtPeso;
    private JTextField txtRating;
    private JTextField txtPie; 
    private JSpinner spinnerFecha;
    private JComboBox<String> comboPosicion;
    private JPanel panelDatos;

    // Botones
    private JButton btnEditar, btnNuevo, btnGuardar, btnAnterior, btnSiguiente, btnEstadistica;

    // Estado
    private boolean esNuevoRegistro = false;

    public AppJugador() {
        super("Gestión de Jugadores FIFA"); // Título actualizado según imagen
        listaJugadores = new ArrayList<>();
        initUI();
        cargarDatosIniciales();
        configurarAtajosTeclado(); // Configuración de Ctrl+D y Ctrl+I
    }

    private void initUI() {
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 1. Barra de Menú
        crearMenu();

        // 2. JTable en JScrollPane (Centro)
        String[] columnas = {"Nombre", "Nacionalidad", "Peso", "Fecha Nac.", "Posición", "Pie", "Rating"};
        modeloTabla = new DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabla = new JTable(modeloTabla);
        tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        tabla.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && tabla.getSelectedRow() != -1) {
                mostrarDatosEnFormulario(tabla.getSelectedRow());
                actualizarEstadoBotonesNavegacion();
            }
        });

        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane, BorderLayout.CENTER);

        // 3. Panel Inferior
        JPanel panelInferior = new JPanel(new BorderLayout());
        crearPanelDatos();
        panelInferior.add(panelDatos, BorderLayout.CENTER);
        panelInferior.add(panelBotones(), BorderLayout.SOUTH);

        add(panelInferior, BorderLayout.SOUTH);
    }

    private void crearMenu() {
        JMenuBar menuBar = new JMenuBar();
        
        // --- Menú Archivo ---
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGrabar = new JMenuItem("Grabar");
        JMenuItem itemSalir = new JMenuItem("Salir");
        
        // Aceleradores (Shortcuts del Menú)
        itemAbrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
        itemGrabar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));

        itemAbrir.addActionListener(e -> abrirArchivo());
        itemGrabar.addActionListener(e -> guardarArchivo());
        itemSalir.addActionListener(e -> System.exit(0));

        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGrabar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        // --- Menú Ayuda ---
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemTeclas = new JMenuItem("Teclas de Acceso"); // Nuevo Item
        JMenuItem itemAcerca = new JMenuItem("Acerca de..");
        
        itemTeclas.addActionListener(e -> mostrarTeclasAcceso());
        itemAcerca.addActionListener(e -> mostrarAcercaDe());

        menuAyuda.add(itemTeclas);
        menuAyuda.add(itemAcerca);

        menuBar.add(menuArchivo);
        menuBar.add(menuAyuda);
        setJMenuBar(menuBar);
    }

    private void configurarAtajosTeclado() {
        // Configuración de atajos globales (funcionan aunque el foco esté en la tabla)
        JRootPane rootPane = this.getRootPane();
        InputMap inputMap = rootPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = rootPane.getActionMap();

        // Ctrl + I -> Nuevo Registro
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK), "nuevoRegistro");
        actionMap.put("nuevoRegistro", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accionNuevo();
            }
        });

        // Ctrl + D -> Borrar Registro
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK), "borrarRegistro");
        actionMap.put("borrarRegistro", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accionBorrar();
            }
        });
    }

    private void crearPanelDatos() {
        panelDatos = new JPanel(new GridLayout(4, 4, 10, 10)); 
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos del Jugador"));

        panelDatos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelDatos.add(txtNombre);

        panelDatos.add(new JLabel("Nacionalidad:"));
        txtNacionalidad = new JTextField();
        panelDatos.add(txtNacionalidad);

        panelDatos.add(new JLabel("Peso (kg):"));
        txtPeso = new JTextField();
        panelDatos.add(txtPeso);

        panelDatos.add(new JLabel("F. Nacimiento (dd/MM/yyyy):"));
        spinnerFecha = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy");
        spinnerFecha.setEditor(dateEditor);
        panelDatos.add(spinnerFecha);

        panelDatos.add(new JLabel("Posición:"));
        String[] posiciones = {"Portero", "Defensa", "Mediocampista", "Delantero"};
        comboPosicion = new JComboBox<>(posiciones);
        panelDatos.add(comboPosicion);

        panelDatos.add(new JLabel("Pie Preferido:"));
        txtPie = new JTextField();
        panelDatos.add(txtPie);

        panelDatos.add(new JLabel("Rating (1-99):"));
        txtRating = new JTextField();
        panelDatos.add(txtRating);
        
        panelDatos.add(new JLabel("")); 
    }

    private JPanel panelBotones() {
        JPanel pnl = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        
        btnAnterior = new JButton("Anterior");
        btnSiguiente = new JButton("Siguiente");
        btnNuevo = new JButton("Nuevo");
        btnEditar = new JButton("Editar");
        btnGuardar = new JButton("Guardar");
        btnEstadistica = new JButton("Estadística");

        btnNuevo.addActionListener(e -> accionNuevo());
        btnEditar.addActionListener(e -> accionEditar());
        btnGuardar.addActionListener(e -> accionGuardar());
        btnAnterior.addActionListener(e -> navegar(-1));
        btnSiguiente.addActionListener(e -> navegar(1));
        btnEstadistica.addActionListener(e -> mostrarEstadistica());

        pnl.add(btnAnterior);
        pnl.add(btnSiguiente);
        pnl.add(Box.createHorizontalStrut(20));
        pnl.add(btnNuevo);
        pnl.add(btnEditar);
        pnl.add(btnGuardar);
        pnl.add(Box.createHorizontalStrut(20));
        pnl.add(btnEstadistica);
        
        return pnl;
    }

    // --- Lógica de Negocio ---

    private void cargarDatosIniciales() {
        listaJugadores = Utileria.inicializar();
        actualizarTabla();
        habilitarPanelDatos(false);
        
        if (!listaJugadores.isEmpty()) {
            tabla.setRowSelectionInterval(0, 0);
        }
        actualizarEstadoBotonesGeneral();
    }

    private void actualizarTabla() {
        modeloTabla.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato simple para tabla
        // Formato ISO para visualización en tabla según imagen sugerida (YYYY-MM-DD)
        // Pero mantendremos el del spinner
        
        for (Jugador e : listaJugadores) {
            Object[] fila = {
                e.getNombre(),
                e.getNacionalidad(),
                e.getPeso(),
                e.getFechaNacimiento().format(formatter),
                e.getPosicion(),
                e.isPie() ? "Derecho" : "Izquierdo",
                e.getRating()
            };
            modeloTabla.addRow(fila);
        }
    }

    private void mostrarDatosEnFormulario(int indice) {
        if (indice < 0 || indice >= listaJugadores.size()) return;

        Jugador e = listaJugadores.get(indice);
        txtNombre.setText(e.getNombre());
        txtNacionalidad.setText(e.getNacionalidad());
        txtPeso.setText(String.valueOf(e.getPeso()));
        txtRating.setText(String.valueOf(e.getRating()));
        txtPie.setText(e.isPie() ? "Derecho" : "Izquierdo");
        comboPosicion.setSelectedItem(e.getPosicion());

        Date date = Date.from(e.getFechaNacimiento().atZone(ZoneId.systemDefault()).toInstant());
        spinnerFecha.setValue(date);
    }

    private void navegar(int direccion) {
        int filaActual = tabla.getSelectedRow();
        int nuevaFila = filaActual + direccion;

        if (nuevaFila >= 0 && nuevaFila < tabla.getRowCount()) {
            tabla.setRowSelectionInterval(nuevaFila, nuevaFila);
            tabla.scrollRectToVisible(tabla.getCellRect(nuevaFila, 0, true));
        }
    }

    private void accionNuevo() {
        tabla.clearSelection();
        limpiarFormulario();
        habilitarPanelDatos(true);
        esNuevoRegistro = true;
        
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(false);
        tabla.setEnabled(false);
        
        // Foco en el nombre
        txtNombre.requestFocus();
    }
    
    private void accionBorrar() {
        int fila = tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro para borrar.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String nombre = listaJugadores.get(fila).getNombre();
        int confirmacion = JOptionPane.showConfirmDialog(
                this, 
                "¿Está seguro de que desea borrar a " + nombre + "?", 
                "Confirmar Borrado", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.WARNING_MESSAGE
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            listaJugadores.remove(fila);
            actualizarTabla();
            limpiarFormulario();
            actualizarEstadoBotonesGeneral();
            
            // Ajustar selección tras borrar
            if (!listaJugadores.isEmpty()) {
                int nuevaSeleccion = Math.min(fila, listaJugadores.size() - 1);
                tabla.setRowSelectionInterval(nuevaSeleccion, nuevaSeleccion);
            }
        }
    }

    private void accionEditar() {
        if (tabla.getSelectedRow() == -1) return;
        habilitarPanelDatos(true);
        esNuevoRegistro = false;
        btnNuevo.setEnabled(false);
        btnEditar.setEnabled(false);
        btnGuardar.setEnabled(true);
        tabla.setEnabled(false);
    }

    private void accionGuardar() {
        try {
            String nombre = txtNombre.getText();
            String nacionalidad = txtNacionalidad.getText();
            float peso = Float.parseFloat(txtPeso.getText());
            int rating = Integer.parseInt(txtRating.getText());
            String posicion = (String) comboPosicion.getSelectedItem();
            String pieTexto = txtPie.getText().toLowerCase();
            boolean pie = pieTexto.contains("derecho") || pieTexto.equals("true");
            Date date = (Date) spinnerFecha.getValue();
            LocalDateTime fechaNac = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

            Jugador estudiante = new Jugador(nombre, nacionalidad, peso, fechaNac, posicion, pie, rating);

            if (esNuevoRegistro) {
                listaJugadores.add(estudiante);
            } else {
                int fila = tabla.getSelectedRow();
                listaJugadores.set(fila, estudiante);
            }

            actualizarTabla();
            limpiarFormulario();
            habilitarPanelDatos(false);
            tabla.setEnabled(true);
            
            int filaSeleccion = esNuevoRegistro ? listaJugadores.size() - 1 : tabla.getSelectedRow();
            if (filaSeleccion >= 0 && filaSeleccion < tabla.getRowCount()) {
                tabla.setRowSelectionInterval(filaSeleccion, filaSeleccion);
            }

            actualizarEstadoBotonesGeneral();
            JOptionPane.showMessageDialog(this, "Registro guardado correctamente.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar. Verifique los datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarEstadistica() {
        if (listaJugadores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay datos.");
            return;
        }

        double promedioRating = listaJugadores.stream().mapToInt(Jugador::getRating).average().orElse(0.0);
        double promedioPeso = listaJugadores.stream().mapToDouble(Jugador::getPeso).average().orElse(0.0);
        int mayorRating = listaJugadores.stream().mapToInt(Jugador::getRating).max().orElse(0);
        int menorRating = listaJugadores.stream().mapToInt(Jugador::getRating).min().orElse(0);
        float mayorPeso = (float) listaJugadores.stream().mapToDouble(Jugador::getPeso).max().orElse(0.0);
        float menorPeso = (float) listaJugadores.stream().mapToDouble(Jugador::getPeso).min().orElse(0.0);
        
        long totalEdadAnios = listaJugadores.stream()
                .mapToLong(e -> ChronoUnit.YEARS.between(e.getFechaNacimiento(), LocalDateTime.now()))
                .sum();
        double edadPromedio = listaJugadores.isEmpty() ? 0.0 : (double) totalEdadAnios / listaJugadores.size();
        
        long derechos = listaJugadores.stream().filter(Jugador::isPie).count();
        long izquierdos = listaJugadores.size() - derechos;
        String pieMasUsado = (derechos > izquierdos) ? "Derecho" : "Izquierdo";

        String mensaje = String.format(
            "Total: %d Jugadores\n\n" +
            "Rating Prom: %.2f (Max: %d, Min: %d)\n" +
            "Peso Prom: %.2f kg (Max: %.2f, Min: %.2f)\n" +
            "Edad Prom: %.1f años\n" +
            "Pie: %s (Der: %d, Izq: %d)",
            listaJugadores.size(), promedioRating, mayorRating, menorRating,
            promedioPeso, mayorPeso, menorPeso, edadPromedio, pieMasUsado, derechos, izquierdos
        );
        
        JOptionPane.showMessageDialog(this, mensaje, "Estadísticas", JOptionPane.INFORMATION_MESSAGE);
    }

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtNacionalidad.setText("");
        txtPeso.setText("");
        txtRating.setText("");
        txtPie.setText("");
        spinnerFecha.setValue(new Date());
        comboPosicion.setSelectedIndex(0);
    }

    private void habilitarPanelDatos(boolean habilitar) {
        for (Component c : panelDatos.getComponents()) {
            c.setEnabled(habilitar);
        }
    }

    private void actualizarEstadoBotonesGeneral() {
        boolean hayDatos = !listaJugadores.isEmpty();
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        boolean haySeleccion = tabla.getSelectedRow() != -1;
        btnEditar.setEnabled(haySeleccion);
        actualizarEstadoBotonesNavegacion();
    }

    private void actualizarEstadoBotonesNavegacion() {
        int fila = tabla.getSelectedRow();
        int total = tabla.getRowCount();
        if (tabla.isEnabled()) {
            btnAnterior.setEnabled(fila > 0);
            btnSiguiente.setEnabled(fila != -1 && fila < total - 1);
            btnEditar.setEnabled(fila != -1);
        }
    }

    // --- Acciones de Archivo y Ayuda ---

    private void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            listaJugadores = Utileria.leerDatos(archivo.getAbsolutePath());
            actualizarTabla();
            if (!listaJugadores.isEmpty()) tabla.setRowSelectionInterval(0, 0);
        }
    }

    private void guardarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            Utileria.grabarDatos(archivo.getAbsolutePath(), listaJugadores);
        }
    }
    
    private void mostrarTeclasAcceso() {
        String mensaje = "<html><b>Teclas de Acceso Rápido</b><br><br>" +
                         "<b>Menú:</b><br>" +
                         "- Ctrl + A: Abrir archivo<br>" +
                         "- Ctrl + G: Grabar archivo<br><br>" +
                         "<b>Global (Tabla):</b><br>" +
                         "- Ctrl + D: Borrar registro seleccionado<br>" +
                         "- Ctrl + I: Iniciar nuevo registro</html>";
                         
        JOptionPane.showMessageDialog(this, mensaje, "Ayuda - Teclas de Acceso", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mostrarAcercaDe() {
        String mensaje = "Aplicación de Gestión de Jugadores FIFA\n" +
                         "Versión: 2.0\n" +
                         "Programador: David Efrén Terrones Buchard"
                         "Asistencia de: Google Gemini 3";
        JOptionPane.showMessageDialog(this, mensaje, "Acerca de...", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
        SwingUtilities.invokeLater(() -> {
            new AppJugador().setVisible(true);
        });
    }
}