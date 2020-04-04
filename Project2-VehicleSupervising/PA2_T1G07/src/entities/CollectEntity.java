package entities;

import java.util.Properties;
import javax.swing.*;
import kafkaUtils.Producer;
import message.Message;
import message.MessageSerializer;

/**
 * Class for the Collect Entity for the car supervising system.
 * 
 * @author Filipe Pires (85122) and João Alegria (85048)
 */
public class CollectEntity extends JFrame {
    
    private String[] topicNames = new String[]{"BatchTopic", "ReportTopic", "AlarmTopic"};

    /**
     * Creates new form CollectEntity
     */
    public CollectEntity() {
        this.setTitle("Collect Entiry");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        topicsToIncludeLabel = new javax.swing.JLabel();
        batchTopicCheckbox = new javax.swing.JCheckBox();
        reportTopicCheckbox = new javax.swing.JCheckBox();
        alarmTopicCheckbox = new javax.swing.JCheckBox();
        pathToCarDataLabel = new javax.swing.JLabel();
        filePath = new javax.swing.JTextField();
        timeoutLabel = new javax.swing.JLabel();
        timeout = new javax.swing.JSpinner();
        startBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logs = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setText("Collect Entity");

        topicsToIncludeLabel.setText("Topics to include:");

        batchTopicCheckbox.setSelected(true);
        batchTopicCheckbox.setText("BatchTopic");

        reportTopicCheckbox.setSelected(true);
        reportTopicCheckbox.setText("ReportTopic");

        alarmTopicCheckbox.setSelected(true);
        alarmTopicCheckbox.setText("AlarmTopic");

        pathToCarDataLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pathToCarDataLabel.setText("Path to Car Data (.txt):");

        filePath.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        filePath.setText("(default path is <ProjectLocation>/src/data)");

        timeoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        timeoutLabel.setText("Timeout (ms):");

        timeout.setModel(new javax.swing.SpinnerNumberModel(1000, 100, 10000, 100));

        startBtn.setText("Start");
        startBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startBtnMouseClicked(evt);
            }
        });

        logs.setColumns(20);
        logs.setRows(5);
        jScrollPane1.setViewportView(logs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addComponent(topicsToIncludeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(batchTopicCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reportTopicCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alarmTopicCheckbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pathToCarDataLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(timeoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(92, 92, 92))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(timeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(startBtn))
                                    .addComponent(filePath, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                                .addContainerGap(24, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(topicsToIncludeLabel)
                    .addComponent(pathToCarDataLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(batchTopicCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportTopicCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeoutLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alarmTopicCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startBtnMouseClicked
        
        Properties props = new Properties();                                                        // create properties to access producer configs
        props.put("bootstrap.servers", "localhost:9092");                                           // assign localhost id
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");      // define serializer for keys
        props.put("value.serializer", MessageSerializer.class.getName());    // define serializer for values

        Producer<String,Message> producer = new Producer<>(props);
        Message m = new Message("banana",10,0);
        producer.fireAndForget(this.topicNames,"k1",m);
        producer.close();
        
    }//GEN-LAST:event_startBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        System.out.println("[Collect] Running...");
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
            java.util.logging.Logger.getLogger(CollectEntity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CollectEntity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CollectEntity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollectEntity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollectEntity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alarmTopicCheckbox;
    private javax.swing.JCheckBox batchTopicCheckbox;
    private javax.swing.JTextField filePath;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea logs;
    private javax.swing.JLabel pathToCarDataLabel;
    private javax.swing.JCheckBox reportTopicCheckbox;
    private javax.swing.JButton startBtn;
    private javax.swing.JSpinner timeout;
    private javax.swing.JLabel timeoutLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel topicsToIncludeLabel;
    // End of variables declaration//GEN-END:variables

    

}
