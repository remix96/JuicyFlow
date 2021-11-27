package JuicyFlow;

import java.util.LinkedList;
import javax.swing.*;
/**
 *
 * @author juicyflowgroup
 */
public class JuicyFlowGUI extends javax.swing.JFrame {
    private final JuicyFlow juicyFlow;
    private final StartUp startUp;
    
    public JuicyFlowGUI() {
        initComponents();
        this.juicyFlow = JuicyFlow.getIstanza();
        this.startUp = new StartUp(juicyFlow);
        //CONTROLLO PER ABILITAZIONE A GESTIONE VENDITE PENDENDI
        if(juicyFlow.getListaOrdiniPendenti().isEmpty())
            this.avviaConvalidaOrdinePendente.setEnabled(false);
    }
    
    public float ottieniNumeroControllato(String testo){
        float quantitàDose = 0;
        do{
            try{
                quantitàDose = Float.parseFloat(JOptionPane.showInputDialog(this, testo));
            } catch (Exception ex){
                if(ex.getMessage() == null){
                    break;
                } else{
                    JOptionPane.showMessageDialog(this, "La quantità non può contenere lettere");
                }
            }
        }while(quantitàDose <= 0);
        
        return quantitàDose;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inserisciCarico = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        listaProdottiInserimento = new javax.swing.JComboBox<>();
        inserisciQuantità = new javax.swing.JButton();
        terminaInserimento = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        prodottiInseriti = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        avviaLavorazione = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        listaRicette = new javax.swing.JComboBox<>();
        confermaLavorazione = new javax.swing.JButton();
        terminaLavorazione = new javax.swing.JButton();
        inserisciQuantitàPrincipale = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        displayLavorazione = new javax.swing.JTextArea();
        esci = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gestisciVendita = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        confermaVendita = new javax.swing.JButton();
        listaProdottiVendita = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        inserisciQuantitàVendita = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        displayVendita = new javax.swing.JTextArea();
        contenutoSerbatoi = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displaySerbatoi = new javax.swing.JTextArea();
        selezioneSerbatoio = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        listaSerbatoi = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        displayMagazzino = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        prodottiInMagazzino = new javax.swing.JTextArea();
        chiudiMagazzino = new javax.swing.JButton();
        mostraDisponibilità = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        esitoVendita = new javax.swing.JLabel();
        terminaVendita = new javax.swing.JButton();
        annulla = new javax.swing.JButton();
        convalidaOrdinePendente = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        listaOrdini = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        textAreaProdottiOrdineVendita = new javax.swing.JTextArea();
        selezionaOrdineVenditaPendente = new javax.swing.JButton();
        creaRicetta = new javax.swing.JFrame();
        jPanel10 = new javax.swing.JPanel();
        listaProdottiCreaRicetta = new javax.swing.JComboBox<>();
        inserisciDoseCreaRicetta = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        riepilogoCreaRicetta = new javax.swing.JTextArea();
        terminaInserimentoCreaRicetta = new javax.swing.JButton();
        ingressoCreaRicetta = new javax.swing.JCheckBox();
        principaleCreaRicetta = new javax.swing.JCheckBox();
        modificaEliminaRicetta = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        riepilogoModificaRicetta = new javax.swing.JTextArea();
        listaRicetteModificaRicetta = new javax.swing.JComboBox<>();
        modificaRicetta = new javax.swing.JButton();
        eliminaRicetta = new javax.swing.JButton();
        selezionaRicettaModificaRicetta = new javax.swing.JButton();
        inserisciNomeCreaRicetta = new javax.swing.JFrame();
        jPanel11 = new javax.swing.JPanel();
        labelNomeCreaRicetta = new javax.swing.JTextField();
        confermaCreaRicetta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        creaProdotto = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        creaProdottoNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        listaTipologiaProdotti = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        modificaDosiRicetta = new javax.swing.JFrame();
        jPanel14 = new javax.swing.JPanel();
        listaRigheRicetta = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        inserisci = new javax.swing.JButton();
        avvia = new javax.swing.JButton();
        mostraContenutoSerbatoi = new javax.swing.JButton();
        avviaVendita = new javax.swing.JButton();
        mostraProdottiInMagazzino = new javax.swing.JButton();
        avviaConvalidaOrdinePendente = new javax.swing.JButton();
        aggiungiRicetta = new javax.swing.JButton();
        aggiungiProdotto = new javax.swing.JButton();
        modificaBottone = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        inserisciCarico.setTitle("JuicyFlow - Inserisci carico");
        inserisciCarico.setMinimumSize(new java.awt.Dimension(325, 388));

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserimento carico"));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        inserisciQuantità.setText("Inserisci quantità");
        inserisciQuantità.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserisciProdotto(evt);
            }
        });

        terminaInserimento.setText("Termina inserimento");
        terminaInserimento.setEnabled(false);
        terminaInserimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminaInserimento(evt);
            }
        });

        prodottiInseriti.setEditable(false);
        prodottiInseriti.setColumns(20);
        prodottiInseriti.setRows(5);
        jScrollPane2.setViewportView(prodottiInseriti);

        jLabel2.setText("Seleziona prodotto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(terminaInserimento)
                    .addComponent(inserisciQuantità)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(listaProdottiInserimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaProdottiInserimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inserisciQuantità)
                .addGap(18, 18, 18)
                .addComponent(terminaInserimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout inserisciCaricoLayout = new javax.swing.GroupLayout(inserisciCarico.getContentPane());
        inserisciCarico.getContentPane().setLayout(inserisciCaricoLayout);
        inserisciCaricoLayout.setHorizontalGroup(
            inserisciCaricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inserisciCaricoLayout.setVerticalGroup(
            inserisciCaricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        avviaLavorazione.setMinimumSize(new java.awt.Dimension(420, 450));

        jPanel4.setBackground(java.awt.Color.lightGray);
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestione lavorazione"));

        listaRicette.setToolTipText("ricette");

        confermaLavorazione.setText("Verifica serbatoi disponibili");
        confermaLavorazione.setEnabled(false);
        confermaLavorazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificaSerbatoiDisponibili(evt);
            }
        });

        terminaLavorazione.setText("Termina lavorazione");
        terminaLavorazione.setEnabled(false);
        terminaLavorazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminaLavorazione(evt);
            }
        });

        inserisciQuantitàPrincipale.setText("Conferma selezione");
        inserisciQuantitàPrincipale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserisciQuantità(evt);
            }
        });

        displayLavorazione.setEditable(false);
        displayLavorazione.setColumns(20);
        displayLavorazione.setRows(5);
        jScrollPane3.setViewportView(displayLavorazione);

        esci.setText("Esci");
        esci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esci(evt);
            }
        });

        jLabel1.setText("Seleziona ricetta");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listaRicette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inserisciQuantitàPrincipale, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(confermaLavorazione, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(terminaLavorazione, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(esci, javax.swing.GroupLayout.Alignment.CENTER)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaRicette, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(inserisciQuantitàPrincipale)
                .addGap(26, 26, 26)
                .addComponent(confermaLavorazione)
                .addGap(18, 18, 18)
                .addComponent(terminaLavorazione)
                .addGap(18, 18, 18)
                .addComponent(esci)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout avviaLavorazioneLayout = new javax.swing.GroupLayout(avviaLavorazione.getContentPane());
        avviaLavorazione.getContentPane().setLayout(avviaLavorazioneLayout);
        avviaLavorazioneLayout.setHorizontalGroup(
            avviaLavorazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        avviaLavorazioneLayout.setVerticalGroup(
            avviaLavorazioneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        gestisciVendita.setTitle("JuicyFlow - Gestisci vendita");
        gestisciVendita.setMinimumSize(new java.awt.Dimension(380, 300));

        jPanel6.setBackground(java.awt.Color.lightGray);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestisci vendita"));

        confermaVendita.setText("Conferma vendita");
        confermaVendita.setEnabled(false);
        confermaVendita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaVendita(evt);
            }
        });

        jLabel4.setText("Seleziona prodotto");

        inserisciQuantitàVendita.setText("Inserisci quantità");
        inserisciQuantitàVendita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selezionaProdotto(evt);
            }
        });

        displayVendita.setEditable(false);
        displayVendita.setColumns(20);
        displayVendita.setRows(5);
        displayVendita.setText("Elenco prodotti selezionati per la vendita:\n\n");
        jScrollPane4.setViewportView(displayVendita);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(confermaVendita, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(inserisciQuantitàVendita)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaProdottiVendita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaProdottiVendita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inserisciQuantitàVendita)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confermaVendita)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gestisciVenditaLayout = new javax.swing.GroupLayout(gestisciVendita.getContentPane());
        gestisciVendita.getContentPane().setLayout(gestisciVenditaLayout);
        gestisciVenditaLayout.setHorizontalGroup(
            gestisciVenditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gestisciVenditaLayout.setVerticalGroup(
            gestisciVenditaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        contenutoSerbatoi.setMinimumSize(new java.awt.Dimension(350, 250));

        jPanel3.setBackground(java.awt.Color.lightGray);
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenuto serbatoi"));

        displaySerbatoi.setEditable(false);
        displaySerbatoi.setColumns(20);
        displaySerbatoi.setRows(5);
        jScrollPane1.setViewportView(displaySerbatoi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout contenutoSerbatoiLayout = new javax.swing.GroupLayout(contenutoSerbatoi.getContentPane());
        contenutoSerbatoi.getContentPane().setLayout(contenutoSerbatoiLayout);
        contenutoSerbatoiLayout.setHorizontalGroup(
            contenutoSerbatoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contenutoSerbatoiLayout.setVerticalGroup(
            contenutoSerbatoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        selezioneSerbatoio.setMinimumSize(new java.awt.Dimension(270, 225));

        jPanel5.setBackground(java.awt.Color.lightGray);
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Selezione serbatoio d'uscita"));

        jLabel3.setText("Seleziona serbatoio ");

        jButton1.setText("Conferma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaSelezioneSerbatoio(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaSerbatoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton1)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(listaSerbatoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout selezioneSerbatoioLayout = new javax.swing.GroupLayout(selezioneSerbatoio.getContentPane());
        selezioneSerbatoio.getContentPane().setLayout(selezioneSerbatoioLayout);
        selezioneSerbatoioLayout.setHorizontalGroup(
            selezioneSerbatoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        selezioneSerbatoioLayout.setVerticalGroup(
            selezioneSerbatoioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selezioneSerbatoioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        displayMagazzino.setMinimumSize(new java.awt.Dimension(300, 500));

        jPanel7.setBackground(java.awt.Color.lightGray);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Prodotti in magazzino"));

        prodottiInMagazzino.setEditable(false);
        prodottiInMagazzino.setColumns(20);
        prodottiInMagazzino.setRows(5);
        jScrollPane5.setViewportView(prodottiInMagazzino);

        chiudiMagazzino.setText("Chiudi");
        chiudiMagazzino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiudiMagazzino(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chiudiMagazzino))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chiudiMagazzino)
                .addContainerGap())
        );

        javax.swing.GroupLayout displayMagazzinoLayout = new javax.swing.GroupLayout(displayMagazzino.getContentPane());
        displayMagazzino.getContentPane().setLayout(displayMagazzinoLayout);
        displayMagazzinoLayout.setHorizontalGroup(
            displayMagazzinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(displayMagazzinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayMagazzinoLayout.setVerticalGroup(
            displayMagazzinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
            .addGroup(displayMagazzinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mostraDisponibilità.setMinimumSize(new java.awt.Dimension(390, 190));

        jPanel8.setBackground(java.awt.Color.lightGray);
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Disponibilità"));

        esitoVendita.setText("jLabel5");

        terminaVendita.setText("Conferma");
        terminaVendita.setEnabled(false);
        terminaVendita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminaVendita(evt);
            }
        });

        annulla.setText("Annulla");
        annulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaVendita(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(esitoVendita)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(annulla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(terminaVendita)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(esitoVendita)
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terminaVendita)
                    .addComponent(annulla))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mostraDisponibilitàLayout = new javax.swing.GroupLayout(mostraDisponibilità.getContentPane());
        mostraDisponibilità.getContentPane().setLayout(mostraDisponibilitàLayout);
        mostraDisponibilitàLayout.setHorizontalGroup(
            mostraDisponibilitàLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
            .addGroup(mostraDisponibilitàLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mostraDisponibilitàLayout.setVerticalGroup(
            mostraDisponibilitàLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(mostraDisponibilitàLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        convalidaOrdinePendente.setMinimumSize(new java.awt.Dimension(440, 300));

        jPanel9.setBackground(java.awt.Color.lightGray);
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestione ordini pendenti"));

        jButton3.setText("Conferma vendita");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaVenditaPendente(evt);
            }
        });

        textAreaProdottiOrdineVendita.setEditable(false);
        textAreaProdottiOrdineVendita.setColumns(20);
        textAreaProdottiOrdineVendita.setRows(5);
        jScrollPane8.setViewportView(textAreaProdottiOrdineVendita);

        selezionaOrdineVenditaPendente.setText("Seleziona ordine vendita");
        selezionaOrdineVenditaPendente.setActionCommand("selezionaOrdineVenditaPendente");
        selezionaOrdineVenditaPendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selezionaOrdineVenditaPendente(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(listaOrdini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selezionaOrdineVenditaPendente))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaOrdini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selezionaOrdineVenditaPendente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout convalidaOrdinePendenteLayout = new javax.swing.GroupLayout(convalidaOrdinePendente.getContentPane());
        convalidaOrdinePendente.getContentPane().setLayout(convalidaOrdinePendenteLayout);
        convalidaOrdinePendenteLayout.setHorizontalGroup(
            convalidaOrdinePendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(convalidaOrdinePendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        convalidaOrdinePendenteLayout.setVerticalGroup(
            convalidaOrdinePendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(convalidaOrdinePendenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        creaRicetta.setMinimumSize(new java.awt.Dimension(475, 350));

        jPanel10.setBackground(java.awt.Color.lightGray);
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Crea ricetta"));

        inserisciDoseCreaRicetta.setText("Inserisci dose");
        inserisciDoseCreaRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserisciDose(evt);
            }
        });

        riepilogoCreaRicetta.setEditable(false);
        riepilogoCreaRicetta.setColumns(20);
        riepilogoCreaRicetta.setRows(5);
        jScrollPane6.setViewportView(riepilogoCreaRicetta);

        terminaInserimentoCreaRicetta.setText("Termina inserimento");
        terminaInserimentoCreaRicetta.setEnabled(false);
        terminaInserimentoCreaRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminaInserimentoCreaRicetta(evt);
            }
        });

        ingressoCreaRicetta.setText("Ingresso");

        principaleCreaRicetta.setText("Principale");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(listaProdottiCreaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(terminaInserimentoCreaRicetta))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ingressoCreaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(principaleCreaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inserisciDoseCreaRicetta))))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaProdottiCreaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserisciDoseCreaRicetta)
                    .addComponent(ingressoCreaRicetta)
                    .addComponent(principaleCreaRicetta))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(terminaInserimentoCreaRicetta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout creaRicettaLayout = new javax.swing.GroupLayout(creaRicetta.getContentPane());
        creaRicetta.getContentPane().setLayout(creaRicettaLayout);
        creaRicettaLayout.setHorizontalGroup(
            creaRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        creaRicettaLayout.setVerticalGroup(
            creaRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        modificaEliminaRicetta.setMinimumSize(new java.awt.Dimension(400, 300));

        jPanel12.setBackground(java.awt.Color.lightGray);
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifica o Elimina ricetta"));

        riepilogoModificaRicetta.setEditable(false);
        riepilogoModificaRicetta.setColumns(20);
        riepilogoModificaRicetta.setRows(5);
        jScrollPane7.setViewportView(riepilogoModificaRicetta);

        modificaRicetta.setText("Modifica ricetta");
        modificaRicetta.setEnabled(false);
        modificaRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaDose(evt);
            }
        });

        eliminaRicetta.setText("Elimina ricetta");
        eliminaRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaRicetta(evt);
            }
        });

        selezionaRicettaModificaRicetta.setText("Seleziona ricetta");
        selezionaRicettaModificaRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selezionaRicettaModificaRicetta(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane7)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addComponent(listaRicetteModificaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(selezionaRicettaModificaRicetta)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(modificaRicetta)
                            .addGap(18, 18, 18)
                            .addComponent(eliminaRicetta)))
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(listaRicetteModificaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selezionaRicettaModificaRicetta))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane7)
                    .addGap(28, 28, 28)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(modificaRicetta)
                        .addComponent(eliminaRicetta))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout modificaEliminaRicettaLayout = new javax.swing.GroupLayout(modificaEliminaRicetta.getContentPane());
        modificaEliminaRicetta.getContentPane().setLayout(modificaEliminaRicettaLayout);
        modificaEliminaRicettaLayout.setHorizontalGroup(
            modificaEliminaRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        modificaEliminaRicettaLayout.setVerticalGroup(
            modificaEliminaRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        inserisciNomeCreaRicetta.setMinimumSize(new java.awt.Dimension(370, 250));

        jPanel11.setBackground(java.awt.Color.lightGray);
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserisci nome"));

        confermaCreaRicetta.setText("Conferma");
        confermaCreaRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confermaCreaRicetta(evt);
            }
        });

        jLabel5.setText("Inserisci nome della ricetta");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(labelNomeCreaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confermaCreaRicetta))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNomeCreaRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confermaCreaRicetta)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout inserisciNomeCreaRicettaLayout = new javax.swing.GroupLayout(inserisciNomeCreaRicetta.getContentPane());
        inserisciNomeCreaRicetta.getContentPane().setLayout(inserisciNomeCreaRicettaLayout);
        inserisciNomeCreaRicettaLayout.setHorizontalGroup(
            inserisciNomeCreaRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inserisciNomeCreaRicettaLayout.setVerticalGroup(
            inserisciNomeCreaRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        creaProdotto.setMinimumSize(new java.awt.Dimension(450, 320));

        jPanel13.setBackground(java.awt.Color.lightGray);
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Crea prodotto"));
        jPanel13.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel6.setText("Nome prodotto:");

        jLabel7.setText("Tipo prodotto:");

        listaTipologiaProdotti.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arancia", "Additivo", "Finito", "Spremuta" }));

        jButton2.setText("Conferma");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creaProdotto(evt);
            }
        });

        jButton4.setText("Annulla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaCreaRIcetta(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(listaTipologiaProdotti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(creaProdottoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creaProdottoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(listaTipologiaProdotti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout creaProdottoLayout = new javax.swing.GroupLayout(creaProdotto.getContentPane());
        creaProdotto.getContentPane().setLayout(creaProdottoLayout);
        creaProdottoLayout.setHorizontalGroup(
            creaProdottoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        creaProdottoLayout.setVerticalGroup(
            creaProdottoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        modificaDosiRicetta.setMinimumSize(new java.awt.Dimension(340, 230));

        jPanel14.setBackground(java.awt.Color.lightGray);
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifica dosi"));

        jLabel9.setText("Seleziona la riga:");

        jButton6.setText("Immetti dose");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impostaNuovaDose(evt);
            }
        });

        jToggleButton1.setText("Esci");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminaModificaDosi(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaRigheRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToggleButton1))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaRigheRicetta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout modificaDosiRicettaLayout = new javax.swing.GroupLayout(modificaDosiRicetta.getContentPane());
        modificaDosiRicetta.getContentPane().setLayout(modificaDosiRicettaLayout);
        modificaDosiRicettaLayout.setHorizontalGroup(
            modificaDosiRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        modificaDosiRicettaLayout.setVerticalGroup(
            modificaDosiRicettaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(370, 407));

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Home"));

        inserisci.setText("Avvia inserimento");
        inserisci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaInserimento(evt);
            }
        });

        avvia.setText("Avvia lavorazione");
        avvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaLavorazione(evt);
            }
        });

        mostraContenutoSerbatoi.setText("Mostra contenuto serbatoi");
        mostraContenutoSerbatoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraSerbatoi(evt);
            }
        });

        avviaVendita.setText("Avvia vendita");
        avviaVendita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaVendita(evt);
            }
        });

        mostraProdottiInMagazzino.setText("Mostra prodotti in magazzino");
        mostraProdottiInMagazzino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraProdottiInMagazzino(evt);
            }
        });

        avviaConvalidaOrdinePendente.setText("Convalida ordine pendente");
        avviaConvalidaOrdinePendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaConvalidaOrdinePendente(evt);
            }
        });

        aggiungiRicetta.setText("Aggiungi ricetta");
        aggiungiRicetta.setActionCommand("aggiungiRicetta");
        aggiungiRicetta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaCreaRicetta(evt);
            }
        });

        aggiungiProdotto.setText("Crea prodotto");
        aggiungiProdotto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaAggiungiProdotto(evt);
            }
        });

        modificaBottone.setText("Modifica/Elimina ricetta");
        modificaBottone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaBottone(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JuicyFlow/logo JuicyFlow.png"))); // NOI18N
        jLabel8.setText("logo");
        jLabel8.setMaximumSize(new java.awt.Dimension(257, 257));
        jLabel8.setMinimumSize(new java.awt.Dimension(257, 257));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(inserisci)
                    .addComponent(avvia)
                    .addComponent(avviaVendita)
                    .addComponent(mostraProdottiInMagazzino)
                    .addComponent(mostraContenutoSerbatoi)
                    .addComponent(avviaConvalidaOrdinePendente)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(aggiungiRicetta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificaBottone))
                    .addComponent(aggiungiProdotto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(inserisci))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(avvia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avviaVendita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostraProdottiInMagazzino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mostraContenutoSerbatoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avviaConvalidaOrdinePendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aggiungiRicetta)
                    .addComponent(modificaBottone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(aggiungiProdotto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avviaLavorazione(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaLavorazione
        listaRicette.removeAllItems();
        for(Ricetta corrente: this.juicyFlow.getRicette()){
            listaRicette.addItem(corrente);
        }
        
        avviaLavorazione.setVisible(true);
    }//GEN-LAST:event_avviaLavorazione

    private void mostraSerbatoi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraSerbatoi
        displaySerbatoi.setText(this.juicyFlow.mostraSerbatoi());
        contenutoSerbatoi.setVisible(true);
    }//GEN-LAST:event_mostraSerbatoi

    private void verificaSerbatoiDisponibili(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificaSerbatoiDisponibili
        listaSerbatoi.removeAllItems();
        for(Serbatoio corrente : this.juicyFlow.verificaSerbatoiDisponibili()){
            listaSerbatoi.addItem(corrente);
        }
        selezioneSerbatoio.setVisible(true);
        selezioneSerbatoio.setAlwaysOnTop(true);
    }//GEN-LAST:event_verificaSerbatoiDisponibili

    private void terminaLavorazione(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminaLavorazione
        String indexSerbatoioSelezionato = null;
        if(listaSerbatoi.getItemCount() != 0){
            this.juicyFlow.terminaLavorazione((Serbatoio) listaSerbatoi.getSelectedItem()); 
        }else
            this.juicyFlow.terminaLavorazione();
        this.avviaLavorazione.setVisible(false);
        JOptionPane.showMessageDialog(this, "Lavorazione effettuata");
        
        listaRicette.setEnabled(true);
        inserisciQuantitàPrincipale.setEnabled(true);
        displayLavorazione.setText("");
        terminaLavorazione.setEnabled(false);
        selezioneSerbatoio.setAlwaysOnTop(false);
    }//GEN-LAST:event_terminaLavorazione

    private void avviaInserimento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaInserimento
        listaProdottiInserimento.removeAllItems();
        this.prodottiInseriti.setText("");
        this.juicyFlow.avviaInserimento();
        for(Prodotto corrente: this.juicyFlow.avviaInserimento())
            this.listaProdottiInserimento.addItem(corrente);
        inserisciCarico.setVisible(true);
    }//GEN-LAST:event_avviaInserimento

    private void terminaInserimento(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminaInserimento
        this.juicyFlow.terminaInserimento();
        inserisciCarico.setVisible(false);
        prodottiInseriti.setText("");
        this.terminaInserimento.setEnabled(false);
    }//GEN-LAST:event_terminaInserimento

    private void inserisciProdotto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserisciProdotto
        StringBuilder elenco = new StringBuilder("Elenco prodotti inseriti - quantità presenti: \n");
        try{
            this.inserisciCarico.setAlwaysOnTop(false);
            this.juicyFlow.inserisciProdotto((Prodotto) listaProdottiInserimento.getSelectedItem(), this.ottieniNumeroControllato("Quantità:"));
            this.inserisciCarico.setAlwaysOnTop(true);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "E' stata immessa una quantità non valida");
        } finally{ 
            //COSTRUISCE LA STRINGA
            for(RigaMagazzino rigaCorrente : this.juicyFlow.getMagazzino().getBufferRigheMagazzino()){
                elenco.append(rigaCorrente.getProdotto().getNome() + " : " + rigaCorrente.getQuantità() + " Kg\n");
            }
            prodottiInseriti.setText(elenco.toString());
        }
        this.terminaInserimento.setEnabled(true);
    }//GEN-LAST:event_inserisciProdotto

    private void inserisciQuantità(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserisciQuantità
        boolean effettuabile = true;
        boolean spremuta = false;
        String prodottoPrincipale;
        listaRicette.setEnabled(false);
        StringBuilder esito = new StringBuilder("-Prodotti coinvolti: \n\n");
        //OPERATORE INSERISCE QUANTITà
        //QUI VIENE ESEGUITO ANCHE IL METODO SELEZIONARICETTALAVORAZIONE.
        float quantitàImmessa = 0;
        
        LinkedList<ProdottoInLavorazione> prodottiInLavorazione = null;
        
        try{
            prodottoPrincipale = this.juicyFlow.selezionaRicetta((Ricetta) this.listaRicette.getSelectedItem());
            this.avviaLavorazione.setAlwaysOnTop(false);
            quantitàImmessa = this.ottieniNumeroControllato("Quantità >0 per " + prodottoPrincipale +" : ");
            this.avviaLavorazione.setAlwaysOnTop(true);
            prodottiInLavorazione = this.juicyFlow.inserisciQuantità(quantitàImmessa);
        } catch (Exception ex) {
            switch (ex.getMessage()){
                case "ProdottoPrincipaleMancante":
                    JOptionPane.showMessageDialog(rootPane, "Nessun prodotto principale trovato nella ricetta");
                    return;
            }
        } finally {
            for(ProdottoInLavorazione corrente : prodottiInLavorazione){
                esito.append(corrente.getRigaRicetta().getProdotto().getNome() + " : " + corrente.getQuantità() + " Kg");
                //SE è DI TIPO SPREMUTA
                if(corrente.getRigaRicetta().getProdotto().getTipo().equalsIgnoreCase("spremuta")){ 
                    if(!corrente.getRigaRicetta().getIngresso())
                        spremuta = true;
                    else{ 
                        if(corrente.getDisponibilità()){
                           esito.append(" --> DISPONIBILE\n");
                        }   
                        else{
                            effettuabile = false;
                            esito.append(" --> NON DISPONIBILE\n");
                        }
                    }
                    //SE NON è DI TIPO SPREMUTA
                }else{ 
                    if(corrente.getRigaRicetta().getIngresso()){
                        if(corrente.getDisponibilità()){
                            esito.append(" --> DISPONIBILE\n");
                        }
                        else{
                            effettuabile = false;
                            esito.append(" --> NON DISPONIBILE\n");
                        }
                    }else
                        esito.append("\n");
                }
            }
            displayLavorazione.setText(esito.toString());
            if(!spremuta && effettuabile){
                terminaLavorazione.setEnabled(true);
                inserisciQuantitàPrincipale.setEnabled(false);
            }
            if(effettuabile && spremuta){
                confermaLavorazione.setEnabled(true);
                inserisciQuantitàPrincipale.setEnabled(false);
            }
        }
    }//GEN-LAST:event_inserisciQuantità

    private void avviaVendita(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaVendita
        //RIEMPIE LA COMBOBOX CON I PRODOTTI FINITI
        listaProdottiVendita.removeAllItems();
        this.displayVendita.setText("Elenco prodotti selezionati per la vendita:\n\n");
        for(Prodotto corrente : this.juicyFlow.avviaVendita())
            listaProdottiVendita.addItem(corrente);
        gestisciVendita.setVisible(true);
    }//GEN-LAST:event_avviaVendita

    private void confermaVendita(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaVendita
        confermaVendita.setEnabled(false);
        this.juicyFlow.confermaVendita();
        //SE LA VENDITA è EFFETTUABILE
        if(this.juicyFlow.getOrdineVenditaCorrente().getDisponibilità())
            esitoVendita.setText("Vendita effettuabile");
            
        //ALTRIMENTI
        else
            esitoVendita.setText("<html>Le quantità immesse non sono disponibili,"
                    + " confermando la vendita questa verrà settata a pendente</html>");
        this.gestisciVendita.setVisible(false);
        this.terminaVendita.setEnabled(true);
        this.mostraDisponibilità.setVisible(true); 
    }//GEN-LAST:event_confermaVendita

    private void confermaSelezioneSerbatoio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaSelezioneSerbatoio
        this.selezioneSerbatoio.setVisible(false);
        confermaLavorazione.setEnabled(false);
        terminaLavorazione.setEnabled(true);
    }//GEN-LAST:event_confermaSelezioneSerbatoio

    private void selezionaProdotto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selezionaProdotto
        //QUI VIENE PRESO IL NOME DEL PRODOTTO SELEZIONATO DALL'OPERATORE      
        Prodotto prodotto = (Prodotto) listaProdottiVendita.getSelectedItem();               
        //QUI VIENE INSERITA LA QUANTITà DALL'OPERATORE
        float quantità = 0;
        
        try {
            quantità = this.ottieniNumeroControllato("quantità " + prodotto.getNome() + " >0 :");
            this.gestisciVendita.setAlwaysOnTop(true);
            
            this.juicyFlow.selezionaProdotto(prodotto, quantità);
            
            this.displayVendita.append("-" + prodotto.getNome() + ": " + quantità + "\n");
            confermaVendita.setEnabled(true);
            this.gestisciVendita.setAlwaysOnTop(false);
        } catch (Exception ex) {
            switch (ex.getMessage()){
                case "prodottoGiàPresente":
                    this.gestisciVendita.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(this, "Il prodotto inserito è già presente nell'ordine vendita");
                    this.gestisciVendita.setAlwaysOnTop(true);
                    break;
            }
        }
    }//GEN-LAST:event_selezionaProdotto

    private void mostraProdottiInMagazzino(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraProdottiInMagazzino
        displayMagazzino.setVisible(true);
        prodottiInMagazzino.setText(this.juicyFlow.mostraProdottiInMagazzino());
    }//GEN-LAST:event_mostraProdottiInMagazzino

    private void chiudiMagazzino(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chiudiMagazzino
        prodottiInMagazzino.setText("");
        displayMagazzino.setVisible(false);
    }//GEN-LAST:event_chiudiMagazzino

    private void terminaVendita(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminaVendita
        this.juicyFlow.terminaVendita();
        if(!this.juicyFlow.getListaOrdiniPendenti().isEmpty())
            this.avviaConvalidaOrdinePendente.setEnabled(true);
        this.mostraDisponibilità.setVisible(false);
        displayVendita.setText("");
        if(this.juicyFlow.getListaOrdiniPendenti().isEmpty())
            this.avviaConvalidaOrdinePendente.setEnabled(false);
        this.terminaVendita.setEnabled(false);
    }//GEN-LAST:event_terminaVendita

    private void annullaVendita(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annullaVendita
        this.mostraDisponibilità.setVisible(false);
        this.juicyFlow.annullaVendita();
        displayVendita.setText("");
    }//GEN-LAST:event_annullaVendita

    private void avviaConvalidaOrdinePendente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaConvalidaOrdinePendente
        listaOrdini.removeAllItems();
        this.textAreaProdottiOrdineVendita.setText("");
        for(OrdineVendita corrente : this.juicyFlow.getListaOrdiniPendenti())
            listaOrdini.addItem(corrente);
        this.convalidaOrdinePendente.setVisible(true);
    }//GEN-LAST:event_avviaConvalidaOrdinePendente

    private void confermaVenditaPendente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaVenditaPendente
        confermaVendita.setEnabled(false);
        this.juicyFlow.confermaVendita((OrdineVendita) this.listaOrdini.getSelectedItem());
        //SE LA VENDITA è EFFETTUABILE
        if(this.juicyFlow.getOrdineVenditaCorrente().getDisponibilità()){
            esitoVendita.setText("Vendita effettuabile");
            this.terminaVendita.setEnabled(true);
        }
        //ALTRIMENTI
        else{
            this.terminaVendita.setEnabled(false);
            esitoVendita.setText("<html>Le quantità immesse non sono disponibili</html>");
        }
        this.gestisciVendita.setVisible(false);
        this.mostraDisponibilità.setVisible(true);
        this.convalidaOrdinePendente.setVisible(false);
    }//GEN-LAST:event_confermaVenditaPendente

    private void avviaCreaRicetta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaCreaRicetta
        riepilogoCreaRicetta.setText("");
        this.labelNomeCreaRicetta.setText("");
        listaProdottiCreaRicetta.removeAllItems();
        for(Prodotto corrente : this.juicyFlow.avviaCreaRicetta())
            listaProdottiCreaRicetta.addItem(corrente);
        this.creaRicetta.setVisible(true);
    }//GEN-LAST:event_avviaCreaRicetta

    private void terminaInserimentoCreaRicetta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminaInserimentoCreaRicetta
        this.creaRicetta.setVisible(false);
        this.inserisciNomeCreaRicetta.setVisible(true);
        this.creaRicetta.setAlwaysOnTop(false);
        this.riepilogoCreaRicetta.setText("");
        this.terminaInserimentoCreaRicetta.setEnabled(false);
    }//GEN-LAST:event_terminaInserimentoCreaRicetta

    private void inserisciDose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserisciDose
        String nomeProdotto = listaProdottiCreaRicetta.getSelectedItem().toString();
        this.creaRicetta.setAlwaysOnTop(false);
        float quantitàDose = 0;
        
        try{
            
            quantitàDose = this.ottieniNumeroControllato("quantità " + nomeProdotto + " :");
            
            this.creaRicetta.setAlwaysOnTop(true);
            
            this.juicyFlow.inserisciRigaRicetta((Prodotto) listaProdottiCreaRicetta.getSelectedItem(), quantitàDose, this.ingressoCreaRicetta.isSelected(), this.principaleCreaRicetta.isSelected());
            this.riepilogoCreaRicetta.append("-" + nomeProdotto + ": " + quantitàDose);
            if(this.principaleCreaRicetta.isSelected()){
                this.riepilogoCreaRicetta.append(" - principale");
            }
            if(this.ingressoCreaRicetta.isSelected()){
                this.riepilogoCreaRicetta.append(" - ingresso");
            } else {
                this.riepilogoCreaRicetta.append(" - uscita");
            }
            this.riepilogoCreaRicetta.append("\n");
            terminaInserimentoCreaRicetta.setEnabled(true);
            this.creaRicetta.setAlwaysOnTop(false);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            switch (ex.getMessage()){
                case "principalePresente":
                    this.creaRicetta.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(this, "Sono stati inseriti due prodotti principali");
                    this.creaRicetta.setAlwaysOnTop(true);
                    break;
                case "spremutaUscitaPresente":
                    this.creaRicetta.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(this, "Sono state inserite due spremute in uscita");
                    this.creaRicetta.setAlwaysOnTop(true);
                    break;
                case "prodottoPresente":
                    this.creaRicetta.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(this, "Il prodotto " + nomeProdotto + " è già stato inserito");
                    this.creaRicetta.setAlwaysOnTop(true);
                    break;
            }
            
        }
        this.terminaInserimentoCreaRicetta.setEnabled(true);
    }//GEN-LAST:event_inserisciDose
    
    private void avviaAggiungiProdotto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaAggiungiProdotto
        this.creaProdotto.setVisible(true);
    }//GEN-LAST:event_avviaAggiungiProdotto

    private void modificaBottone(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaBottone
        this.riepilogoModificaRicetta.setText("");
        listaRicetteModificaRicetta.removeAllItems();
        for(Ricetta corrente : this.juicyFlow.getRicette())
            listaRicetteModificaRicetta.addItem(corrente);
        this.modificaEliminaRicetta.setVisible(true);
    }//GEN-LAST:event_modificaBottone

    private void selezionaRicettaModificaRicetta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selezionaRicettaModificaRicetta
        this.riepilogoModificaRicetta.setText("");
        
        for(RigaRicetta corrente : this.juicyFlow.ottieniRigheRicetta((Ricetta) listaRicetteModificaRicetta.getSelectedItem())){
            this.riepilogoModificaRicetta.append("-" + corrente.getProdotto().getNome() + ": " + corrente.getDose());
            if(corrente.getPrincipale()){
                this.riepilogoModificaRicetta.append(" - principale");
            }
            if(corrente.getIngresso()){
                this.riepilogoModificaRicetta.append(" - ingresso");
            } else {
                this.riepilogoModificaRicetta.append(" - uscita");
            }
            this.riepilogoModificaRicetta.append("\n");
            this.modificaRicetta.setEnabled(true);
        }
    }//GEN-LAST:event_selezionaRicettaModificaRicetta

    private void confermaCreaRicetta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confermaCreaRicetta
        try {
            this.juicyFlow.terminaCreaRicetta(this.labelNomeCreaRicetta.getText());
            this.inserisciNomeCreaRicetta.setVisible(false);
        } catch (Exception ex) {
            if(ex.getMessage().equalsIgnoreCase("Nessun nome inserito")){
                this.inserisciNomeCreaRicetta.setAlwaysOnTop(false);
                JOptionPane.showMessageDialog(this, "Nessun nome inserito per la ricetta");
                this.inserisciNomeCreaRicetta.setAlwaysOnTop(true);
            }
            else{
                this.inserisciNomeCreaRicetta.setAlwaysOnTop(false);
                JOptionPane.showMessageDialog(this, "Esiste già una ricetta con questo nome");
                this.inserisciNomeCreaRicetta.setAlwaysOnTop(true);
            }
        }
    }//GEN-LAST:event_confermaCreaRicetta

    private void eliminaRicetta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaRicetta
        this.juicyFlow.terminaEliminaRicetta((Ricetta) listaRicetteModificaRicetta.getSelectedItem());
        JOptionPane.showMessageDialog(this, "Ricetta eliminata correttamente");
        this.modificaEliminaRicetta.setVisible(false);
    }//GEN-LAST:event_eliminaRicetta

    private void esci(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esci
        avviaLavorazione.setVisible(false);
        listaRicette.setEnabled(true);
        inserisciQuantitàPrincipale.setEnabled(true);
        displayLavorazione.setText("");
    }//GEN-LAST:event_esci

    private void creaProdotto(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creaProdotto
        String nome = this.creaProdottoNome.getText();
        boolean soloNumeri = nome.chars().allMatch(Character::isDigit);
        if(soloNumeri){
            //Per il wellness dell'attore, un po' di umorismo
            JOptionPane.showMessageDialog(this, "Non sono una rubrica");
        }
        else{
            //Se casella di testo non vuota
            if(!nome.equalsIgnoreCase("")){
                String tipo = (String) this.listaTipologiaProdotti.getSelectedItem();
                if(!this.juicyFlow.aggiungiProdotto(nome, tipo.toLowerCase()))
                    JOptionPane.showMessageDialog(this, "Prodotto aggiunto");
                else
                    JOptionPane.showMessageDialog(this, "Prodotto già presente");
            }
            else{
                JOptionPane.showMessageDialog(this, "Inserisci un nome per il prodotto");
            }
        }
        this.creaProdotto.setVisible(false);
    }//GEN-LAST:event_creaProdotto

    private void annullaCreaRIcetta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annullaCreaRIcetta
        this.creaProdotto.setVisible(false);
    }//GEN-LAST:event_annullaCreaRIcetta

    private void selezionaOrdineVenditaPendente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selezionaOrdineVenditaPendente
        this.textAreaProdottiOrdineVendita.setText(juicyFlow.visualizzaRigheOrdinePendente((OrdineVendita) this.listaOrdini.getSelectedItem()));
    }//GEN-LAST:event_selezionaOrdineVenditaPendente

    private void impostaNuovaDose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impostaNuovaDose
        this.modificaDosiRicetta.setAlwaysOnTop(false);
        float nuovaDose = this.ottieniNumeroControllato("Dose:");
        this.modificaDosiRicetta.setAlwaysOnTop(true);
        try {
            this.juicyFlow.impostaNuovaDose(nuovaDose, (RigaRicetta) this.listaRigheRicetta.getSelectedItem());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.modificaDosiRicetta.setAlwaysOnTop(false);
        JOptionPane.showMessageDialog(this, "Dose modificata correttamente");
        this.modificaDosiRicetta.setAlwaysOnTop(true);
    }//GEN-LAST:event_impostaNuovaDose

    private void modificaDose(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaDose
        Ricetta ricettaSelezionata = (Ricetta)listaRicetteModificaRicetta.getSelectedItem();
        //Popolo combobox con righeRicetta opportune
        this.listaRigheRicetta.removeAllItems();
        for(RigaRicetta corrente: ricettaSelezionata.getRigheRicetta()){
            if(!corrente.getPrincipale())
                this.listaRigheRicetta.addItem(corrente);
        }
        this.riepilogoModificaRicetta.setText("");
        this.modificaEliminaRicetta.setVisible(false);
        this.modificaDosiRicetta.setVisible(true);
    }//GEN-LAST:event_modificaDose

    private void terminaModificaDosi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminaModificaDosi
        this.modificaDosiRicetta.setVisible(false);
        this.modificaDosiRicetta.setAlwaysOnTop(false);
        this.modificaRicetta.setEnabled(false);
    }//GEN-LAST:event_terminaModificaDosi
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuicyFlowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuicyFlowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuicyFlowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuicyFlowGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuicyFlowGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiProdotto;
    private javax.swing.JButton aggiungiRicetta;
    private javax.swing.JButton annulla;
    private javax.swing.JButton avvia;
    private javax.swing.JButton avviaConvalidaOrdinePendente;
    private javax.swing.JFrame avviaLavorazione;
    private javax.swing.JButton avviaVendita;
    private javax.swing.JButton chiudiMagazzino;
    private javax.swing.JButton confermaCreaRicetta;
    private javax.swing.JButton confermaLavorazione;
    private javax.swing.JButton confermaVendita;
    private javax.swing.JFrame contenutoSerbatoi;
    private javax.swing.JFrame convalidaOrdinePendente;
    private javax.swing.JFrame creaProdotto;
    private javax.swing.JTextField creaProdottoNome;
    private javax.swing.JFrame creaRicetta;
    private javax.swing.JTextArea displayLavorazione;
    private javax.swing.JFrame displayMagazzino;
    private javax.swing.JTextArea displaySerbatoi;
    private javax.swing.JTextArea displayVendita;
    private javax.swing.JButton eliminaRicetta;
    private javax.swing.JButton esci;
    private javax.swing.JLabel esitoVendita;
    private javax.swing.JFrame gestisciVendita;
    private javax.swing.JCheckBox ingressoCreaRicetta;
    private javax.swing.JButton inserisci;
    private javax.swing.JFrame inserisciCarico;
    private javax.swing.JButton inserisciDoseCreaRicetta;
    private javax.swing.JFrame inserisciNomeCreaRicetta;
    private javax.swing.JButton inserisciQuantità;
    private javax.swing.JButton inserisciQuantitàPrincipale;
    private javax.swing.JButton inserisciQuantitàVendita;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField labelNomeCreaRicetta;
    private javax.swing.JComboBox<OrdineVendita> listaOrdini;
    private javax.swing.JComboBox<Prodotto> listaProdottiCreaRicetta;
    private javax.swing.JComboBox<Prodotto> listaProdottiInserimento;
    private javax.swing.JComboBox<Prodotto> listaProdottiVendita;
    private javax.swing.JComboBox<Ricetta> listaRicette;
    private javax.swing.JComboBox<Ricetta> listaRicetteModificaRicetta;
    private javax.swing.JComboBox<RigaRicetta> listaRigheRicetta;
    private javax.swing.JComboBox<Serbatoio> listaSerbatoi;
    private javax.swing.JComboBox<String> listaTipologiaProdotti;
    private javax.swing.JButton modificaBottone;
    private javax.swing.JFrame modificaDosiRicetta;
    private javax.swing.JFrame modificaEliminaRicetta;
    private javax.swing.JButton modificaRicetta;
    private javax.swing.JButton mostraContenutoSerbatoi;
    private javax.swing.JFrame mostraDisponibilità;
    private javax.swing.JButton mostraProdottiInMagazzino;
    private javax.swing.JCheckBox principaleCreaRicetta;
    private javax.swing.JTextArea prodottiInMagazzino;
    private javax.swing.JTextArea prodottiInseriti;
    private javax.swing.JTextArea riepilogoCreaRicetta;
    private javax.swing.JTextArea riepilogoModificaRicetta;
    private javax.swing.JButton selezionaOrdineVenditaPendente;
    private javax.swing.JButton selezionaRicettaModificaRicetta;
    private javax.swing.JFrame selezioneSerbatoio;
    private javax.swing.JButton terminaInserimento;
    private javax.swing.JButton terminaInserimentoCreaRicetta;
    private javax.swing.JButton terminaLavorazione;
    private javax.swing.JButton terminaVendita;
    private javax.swing.JTextArea textAreaProdottiOrdineVendita;
    // End of variables declaration//GEN-END:variables
}
