/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciarcontas;

import java.io.File;
import java.io.FileInputStream;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Diego Oliveira Froes
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private String jTextCaminho;
    private boolean copyCellContent;
    private JProgresso jProgresso;
    private Thread progresso;
    private final int OK_PRINT = 1;
    private final int LIXO = 2;
    private final String CELL_READ_START = "Tel";
    private ArrayList<Cliente> list_Client = new ArrayList<Cliente>();
    private Log log_Entrada = new Log();
    private ArrayList<String> list_Auxi_Client = new ArrayList<String>();
    private int index_corrente;

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.getCrossPlatformLookAndFeelClassName();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        //teste();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelPrincipal1 = new javax.swing.JPanel();
        jButtonAbrirConta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelDados = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemAbrirConta = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PromoSystem - Corporate Tel Solutions");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logoPromo.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanelPrincipal1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonAbrirConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tel.png"))); // NOI18N
        jButtonAbrirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirContaActionPerformed(evt);
            }
        });

        jLabel2.setText("Abrir Conta");

        javax.swing.GroupLayout jPanelPrincipal1Layout = new javax.swing.GroupLayout(jPanelPrincipal1);
        jPanelPrincipal1.setLayout(jPanelPrincipal1Layout);
        jPanelPrincipal1Layout.setHorizontalGroup(
            jPanelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipal1Layout.createSequentialGroup()
                .addGroup(jPanelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAbrirConta))
                    .addGroup(jPanelPrincipal1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelPrincipal1Layout.setVerticalGroup(
            jPanelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAbrirConta)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número", "Tipo Tarifa", "Valor", "Novo Valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(208, 208, 208))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        jMenuItemAbrirConta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAbrirConta.setText("Abrir Conta");
        jMenuItemAbrirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAbrirContaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemAbrirConta);
        jMenu1.add(jSeparator1);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");

        jMenuItem1.setText("Contato");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Sobre");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAbrirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAbrirContaActionPerformed
        diretorioArquivo();
    }//GEN-LAST:event_jMenuItemAbrirContaActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jButtonAbrirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirContaActionPerformed
        diretorioArquivo();
    }//GEN-LAST:event_jButtonAbrirContaActionPerformed

    private void diretorioArquivo() {
        try {
            JFileChooser abrir = new JFileChooser();
            // Filtro para Arquivo TXT
            abrir.setFileFilter(new FileNameExtensionFilter("Image files", "xls", "xlsx"));
            abrir.setAcceptAllFileFilterUsed(false);

            abrir.setDialogTitle("Carregar Base de Dados");

            int retorno = abrir.showOpenDialog(this);

            if (retorno == JFileChooser.APPROVE_OPTION) {
                String caminho = abrir.getSelectedFile().getAbsolutePath();
                this.jTextCaminho = (caminho);
            }
        } catch (Exception error) {
            error.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não Foi Possível Carregar o Arquivo");
        }

        carregarArquivo(this.jTextCaminho);
    }

    private void carregarArquivo(String diretorio) {

        //openAguarde();

        // TODO Colocar a parte de leitura para a classe GerenciarArquivo.java 
        try {

            FileInputStream file = new FileInputStream(new File(jTextCaminho));
            //boolean copyCellContent = false;

            //Create Workbook instance holding reference to .xlsx file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()) {

                Row row = rowIterator.next();

                if (this.copyCellContent) {
                    //For each row, iterate through all the columns and copy content
                    Iterator<Cell> cellIterator = row.cellIterator();
                    checkValidContent(cellIterator, row, OK_PRINT);
                } else {
                    //For each row, iterate through all the columns and check to change flag
                    Iterator<Cell> cellIterator = row.cellIterator();
                    checkValidContent(cellIterator, row, LIXO);
                }

                System.out.println("");
            }

            file.close();

            for (int i = 0; i < list_Client.size(); i++) {
                System.out.println("\n--------------------------------------------------\n");
                System.out.println("\nTELEFONE: " + list_Client.get(i).getTelefone());
                for (int j = 0; j < list_Client.get(i).getLog_entrada().size(); j++) {
                    list_Client.get(i).getLog_entrada().toString();
                }
                System.out.println("\n--------------------------------------------------\n");
            }



            //closeAguarde();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void checkValidContent(Iterator<Cell> cellIterator, Row row, int flag) {

        if (flag == OK_PRINT) {
            while (cellIterator.hasNext() && this.copyCellContent) {

                Cell cell = cellIterator.next();

                // Condição parada de leitura do arquivo.
                if (row.getCell(0) == null) {
                    System.out.print("Conta lida com sucesso");
                    this.copyCellContent = false;
                } else {
                    setClientContent(cell, flag);
                }
            }
        } else if (flag == LIXO) {
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                setClientContent(cell, flag);
            }
        }
        
        // Fim de uma interação de uma linha, passando por cada celula
        list_Client.get(index_corrente).getLog_entrada().add(log_Entrada);

    }

    private void setClientContent(Cell cell, int flag) {
        DataFormatter formatter = new DataFormatter();
        String telefone;

        if (flag == OK_PRINT) {
            if (cell.getColumnIndex() == 0) {
                telefone = formatter.formatCellValue(cell);
                addClient(telefone, cell, flag);
            } else {
                addLog(cell, flag);
            }
        }
    }

    private void openAguarde() {
        jProgresso = new JProgresso();
        jProgresso.setVisible(true);
        progresso = new Thread(jProgresso);
        progresso.start();
    }

    private void closeAguarde() {
        jProgresso.finalizarProgresso();
        progresso = null;
    }

    private void addClient(String telefone, Cell cell, int flag) {

        if (list_Auxi_Client.isEmpty()) {
            Cliente c = new Cliente();
            c.setTelefone(telefone);

            list_Client.add(c);
            list_Auxi_Client.add(telefone);
            index_corrente = list_Client.indexOf(telefone);

            //list_Client. // Gravar Log
            addLog(cell, flag);

        } else {
            if (list_Auxi_Client.contains(telefone)) {
                // Só grava Log
                index_corrente = list_Client.indexOf(telefone);
                addLog(cell, flag);
            } else {
                // Add Cliente and Gravar Log
                Cliente c = new Cliente();
                c.setTelefone(telefone);
                list_Client.add(c);
                list_Auxi_Client.add(telefone);
                index_corrente = list_Client.indexOf(telefone);

                addLog(cell, flag);

            }
        }
    }

    private void addLog(Cell cell, int flag) {
        DataFormatter formatter = new DataFormatter();

        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC: {
                if (flag == OK_PRINT) {
                    //System.out.print(formatter.formatCellValue(cell) + "\t");


                    setaLogCampo((cell.getColumnIndex() - 1), formatter.formatCellValue(cell));


                } else if (flag == LIXO) {
                    System.out.print("###");
                }
                break;
            }
            case Cell.CELL_TYPE_STRING: {
                if (flag == OK_PRINT) {
                    //System.out.print(cell.getStringCellValue() + "\t");


                    setaLogCampo((cell.getColumnIndex() - 1), formatter.formatCellValue(cell));


                } else if (flag == LIXO) {
                    if (cell.getStringCellValue().equals(CELL_READ_START)) {
                        System.out.print("Imprimindo valores na proxima linha...\n");
                        this.copyCellContent = true;
                    }
                    System.out.print("###");
                }
                break;
            }
        }
    }

    private void setaLogCampo(int index, String conteudo) {
        switch (index) {
            case 0: {
                log_Entrada.setCargo(conteudo);
                break;
            }
            case 1: {
                log_Entrada.setData(conteudo);
                break;
            }
            case 2: {
                log_Entrada.setHora(conteudo);
                break;
            }
            case 3: {
                log_Entrada.setOrigem_uf_destino(conteudo);
                break;
            }
            case 4: {
                log_Entrada.setNumero(conteudo);
                break;
            }
            case 5: {
                log_Entrada.setDuracao_quantidade(conteudo);
                break;
            }
            case 6: {
                log_Entrada.setTarifa(Integer.parseInt(conteudo));
                break;
            }
            case 7: {
                log_Entrada.setValor(Integer.parseInt(conteudo));
                break;
            }
            case 8: {
                log_Entrada.setValor_cobrado(Integer.parseInt(conteudo));
                break;
            }
            case 9: {
                log_Entrada.setSub_secao(conteudo);
                break;
            }
            case 10: {
                log_Entrada.setImposto(Integer.parseInt(conteudo));
                break;
            }
            case 11: {
                log_Entrada.setDescricao(conteudo);
                break;
            }
            case 12: {
                log_Entrada.setCargo(conteudo);
                break;
            }
            default: {
            }
        }
    }

    private void teste() {
        ArrayList<String> t = new ArrayList<>();

        t.add("A");
        t.add("B");
        t.add("C");
        t.add("D");

        if (t.contains("E")) {

            System.out.println(t.indexOf("E"));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrirConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAbrirConta;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelPrincipal1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
