/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page;

import db.table.MemberDAO;
import db.table.MemberDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author STU-05
 */
public class Join extends javax.swing.JFrame 
    implements ActionListener, ItemListener{
    String userid;
    private String[] emailArr = {"naver.com", "nate.com", "daum.net", "gmail.com", "직접 입력"};
    private boolean isDuplicate=false; //중복확인
    private int LoginState; //0이면 회원가입, 1이면 회원수정

    /**
     * Creates new form Join
     */
    public Join() {
        initComponents();
        init();
        addEvent();
        settingText();
        
    }
    
    public Join(String userid) {
        this();
        this.userid=userid;
        LoginState=1;
        settingText();
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbUserid = new javax.swing.JLabel();
        tfUserid = new javax.swing.JTextField();
        btUseridDup = new javax.swing.JButton();
        tfEm1 = new javax.swing.JTextField();
        tfPwd = new javax.swing.JTextField();
        lbTel = new javax.swing.JLabel();
        cbTel1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        tfTel2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tfTel3 = new javax.swing.JTextField();
        lbAddr1 = new javax.swing.JLabel();
        tfAddr1 = new javax.swing.JTextField();
        lbAddr2 = new javax.swing.JLabel();
        tfAddr2 = new javax.swing.JTextField();
        lbPwd = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbGol = new javax.swing.JLabel();
        cbEm2 = new javax.swing.JComboBox<>();
        tfEm3 = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btJoin = new javax.swing.JButton();
        btCan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("모아나 온라인 서점 홈페이지");

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2s.jpg"))); // NOI18N

        jLabel2.setText("어서오세요. 모아나입니다");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLogo)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbUserid.setText("아이디");

        btUseridDup.setText("중복확인");

        tfEm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEm1ActionPerformed(evt);
            }
        });

        lbTel.setText("휴대전화");

        cbTel1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "010", "011", "012", "016" }));

        jLabel13.setText("-");

        jLabel14.setText("-");

        lbAddr1.setText("주소");

        tfAddr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAddr1ActionPerformed(evt);
            }
        });

        lbAddr2.setText("상세주소");

        lbPwd.setText("비밀번호");

        lbName.setText("이름");

        lbGol.setText("@");

        cbEm2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gmail.com", "naver.com", "daum.net", "nate.com", "직접 입력" }));

        lbEmail.setText("이메일");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAddr1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbUserid)
                                    .addGap(28, 28, 28))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(lbPwd)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName)
                                    .addComponent(lbEmail))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfEm1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbGol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbEm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfEm3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfUserid, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                            .addComponent(tfPwd))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btUseridDup)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTel)
                            .addComponent(lbAddr2))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(cbTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfAddr2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAddr1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUserid)
                    .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUseridDup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPwd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGol)
                    .addComponent(cbEm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTel)
                    .addComponent(jLabel13)
                    .addComponent(tfTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(tfTel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddr1)
                    .addComponent(tfAddr1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddr2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddr2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btJoin.setText("가입하기");

        btCan.setText("취소");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btJoin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btJoin)
                    .addComponent(btCan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("회원가입");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAddr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddr1ActionPerformed

    private void tfEm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEm1ActionPerformed

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
            java.util.logging.Logger.getLogger(Join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Join.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Join().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCan;
    private javax.swing.JButton btJoin;
    private javax.swing.JButton btUseridDup;
    private javax.swing.JComboBox<String> cbEm2;
    private javax.swing.JComboBox<String> cbTel1;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbAddr1;
    private javax.swing.JLabel lbAddr2;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGol;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPwd;
    private javax.swing.JLabel lbTel;
    private javax.swing.JLabel lbUserid;
    private javax.swing.JTextField tfAddr1;
    private javax.swing.JTextField tfAddr2;
    private javax.swing.JTextField tfEm1;
    private javax.swing.JTextField tfEm3;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPwd;
    private javax.swing.JTextField tfTel2;
    private javax.swing.JTextField tfTel3;
    private javax.swing.JTextField tfUserid;
    // End of variables declaration//GEN-END:variables

private void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }

    private void addEvent() {
       btJoin.addActionListener(this);
       btCan.addActionListener(this);
       btUseridDup.addActionListener(this);
       
       cbEm2.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btCan) {
            this.dispose();
        }
        
        if(e.getSource()==btJoin) {
            
            if(LoginState==0) { 
                try {
                    //회원가입
                    register(); //addMember를 한 상태
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
            }else if(LoginState==1) { //로그인 한 상태임, 이미 정보를 뿌려준 상태임.
                isDuplicate=true;
                try {
                    EditMember();
                } 
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        //중복확인 체크
        if(e.getSource()==btUseridDup) {
            MemberDAO dao=new MemberDAO();
            try {
                isDuplicate=dao.selectByUseridReturnBool(tfUserid.getText());
                if(!isDuplicate) {
                    JOptionPane.showMessageDialog(this, "이미 존재하는 아이디입니다.");
                }else{
                    int useThisUserid = JOptionPane.showConfirmDialog(this, "사용가능한 아이디입니다.\n"
                            + "이 아이디를 사용하시겠습니까?", //goCart가 0을 받으면 YES 한 것
                    "아이디 중복 확인", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    
                    if(useThisUserid==0) { //사용하겠다
                        tfUserid.setEditable(false);
                    }else{ //사용하지 않겠다
                        isDuplicate=false;
                        tfUserid.setEditable(true);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void register() throws SQLException {
        //사용자 입력 받아오기
        userid=tfUserid.getText();
        String pwd=tfPwd.getText();
        String name=tfName.getText();

        String email1=tfEm1.getText();
        String email3=tfEm3.getText();
        String tel2=tfTel2.getText();
        String tel3=tfTel3.getText();
        String addr1=tfAddr1.getText();
        String addr2=tfAddr2.getText();

        String email2=cbEm2.getSelectedItem().toString();
        String tel1=cbTel1.getSelectedItem().toString();

        if(name==null || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "이름을 입력하세요");
            tfName.requestFocus();
            return;
        }
        if(userid==null || userid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
            tfUserid.requestFocus();
            return;
        } if(pwd==null || pwd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
            tfPwd.requestFocus();
            return;
        }
        if(!isDuplicate) {
            System.out.println("register에서 isDuplicate="+isDuplicate);
            JOptionPane.showMessageDialog(this, "아이디 중복을 확인하세요");
            btUseridDup.requestFocus();
            return;
        } 
        //(3) email과 hp 이어주기
        String tel="", email="";
        if(tel2!=null && !tel2.isEmpty() && tel3!=null && !tel3.isEmpty()) {
            tel=tel1+"-"+tel2+"-"+tel3;
        }else{
            JOptionPane.showMessageDialog(this, "전화번호를 입력하세요");
            return;
        }
        
        if(email1!=null && !email1.isEmpty()) {
            if(email2.equals("직접 입력")) {
                if(email3!=null && !email3.isEmpty()){
                    email=email1+"@"+email3;
                }
             }else{
                email=email1+"@"+email2;
            }
         }//if

        //db처리
        MemberDTO dto = new MemberDTO(userid, pwd, name, email, tel, addr1, addr2);
        MemberDAO dao = new MemberDAO();
        int cnt=dao.addMember(dto);
        System.out.println("회원가입 시 cnt값="+cnt);
        //3.화면처리 - cnt를 통해 회원가입 성공유무 처리
        if(cnt>0) {
            String result="회원가입 되었습니다!";
            JOptionPane.showMessageDialog(this, result);
            this.dispose();
        }else{
            String result="회원가입 실패!";
            JOptionPane.showMessageDialog(this, result);
        }
    }
    
    private void settingText() {
        if(LoginState==0) {
            setTitle("회원가입");
            btJoin.setText("회원가입");
            tfName.setEditable(true);
            tfUserid.setEditable(true);
            tfPwd.setEditable(true);
            btUseridDup.setEnabled(true);
        }else if(LoginState==1){
            setTitle("회원정보 수정");
            btJoin.setText("수정");
            tfName.setEditable(false);
            tfUserid.setEditable(false);
            tfPwd.setEditable(false);
            btUseridDup.setEnabled(false);
            tfUserid.setText(userid);
            
            try {
                showInfo(userid);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
         if(e.getSource()==cbEm2) {
            if(e.getStateChange()==ItemEvent.SELECTED) {
                String selItem=cbEm2.getSelectedItem().toString();
                if(selItem.equals("직접 입력")) {
                    tfEm3.setEnabled(true);
                    
                    tfEm3.requestFocus();
                    tfEm3.setText("");
                }else{
                    tfEm3.setText("");
                    tfEm3.setEditable(false);
                    
                }
            }
        }
    }

    private void EditMember() throws SQLException {
        //사용자 입력 받아오기
        userid=tfUserid.getText();
        String pwd=tfPwd.getText();
        String name=tfName.getText();

        String email1=tfEm1.getText();
        String email3=tfEm3.getText();
        String tel2=tfTel2.getText();
        String tel3=tfTel3.getText();
        String addr1=tfAddr1.getText();
        String addr2=tfAddr2.getText();

        String email2=cbEm2.getSelectedItem().toString();
        String tel1=cbTel1.getSelectedItem().toString();

        if(name==null || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "이름을 입력하세요");
            tfName.requestFocus();
            return;
        }
        if(userid==null || userid.isEmpty()) {
            JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
            tfUserid.requestFocus();
            return;
        } if(pwd==null || pwd.isEmpty()) {
            JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
            tfPwd.requestFocus();
            return;
        }
        if(!isDuplicate) {
            JOptionPane.showMessageDialog(this, "아이디 중복확인하세요");
            btUseridDup.requestFocus();
            return;
        }
        
        //(3) email과 hp 이어주기
        String tel="", email="";
        if(tel2!=null && !tel2.isEmpty() && tel3!=null && !tel3.isEmpty()) {
            tel=tel1+"-"+tel2+"-"+tel3;
        }
        
        if(email1!=null && !email1.isEmpty()) {
            if(email2.equals("직접입력")) {
                if(email3!=null && !email3.isEmpty()){
                    email=email1+"@"+email3;
                }
             }else{
                email=email1+"@"+email2;
            }
         }//if

        //db처리
        MemberDTO dto = new MemberDTO(userid, pwd, name, email, tel, addr1, addr2);
        MemberDAO dao = new MemberDAO();
        int cnt=dao.updateMember(dto);
        
        //3.화면처리 - cnt를 통해 회원가입 성공유무 처리
        String result="";
        if(cnt>0) {
            result="회원정보 수정되었습니다!";
            this.dispose();
        }else{
            result="회원정보 수정 실패!";
            JOptionPane.showMessageDialog(this, result);
        }
    }

    private void showInfo(String userid) throws SQLException {
        MemberDAO dao=new MemberDAO();
     
        //현재 저장된 정보를 받아온다.
        MemberDTO dto=dao.selectByUserid(userid);

        String pwd=dto.getPwd();
        String name=dto.getName();
        String tel=dto.getTel();
        String email=dto.getEmail();
        String address1=dto.getAddress1();
        String address2=dto.getAddress1();
        
        //기본사항 넣기
        tfPwd.setText(pwd);
        tfName.setText(name);
        tfAddr1.setText(address1);
        tfAddr2.setText(address2);

        //tel 쪼개서 넣기
        if(tel!=null && !tel.isEmpty()) {
            String[] telArr=tel.split("-"); 

            cbTel1.setSelectedItem(telArr[0]);
            tfTel2.setText(telArr[1]);
            tfTel3.setText(telArr[2]);
        }//if

        //email 쪼개서 넣기
        if(email!=null && !email.isEmpty()) { 
            String[] emails=email.split("@");

            tfEm1.setText(emails[0]);

            String email2=emails[1];
            boolean emailExist=false;
            
            for(int i=0;i<emailArr.length;i++) { //email이 cb에 있는가?
                if(email2.equals(emailArr[i])) { 
                    emailExist=true;
                    break;
                }

            }//for

            if(emailExist) { //email이 cb에 있다면
                cbEm2.setSelectedItem(email2);
            }else{                         //email이 cb에 없다면
                cbEm2.setSelectedItem("직접입력");
                tfEm3.setText(email2);
                tfEm3.setEnabled(true);
            }
        }
    }
    
}