import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana {
    private JPanel ventana;

    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JTabbedPane tabbedPane4;
    private JTabbedPane tabbedPane5;
    private JTabbedPane tabbedPane6;

    private JButton btnRegistrarTecnico;
    private JSpinner spnIdTecnico;
    private JTextField txtNombreTecnico;
    private JTextField txtCorreoTecnico;
    private JPasswordField txtContrasenaTecnico;
    private JComboBox cmbActividadTecnico;
    private JComboBox cmbEspecialidadTecnico;
    private JSpinner spnNivelExperienciaTecnico;
    private JComboBox cmbDisponibilidadTecnico;
    private JList listaTecnicos;
    private JButton btnListarTecnicos;
    private JList listaTecnicosEditar;
    private JButton btnSeleccionarTecnicoEditar;
    private JSpinner spnIdTecnicoEditar;
    private JTextField txtNombreTecnicoEditar;
    private JTextField txtCorreoTecnicoEditar;
    private JPasswordField txtContrasenaTecnicoEditar1;
    private JComboBox cmbActividadTecnicoEditar;
    private JComboBox cmbEspecialidadTecnicoEditar;
    private JSpinner spnExperienciaTecnicoEditar;
    private JComboBox cmbDisponibilidadTecnicoEditar;
    private JButton btnEditarTecnico;
    private JSpinner spnIdTecnicoEliminar;
    private JTextArea txtInfoTecnicoEliminar;
    private JButton btnMostrarTecnicoEliminar;
    private JButton btnEliminarTecnico;
    private JSpinner spnIdTecnicoBuscar;
    private JButton btnBuscarTecnicoId;
    private JTextArea txtInfoTecnicoBuscado;
    private JButton btnOrdenarTecnicosPorNombre;
    private JTextArea txtInfoTecnicosOrdenadorPorNombre;
    private JButton btnOrdenarTecnicosPorExperiencia;
    private JTextArea txtInfoTecnicosOrdenadosPorExperiencia;
    private JSpinner spnIdCliente;
    private JTextField txtNombreCliente;
    private JComboBox cmbEmpresaCliente;
    private JTextField txtTelefonoCliente;
    private JTextField txtCorreoCliente;
    private JButton btnRegistrarCliente;
    private JList listaClientes;
    private JButton btnListarClientes;
    private JButton btnSeleccionarClienteEditar;
    private JList listaClientesEditar;
    private JTextField txtNombreClienteEditar;
    private JComboBox cmbEmpresaClienteEditar;
    private JTextField txtTelefonoClienteEditar;
    private JTextField txtCorreoClienteEditar;
    private JButton btnEditarCliente;
    private JSpinner spnIdClienteEditar;
    private JSpinner spnIdClienteEliminar;
    private JButton btnMostrarInfoClienteEliminar;
    private JTextArea txtInfoClienteEliminar;
    private JButton btnClienteEliminar;
    private JButton btnOrdenarClientesNombre;
    private JTextArea txtInfoClientesNombreOrdenados;
    private JSpinner spnIdCaso;
    private JTextField txtTituloCaso;
    private JTextField txtDescripcionCaso;
    private JSpinner spnPrioridadCaso;
    private JComboBox cmbEstadoCaso;
    private JComboBox cmbCanalCaso;
    private JTextField txtFechaCreacionCaso;
    private JTextField txtFechaCierreCaso;
    private JSpinner spnIdClienteCaso;
    private JSpinner spnIdTecnicoCaso;
    private JButton btnRegistrarCaso;
    private JButton btnListarCasos;
    private JList listaCasos;
    private JButton btnSeleccionarCasoEditar;
    private JList listaCasosEditar;
    private JButton btnEditarCaso;
    private JSpinner spnIdCasoEditar;
    private JTextField txtTituloCasoEdit;
    private JTextField txtDescripcionCasoEdit;
    private JSpinner spnPrioridadCasoEdit;
    private JComboBox cmbEstadoCasoEditar;
    private JComboBox cmbCanalCasoEditar;
    private JTextField txtFechCreacionCasoEditar;
    private JTextField txtFechaFinalCasoEdit;
    private JSpinner spnIdClienteCasoEditar;
    private JSpinner spnTecnicoCasoEditar;
    private JButton btnMostrarCasoEliminar;
    private JTextArea txtInfoCasoEliminar;
    private JButton btnEliminarCaso;
    private JButton btnOrdenarCasosPrioridad;
    private JButton btnRegistrarAsignacion;
    private JSpinner spnIdAsignacion;
    private JSpinner spnIdCasoAsignacion;
    private JSpinner spnIdTecnicoAsignacion;
    private JTextField txtFechAsignacion;
    private JTextField txtFechaInicioAtencionAsignacion;
    private JTextField txtFechaFinAtencionAsignacion;
    private JComboBox cmbEstadoAsignacion;
    private JButton btnMostrarListaAsignaciones;
    private JList listaAsiganciones;
    private JButton btnSeleccionarEditarAsignacion;
    private JList listaAsignacionesEditar;
    private JSpinner spnIdAsignacionEditar;
    private JSpinner spnIdCasoAsignacionEditar;
    private JSpinner spnIdTecnicoAsignacionEditar;
    private JTextField txtFechaAsignacionEditar;
    private JTextField txtFechaInicioAtencionAsignacionEditar;
    private JTextField txtFechaFinAtencionAsignacionEditar;
    private JComboBox cmbEstadoAsignacionEditar;
    private JButton btnEditarAsignacion;
    private JButton btnMoestrarAsignacionEliminar;
    private JSpinner spnIdAsignacionEliminar;
    private JTextArea txtInfoAsignacionEliminar;
    private JButton btnEliminarAsignacion;
    private JSpinner spnIdSolucion;
    private JTextField txtDescripcionSolucion;
    private JTextField txtFechaRegistroSolucion;
    private JSpinner spnIdTecnicoSolucion;
    private JSpinner spnIdCasoSolucion;
    private JTextField txtNotaSolucion;
    private JButton btnRegistrarSolucion;
    private JButton btnListarSoluciones;
    private JList listaSoluciones;
    private JButton btnSeleccionSolucionEditar;
    private JList listaSolucionesEditar;
    private JButton btnEditarSolucion;
    private JSpinner spnIdSolucionEditar;
    private JTextField txtDescripcionSolucionEditar;
    private JTextField txtFechaRegistroSolucionEditar;
    private JSpinner spnIdTecnicoSolucionEditar;
    private JSpinner spnIdCasoSolucionEditar;
    private JTextField txtNotaSolucionEditar;
    private JButton btnMostrarSolucionEliminar;
    private JSpinner spnIdSolucionEliminar;
    private JTextArea txtInfoSolucionEliminar;
    private JButton btnEliminarSolucion;
    private JSpinner spnIdSolucionBuscar;
    private JButton btnBuscarSolucion;
    private JTextArea txtInfoSolucionBuscar;
    private JTextArea txtInfoCasosOrdenadosPrioridad;
    private JSpinner spnCasoEliminar;
    GestorTecnicos gestorTecnicos = new GestorTecnicos();
    GestorCasos gestorCasos = new GestorCasos();
    GestorClientes gestorClientes = new GestorClientes();
    GestorSoluciones gestorSoluciones = new GestorSoluciones();
    GestorAsignaciones gestorAsignaciones = new GestorAsignaciones();
    private JTextArea txtInfoCasosOrdenar;

    int indexTecnico;
    int indexCliente;
    int indexCaso;
    int indexSolucion;
    int indexAsignacion;

    public void llenarListaTecnicos(){
        //METODO PARA LLENAR LA LISTA DE TECNICOS
        DefaultListModel lsm = new DefaultListModel();
        for (Tecnico tecnico: gestorTecnicos.getListaTecnicos()){
            lsm.addElement("TECNICO ID: "+tecnico.getIdTecnico() + "  - " + tecnico.getNombre());
        }
        listaTecnicos.setModel(lsm);
        listaTecnicosEditar.setModel(lsm);
    }
    public void llenarListaClientes(){
        //METODO PARA LLENAR LA LISTA DE CLIENTES
        DefaultListModel lsm = new DefaultListModel();
        for (Cliente cliente: gestorClientes.getClientes()){
            lsm.addElement("CLIENTE ID: "+cliente.getIdCliente() + "  - " + cliente.getNombre());
        }
        listaClientes.setModel(lsm);
        listaClientesEditar.setModel(lsm);
    }

    public void llenarListaCasos(){
        //METODO PARA LLENAR LA LISTA DE CASOS
        DefaultListModel lsm = new DefaultListModel();
        for (Caso caso: gestorCasos.getCasos()){
            lsm.addElement("CASO ID: "+caso.getIdCaso() + "  - " + caso.getTitulo());
        }
        listaCasos.setModel(lsm);
        listaCasosEditar.setModel(lsm);
    }

    public void llenarListaSoluciones(){
        //METODO PARA LLENAR LA LISTA DE SOLUCIONES
        DefaultListModel lsm = new DefaultListModel();
        for (Solucion solucion: gestorSoluciones.getSoluciones()){
            lsm.addElement("SOLUCION ID: "+solucion.getIdSolucion() + "  - " + solucion.getDescripcion());
        }
        listaSoluciones.setModel(lsm);
        listaSolucionesEditar.setModel(lsm);
    }

    public void llenarListaAsignaciones(){
        //METODO PARA LLENAR LA LISTA DE ASIGNACIONES
        DefaultListModel lsm = new DefaultListModel();
        for (Asignacion asignacion: gestorAsignaciones.getListaAsignaciones()){
            lsm.addElement("ASIGNACION ID: "+asignacion.getIdAsignacion() + "  - " + "Caso ID: " + asignacion.getCaso() + " - Tecnico ID: " + asignacion.getTecnico());
        }
        listaAsiganciones.setModel(lsm);
        listaAsignacionesEditar.setModel(lsm);
    }

    public Ventana(){
        //MODELOS DE LOS SPINNERS DE TODAS LAS SECCIONES
        SpinnerNumberModel modeloIdTecnico = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnico.setModel(modeloIdTecnico);
        SpinnerNumberModel modeloIdTecnicoEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoEditar.setModel(modeloIdTecnicoEditar);
        SpinnerNumberModel modeloNivelExperienciaTecnico = new SpinnerNumberModel(1,
                1, 50, 1);
        spnNivelExperienciaTecnico.setModel(modeloNivelExperienciaTecnico);
        SpinnerNumberModel modeloExperienciaTecnicoEditar = new SpinnerNumberModel(1,
                1, 50, 1);
        spnExperienciaTecnicoEditar.setModel(modeloExperienciaTecnicoEditar);
        SpinnerNumberModel modeloIdCasoEliminar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnCasoEliminar.setModel(modeloIdCasoEliminar);
        SpinnerNumberModel modeloIdCliente = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdCliente.setModel(modeloIdCliente);
        SpinnerNumberModel modeloIdClienteEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdClienteEditar.setModel(modeloIdClienteEditar);
        SpinnerNumberModel modeloIdClienteEliminar1 = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdClienteEliminar.setModel(modeloIdClienteEliminar1);
        SpinnerNumberModel modeloIdCaso = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdCaso.setModel(modeloIdCaso);
        SpinnerNumberModel modeloPrioridadCaso = new SpinnerNumberModel(1, 1, 5, 1);
        spnPrioridadCaso.setModel(modeloPrioridadCaso);
        SpinnerNumberModel modeloIdCasoEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdCasoEditar.setModel(modeloIdCasoEditar);
        SpinnerNumberModel modeloPrioridadCasoEditar = new SpinnerNumberModel(1, 1, 5, 1);
        spnPrioridadCasoEdit.setModel(modeloPrioridadCasoEditar);
        SpinnerNumberModel modeloIdSolucion = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdSolucion.setModel(modeloIdSolucion);
        SpinnerNumberModel modeloIdSolucionEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdSolucionEditar.setModel(modeloIdSolucionEditar);
        SpinnerNumberModel modeloIdSolucionEliminar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdSolucionEliminar.setModel(modeloIdSolucionEliminar);
        SpinnerNumberModel modeloIdAsignacion = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdAsignacion.setModel(modeloIdAsignacion);
        SpinnerNumberModel modeloIdAsignacionEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdAsignacionEditar.setModel(modeloIdAsignacionEditar);
        SpinnerNumberModel modeloIdAsignacionEliminar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdAsignacionEliminar.setModel(modeloIdAsignacionEliminar);
        SpinnerNumberModel modeloIdTecnicoCaso = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoEliminar.setModel(modeloIdTecnicoCaso);
        SpinnerNumberModel modeloIdTecnicoBuscar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoBuscar.setModel(modeloIdTecnicoBuscar);
        SpinnerNumberModel modeloIdClienteCaso = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdClienteCaso.setModel(modeloIdClienteCaso);
        SpinnerNumberModel modeloIdTecnicoCaso1 = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoCaso.setModel(modeloIdTecnicoCaso1);
        SpinnerNumberModel modeloIdClienteCasoEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdClienteCasoEditar.setModel(modeloIdClienteCasoEditar);
        SpinnerNumberModel modeloIdTecnicoCasoEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnTecnicoCasoEditar.setModel(modeloIdTecnicoCasoEditar);
        SpinnerNumberModel modeloIdTecnicoAsignacion = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoAsignacion.setModel(modeloIdTecnicoAsignacion);
        SpinnerNumberModel modeloIdCasoAsignacion = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdCasoAsignacion.setModel(modeloIdCasoAsignacion);
        SpinnerNumberModel modeloIdCasoAsignacionEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdCasoAsignacionEditar.setModel(modeloIdCasoAsignacionEditar);
        SpinnerNumberModel modeloIdTecnicoAsignacionEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoAsignacionEditar.setModel(modeloIdTecnicoAsignacionEditar);
        SpinnerNumberModel modeloIdTecnicoSolucion = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoSolucion.setModel(modeloIdTecnicoSolucion);
        SpinnerNumberModel modeloIdCasoSolucion = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdCasoSolucion.setModel(modeloIdCasoSolucion);
        SpinnerNumberModel modeloIdCasoSolucionEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdCasoSolucionEditar.setModel(modeloIdCasoSolucionEditar);
        SpinnerNumberModel modeloIdTecnicoSolucionEditar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdTecnicoSolucionEditar.setModel(modeloIdTecnicoSolucionEditar);
        SpinnerNumberModel modeloIdSolucionBuscar = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
        spnIdSolucionBuscar.setModel(modeloIdSolucionBuscar);
        /// SECCION TECNICO ///
        //* SEUBSECCION REGISTRAR TECNICO *//
        // BOTON REGISTRAR TECNICO(TIENE VALIDACIONES SI NO INGRESA EN LOS CAMPOS CORRECTAMENTE NO LO DEJA REGISTRAR)
        btnRegistrarTecnico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idTecnico = (int) spnIdTecnico.getValue();
                String nombre = txtNombreTecnico.getText();
                String correo = txtCorreoTecnico.getText();
                String contrasena = new String (txtContrasenaTecnico.getPassword());
                String textoActividad = (String) cmbActividadTecnico.getSelectedItem();
                String especialidad = (String) cmbEspecialidadTecnico.getSelectedItem();
                int nivelExperiencia = (int) spnNivelExperienciaTecnico.getValue();
                String textoDisponibilidad = (String) cmbDisponibilidadTecnico.getSelectedItem();
                boolean actividad;
                boolean disponible;
                if (textoActividad.equals("Activo") ){
                    actividad = true;
                } else {
                    actividad = false;
                }
                if (textoDisponibilidad.equals("Disponible")){
                    disponible = true;
                } else {
                    disponible = false;
                }

                if ( nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || especialidad.isEmpty() || textoActividad.isEmpty() || textoDisponibilidad.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Tecnico tecnico = new Tecnico(idTecnico, nombre, correo, contrasena,
                            actividad, especialidad, nivelExperiencia, disponible);
                    gestorTecnicos.agregarTecnico(tecnico);
                    JOptionPane.showMessageDialog(null, "Técnico registrado exitosamente.");
                    llenarListaTecnicos();
                }
            }
        });

        //* SEUBSECCION LISTAR TECNICOS *//
        // BOTON LISTAR TECNICOS

        btnListarTecnicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorTecnicos.getListaTecnicos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay técnicos registrados.");
                    return;
                }else {
                    JOptionPane.showMessageDialog(null, "Cargando datos de técnicos...");
                    llenarListaTecnicos();
                }
            }
        });

        //* SEUBSECCION EDITAR TECNICO *//
        // BOTON SELECCIONAR TECNICO A EDITAR(USAMOS UN INDEX PARA SABER CUAL TECNICO SELECCIONO EL USUARIO Y ASI OBETENER SUS DATOS)
        btnSeleccionarTecnicoEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexTecnico = listaTecnicosEditar.getSelectedIndex();
                if ( indexTecnico == -1 ) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione un técnico de la lista.");
                    return;
                }else {
                    Tecnico tecnico = gestorTecnicos.getListaTecnicos().get(indexTecnico);
                    spnIdTecnicoEditar.setValue(tecnico.getIdTecnico());
                    txtNombreTecnicoEditar.setText(tecnico.getNombre());
                    txtCorreoTecnicoEditar.setText(tecnico.getCorreoInstitucional());
                    txtContrasenaTecnicoEditar1.setText(tecnico.getContrasena());
                    if ( tecnico.isActivo() ) {
                        cmbActividadTecnicoEditar.setSelectedItem("Activo");
                    } else {
                        cmbActividadTecnicoEditar.setSelectedItem("Inactivo");
                    }
                    cmbEspecialidadTecnicoEditar.setSelectedItem(tecnico.getEspecialidad());
                    spnExperienciaTecnicoEditar.setValue(tecnico.getNivelExperiencia());
                    if ( tecnico.isDisponible() ) {
                        cmbDisponibilidadTecnicoEditar.setSelectedItem("Disponible");
                    } else {
                        cmbDisponibilidadTecnicoEditar.setSelectedItem("No Disponible");
                    }
                }
            }
        });
        // BOTON EDITAR TECNICO (TIENE VALIDACIONES SI NO INGRESA EN LOS CAMPOS CORRECTAMENTE NO LO DEJA EDITAR)
        btnEditarTecnico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idTecnico = (int) spnIdTecnicoEditar.getValue();
                String nombre = txtNombreTecnicoEditar.getText();
                String correo = txtCorreoTecnicoEditar.getText();
                String contrasena = new String (txtContrasenaTecnicoEditar1.getPassword());
                String textoActividad = (String) cmbActividadTecnicoEditar.getSelectedItem();
                String especialidad = (String) cmbEspecialidadTecnicoEditar.getSelectedItem();
                int nivelExperiencia = (int) spnExperienciaTecnicoEditar.getValue();
                String textoDisponibilidad = (String) cmbDisponibilidadTecnicoEditar.getSelectedItem();
                boolean actividad;
                boolean disponible;
                if (textoActividad.equals("Activo") ){
                    actividad = true;
                } else {
                    actividad = false;
                }
                if (textoDisponibilidad.equals("Disponible")){
                    disponible = true;
                } else {
                    disponible = false;
                }

                if ( nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || especialidad.isEmpty() || textoActividad.isEmpty() || textoDisponibilidad.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Tecnico tecnico = new Tecnico(idTecnico, nombre, correo, contrasena,
                            actividad, especialidad, nivelExperiencia, disponible);
                    gestorTecnicos.getListaTecnicos().set(indexTecnico, tecnico);
                    JOptionPane.showMessageDialog(null, "Técnico editado exitosamente.");
                    llenarListaTecnicos();
                }
            }
        });
        //* SEUBSECCION ELIMINAR TECNICO *//
        // BOTON MOSTRAR INFO TECNICO A ELIMINAR
        btnMostrarTecnicoEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idTecnico = (int) spnIdTecnicoEliminar.getValue();
                Tecnico tecnico = gestorTecnicos.buscarTecnicoPorIdBinaria(idTecnico);
                if ( tecnico == null ) {
                    JOptionPane.showMessageDialog(null, "No se encontró un técnico con el ID proporcionado.");
                    return;
                }else {
                    String info = "ID: " + tecnico.getIdTecnico() + "\n" +
                            "Nombre: " + tecnico.getNombre() + "\n" +
                            "Correo: " + tecnico.getCorreoInstitucional() + "\n" +
                            "Contraseña: " + tecnico.getContrasena() + "\n" +
                            "Actividad: " + (tecnico.isActivo() ? "Activo" : "Inactivo") + "\n" +
                            "Especialidad: " + tecnico.getEspecialidad() + "\n" +
                            "Nivel de Experiencia: " + tecnico.getNivelExperiencia() + "\n" +
                            "Disponibilidad: " + (tecnico.isDisponible() ? "Disponible" : "No Disponible");
                    txtInfoTecnicoEliminar.setText(info);
                }
            }
        });

        // BOTON ELIMINAR TECNICO
        btnEliminarTecnico.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idTecnico = (int) spnIdTecnicoEliminar.getValue();
                boolean eliminado = gestorTecnicos.eliminarTecnico(idTecnico);
                if ( eliminado ) {
                    JOptionPane.showMessageDialog(null, "Técnico eliminado exitosamente.");
                    txtInfoTecnicoEliminar.setText("");
                    llenarListaTecnicos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un técnico con el ID proporcionado.");
                }
            }
        });

        //* SEUBSECCION BUSCAR TECNICO POR ID *//
        // BOTON BUSCAR TECNICO POR ID
        btnBuscarTecnicoId.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idTecnico = (int) spnIdTecnicoBuscar.getValue();
                Tecnico tecnico = gestorTecnicos.buscarTecnicoPorIdBinaria(idTecnico);
                if ( tecnico == null ) {
                    JOptionPane.showMessageDialog(null, "No se encontró un técnico con el ID proporcionado.");
                    return;
                }else {
                    String info = "ID: " + tecnico.getIdTecnico() + "\n" +
                            "Nombre: " + tecnico.getNombre() + "\n" +
                            "Correo: " + tecnico.getCorreoInstitucional() + "\n" +
                            "Contraseña: " + tecnico.getContrasena() + "\n" +
                            "Actividad: " + (tecnico.isActivo() ? "Activo" : "Inactivo") + "\n" +
                            "Especialidad: " + tecnico.getEspecialidad() + "\n" +
                            "Nivel de Experiencia: " + tecnico.getNivelExperiencia() + "\n" +
                            "Disponibilidad: " + (tecnico.isDisponible() ? "Disponible" : "No Disponible");
                    txtInfoTecnicoBuscado.setText(info);
                }
            }
        });

        //* SEUBSECCION ORDENAR TECNICOS *//
        // BOTON ORDENAR TECNICOS POR NOMBRE

        btnOrdenarTecnicosPorNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorTecnicos.getListaTecnicos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay técnicos registrados.");
                    return;
                }else {
                    gestorTecnicos.ordenarTecnicosPorNombreBurbuja();
                    StringBuilder info = new StringBuilder();
                    for (Tecnico tecnico : gestorTecnicos.getListaTecnicos()) {
                        info.append("ID: ").append(tecnico.getIdTecnico()).append("\n")
                                .append("Nombre: ").append(tecnico.getNombre()).append("\n")
                                .append("Correo: ").append(tecnico.getCorreoInstitucional()).append("\n")
                                .append("Contraseña: ").append(tecnico.getContrasena()).append("\n")
                                .append("Actividad: ").append(tecnico.isActivo() ? "Activo" : "Inactivo").append("\n")
                                .append("Especialidad: ").append(tecnico.getEspecialidad()).append("\n")
                                .append("Nivel de Experiencia: ").append(tecnico.getNivelExperiencia()).append("\n")
                                .append("Disponibilidad: ").append(tecnico.isDisponible() ? "Disponible" : "No Disponible").append("\n\n");
                    }
                    txtInfoTecnicosOrdenadorPorNombre.setText(info.toString());
                }
            }
        });

        // BOTON ORDENAR TECNICOS POR NIVEL DE EXPERIENCIA
        btnOrdenarTecnicosPorExperiencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorTecnicos.getListaTecnicos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay técnicos registrados.");
                    return;
                }else {
                    gestorTecnicos.ordenarTecnicosPorNivelExperienciaBurbuja();
                    StringBuilder info = new StringBuilder();
                    for (Tecnico tecnico : gestorTecnicos.getListaTecnicos()) {
                        info.append("ID: ").append(tecnico.getIdTecnico()).append("\n")
                                .append("Nombre: ").append(tecnico.getNombre()).append("\n")
                                .append("Correo: ").append(tecnico.getCorreoInstitucional()).append("\n")
                                .append("Contraseña: ").append(tecnico.getContrasena()).append("\n")
                                .append("Actividad: ").append(tecnico.isActivo() ? "Activo" : "Inactivo").append("\n")
                                .append("Especialidad: ").append(tecnico.getEspecialidad()).append("\n")
                                .append("Nivel de Experiencia: ").append(tecnico.getNivelExperiencia()).append("\n")
                                .append("Disponibilidad: ").append(tecnico.isDisponible() ? "Disponible" : "No Disponible").append("\n\n");
                    }
                    txtInfoTecnicosOrdenadosPorExperiencia.setText(info.toString());
                }
            }
        });

        /// SECCION CLIENTE ///
        //* SEUBSECCION REGISTRAR CLIENTE *//
        // BOTON REGISTRAR CLIENTE(TIENE VALIDACIONES SI NO INGRESA EN LOS CAMPOS CORRECTAMENTE NO LO DEJA REGISTRAR)
        btnRegistrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCliente = (int) spnIdCliente.getValue();
                String nombre = txtNombreCliente.getText();
                String empresa = (String) cmbEmpresaCliente.getSelectedItem();
                String telefono = txtTelefonoCliente.getText();
                String correo = txtCorreoCliente.getText();

                if ( nombre.isEmpty() || empresa.isEmpty() || telefono.isEmpty() || correo.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Cliente cliente = new Cliente(idCliente, nombre, empresa, telefono, correo);
                    gestorClientes.agregarCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente.");
                }
            }
        });

        //* SEUBSECCION LISTAR CLIENTES *//
        // BOTON LISTAR CLIENTES
        btnListarClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorClientes.getClientes().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
                    return;
                }else {
                    JOptionPane.showMessageDialog(null, "Cargando datos de clientes...");
                    llenarListaClientes();
                }
            }
        });

        //* SEUBSECCION EDITAR CLIENTE *//
        // BOTON SELECCIONAR CLIENTE A EDITAR(USAMOS UN INDEX PARA SABER CUAL CLIENTE SELECCIONO EL USUARIO Y ASI OBETENER SUS DATOS)
        btnSeleccionarClienteEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexCliente = listaClientesEditar.getSelectedIndex();
                if ( indexCliente == -1 ) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione un cliente de la lista.");
                    return;
                }else {
                    Cliente cliente = gestorClientes.getClientes().get(indexCliente);
                    spnIdClienteEditar.setValue(cliente.getIdCliente());
                    txtNombreClienteEditar.setText(cliente.getNombre());
                    cmbEmpresaClienteEditar.setSelectedItem(cliente.getEmpresa());
                    txtTelefonoClienteEditar.setText(cliente.getTelefono());
                    txtCorreoClienteEditar.setText(cliente.getCorreo());
                }
            }
        });
        // BOTON EDITAR CLIENTE (TIENE VALIDACIONES SI NO INGRESA EN LOS CAMPOS CORRECTAMENTE NO LO DEJA EDITAR)
        btnEditarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCliente = (int) spnIdClienteEditar.getValue();
                String nombre = txtNombreClienteEditar.getText();
                String empresa = (String) cmbEmpresaClienteEditar.getSelectedItem();
                String telefono = txtTelefonoClienteEditar.getText();
                String correo = txtCorreoClienteEditar.getText();

                if ( nombre.isEmpty() || empresa.isEmpty() || telefono.isEmpty() || correo.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Cliente cliente = new Cliente(idCliente, nombre, empresa, telefono, correo);
                    gestorClientes.getClientes().set(indexCliente, cliente);
                    JOptionPane.showMessageDialog(null, "Cliente editado exitosamente.");
                    llenarListaClientes();
                }
            }
        });
        //* SEUBSECCION ELIMINAR CLIENTE *//
        // BOTON MOSTRAR INFO CLIENTE A ELIMINAR
        btnMostrarInfoClienteEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCliente = (int) spnIdClienteEliminar.getValue();
                Cliente cliente = gestorClientes.buscarClientePorIdBinaria(idCliente);
                if ( cliente == null ) {
                    JOptionPane.showMessageDialog(null, "No se encontró un cliente con el ID proporcionado.");
                    return;
                }else {
                    String info = "ID: " + cliente.getIdCliente() + "\n" +
                            "Nombre: " + cliente.getNombre() + "\n" +
                            "Empresa: " + cliente.getEmpresa() + "\n" +
                            "Teléfono: " + cliente.getTelefono() + "\n" +
                            "Correo: " + cliente.getCorreo();
                    txtInfoClienteEliminar.setText(info);
                }
            }
        });
        // BOTON ELIMINAR CLIENTE
        btnClienteEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCliente = (int) spnIdClienteEliminar.getValue();
                boolean eliminado = gestorClientes.eliminarCliente(idCliente);
                if ( eliminado ) {
                    JOptionPane.showMessageDialog(null, "Cliente eliminado exitosamente.");
                    txtInfoClienteEliminar.setText("");
                    llenarListaClientes();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un cliente con el ID proporcionado.");
                }
            }
        });
        //* SEUBSECCION ORDENAR CLIENTES *//
        btnOrdenarClientesNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorClientes.getClientes().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay clientes registrados.");
                    return;
                }else {
                    gestorClientes.ordenarClientesPorNombreBurbuja();
                    StringBuilder info = new StringBuilder();
                    for (Cliente cliente : gestorClientes.getClientes()) {
                        info.append("ID: ").append(cliente.getIdCliente()).append("\n")
                                .append("Nombre: ").append(cliente.getNombre()).append("\n")
                                .append("Empresa: ").append(cliente.getEmpresa()).append("\n")
                                .append("Teléfono: ").append(cliente.getTelefono()).append("\n")
                                .append("Correo: ").append(cliente.getCorreo()).append("\n\n");
                    }
                    txtInfoClientesNombreOrdenados.setText(info.toString());
                }
            }
        });

        /// SECCION CASO ///
        //* SEUBSECCION REGISTRAR CASO *//
        // BOTON REGISTRAR CASO(TIENE VALIDACIONES SI NO INGRESA EN LOS CAMPOS CORRECTAMENTE NO LO DEJA REGISTRAR)
        btnRegistrarCaso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCaso = (int) spnIdCaso.getValue();
                String titulo = txtTituloCaso.getText();
                String descripcion = txtDescripcionCaso.getText();
                int prioridad = (int) spnPrioridadCaso.getValue();
                String estado = (String) cmbEstadoCaso.getSelectedItem();
                String canal = (String) cmbCanalCaso.getSelectedItem();
                String fechaCreacion = txtFechaCreacionCaso.getText();
                String fechaCierre = txtFechaCierreCaso.getText();
                int idCliente = 0; //SE BUSCARA EL CLIENTE POR ID CON LOS METODOS DEL GESTOR
                int idTecnico = 0; //SE BUSCARA EL TECNICO POR ID CON LOS METODOS DEL GESTOR
                if (gestorClientes.getClientes().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay clientes registrados. Por favor, registre un cliente primero.");
                    return;
                } else {
                    idCliente = (int) spnIdClienteCaso.getValue();
                    Cliente cliente = gestorClientes.buscarClientePorIdBinaria(idCliente);
                    if (cliente == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró un cliente con el ID proporcionado.");
                        return;
                    }
                    idCliente = cliente.getIdCliente();
                }

                if (gestorTecnicos.getListaTecnicos().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay técnicos registrados. Por favor, registre un técnico primero.");
                    return;
                } else {
                    idTecnico = (int) spnIdTecnicoCaso.getValue();
                    Tecnico tecnico = gestorTecnicos.buscarTecnicoPorIdBinaria(idTecnico);
                    if (tecnico == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró un técnico con el ID proporcionado.");
                        return;
                    }
                    idTecnico = tecnico.getIdTecnico();
                }


                if ( titulo.isEmpty() || descripcion.isEmpty() || estado.isEmpty() || canal.isEmpty() || fechaCreacion.isEmpty() || fechaCierre.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Caso caso = new Caso(idCaso, titulo, descripcion, prioridad, estado,
                            canal, fechaCreacion, fechaCierre, idCliente, idTecnico);
                    gestorCasos.agregarCaso(caso);
                    JOptionPane.showMessageDialog(null, "Caso registrado exitosamente.");
                    llenarListaCasos();
                }
            }
        });

        //* SEUBSECCION LISTAR CASOS *//
        // BOTON LISTAR CASOS
        btnListarCasos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorCasos.getCasos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay casos registrados.");
                    return;
                }else {
                    JOptionPane.showMessageDialog(null, "Cargando datos de casos...");
                    llenarListaCasos();
                }
            }
        });
        //* SEUBSECCION EDITAR CASO *//
        // BOTON SELECCIONAR CASO A EDITAR(USAMOS UN INDEX PARA SABER CUAL CASO SELECCIONO EL USUARIO Y ASI OBETENER SUS DATOS)
        btnSeleccionarCasoEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexCaso = listaCasosEditar.getSelectedIndex();
                if ( indexCaso == -1 ) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione un caso de la lista.");
                    return;
                }else {
                    Caso caso = gestorCasos.getCasos().get(indexCaso);
                    spnIdCasoEditar.setValue(caso.getIdCaso());
                    txtTituloCasoEdit.setText(caso.getTitulo());
                    txtDescripcionCasoEdit.setText(caso.getDescripcion());
                    spnPrioridadCasoEdit.setValue(caso.getPrioridad());
                    cmbEstadoCasoEditar.setSelectedItem(caso.getEstado());
                    cmbCanalCasoEditar.setSelectedItem(caso.getCanalContacto());
                    txtFechCreacionCasoEditar.setText(caso.getFechaCreacion());
                    txtFechaFinalCasoEdit.setText(caso.getFechaCierre());
                    spnIdClienteCasoEditar.setValue(caso.getCliente());
                    spnTecnicoCasoEditar.setValue(caso.getTecnicoAsignado());
                }
            }
        });
        // BOTON EDITAR CASO (TIENE VALIDACIONES SI NO INGRESA EN LOS CAMPOS CORRECTAMENTE NO LO DEJA EDITAR)
        btnEditarCaso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCaso = (int) spnIdCasoEditar.getValue();
                String titulo = txtTituloCasoEdit.getText();
                String descripcion = txtDescripcionCasoEdit.getText();
                int prioridad = (int) spnPrioridadCasoEdit.getValue();
                String estado = (String) cmbEstadoCasoEditar.getSelectedItem();
                String canal = (String) cmbCanalCasoEditar.getSelectedItem();
                String fechaCreacion = txtFechCreacionCasoEditar.getText();
                String fechaCierre = txtFechaFinalCasoEdit.getText();
                int idCliente = (int) spnIdClienteCasoEditar.getValue();
                int idTecnico = (int) spnTecnicoCasoEditar.getValue();

                if ( titulo.isEmpty() || descripcion.isEmpty() || estado.isEmpty() || canal.isEmpty() || fechaCreacion.isEmpty() || fechaCierre.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Caso caso = new Caso(idCaso, titulo, descripcion, prioridad, estado,
                            canal, fechaCreacion, fechaCierre, idCliente, idTecnico);
                    gestorCasos.getCasos().set(indexCaso, caso);
                    JOptionPane.showMessageDialog(null, "Caso editado exitosamente.");
                    llenarListaCasos();
                }
            }
        });
        //* SEUBSECCION ELIMINAR CASO *//
        // BOTON MOSTRAR INFO CASO A ELIMINAR
        btnMostrarCasoEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCaso = (int) spnCasoEliminar.getValue();
                Caso caso = gestorCasos.buscarCasoPorIdBinaria(idCaso);
                if ( caso == null ) {
                    JOptionPane.showMessageDialog(null, "No se encontró un caso con el ID proporcionado.");
                    return;
                }else {
                    String info = "ID: " + caso.getIdCaso() + "\n" +
                            "Título: " + caso.getTitulo() + "\n" +
                            "Descripción: " + caso.getDescripcion() + "\n" +
                            "Prioridad: " + caso.getPrioridad() + "\n" +
                            "Estado: " + caso.getEstado() + "\n" +
                            "Canal de Contacto: " + caso.getCanalContacto() + "\n" +
                            "Fecha de Creación: " + caso.getFechaCreacion() + "\n" +
                            "Fecha de Cierre: " + caso.getFechaCierre() + "\n" +
                            "ID Cliente: " + caso.getCliente() + "\n" +
                            "ID Técnico Asignado: " + caso.getTecnicoAsignado();
                    txtInfoCasoEliminar.setText(info);
                }
            }
        });

        // BOTON ELIMINAR CASO
        btnEliminarCaso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idCaso = (int) spnCasoEliminar.getValue();
                boolean eliminado = gestorCasos.eliminarCaso(idCaso);
                if ( eliminado ) {
                    JOptionPane.showMessageDialog(null, "Caso eliminado exitosamente.");
                    txtInfoCasoEliminar.setText("");
                    llenarListaCasos();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un caso con el ID proporcionado.");
                }
            }
        });

        //* SEUBSECCION BUSCAR CASO POR ID *//
        // BOTON BUSCAR CASO POR ID
        btnOrdenarCasosPrioridad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorCasos.getCasos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay casos registrados.");
                    return;
                }else {
                    gestorCasos.ordenarCasosPorPrioridadBurbuja();
                    StringBuilder info = new StringBuilder();
                    for (Caso caso : gestorCasos.getCasos()) {
                        info.append("ID: ").append(caso.getIdCaso()).append("\n")
                                .append("Título: ").append(caso.getTitulo()).append("\n")
                                .append("Descripción: ").append(caso.getDescripcion()).append("\n")
                                .append("Prioridad: ").append(caso.getPrioridad()).append("\n")
                                .append("Estado: ").append(caso.getEstado()).append("\n")
                                .append("Canal de Contacto: ").append(caso.getCanalContacto()).append("\n")
                                .append("Fecha de Creación: ").append(caso.getFechaCreacion()).append("\n")
                                .append("Fecha de Cierre: ").append(caso.getFechaCierre()).append("\n")
                                .append("ID Cliente: ").append(caso.getCliente()).append("\n")
                                .append("ID Técnico Asignado: ").append(caso.getTecnicoAsignado()).append("\n\n");
                    }
                    txtInfoCasosOrdenar.setText(info.toString());
                }
            }
        });

        /// SECCION ASIGNACIONES ///
        // BOTON REGISTRAR ASIGNACION DE CASO A TECNICO(CON VALIDACIONES)
        btnRegistrarAsignacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idAsignacion = (int) spnIdAsignacion.getValue();
                int idCaso = (int) spnIdCasoAsignacion.getValue();
                int idTecnico = (int) spnIdTecnicoAsignacion.getValue();
                String fechaAsignacion = txtFechAsignacion.getText();
                String fechaInicio = txtFechaInicioAtencionAsignacion.getText();
                String fechaFin = txtFechaFinAtencionAsignacion.getText();
                String estadoAsignacion = (String) cmbEstadoAsignacion.getSelectedItem();

                //BUSCAR EL CASO POR EL ID QUE INGRESO EL USUARIO
                if ( gestorCasos.getCasos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay casos registrados. Por favor, registre un caso primero.");
                    return;
                } else {
                    Caso caso = gestorCasos.buscarCasoPorIdBinaria(idCaso);
                    if (caso == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró un caso con el ID proporcionado.");
                        return;
                    }
                    idCaso = caso.getIdCaso();
                }
                //BUSCAR EL TECNICO POR EL ID QUE INGRESO EL USUARIO
                if ( gestorTecnicos.getListaTecnicos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay técnicos registrados. Por favor, registre un técnico primero.");
                    return;
                } else {
                    Tecnico tecnico = gestorTecnicos.buscarTecnicoPorIdBinaria(idTecnico);
                    if (tecnico == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró un técnico con el ID proporcionado.");
                        return;
                    }
                    idTecnico = tecnico.getIdTecnico();
                }

                if ( fechaAsignacion.isEmpty() || fechaInicio.isEmpty() || fechaFin.isEmpty() || estadoAsignacion.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Asignacion asignacion = new Asignacion(idAsignacion, idCaso, idTecnico,
                            fechaAsignacion, fechaInicio, fechaFin, estadoAsignacion);
                    gestorAsignaciones.agregarAsignacion(asignacion);
                    JOptionPane.showMessageDialog(null, "Asignación registrada exitosamente.");
                }
            }
        });
        //* SEUBSECCION LISTAR ASIGNACIONES *//
        // BOTON LISTAR ASIGNACIONES
        btnMostrarListaAsignaciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( gestorAsignaciones.getListaAsignaciones().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay asignaciones registradas.");
                    return;
                }else {
                    JOptionPane.showMessageDialog(null, "Cargando datos de asignaciones...");
                    llenarListaAsignaciones();
                }
            }
        });
        //* SEUBSECCION EDITAR ASIGNACION *//
        // BOTON SELECCIONAR ASIGNACION
        btnSeleccionarEditarAsignacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexAsignacion = listaAsignacionesEditar.getSelectedIndex();
                if ( indexAsignacion == -1 ) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una asignación de la lista.");
                    return;
                }else {
                    Asignacion asignacion = gestorAsignaciones.getListaAsignaciones().get(indexAsignacion);
                    spnIdAsignacionEditar.setValue(asignacion.getIdAsignacion());
                    spnIdCasoAsignacionEditar.setValue(asignacion.getCaso());
                    spnIdTecnicoAsignacionEditar.setValue(asignacion.getTecnico());
                    txtFechaAsignacionEditar.setText(asignacion.getFechaAsignacion());
                    txtFechaInicioAtencionAsignacionEditar.setText(asignacion.getFechaInicioAtencion());
                    txtFechaFinAtencionAsignacionEditar.setText(asignacion.getFechaFinAtencion());
                    cmbEstadoAsignacionEditar.setSelectedItem(asignacion.getEstadoAsignacion());
                }
            }
        });
        // BOTON EDITAR ASIGNACION
        btnEditarAsignacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idAsignacion = (int) spnIdAsignacionEditar.getValue();
                int idCaso = (int) spnIdCasoAsignacionEditar.getValue();
                int idTecnico = (int) spnIdTecnicoAsignacionEditar.getValue();
                String fechaAsignacion = txtFechaAsignacionEditar.getText();
                String fechaInicio = txtFechaInicioAtencionAsignacionEditar.getText();
                String fechaFin = txtFechaFinAtencionAsignacionEditar.getText();
                String estadoAsignacion = (String) cmbEstadoAsignacionEditar.getSelectedItem();

                if ( fechaAsignacion.isEmpty() || fechaInicio.isEmpty() || fechaFin.isEmpty() || estadoAsignacion.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Asignacion asignacion = new Asignacion(idAsignacion, idCaso, idTecnico,
                            fechaAsignacion, fechaInicio, fechaFin, estadoAsignacion);
                    gestorAsignaciones.getListaAsignaciones().set(indexAsignacion, asignacion);
                    JOptionPane.showMessageDialog(null, "Asignación editada exitosamente.");
                    llenarListaAsignaciones();
                }
            }
        });
        //* SEUBSECCION ELIMINAR ASIGNACION *//
        // BOTON MOSTRAR INFO ASIGNACION A ELIMINAR
        btnMoestrarAsignacionEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idAsignacion = (int) spnIdAsignacionEliminar.getValue();
                Asignacion asignacion = gestorAsignaciones.buscarAsignacion(idAsignacion);
                if ( asignacion == null ) {
                    JOptionPane.showMessageDialog(null, "No se encontró una asignación con el ID proporcionado.");
                    return;
                }else {
                    String info = "ID Asignación: " + asignacion.getIdAsignacion() + "\n" +
                            "ID Caso: " + asignacion.getCaso() + "\n" +
                            "ID Técnico: " + asignacion.getTecnico() + "\n" +
                            "Fecha de Asignación: " + asignacion.getFechaAsignacion() + "\n" +
                            "Fecha de Inicio de Atención: " + asignacion.getFechaInicioAtencion() + "\n" +
                            "Fecha de Fin de Atención: " + asignacion.getFechaFinAtencion() + "\n" +
                            "Estado de la Asignación: " + asignacion.getEstadoAsignacion();
                    txtInfoAsignacionEliminar.setText(info);
                }
            }
        });
        // BOTON ELIMINAR ASIGNACION
        btnEliminarAsignacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idAsignacion = (int) spnIdAsignacionEliminar.getValue();
                boolean eliminado = gestorAsignaciones.eliminarAsignacion(idAsignacion);
                if ( eliminado ) {
                    JOptionPane.showMessageDialog(null, "Asignación eliminada exitosamente.");
                    txtInfoAsignacionEliminar.setText("");
                    llenarListaAsignaciones();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una asignación con el ID proporcionado.");
                }
            }
        });
        /// SECCION SOLUCIONES ///
        //* SEUBSECCION REGISTRAR SOLUCION A CASO(CON VALIDACIONES) *//
        // BOTON REGISTRAR SOLUCION
        btnRegistrarSolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idSolucion = (int) spnIdSolucion.getValue();
                int idCaso = (int) spnIdCasoSolucion.getValue();
                int idTecnico = (int) spnIdTecnicoSolucion.getValue();
                String descripcionSolucion = txtDescripcionSolucion.getText();
                String fechaSolucion = txtFechaRegistroSolucion.getText();
                String notaAdicional = txtNotaSolucion.getText();

                //BUSCAR EL CASO POR EL ID QUE INGRESO EL USUARIO
                if ( gestorCasos.getCasos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay casos registrados. Por favor, registre un caso primero.");
                    return;
                } else {
                    Caso caso = gestorCasos.buscarCasoPorIdBinaria(idCaso);
                    if (caso == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró un caso con el ID proporcionado.");
                        return;
                    }
                    idCaso = caso.getIdCaso();
                }
                //BUSCAR EL TECNICO POR EL ID QUE INGRESO EL USUARIO
                if ( gestorTecnicos.getListaTecnicos().isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "No hay técnicos registrados. Por favor, registre un técnico primero.");
                    return;
                } else {
                    Tecnico tecnico = gestorTecnicos.buscarTecnicoPorIdBinaria(idTecnico);
                    if (tecnico == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró un técnico con el ID proporcionado.");
                        return;
                    }
                    idTecnico = tecnico.getIdTecnico();
                }

                if ( descripcionSolucion.isEmpty() || fechaSolucion.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Solucion solucion = new Solucion(idSolucion, descripcionSolucion, fechaSolucion,
                            idTecnico, idCaso, notaAdicional);
                    gestorSoluciones.agregarSolucion(solucion);
                    JOptionPane.showMessageDialog(null, "Solución registrada exitosamente.");
                }
            }
        });

        //* SEUBSECCION LISTAR SOLUCIONES *//
        // BOTON LISTAR SOLUCIONES
        btnListarSoluciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (gestorSoluciones.getSoluciones().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay soluciones registradas.");
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "Cargando datos de soluciones...");
                    llenarListaSoluciones();
                }
            }
        });
        //* SEUBSECCION EDITAR *//
        // BOTON SELECCIONAR SOLUCION
        btnSeleccionSolucionEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                indexSolucion = listaSolucionesEditar.getSelectedIndex();
                if (indexSolucion == -1) {
                    JOptionPane.showMessageDialog(null, "Por favor, seleccione una solución de la lista.");
                    return;
                } else {
                    Solucion solucion = gestorSoluciones.getSoluciones().get(indexSolucion);
                    spnIdSolucionEditar.setValue(solucion.getIdSolucion());
                    spnIdCasoSolucionEditar.setValue(solucion.getCasoAsociado());
                    spnIdTecnicoSolucionEditar.setValue(solucion.getTecnicoResponsable());
                    txtDescripcionSolucionEditar.setText(solucion.getDescripcion());
                    txtFechaRegistroSolucionEditar.setText(solucion.getFechaRegistro());
                    txtNotaSolucionEditar.setText(solucion.getNotaAdicional());
                }
            }
        });
        // BOTON EDITAR SOLUCION

        btnEditarSolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idSolucion = (int) spnIdSolucionEditar.getValue();
                int idCaso = (int) spnIdCasoSolucionEditar.getValue();
                int idTecnico = (int) spnIdTecnicoSolucionEditar.getValue();
                String descripcionSolucion = txtDescripcionSolucionEditar.getText();
                String fechaSolucion = txtFechaRegistroSolucionEditar.getText();
                String notaAdicional = txtNotaSolucionEditar.getText();

                if ( descripcionSolucion.isEmpty() || fechaSolucion.isEmpty() ) {
                    JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.");
                    return;
                }else {
                    Solucion solucion = new Solucion(idSolucion, descripcionSolucion, fechaSolucion,
                            idTecnico, idCaso, notaAdicional);
                    gestorSoluciones.getSoluciones().set(indexSolucion, solucion);
                    JOptionPane.showMessageDialog(null, "Solución editada exitosamente.");
                    llenarListaSoluciones();
                }
            }
        });
        //* SEUBSECCION ELIMINAR *//
        // BOTON MOSTRAR INFO SOLUCION A ELIMINAR
        btnMostrarSolucionEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idSolucion = (int) spnIdSolucionEliminar.getValue();
                Solucion solucion = gestorSoluciones.buscarSolucionPorIdLineal(idSolucion);
                if ( solucion == null ) {
                    JOptionPane.showMessageDialog(null, "No se encontró una solución con el ID proporcionado.");
                    return;
                }else {
                    String info = "ID Solución: " + solucion.getIdSolucion() + "\n" +
                            "Descripción: " + solucion.getDescripcion() + "\n" +
                            "Fecha de Registro: " + solucion.getFechaRegistro() + "\n" +
                            "ID Técnico Responsable: " + solucion.getTecnicoResponsable() + "\n" +
                            "ID Caso Asociado: " + solucion.getCasoAsociado() + "\n" +
                            "Nota Adicional: " + solucion.getNotaAdicional();
                    txtInfoSolucionEliminar.setText(info);
                }
            }
        });
        // BOTON ELIMINAR SOLUCION
        btnEliminarSolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idSolucion = (int) spnIdSolucionEliminar.getValue();
                boolean eliminado = gestorSoluciones.eliminarSolucion(idSolucion);
                if ( eliminado ) {
                    JOptionPane.showMessageDialog(null, "Solución eliminada exitosamente.");
                    txtInfoSolucionEliminar.setText("");
                    llenarListaSoluciones();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una solución con el ID proporcionado.");
                }
            }
        });
        //* SEUBSECCION BUSCAR SOLUCION POR ID *//
        // BOTON BUSCAR SOLUCIONES POR ID
        btnBuscarSolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idSolucion = (int) spnIdSolucionBuscar.getValue();
                Solucion solucion = gestorSoluciones.buscarSolucionPorIdLineal(idSolucion);
                if ( solucion == null ) {
                    JOptionPane.showMessageDialog(null, "No se encontró una solución con el ID proporcionado.");
                    return;
                }else {
                    String info = "ID Solución: " + solucion.getIdSolucion() + "\n" +
                            "Descripción: " + solucion.getDescripcion() + "\n" +
                            "Fecha de Registro: " + solucion.getFechaRegistro() + "\n" +
                            "ID Técnico Responsable: " + solucion.getTecnicoResponsable() + "\n" +
                            "ID Caso Asociado: " + solucion.getCasoAsociado() + "\n" +
                            "Nota Adicional: " + solucion.getNotaAdicional();
                    txtInfoSolucionBuscar.setText(info);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelpForge");
        frame.setContentPane(new Ventana().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
