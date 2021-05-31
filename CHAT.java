/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniO;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JComponent;
import java.sql.*;
import java.net.*;
import java.io.*;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author shivam
 */

public class CHAT extends javax.swing.JFrame {
Connection con = null;
static String user_name;
static Socket s;
static DataInputStream din;
static DataOutputStream dout;  
Boolean typing;
String friend[]=new String[8];
String user_t[]=new String[8];
int cf;
    /**
     * Creates new form CHAT
     * @param user
     */
    public CHAT(String user) {
        initComponents();
         con = dbConnection.con();
         user_name = user;
         try{
       Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from user_details limit 8");
          
int i=0;       

while(rs.next())
        {  System.out.println("User name= "+user_name+":: user name= "+rs.getString(2)+":: User= "+rs.getString(1));
        String abc=rs.getString(2);
        System.out.println(user_name.getClass().getName());
        System.out.println(rs.getString(2).getClass().getName());
            if(abc.equals(user_name) ){
          System.out.println("match found");
          
            }
            else{
         
             friend[i]=rs.getString(1);
             user_t[i]=rs.getString(2);
             i++;
            }
        }
        friend1.setText(friend[0]);
        friend2.setText(friend[1]);
        friend3.setText(friend[2]);
        friend4.setText(friend[3]);
        friend5.setText(friend[4]);
        friend6.setText(friend[5]);
        friend7.setText(friend[6]);
        //friend8.setText(friend[7]);
        
      
        
         /*  s = new Socket("127.0.0.1", 6001);
            din  = new DataInputStream(s.getInputStream());
            dout = new DataOutputStream(s.getOutputStream());
            
            String msginput = "";
            
	    while(true){
                area.setLayout(new BorderLayout());
	        msginput = din.readUTF();
            	JPanel p2 = formatLabel(msginput);
                JPanel left = new JPanel(new BorderLayout());
                left.add(p2, BorderLayout.LINE_START);
           Component vertical = null;
                
                vertical.add(left);
                vertical.add(Box.createVerticalStrut(15));
                area.add(vertical, BorderLayout.PAGE_START);
                //f1.validate();
        
            }*/
        
         }
    
     catch(Exception e2)
    {
     System.out.println(e2);
    }
        
   
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TextField = new javax.swing.JTextField();
        SEND = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        friend1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        friend2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        friend3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        friend4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        friend5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        friend6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        friend7 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextField.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N

        SEND.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        SEND.setText("SEND");
        SEND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENDActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("CHAT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        friend1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        friend1.setText("FRIEND");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friend1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(friend1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setText("CHAT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        friend2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        friend2.setText("FRIEND");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(friend2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel1)
                    .addComponent(friend2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setText("CHAT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        friend3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        friend3.setText("FRIEND");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friend3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(friend3))
                .addGap(36, 36, 36))
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setText("CHAT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        friend4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        friend4.setText("FRIEND");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friend4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(friend4))
                .addGap(36, 36, 36))
        );

        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setText("CHAT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        friend5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        friend5.setText("FRIEND");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friend5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(friend5))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton7.setText("CHAT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        friend6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        friend6.setText("FRIEND");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friend6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(friend6)
                    .addComponent(jButton7))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton8.setText("CHAT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        friend7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        friend7.setText("FRIEND");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(friend7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(friend7))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        name.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton9.setText("REFRESH");

        jButton10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton10.setText("CLEAR CHAT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SEND, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jButton9)
                        .addGap(31, 31, 31)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(583, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SEND, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new HOME(user_name).setVisible(true);
       this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cf=0;
        name.setText(friend[0]);
String mas="";
String t="";
try{
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    String s=rss.getString(4);
//    
//    for(int ii=0;ii<=s.length();ii+=40){
//    if(s.length()>=40){
//        t+=s.substring(ii,(ii+40))+"\n";
//        
//       }
//    else{
//        t+=s.substring(ii)+"\n";
//        
//    }
// //   System.out.println(t);
//    }
    
    System.out.println(t);
 
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
   // System.out.println(mas);
    }
    else{
    mas=mas+"\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);  
 }
 catch(Exception ea){
     System.out.println("user name:"+user_t[cf]+"   current user:"+user_name);
        System.out.println("Error in pawan");
 }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENDActionPerformed
        try{ Statement stmt_i=con.createStatement();
       System.out.println("Error 1");
       stmt_i.executeUpdate("INSERT INTO `message`( `f_1`, `f_2`, `message`) VALUES ('"+user_name+"','"+user_t[cf]+"','"+TextField.getText()+"')");
       TextField.setText("");
       String mas = "";
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
    }
    else{
    mas=mas+"\t\t\t\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);
       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_SENDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
cf=1;
        name.setText(friend[1]);
String mas="";
String t="";
try{
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    String s=rss.getString(4);

    System.out.println(t);
 
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
   // System.out.println(mas);
    }
    else{
    mas=mas+"\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);  
 }
 catch(Exception ea){
     System.out.println("user name:"+user_t[cf]+"   current user:"+user_name);
        System.out.println("Error in pawan");
 }                                             // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      cf=2;
        name.setText(friend[2]);
String mas="";
String t="";
try{
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    String s=rss.getString(4);

    System.out.println(t);
 
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
   // System.out.println(mas);
    }
    else{
    mas=mas+"\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);  
 }
 catch(Exception ea){
     System.out.println("user name:"+user_t[cf]+"   current user:"+user_name);
        System.out.println("Error in pawan");
 }                                             // TODO add your handling code here:
           // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 cf=3;
        name.setText(friend[3]);
String mas="";
String t="";
try{
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    String s=rss.getString(4);

    System.out.println(t);
 
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
   // System.out.println(mas);
    }
    else{
    mas=mas+"\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);  
 }
 catch(Exception ea){
     System.out.println("user name:"+user_t[cf]+"   current user:"+user_name);
        System.out.println("Error in pawan");
 }                                             // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
  cf=4;
        name.setText(friend[4]);
String mas="";
String t="";
try{
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    String s=rss.getString(4);

    System.out.println(t);
 
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
   // System.out.println(mas);
    }
    else{
    mas=mas+"\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);  
 }
 catch(Exception ea){
     System.out.println("user name:"+user_t[cf]+"   current user:"+user_name);
        System.out.println("Error in pawan");
 }                                             // TODO add your handling code here:
     // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    cf=5;
        name.setText(friend[5]);
String mas="";
String t="";
try{
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    String s=rss.getString(4);

    System.out.println(t);
 
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
   // System.out.println(mas);
    }
    else{
    mas=mas+"\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);  
 }
 catch(Exception ea){
     System.out.println("user name:"+user_t[cf]+"   current user:"+user_name);
        System.out.println("Error in pawan");
 }                                             // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
cf=6;
        name.setText(friend[6]);
String mas="";
String t="";
try{
       Statement stmt_c=con.createStatement();
       System.out.println("Error 1");
        ResultSet rss=stmt_c.executeQuery("Select * from message where (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"');" );
        System.out.println("Error 2");
while(rss.next())
{   System.out.println(user_name+"  ::  "+rss.getString(2));
    String s=rss.getString(4);

    System.out.println(t);
 
    if(user_name.equals(rss.getString(2))){
    mas=mas+rss.getString(4)+"\n";
    System.out.println("Error 3");
   // System.out.println(mas);
    }
    else{
    mas=mas+"\t\t\t\t"+rss.getString(4)+"\n";
        
    }
}
area.setText(mas);  
 }
 catch(Exception ea){
     System.out.println("user name:"+user_t[cf]+"   current user:"+user_name);
        System.out.println("Error in pawan");
 }                                             // TODO add your handling code here:
    
   // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
area.setText(""); 
 Statement stmt_clear=con.createStatement();
       System.out.println("Error 1");
        stmt_clear.executeUpdate("DELETE FROM message' WHERE (f_1='"+user_name+"' and f_2='"+user_t[cf]+"') or (f_1='"+user_t[cf]+"' and f_2='"+user_name+"')");

// TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(CHAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CHAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CHAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CHAT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CHAT(user_name).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SEND;
    private javax.swing.JTextField TextField;
    private javax.swing.JTextArea area;
    private javax.swing.JLabel friend1;
    private javax.swing.JLabel friend2;
    private javax.swing.JLabel friend3;
    private javax.swing.JLabel friend4;
    private javax.swing.JLabel friend5;
    private javax.swing.JLabel friend6;
    private javax.swing.JLabel friend7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables

    private JPanel formatLabel(String msginput) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
