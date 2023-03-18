package com.WaiperSoft.GUI;

import com.WaiperSoft.Latex;
import com.WaiperSoft.R;
import com.formdev.flatlaf.intellijthemes.FlatAllIJThemes;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaContrastIJTheme;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.commons.math3.util.Precision;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import javax.swing.UIManager.LookAndFeelInfo;

public class Ventana extends javax.swing.JFrame {

    Latex tex = new Latex();
    R Rsrc = new R();
    Integer tamañoLatex;
    String latexExpression = "\\textrm{Powered by }\\LaTeX{}", copy;
    static Integer round = 4;

    @SuppressWarnings({"OverridableMethodCallInConstructor", "LeakingThisInConstructor"})
    public Ventana() {
        initComponents();
        initComponents2();
        setAllIcons();
        this.setResizable(true);
        this.setLocationRelativeTo(this);
        labelLatex.setIcon(tex.getIconOfLatex(latexExpression, 60));
    }

    public void setAllIcons() {

        latexLabelP3.setIcon(tex.getIconOfLatex(Latex.nM, 30));
        latexLabelP4.setIcon(tex.getIconOfLatex(Latex.ICp, 30));
        latexLabelP5.setIcon(tex.getIconOfLatex(Latex.nP, 30));
        latexLabelP6.setIcon(tex.getIconOfLatex(Latex.ICv, 30));

        meanLabelP1.setIcon(tex.getIconOfLatex("\\mu_{\\bar{x}}=", 20));
        desvLabelP1.setIcon(tex.getIconOfLatex("\\sigma =", 20));
        nLabelP1.setIcon(tex.getIconOfLatex("n=", 20));

        meanLabelP2.setIcon(tex.getIconOfLatex("\\bar{x}=", 20));
        desvLabelP2.setIcon(tex.getIconOfLatex("\\sigma =", 20));
        nLabelP2.setIcon(tex.getIconOfLatex("n=", 20));
        ncLabelP2.setIcon(tex.getIconOfLatex("NC=", 20));

        errLabelP3.setIcon(tex.getIconOfLatex("E=", 20));
        desLabelP3.setIcon(tex.getIconOfLatex("\\sigma =", 20));
        ncLabelP3.setIcon(tex.getIconOfLatex("NC =", 20));

        siLabelP4.setIcon(tex.getIconOfLatex("\\#si=", 20));
        nLabelP4.setIcon(tex.getIconOfLatex("n =", 20));
        ncLabelP4.setIcon(tex.getIconOfLatex("NC =", 20));

        phatLabelP5.setIcon(tex.getIconOfLatex("\\hat{p}=", 20));
        errLabelP5.setIcon(tex.getIconOfLatex(" E =", 20));
        ncLabelP5.setIcon(tex.getIconOfLatex("NC =", 20));

        ncLabelP6.setIcon(tex.getIconOfLatex("NC=", 20));
        ssLabelP6.setIcon(tex.getIconOfLatex(" s^{2} =", 20));
        nLabelP6.setIcon(tex.getIconOfLatex("n =", 20));

        alphaLabelP7.setIcon(tex.getIconOfLatex("\\alpha=", 20));
        desLabelP7.setIcon(tex.getIconOfLatex("\\sigma =", 20));
        nLabelP7.setIcon(tex.getIconOfLatex("n =", 20));
        mean1LabelP7.setIcon(tex.getIconOfLatex("\\mu=", 20));
        mean2LabelP7.setIcon(tex.getIconOfLatex(" \\hat{x} =", 20));

        siLabelP8.setIcon(tex.getIconOfLatex("\\#si=", 20));
        p0LabelP8.setIcon(tex.getIconOfLatex("p_0 =", 20));
        nLabelP8.setIcon(tex.getIconOfLatex("n =", 20));
        alphaLabelP8.setIcon(tex.getIconOfLatex("\\alpha=", 20));

        ssLabelP9.setIcon(tex.getIconOfLatex("s^2=", 20));
        sigmaLabelP9.setIcon(tex.getIconOfLatex("\\sigma^2 =", 20));
        nLabelP9.setIcon(tex.getIconOfLatex("n =", 20));
        alphaLabelP9.setIcon(tex.getIconOfLatex("\\alpha=", 20));

        tamañoLatex = sizeLatexSlider.getValue();
    }

    public void initComponents2() {
        datTextP1.setVisible(false);
        dat2TextP.setVisible(false);
        round6RButton.setSelected(true);
        for (LookAndFeelInfo info : FlatAllIJThemes.INFOS) {
            themesCBox.addItem(info.getName());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        probOfMeanType = new javax.swing.ButtonGroup();
        icDistType = new javax.swing.ButtonGroup();
        roundGroup = new javax.swing.ButtonGroup();
        thMeanDist = new javax.swing.ButtonGroup();
        thTailMeanType = new javax.swing.ButtonGroup();
        thTailPropType = new javax.swing.ButtonGroup();
        jTabbedPane = new javax.swing.JTabbedPane();
        P1 = new javax.swing.JPanel();
        meanLabelP1 = new javax.swing.JLabel();
        desvLabelP1 = new javax.swing.JLabel();
        desvTextP1 = new javax.swing.JTextField();
        meanTextP1 = new javax.swing.JTextField();
        calProbMeanButton = new javax.swing.JButton();
        nLabelP1 = new javax.swing.JLabel();
        nTextP1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        menorJRbutton = new javax.swing.JRadioButton();
        mayorJRButton = new javax.swing.JRadioButton();
        entreJRButton = new javax.swing.JRadioButton();
        datTextP1 = new javax.swing.JTextField();
        dat2TextP = new javax.swing.JTextField();
        P2 = new javax.swing.JPanel();
        meanLabelP2 = new javax.swing.JLabel();
        meanTextP2 = new javax.swing.JTextField();
        desvLabelP2 = new javax.swing.JLabel();
        desvTextP2 = new javax.swing.JTextField();
        nLabelP2 = new javax.swing.JLabel();
        nTextP2 = new javax.swing.JTextField();
        ncLabelP2 = new javax.swing.JLabel();
        ncTextP2 = new javax.swing.JTextField();
        calcICButton1 = new javax.swing.JButton();
        latexLabelP2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tJRButtonP1 = new javax.swing.JRadioButton();
        normJRButtonP1 = new javax.swing.JRadioButton();
        P3 = new javax.swing.JPanel();
        errTextP3 = new javax.swing.JTextField();
        errLabelP3 = new javax.swing.JLabel();
        desTextP3 = new javax.swing.JTextField();
        desLabelP3 = new javax.swing.JLabel();
        ncLabelP3 = new javax.swing.JLabel();
        ncTextP3 = new javax.swing.JTextField();
        calcTamXMeanButton = new javax.swing.JButton();
        latexLabelP3 = new javax.swing.JLabel();
        P4 = new javax.swing.JPanel();
        calICPropButton = new javax.swing.JButton();
        ncLabelP4 = new javax.swing.JLabel();
        ncTextP4 = new javax.swing.JTextField();
        siLabelP4 = new javax.swing.JLabel();
        siTextP4 = new javax.swing.JTextField();
        nLabelP4 = new javax.swing.JLabel();
        nTextP4 = new javax.swing.JTextField();
        latexLabelP4 = new javax.swing.JLabel();
        P5 = new javax.swing.JPanel();
        ncTextP5 = new javax.swing.JTextField();
        ncLabelP5 = new javax.swing.JLabel();
        phatTextP5 = new javax.swing.JTextField();
        phatLabelP5 = new javax.swing.JLabel();
        errTextP5 = new javax.swing.JTextField();
        errLabelP5 = new javax.swing.JLabel();
        calcTamPropButton = new javax.swing.JButton();
        latexLabelP5 = new javax.swing.JLabel();
        P6 = new javax.swing.JPanel();
        ssLabelP6 = new javax.swing.JLabel();
        ssTextP6 = new javax.swing.JTextField();
        nLabelP6 = new javax.swing.JLabel();
        nTextP6 = new javax.swing.JTextField();
        ncTextP6 = new javax.swing.JTextField();
        ncLabelP6 = new javax.swing.JLabel();
        calcICvarButton1 = new javax.swing.JButton();
        latexLabelP6 = new javax.swing.JLabel();
        P7 = new javax.swing.JPanel();
        latexLabelP7 = new javax.swing.JLabel();
        calcTHmeanButton = new javax.swing.JButton();
        mean1LabelP7 = new javax.swing.JLabel();
        mean1TextP7 = new javax.swing.JTextField();
        mean2TextP7 = new javax.swing.JTextField();
        mean2LabelP7 = new javax.swing.JLabel();
        alphaLabelP7 = new javax.swing.JLabel();
        alphaTextP7 = new javax.swing.JTextField();
        nTextP7 = new javax.swing.JTextField();
        nLabelP7 = new javax.swing.JLabel();
        desLabelP7 = new javax.swing.JLabel();
        desTextP7 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        tailInfRButtonP7 = new javax.swing.JRadioButton();
        tailSupRButtonP7 = new javax.swing.JRadioButton();
        tail2RButtonP7 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        tDistRButtonP7 = new javax.swing.JRadioButton();
        normDistRButonP7 = new javax.swing.JRadioButton();
        P8 = new javax.swing.JPanel();
        alphaTextP8 = new javax.swing.JTextField();
        nTextP8 = new javax.swing.JTextField();
        nLabelP8 = new javax.swing.JLabel();
        alphaLabelP8 = new javax.swing.JLabel();
        siLabelP8 = new javax.swing.JLabel();
        siTextP8 = new javax.swing.JTextField();
        p0LabelP8 = new javax.swing.JLabel();
        p0TextP8 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        tailInfRButtonP8 = new javax.swing.JRadioButton();
        tailSupRButtonP8 = new javax.swing.JRadioButton();
        tail2RButtonP8 = new javax.swing.JRadioButton();
        latexLabelP8 = new javax.swing.JLabel();
        calcTHpropButton = new javax.swing.JButton();
        P9 = new javax.swing.JPanel();
        alphaTextP9 = new javax.swing.JTextField();
        nTextP9 = new javax.swing.JTextField();
        nLabelP9 = new javax.swing.JLabel();
        alphaLabelP9 = new javax.swing.JLabel();
        ssLabelP9 = new javax.swing.JLabel();
        ssTextP9 = new javax.swing.JTextField();
        sigmaLabelP9 = new javax.swing.JLabel();
        sigmaTextP9 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tailInfRButtonP9 = new javax.swing.JRadioButton();
        tailSupRButtonP9 = new javax.swing.JRadioButton();
        tail2RButtonP9 = new javax.swing.JRadioButton();
        latexLabelP9 = new javax.swing.JLabel();
        calcTHvarButton1 = new javax.swing.JButton();
        labelTitle = new javax.swing.JLabel();
        panelLatex = new javax.swing.JPanel();
        scrollPaneLatex = new javax.swing.JScrollPane();
        labelLatex = new javax.swing.JLabel();
        sizeLatexSlider = new javax.swing.JSlider();
        copyButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RTextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        outRText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        themesCBox = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        round1RButton = new javax.swing.JRadioButtonMenuItem();
        round2RButton = new javax.swing.JRadioButtonMenuItem();
        round4RButton = new javax.swing.JRadioButtonMenuItem();
        round6RButton = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(883, 727));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jTabbedPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        meanLabelP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        meanLabelP1.setText("U =");

        desvLabelP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desvLabelP1.setText("U =");

        desvTextP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        meanTextP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        calProbMeanButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calProbMeanButton.setText("Calcular");
        calProbMeanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calProbMeanButtonActionPerformed(evt);
            }
        });

        nLabelP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nLabelP1.setText("U =");

        nTextP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        probOfMeanType.add(menorJRbutton);
        menorJRbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menorJRbutton.setText("Sea menor que");
        menorJRbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menorJRbuttonActionPerformed(evt);
            }
        });
        jPanel4.add(menorJRbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        probOfMeanType.add(mayorJRButton);
        mayorJRButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mayorJRButton.setText("Sea mayor que");
        mayorJRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorJRButtonActionPerformed(evt);
            }
        });
        jPanel4.add(mayorJRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));

        probOfMeanType.add(entreJRButton);
        entreJRButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        entreJRButton.setText("Se encuentre Entre");
        entreJRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreJRButtonActionPerformed(evt);
            }
        });
        jPanel4.add(entreJRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        datTextP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        datTextP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datTextP1ActionPerformed(evt);
            }
        });
        jPanel4.add(datTextP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 70, 30));

        dat2TextP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel4.add(dat2TextP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 70, 30));

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meanLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desvLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(meanTextP1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desvTextP1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nTextP1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(calProbMeanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addComponent(meanLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(desvLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nLabelP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P1Layout.createSequentialGroup()
                        .addComponent(meanTextP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(desvTextP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nTextP1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calProbMeanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Probabilidad de Muestra", P1);

        meanLabelP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        meanLabelP2.setText("U =");

        meanTextP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        desvLabelP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desvLabelP2.setText("U =");

        desvTextP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nLabelP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nLabelP2.setText("U =");

        nTextP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ncLabelP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ncLabelP2.setText("U =");

        ncTextP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        calcICButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcICButton1.setText("Calcular");
        calcICButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcICButton1ActionPerformed(evt);
            }
        });

        latexLabelP2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icDistType.add(tJRButtonP1);
        tJRButtonP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tJRButtonP1.setText("Distribucion T");
        tJRButtonP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJRButtonP1ActionPerformed(evt);
            }
        });
        jPanel3.add(tJRButtonP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        icDistType.add(normJRButtonP1);
        normJRButtonP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        normJRButtonP1.setText("Distribucion Normal");
        normJRButtonP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normJRButtonP1ActionPerformed(evt);
            }
        });
        jPanel3.add(normJRButtonP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(meanLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(meanTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(nLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(desvLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(desvTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P2Layout.createSequentialGroup()
                        .addComponent(ncLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(ncTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(latexLabelP2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcICButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meanLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meanTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desvLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desvTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ncLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ncTextP2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(P2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(latexLabelP2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcICButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Intervalos de Confianza de la Media", P2);

        errTextP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        errLabelP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errLabelP3.setText("U =");

        desTextP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        desLabelP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desLabelP3.setText("U =");

        ncLabelP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ncLabelP3.setText("U =");

        ncTextP3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        calcTamXMeanButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcTamXMeanButton.setText("Calcular");
        calcTamXMeanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTamXMeanButtonActionPerformed(evt);
            }
        });

        latexLabelP3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P3Layout = new javax.swing.GroupLayout(P3);
        P3.setLayout(P3Layout);
        P3Layout.setHorizontalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P3Layout.createSequentialGroup()
                                .addComponent(errLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(errTextP3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P3Layout.createSequentialGroup()
                                .addComponent(desLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(desTextP3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P3Layout.createSequentialGroup()
                                .addComponent(ncLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ncTextP3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(latexLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcTamXMeanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P3Layout.setVerticalGroup(
            P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P3Layout.createSequentialGroup()
                .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errTextP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desTextP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ncLabelP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ncTextP3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(P3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(latexLabelP3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(calcTamXMeanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Tamaño de muestra para la media", P3);

        calICPropButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calICPropButton.setText("Calcular");
        calICPropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calICPropButtonActionPerformed(evt);
            }
        });

        ncLabelP4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ncLabelP4.setText("U =");

        ncTextP4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        siLabelP4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        siLabelP4.setText("U =");

        siTextP4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nLabelP4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nLabelP4.setText("U =");

        nTextP4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        latexLabelP4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P4Layout = new javax.swing.GroupLayout(P4);
        P4.setLayout(P4Layout);
        P4Layout.setHorizontalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P4Layout.createSequentialGroup()
                                .addComponent(siLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(siTextP4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P4Layout.createSequentialGroup()
                                .addComponent(nLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nTextP4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P4Layout.createSequentialGroup()
                                .addComponent(ncLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ncTextP4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(latexLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calICPropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P4Layout.setVerticalGroup(
            P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siTextP4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nTextP4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(P4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ncLabelP4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ncTextP4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(P4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(latexLabelP4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calICPropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Intervalo de confianza para la Proporción", P4);

        ncTextP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ncLabelP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ncLabelP5.setText("U =");

        phatTextP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        phatLabelP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        phatLabelP5.setText("U =");

        errTextP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        errLabelP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errLabelP5.setText("U =");

        calcTamPropButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcTamPropButton.setText("Calcular");
        calcTamPropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTamPropButtonActionPerformed(evt);
            }
        });

        latexLabelP5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P5Layout = new javax.swing.GroupLayout(P5);
        P5.setLayout(P5Layout);
        P5Layout.setHorizontalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P5Layout.createSequentialGroup()
                .addGroup(P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P5Layout.createSequentialGroup()
                                .addComponent(errLabelP5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(errTextP5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P5Layout.createSequentialGroup()
                                .addComponent(phatLabelP5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(phatTextP5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P5Layout.createSequentialGroup()
                                .addComponent(ncLabelP5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ncTextP5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                        .addComponent(latexLabelP5, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcTamPropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P5Layout.setVerticalGroup(
            P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P5Layout.createSequentialGroup()
                .addGroup(P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errLabelP5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errTextP5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phatLabelP5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phatTextP5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ncLabelP5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ncTextP5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(P5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(latexLabelP5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(calcTamPropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Tamaño de muestra para la proporción", P5);

        ssLabelP6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ssLabelP6.setText("U =");

        ssTextP6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nLabelP6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nLabelP6.setText("U =");

        nTextP6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ncTextP6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        ncLabelP6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ncLabelP6.setText("U =");

        calcICvarButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcICvarButton1.setText("Calcular");
        calcICvarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcICvarButton1ActionPerformed(evt);
            }
        });

        latexLabelP6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P6Layout = new javax.swing.GroupLayout(P6);
        P6.setLayout(P6Layout);
        P6Layout.setHorizontalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P6Layout.createSequentialGroup()
                .addGroup(P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P6Layout.createSequentialGroup()
                                .addComponent(ssLabelP6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ssTextP6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P6Layout.createSequentialGroup()
                                .addComponent(nLabelP6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nTextP6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P6Layout.createSequentialGroup()
                                .addComponent(ncLabelP6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ncTextP6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                        .addComponent(latexLabelP6, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcICvarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P6Layout.setVerticalGroup(
            P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssLabelP6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ssTextP6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nLabelP6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nTextP6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(P6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ncLabelP6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ncTextP6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(latexLabelP6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcICvarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Intervalo de confianza para la Varianza", P6);

        latexLabelP7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calcTHmeanButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcTHmeanButton.setText("Calcular");
        calcTHmeanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTHmeanButtonActionPerformed(evt);
            }
        });

        mean1LabelP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mean1LabelP7.setText("U =");

        mean1TextP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mean2TextP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        mean2LabelP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mean2LabelP7.setText("U =");

        alphaLabelP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alphaLabelP7.setText("U =");

        alphaTextP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nTextP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nLabelP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nLabelP7.setText("U =");

        desLabelP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desLabelP7.setText("U =");

        desTextP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thTailMeanType.add(tailInfRButtonP7);
        tailInfRButtonP7.setText("Prueba de Cola Inferior");
        tailInfRButtonP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailInfRButtonP7ActionPerformed(evt);
            }
        });
        jPanel2.add(tailInfRButtonP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        thTailMeanType.add(tailSupRButtonP7);
        tailSupRButtonP7.setText("Prueba de Cola Superior");
        tailSupRButtonP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailSupRButtonP7ActionPerformed(evt);
            }
        });
        jPanel2.add(tailSupRButtonP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        thTailMeanType.add(tail2RButtonP7);
        tail2RButtonP7.setText("Prueba de Dos Colas");
        tail2RButtonP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tail2RButtonP7ActionPerformed(evt);
            }
        });
        jPanel2.add(tail2RButtonP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thMeanDist.add(tDistRButtonP7);
        tDistRButtonP7.setText("Distribución T");
        tDistRButtonP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDistRButtonP7ActionPerformed(evt);
            }
        });
        jPanel5.add(tDistRButtonP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        thMeanDist.add(normDistRButonP7);
        normDistRButonP7.setText("Distribución Normal");
        normDistRButonP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normDistRButonP7ActionPerformed(evt);
            }
        });
        jPanel5.add(normDistRButonP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout P7Layout = new javax.swing.GroupLayout(P7);
        P7.setLayout(P7Layout);
        P7Layout.setHorizontalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P7Layout.createSequentialGroup()
                        .addComponent(mean1LabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(mean1TextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P7Layout.createSequentialGroup()
                        .addComponent(mean2LabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(mean2TextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P7Layout.createSequentialGroup()
                        .addComponent(nLabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nTextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P7Layout.createSequentialGroup()
                                .addComponent(desLabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(desTextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P7Layout.createSequentialGroup()
                                .addComponent(alphaLabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(alphaTextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(P7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(latexLabelP7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcTHmeanButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P7Layout.setVerticalGroup(
            P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P7Layout.createSequentialGroup()
                .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mean1LabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mean1TextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mean2LabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mean2TextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nLabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nTextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(P7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(latexLabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcTHmeanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(P7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desLabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desTextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(P7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alphaLabelP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alphaTextP7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Test de Hipotesis Para una Media", P7);

        alphaTextP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nTextP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nLabelP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nLabelP8.setText("U =");

        alphaLabelP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alphaLabelP8.setText("U =");

        siLabelP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        siLabelP8.setText("U =");

        siTextP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        p0LabelP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p0LabelP8.setText("U =");

        p0TextP8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thTailPropType.add(tailInfRButtonP8);
        tailInfRButtonP8.setText("Prueba de Cola Inferior");
        tailInfRButtonP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailInfRButtonP8ActionPerformed(evt);
            }
        });
        jPanel6.add(tailInfRButtonP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        thTailPropType.add(tailSupRButtonP8);
        tailSupRButtonP8.setText("Prueba de Cola Superior");
        tailSupRButtonP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailSupRButtonP8ActionPerformed(evt);
            }
        });
        jPanel6.add(tailSupRButtonP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        thTailPropType.add(tail2RButtonP8);
        tail2RButtonP8.setText("Prueba de Dos Colas");
        tail2RButtonP8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tail2RButtonP8ActionPerformed(evt);
            }
        });
        jPanel6.add(tail2RButtonP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        latexLabelP8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calcTHpropButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcTHpropButton.setText("Calcular");
        calcTHpropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTHpropButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P8Layout = new javax.swing.GroupLayout(P8);
        P8.setLayout(P8Layout);
        P8Layout.setHorizontalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P8Layout.createSequentialGroup()
                        .addComponent(siLabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(siTextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P8Layout.createSequentialGroup()
                        .addComponent(nLabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nTextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P8Layout.createSequentialGroup()
                        .addComponent(p0LabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(p0TextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P8Layout.createSequentialGroup()
                        .addComponent(alphaLabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(alphaTextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcTHpropButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latexLabelP8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P8Layout.setVerticalGroup(
            P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P8Layout.createSequentialGroup()
                .addGroup(P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siLabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(siTextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nLabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nTextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p0LabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p0TextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(P8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alphaLabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alphaTextP8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(P8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(P8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(latexLabelP8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calcTHpropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane.addTab("Test de hipotesis para una Proporción", P8);

        alphaTextP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nTextP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        nLabelP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nLabelP9.setText("U =");

        alphaLabelP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alphaLabelP9.setText("U =");

        ssLabelP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ssLabelP9.setText("U =");

        ssTextP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        sigmaLabelP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sigmaLabelP9.setText("U =");

        sigmaTextP9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        thTailPropType.add(tailInfRButtonP9);
        tailInfRButtonP9.setText("Prueba de Cola Inferior");
        tailInfRButtonP9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailInfRButtonP9ActionPerformed(evt);
            }
        });
        jPanel7.add(tailInfRButtonP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        thTailPropType.add(tailSupRButtonP9);
        tailSupRButtonP9.setText("Prueba de Cola Superior");
        tailSupRButtonP9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tailSupRButtonP9ActionPerformed(evt);
            }
        });
        jPanel7.add(tailSupRButtonP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        thTailPropType.add(tail2RButtonP9);
        tail2RButtonP9.setText("Prueba de Dos Colas");
        tail2RButtonP9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tail2RButtonP9ActionPerformed(evt);
            }
        });
        jPanel7.add(tail2RButtonP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        latexLabelP9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calcTHvarButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calcTHvarButton1.setText("Calcular");
        calcTHvarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTHvarButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P9Layout = new javax.swing.GroupLayout(P9);
        P9.setLayout(P9Layout);
        P9Layout.setHorizontalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sigmaLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alphaLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sigmaTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alphaTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calcTHvarButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(latexLabelP9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        P9Layout.setVerticalGroup(
            P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P9Layout.createSequentialGroup()
                .addGroup(P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(latexLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(calcTHvarButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P9Layout.createSequentialGroup()
                        .addGroup(P9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(P9Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ssLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(sigmaLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(alphaLabelP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P9Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ssTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(nTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(sigmaTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(alphaTextP9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(P9Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane.addTab("Test de hipotesis para una Varianza", P9);

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        labelTitle.setText("waiperSoft");

        panelLatex.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        labelLatex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scrollPaneLatex.setViewportView(labelLatex);

        sizeLatexSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        sizeLatexSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sizeLatexSliderStateChanged(evt);
            }
        });

        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLatexLayout = new javax.swing.GroupLayout(panelLatex);
        panelLatex.setLayout(panelLatexLayout);
        panelLatexLayout.setHorizontalGroup(
            panelLatexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLatexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sizeLatexSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPaneLatex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyButton)
                .addContainerGap())
        );
        panelLatexLayout.setVerticalGroup(
            panelLatexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLatexLayout.createSequentialGroup()
                .addGroup(panelLatexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneLatex, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeLatexSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(copyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("R mini"));

        RTextArea.setColumns(20);
        RTextArea.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        RTextArea.setRows(5);
        jScrollPane1.setViewportView(RTextArea);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("R");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        outRText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("OUTPUT BY R:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(outRText, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(outRText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        themesCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        themesCBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                themesCBoxItemStateChanged(evt);
            }
        });
        themesCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themesCBoxActionPerformed(evt);
            }
        });

        jMenu2.setText("Opciones");

        jMenu3.setText("Redondeo");

        roundGroup.add(round1RButton);
        round1RButton.setSelected(true);
        round1RButton.setText("1 decimal");
        round1RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                round1RButtonActionPerformed(evt);
            }
        });
        jMenu3.add(round1RButton);

        roundGroup.add(round2RButton);
        round2RButton.setText("2 decimales");
        round2RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                round2RButtonActionPerformed(evt);
            }
        });
        jMenu3.add(round2RButton);

        roundGroup.add(round4RButton);
        round4RButton.setText("3 decimales");
        round4RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                round4RButtonActionPerformed(evt);
            }
        });
        jMenu3.add(round4RButton);

        roundGroup.add(round6RButton);
        round6RButton.setText("4 decimales");
        round6RButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                round6RButtonActionPerformed(evt);
            }
        });
        jMenu3.add(round6RButton);

        roundGroup.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setText("5 decimales");
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem5);

        roundGroup.add(jRadioButtonMenuItem6);
        jRadioButtonMenuItem6.setText("6 decimales");
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem6);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane)
                    .addComponent(panelLatex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(themesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(themesCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLatex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Rsrc.close();
    }//GEN-LAST:event_formWindowClosed

    private void mayorJRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorJRButtonActionPerformed
        datTextP1.setVisible(true);
        dat2TextP.setVisible(false);
    }//GEN-LAST:event_mayorJRButtonActionPerformed

    private void menorJRbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menorJRbuttonActionPerformed
        datTextP1.setVisible(true);
        dat2TextP.setVisible(false);
    }//GEN-LAST:event_menorJRbuttonActionPerformed

    private void entreJRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreJRButtonActionPerformed
        datTextP1.setVisible(true);
        dat2TextP.setVisible(true);
    }//GEN-LAST:event_entreJRButtonActionPerformed

    @SuppressWarnings("UnusedAssignment")
    private void calProbMeanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calProbMeanButtonActionPerformed

        if (entreJRButton.isSelected()) {
            if (validarJTextOfPanel(P1)) {
                try {
                    Double media, des, lim1, lim2, desx, z1, z2, Pr1, Pr2;
                    Integer n;
                    media = Double.valueOf(meanTextP1.getText());
                    des = Double.valueOf(desvTextP1.getText());
                    n = Integer.valueOf(nTextP1.getText());
                    lim1 = Double.valueOf(datTextP1.getText());
                    lim2 = Double.valueOf(dat2TextP.getText());
                    desx = des / Math.sqrt(n);

                    z1 = (lim1 - media) / (desx);
                    z2 = (lim2 - media) / (desx);
                    Pr1 = Rsrc.pnorm(z1.toString());
                    Pr2 = Rsrc.pnorm(z2.toString());

                    desx = rnd(desx);
                    z1 = rnd(z1);
                    z2 = rnd(z2);
                    Pr1 = rnd(Pr1);
                    Pr2 = rnd(Pr2);

                    String cadena = "\\sigma_{\\bar{x}} =\\dfrac{\\sigma}{\\sqrt{n}} "
                            + "= \\dfrac{" + des + "}{\\sqrt{" + n + "}} = " + desx
                            + "\\\\ " + Latex.Z + "="
                            + "\\dfrac{" + lim1 + "-" + media + "}{" + desx + "}=" + z1
                            + "\\\\ " + Latex.Z + "="
                            + "\\dfrac{" + lim2 + "-" + media + "}{" + desx + "}=" + z2
                            + "\\\\ P(" + lim1 + "<\\bar{x}<" + lim2 + ") = "
                            + "P(\\bar{x} <" + lim2 + ")-P(\\bar{x} <" + lim1
                            + ")\\\\ = " + Pr2 + "-" + Pr1 + "=" + rnd(Pr2 - Pr1);

                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = copy = cadena;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Asegurese de que las entradas sean numericas");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
            }
        } else if (mayorJRButton.isSelected()) {
            dat2TextP.setText("0");
            if (validarJTextOfPanel(P1)) {

                try {
                    Double media, des, lim, desx, z, Pr;
                    Integer n;
                    media = Double.valueOf(meanTextP1.getText());
                    des = Double.valueOf(desvTextP1.getText());
                    n = Integer.valueOf(nTextP1.getText());
                    lim = Double.valueOf(datTextP1.getText());

                    desx = des / Math.sqrt(n);
                    z = (lim - media) / (desx);
                    Pr = Rsrc.pnorm(z.toString());

                    desx = rnd(desx);
                    z = rnd(z);
                    Pr = rnd(Pr);

                    String cadena = "\\sigma_{\\bar{x}} =\\dfrac{\\sigma}{\\sqrt{n}} "
                            + "= \\dfrac{" + des + "}{\\sqrt{" + n + "}} = " + desx
                            + "\\\\ " + Latex.Z + "="
                            + "\\dfrac{" + lim + "-" + media + "}{" + desx + "}=" + z
                            + "\\\\ P(\\bar{x}>" + lim + ") = "
                            + "1-P(\\bar{x} <" + lim
                            + ")\\\\ = 1 -" + Pr + "=" + rnd(1 - Pr);
                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = copy = cadena;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Asegurese de que las entradas sean numericas");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
            }
        } else if (menorJRbutton.isSelected()) {
            dat2TextP.setText("0");
            if (validarJTextOfPanel(P1)) {
                try {
                    Double media, des, lim, desx, z, Pr;
                    Integer n;
                    media = Double.valueOf(meanTextP1.getText());
                    des = Double.valueOf(desvTextP1.getText());
                    n = Integer.valueOf(nTextP1.getText());
                    lim = Double.valueOf(datTextP1.getText());

                    desx = des / Math.sqrt(n);
                    z = (lim - media) / (desx);
                    Pr = Rsrc.pnorm(z.toString());

                    desx = rnd(desx);
                    z = rnd(z);
                    Pr = rnd(Pr);

                    String cadena = "\\sigma_{\\bar{x}} =\\dfrac{\\sigma}{\\sqrt{n}} "
                            + "= \\dfrac{" + des + "}{\\sqrt{" + n + "}} = " + desx
                            + "\\\\ " + Latex.Z + "="
                            + "\\dfrac{" + lim + "-" + media + "}{" + desx + "}=" + z
                            + "\\\\ P(\\bar{x} <" + lim + ") =" + Pr;

                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = copy = cadena;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Asegurese de que las entradas sean numericas");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione enl tipo de cálculo");
        }

    }//GEN-LAST:event_calProbMeanButtonActionPerformed

    private void tJRButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJRButtonP1ActionPerformed
        desvLabelP2.setIcon(tex.getIconOfLatex("s =", 20));
        latexLabelP2.setIcon(tex.getIconOfLatex(Latex.ICm2, 30));
    }//GEN-LAST:event_tJRButtonP1ActionPerformed

    private void normJRButtonP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normJRButtonP1ActionPerformed
        desvLabelP2.setIcon(tex.getIconOfLatex("\\sigma =", 20));
        latexLabelP2.setIcon(tex.getIconOfLatex(Latex.ICm1, 30));
    }//GEN-LAST:event_normJRButtonP1ActionPerformed

    private void calcICButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcICButton1ActionPerformed

        if (validarJTextOfPanel(P2)) {
            try {
                if (normJRButtonP1.isSelected()) {
                    Double media, ds, alpha, nc, err, izq, der, z;
                    Integer n;
                    media = Double.valueOf(meanTextP2.getText());
                    ds = Double.valueOf(desvTextP2.getText());
                    n = Integer.valueOf(nTextP2.getText());
                    nc = Double.valueOf(ncTextP2.getText());

                    alpha = (1 - nc) / 2;
                    z = Rsrc.qnorm(alpha.toString());
                    err = z * ds / Math.sqrt(n);
                    izq = media - err;
                    der = media + err;
                    alpha = (1 - nc);

                    z = rnd(z);
                    alpha = rnd(alpha);
                    err = rnd(err);
                    izq = rnd(izq);
                    der = rnd(der);

                    String cadena = Latex.ALPHA + "=" + "1-" + nc + "=" + alpha
                            + "\\\\ " + Latex.ICm1 + "=" + media + "\\pm "
                            + z + "\\dfrac{" + ds + "}{\\sqrt{" + n + "}}"
                            + "\\\\ IC = " + media + "\\pm " + err;
                    if (izq > der) {
                        cadena += "\\\\IC = [" + der + "," + izq + "]";
                    } else {
                        cadena += "\\\\IC = [" + izq + "," + der + "]";
                    }

                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = copy = cadena;

                } else if (tJRButtonP1.isSelected()) {
                    Double media, ds, alpha, nc, err, izq, der, t;
                    Integer n;
                    media = Double.valueOf(meanTextP2.getText());
                    ds = Double.valueOf(desvTextP2.getText());
                    n = Integer.valueOf(nTextP2.getText());
                    nc = Double.valueOf(ncTextP2.getText());

                    alpha = (1 - nc) / 2;
                    t = Rsrc.qt(alpha.toString(), n - 1 + "", false);
                    err = t * ds / Math.sqrt(n);
                    izq = media - err;
                    der = media + err;
                    alpha = (1 - nc);

                    t = rnd(t);
                    alpha = rnd(alpha);
                    err = rnd(err);
                    izq = rnd(izq);
                    der = rnd(der);

                    String cadena = Latex.ALPHA + "=" + "1-" + nc + "=" + alpha
                            + "\\\\ " + Latex.ICm2 + "=" + media + "\\pm "
                            + t + "\\dfrac{" + ds + "}{\\sqrt{" + n + "}}"
                            + "\\\\ IC = " + media + "\\pm " + err;
                    if (izq > der) {
                        cadena += "\\\\IC = [" + der + "," + izq + "]";
                    } else {
                        cadena += "\\\\IC = [" + izq + "," + der + "]";
                    }

                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = copy = cadena;

                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione la distribución probabbilidad");
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calcICButton1ActionPerformed

    private void sizeLatexSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sizeLatexSliderStateChanged
        tamañoLatex = sizeLatexSlider.getValue();
        labelLatex.setIcon(tex.getIconOfLatex(latexExpression, tamañoLatex));
    }//GEN-LAST:event_sizeLatexSliderStateChanged

    private void round1RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_round1RButtonActionPerformed
        round = 1;
    }//GEN-LAST:event_round1RButtonActionPerformed

    private void round2RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_round2RButtonActionPerformed
        round = 2;
    }//GEN-LAST:event_round2RButtonActionPerformed

    private void round4RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_round4RButtonActionPerformed
        round = 3;
    }//GEN-LAST:event_round4RButtonActionPerformed

    private void round6RButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_round6RButtonActionPerformed
        round = 4;
    }//GEN-LAST:event_round6RButtonActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        round = 5;
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
        round = 6;
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void datTextP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datTextP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datTextP1ActionPerformed

    private void calcTamXMeanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTamXMeanButtonActionPerformed
        if (validarJTextOfPanel(P3)) {
            try {
                Double err, z, sd, n, nc, alpha;
                err = Double.valueOf(errTextP3.getText());
                nc = Double.valueOf(ncTextP3.getText());
                sd = Double.valueOf(desTextP3.getText());

                alpha = (1 - nc) / 2;
                z = Rsrc.qnorm(alpha.toString());
                n = Math.pow((z * sd) / err, 2);
                alpha = (1 - nc);

                alpha = rnd(alpha);
                n = rnd(n);
                z = rnd(z);
                sd = rnd(sd);
                err = rnd(err);
                nc = rnd(nc);

                String cadena = Latex.ALPHA + "=1-" + nc + "=" + alpha
                        + "\\\\ " + Latex.nM + "=\\left ( \\dfrac{ " + z + "\\cdot " + sd + " }"
                        + "{" + err + "}\\right)^2 = " + n;

                labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                latexExpression = copy = cadena;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calcTamXMeanButtonActionPerformed

    private void calICPropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calICPropButtonActionPerformed
        if (validarJTextOfPanel(P4)) {
            try {
                Double si, p, alpha, nc, err, izq, der, z;
                Integer n;
                si = Double.valueOf(siTextP4.getText());
                n = Integer.valueOf(nTextP4.getText());
                nc = Double.valueOf(ncTextP4.getText());

                p = si / n;
                alpha = (1 - nc) / 2;
                z = Rsrc.qnorm(alpha.toString());
                err = z * Math.sqrt((p * (1 - p)) / n);
                izq = p - err;
                der = p + err;
                alpha = (1 - nc);

                p = rnd(p);
                alpha = rnd(alpha);
                z = rnd(z);
                err = rnd(err);
                izq = rnd(izq);
                der = rnd(der);

                String cadena = "\\hat{p} = \\dfrac{" + si + "}{" + n + "}=" + p
                        + "\\\\ " + Latex.ALPHA + "=1-" + nc + "=" + alpha
                        + "\\\\ " + Latex.ICp + "=" + p + "\\pm "
                        + z + "\\sqrt{\\dfrac{" + p + "(1-" + p + ")}{" + n + "}} "
                        + "\\\\ IC = " + p + "\\pm " + err;
                if (izq > der) {
                    cadena += "\\\\IC = [" + der + "," + izq + "]";
                } else {
                    cadena += "\\\\IC = [" + izq + "," + der + "]";
                }

                labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                latexExpression = copy = cadena;

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calICPropButtonActionPerformed

    private void calcTamPropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTamPropButtonActionPerformed
        if (validarJTextOfPanel(P5)) {
            try {
                Double err, z, p, n, nc, alpha;
                err = Double.valueOf(errTextP5.getText());
                nc = Double.valueOf(ncTextP5.getText());
                p = Double.valueOf(phatTextP5.getText());

                alpha = (1 - nc) / 2;
                z = Rsrc.qnorm(alpha.toString());
                n = (Math.pow(z, 2) * p * (1 - p)) / Math.pow(err, 2);
                alpha = (1 - nc);

                alpha = rnd(alpha);
                n = rnd(n);
                z = rnd(z);
                p = rnd(p);
                err = rnd(err);
                nc = rnd(nc);

                String cadena = Latex.ALPHA + "=1-" + nc + "=" + alpha
                        + "\\\\ " + Latex.nP + "="
                        + "\\dfrac{ (" + z + ")^{2}\\cdot " + p + "(" + rnd(1 - p) + ")}{(" + err + ")^{2}} "
                        + "\\\\ n=\\dfrac{" + rnd(z * z) + "\\cdot " + rnd((p * (1 - p))) + "}"
                        + "{" + rnd(err * err) + "} "
                        + "=" + n;

                labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                latexExpression = copy = cadena;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calcTamPropButtonActionPerformed

    private void calcICvarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcICvarButton1ActionPerformed
        if (validarJTextOfPanel(P6)) {
            try {
                Double ss, alpha, nc, izq, der, ch1, ch2;
                Integer n, gl;
                ss = Double.valueOf(ssTextP6.getText());
                n = Integer.valueOf(nTextP6.getText());
                nc = Double.valueOf(ncTextP6.getText());

                gl = n - 1;
                alpha = (1 - nc) / 2;
                ch1 = Rsrc.qchis(alpha.toString(), gl.toString(), false);
                ch2 = Rsrc.qchis(alpha.toString(), gl.toString());

                izq = ss * (n - 1) / ch1;
                der = ss * (n - 1) / ch2;
                alpha = (1 - nc);

                ss = rnd(ss);
                alpha = rnd(alpha);
                ch1 = rnd(ch1);
                ch2 = rnd(ch2);
                izq = rnd(izq);
                der = rnd(der);

                String cadena = "x_{\\frac{\\alpha}{2}(n-1)}^{2}=" + ch1
                        + "\\\\x_{1-\\frac{\\alpha}{2}(n-1)}^{2}=" + ch2
                        + "\\\\ " + Latex.ALPHA + "=1-" + nc + "=" + alpha
                        + "\\\\ " + Latex.ICv + "=\\left(\\dfrac{(" + gl + ")" + ss + "}{" + ch1 + "},"
                        + "\\dfrac{(" + gl + ")" + ss + "}{" + ch2 + "}\\right)"
                        + "\\\\IC = [" + izq + "," + der + "]";

                labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                latexExpression = copy = cadena;

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calcICvarButton1ActionPerformed

    private void calcTHmeanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTHmeanButtonActionPerformed
        if (validarJTextOfPanel(P7)) {
            try {

                Double media1, media2, des, alpha, z0, zalpha, t0, talpha, p;
                Integer n, gl;

                media1 = Double.valueOf(mean1TextP7.getText());
                media2 = Double.valueOf(mean2TextP7.getText());
                n = Integer.valueOf(nTextP7.getText());
                des = Double.valueOf(desTextP7.getText());
                alpha = Double.valueOf(alphaTextP7.getText());

                if (normDistRButonP7.isSelected()) {
                    if (tail2RButtonP7.isSelected()) {

                        latexLabelP7.setIcon(tex.getIconOfLatex(Latex.TH2C1(media1.toString()), 20));
                        z0 = (media2 - media1) / (des / Math.sqrt(n));
                        zalpha = Rsrc.qnorm(alpha / 2 + "", "0", "1", false);
                        p = Rsrc.pnorm(z0.toString(), "0", "1", z0 < 0);

                        media1 = rnd(media1);
                        media2 = rnd(media2);
                        des = rnd(des);
                        alpha = rnd(alpha);
                        z0 = rnd(z0);
                        zalpha = rnd(zalpha);
                        p = rnd(p);

                        String cadena = Latex.Zo
                                + " = \\dfrac{" + media2 + "-" + media1 + " }{" + des + "/\\sqrt{" + n + "}} = " + z0
                                + "\\\\z_{\\alpha/2} = z_{" + rnd(alpha / 2) + "} = " + zalpha
                                + "\\\\ \\textrm{p-value}=" + p;
                        if (Math.abs(z0) > zalpha) {
                            cadena += "\\\\ \\textrm{Dado que } |z_0| > z_{\\alpha/2} \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } |z_0| < z_{\\alpha/2} \\textrm{ Acepto } H_0";
                        }
                        if (2 * p < alpha) {
                            cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                        }
                        labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                        latexExpression = cadena;
                        copy = Latex.TH2C1(media1.toString()) + "\\\\ " + cadena;

                    } else if (tailInfRButtonP7.isSelected()) {

                        latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCI1(media1.toString()), 20));
                        z0 = (media2 - media1) / (des / Math.sqrt(n));
                        zalpha = Rsrc.qnorm(alpha.toString(), "0", "1", false);
                        p = Rsrc.pnorm(z0.toString());
                        media1 = rnd(media1);
                        media2 = rnd(media2);
                        des = rnd(des);
                        alpha = rnd(alpha);
                        z0 = rnd(z0);
                        zalpha = rnd(zalpha);
                        p = rnd(p);

                        String cadena = Latex.Zo
                                + " = \\dfrac{" + media2 + "-" + media1 + " }{" + des + "/\\sqrt{" + n + "}} = " + z0
                                + "\\\\z_{\\alpha} = z_{" + alpha + "} = " + zalpha
                                + "\\\\ \\textrm{p-value}=" + p;
                        if (z0 < -zalpha) {
                            cadena += "\\\\ \\textrm{Dado que } z_0 < -z_{\\alpha} \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } z_0 > -z_{\\alpha} \\textrm{ Acepto } H_0";
                        }
                        if (p < alpha) {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                        }
                        labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                        latexExpression = cadena;
                        copy = Latex.THCI1(media1.toString()) + "\\\\ " + cadena;

                    } else if (tailSupRButtonP7.isSelected()) {

                        latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCS1(media1.toString()), 20));
                        z0 = (media2 - media1) / (des / Math.sqrt(n));
                        zalpha = Rsrc.qnorm(alpha.toString(), "0", "1", false);
                        p = Rsrc.pnorm(z0.toString(), "0", "1", false);

                        media1 = rnd(media1);
                        media2 = rnd(media2);
                        des = rnd(des);
                        alpha = rnd(alpha);
                        z0 = rnd(z0);
                        zalpha = rnd(zalpha);
                        p = rnd(p);

                        String cadena = Latex.Zo
                                + " = \\dfrac{" + media2 + "-" + media1 + " }{" + des + "/\\sqrt{" + n + "}} = " + z0
                                + "\\\\z_{\\alpha} = z_{" + alpha + "} = " + zalpha
                                + "\\\\ \\textrm{p-value}=" + p;
                        if (z0 > zalpha) {
                            cadena += "\\\\ \\textrm{Dado que } z_0 > z_{\\alpha} \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } z_0 < z_{\\alpha} \\textrm{ Acepto } H_0";
                        }
                        if (p < alpha) {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                        }
                        labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                        latexExpression = cadena;
                        copy = Latex.THCS1(media1.toString()) + "\\\\ " + cadena;
                    } else {
                        JOptionPane.showMessageDialog(this, "Seleccione el tipo de prueba de hipótesis");
                    }

                } else if (tDistRButtonP7.isSelected()) {
                    if (tail2RButtonP7.isSelected()) {

                        latexLabelP7.setIcon(tex.getIconOfLatex(Latex.TH2C2(media1.toString()), 20));

                        gl = n - 1;
                        t0 = (media2 - media1) / (des / Math.sqrt(n));
                        talpha = Rsrc.qt(alpha / 2 + "", gl.toString(), false);
                        p = Rsrc.pt(t0.toString(), gl.toString(), t0 < 0);

                        media1 = rnd(media1);
                        media2 = rnd(media2);
                        des = rnd(des);
                        alpha = rnd(alpha);
                        t0 = rnd(t0);
                        talpha = rnd(talpha);
                        p = rnd(p);

                        String cadena = Latex.To
                                + " = \\dfrac{" + media2 + "-" + media1 + " }{" + des + "/\\sqrt{" + n + "}} = " + t0
                                + "\\\\t_{\\alpha/2(n-1)} = t_{" + rnd(alpha / 2) + "(" + gl + ")} = " + talpha
                                + "\\\\ \\textrm{p-value}=" + p;
                        if (Math.abs(t0) > talpha) {
                            cadena += "\\\\ \\textrm{Dado que } |t_0| > t_{\\alpha/2} \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } |t_0| < t_{\\alpha/2} \\textrm{ Acepto } H_0";
                        }
                        if (2 * p < alpha) {
                            cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                        }
                        labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                        latexExpression = cadena;
                        copy = Latex.TH2C2(media1.toString()) + "\\\\ " + cadena;

                    } else if (tailInfRButtonP7.isSelected()) {

                        latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCI2(media1.toString()), 20));

                        gl = n - 1;
                        t0 = (media2 - media1) / (des / Math.sqrt(n));
                        talpha = Rsrc.qt(alpha.toString(), gl.toString(), false);
                        p = Rsrc.pt(t0.toString(), gl.toString());

                        media1 = rnd(media1);
                        media2 = rnd(media2);
                        des = rnd(des);
                        alpha = rnd(alpha);
                        t0 = rnd(t0);
                        talpha = rnd(talpha);
                        p = rnd(p);

                        String cadena = Latex.To
                                + " = \\dfrac{" + media2 + "-" + media1 + " }{" + des + "/\\sqrt{" + n + "}} = " + t0
                                + "\\\\t_{\\alpha(n-1)} = t_{" + alpha + "(" + gl + ")} = " + talpha
                                + "\\\\ \\textrm{p-value}=" + p;
                        if (t0 < -talpha) {
                            cadena += "\\\\ \\textrm{Dado que } t_0 <-t_{\\alpha} \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } t_0 > t_{\\alpha} \\textrm{ Acepto } H_0";
                        }
                        if (p < alpha) {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                        }
                        labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                        latexExpression = cadena;
                        copy = Latex.THCI2(media1.toString()) + "\\\\ " + cadena;

                    } else if (tailSupRButtonP7.isSelected()) {

                        latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCS2(media1.toString()), 20));

                        gl = n - 1;
                        t0 = (media2 - media1) / (des / Math.sqrt(n));
                        talpha = Rsrc.qt(alpha.toString(), gl.toString(), false);
                        p = Rsrc.pt(t0.toString(), gl.toString(), false);

                        media1 = rnd(media1);
                        media2 = rnd(media2);
                        des = rnd(des);
                        alpha = rnd(alpha);
                        t0 = rnd(t0);
                        talpha = rnd(talpha);
                        p = rnd(p);

                        String cadena = Latex.To
                                + " = \\dfrac{" + media2 + "-" + media1 + " }{" + des + "/\\sqrt{" + n + "}} = " + t0
                                + "\\\\t_{\\alpha(n-1)} = t_{" + alpha + "(" + gl + ")} = " + talpha
                                + "\\\\ \\textrm{p-value}=" + p;
                        if (t0 > talpha) {
                            cadena += "\\\\ \\textrm{Dado que } t_0 > t_{\\alpha} \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } t_0 < t_{\\alpha} \\textrm{ Acepto } H_0";
                        }
                        if (p < alpha) {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                        } else {
                            cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                        }
                        labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                        latexExpression = cadena;
                        copy = Latex.THCS2(media1.toString()) + "\\\\ " + cadena;

                    } else {
                        JOptionPane.showMessageDialog(this, "Seleccione el tipo de prueba de hipótesis");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione el tipo de distribución");
                }

            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calcTHmeanButtonActionPerformed

    private void tailInfRButtonP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailInfRButtonP7ActionPerformed
        if (tDistRButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCI2, 20));
        } else if (normDistRButonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCI1, 20));
        }
    }//GEN-LAST:event_tailInfRButtonP7ActionPerformed

    private void tailSupRButtonP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailSupRButtonP7ActionPerformed
        if (tDistRButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCS2, 20));
        } else if (normDistRButonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCS1, 20));
        }
    }//GEN-LAST:event_tailSupRButtonP7ActionPerformed

    private void tail2RButtonP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tail2RButtonP7ActionPerformed
        if (tDistRButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.TH2C2, 20));
        } else if (normDistRButonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.TH2C1, 20));
        }
    }//GEN-LAST:event_tail2RButtonP7ActionPerformed

    private void tDistRButtonP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDistRButtonP7ActionPerformed
        desLabelP7.setIcon(tex.getIconOfLatex("s =", 20));
        if (tail2RButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.TH2C2, 20));
        } else if (tailInfRButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCI2, 20));
        } else if (tailSupRButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCS2, 20));
        }
    }//GEN-LAST:event_tDistRButtonP7ActionPerformed

    private void normDistRButonP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normDistRButonP7ActionPerformed
        desLabelP7.setIcon(tex.getIconOfLatex("\\sigma =", 20));
        if (tail2RButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.TH2C1, 20));
        } else if (tailInfRButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCI1, 20));
        } else if (tailSupRButtonP7.isSelected()) {
            latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCS1, 20));
        }
    }//GEN-LAST:event_normDistRButonP7ActionPerformed

    private void tailInfRButtonP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailInfRButtonP8ActionPerformed
        latexLabelP8.setIcon(tex.getIconOfLatex(Latex.THCI3, 20));
    }//GEN-LAST:event_tailInfRButtonP8ActionPerformed

    private void tailSupRButtonP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailSupRButtonP8ActionPerformed
        latexLabelP8.setIcon(tex.getIconOfLatex(Latex.THCS3, 20));
    }//GEN-LAST:event_tailSupRButtonP8ActionPerformed

    private void tail2RButtonP8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tail2RButtonP8ActionPerformed
        latexLabelP8.setIcon(tex.getIconOfLatex(Latex.TH2C3, 20));
    }//GEN-LAST:event_tail2RButtonP8ActionPerformed

    private void calcTHpropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTHpropButtonActionPerformed
        if (validarJTextOfPanel(P8)) {
            try {
                Double p0, alpha, z0, zalpha, phat, p;
                Integer si, n;

                si = Integer.valueOf(siTextP8.getText());
                p0 = Double.valueOf(p0TextP8.getText());
                alpha = Double.valueOf(alphaTextP8.getText());
                n = Integer.valueOf(nTextP8.getText());

                if (tail2RButtonP8.isSelected()) {

                    latexLabelP8.setIcon(tex.getIconOfLatex(Latex.TH2C3(p0.toString()), 20));
                    phat = Double.valueOf(si) / n;
                    z0 = (phat - p0) / (Math.sqrt((p0 * (1 - p0)) / n));
                    zalpha = Rsrc.qnorm(alpha / 2 + "", "0", "1", false);
                    p = Rsrc.pnorm(z0.toString(), "0", "1", z0 < 0);

                    p0 = rnd(p0);
                    phat = rnd(phat);
                    alpha = rnd(alpha);
                    z0 = rnd(z0);
                    zalpha = rnd(zalpha);
                    p = rnd(p);

                    String cadena = "\\hat{p}=\\dfrac{\\#si}{n}=\\dfrac{" + si + "}{" + n + "}=" + phat
                            + "\\\\ " + Latex.Zo1
                            + " = \\frac{" + phat + "-" + p0 + "}{\\sqrt{\\dfrac{" + p0 + "(" + rnd(1 - p0) + ")}{" + n + "}}}"
                            + " = \\frac{" + rnd(phat - p0) + "}{\\sqrt{\\dfrac{" + rnd(p0 * (1 - p0)) + "}{" + n + "}}} =" + z0
                            + "\\\\z_{\\alpha/2} = z_{" + rnd(alpha / 2) + "} = " + zalpha
                            + "\\\\ \\textrm{p-value}=" + p;

                    if (Math.abs(z0) > zalpha) {
                        cadena += "\\\\ \\textrm{Dado que } |z_0| > z_{\\alpha/2} \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } |z_0| < z_{\\alpha/2} \\textrm{ Acepto } H_0";
                    }
                    if (2 * p < alpha) {
                        cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} < \\alpha \\textrm{ Rechazo: } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                    }
                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = cadena;
                    copy = Latex.TH2C3(p0.toString()) + "\\\\ " + cadena;
                } else if (tailInfRButtonP8.isSelected()) {

                    latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCI3(p0.toString()), 20));

                    phat = Double.valueOf(si) / n;
                    z0 = (phat - p0) / (Math.sqrt((p0 * (1 - p0)) / n));
                    zalpha = Rsrc.qnorm(alpha.toString(), "0", "1", false);
                    p = Rsrc.pnorm(z0.toString());

                    p0 = rnd(p0);
                    phat = rnd(phat);
                    alpha = rnd(alpha);
                    z0 = rnd(z0);
                    zalpha = rnd(zalpha);
                    p = rnd(p);

                    String cadena = "\\hat{p}=\\dfrac{\\#si}{n}=\\dfrac{" + si + "}{" + n + "}=" + phat
                            + "\\\\ " + Latex.Zo1
                            + " = \\frac{" + phat + "-" + p0 + "}{\\sqrt{\\dfrac{" + p0 + "(" + rnd(1 - p0) + ")}{" + n + "}}}"
                            + " = \\frac{" + rnd(phat - p0) + "}{\\sqrt{\\dfrac{" + rnd(p0 * (1 - p0)) + "}{" + n + "}}} =" + z0
                            + "\\\\z_{\\alpha/2} = z_{" + alpha + "} = " + zalpha
                            + "\\\\ \\textrm{p-value}=" + p;

                    if (z0 < -zalpha) {
                        cadena += "\\\\ \\textrm{Dado que } z_0 < -z_{\\alpha} \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } z_0 > -z_{\\alpha} \\textrm{ Acepto } H_0";
                    }
                    if (p < alpha) {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                    }

                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = cadena;
                    copy = Latex.THCI3(p0.toString()) + "\\\\ " + cadena;

                } else if (tailSupRButtonP8.isSelected()) {

                    latexLabelP7.setIcon(tex.getIconOfLatex(Latex.THCS3(p0.toString()), 20));

                    phat = Double.valueOf(si) / n;
                    z0 = (phat - p0) / (Math.sqrt((p0 * (1 - p0)) / n));
                    zalpha = Rsrc.qnorm(alpha.toString(), "0", "1", false);
                    p = Rsrc.pnorm(z0.toString(), "0", "1", false);

                    p0 = rnd(p0);
                    phat = rnd(phat);
                    alpha = rnd(alpha);
                    z0 = rnd(z0);
                    zalpha = rnd(zalpha);
                    p = rnd(p);

                    String cadena = "\\hat{p}=\\dfrac{\\#si}{n}=\\dfrac{" + si + "}{" + n + "}=" + phat
                            + "\\\\ " + Latex.Zo1
                            + " = \\frac{" + phat + "-" + p0 + "}{\\sqrt{\\dfrac{" + p0 + "(" + rnd(1 - p0) + ")}{" + n + "}}}"
                            + " = \\frac{" + rnd(phat - p0) + "}{\\sqrt{\\dfrac{" + rnd(p0 * (1 - p0)) + "}{" + n + "}}} =" + z0
                            + "\\\\z_{\\alpha/2} = z_{" + alpha + "} = " + zalpha
                            + "\\\\ \\textrm{p-value}=" + p;

                    if (z0 > zalpha) {
                        cadena += "\\\\ \\textrm{Dado que } z_0 > z_{\\alpha} \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } z_0 < z_{\\alpha} \\textrm{ Acepto } H_0";
                    }
                    if (p < alpha) {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                    }
                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = cadena;
                    copy = Latex.THCS3(p0.toString()) + "\\\\ " + cadena;
                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione el tipo de prueba de hipótesis");
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calcTHpropButtonActionPerformed

    private void tailInfRButtonP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailInfRButtonP9ActionPerformed
        latexLabelP9.setIcon(tex.getIconOfLatex(Latex.THCI4, 20));
    }//GEN-LAST:event_tailInfRButtonP9ActionPerformed

    private void tailSupRButtonP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tailSupRButtonP9ActionPerformed
        latexLabelP9.setIcon(tex.getIconOfLatex(Latex.THCS4, 20));
    }//GEN-LAST:event_tailSupRButtonP9ActionPerformed

    private void tail2RButtonP9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tail2RButtonP9ActionPerformed
        latexLabelP9.setIcon(tex.getIconOfLatex(Latex.TH2C4, 20));
    }//GEN-LAST:event_tail2RButtonP9ActionPerformed

    private void calcTHvarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTHvarButton1ActionPerformed
        if (validarJTextOfPanel(P9)) {
            try {

                Double ss, alpha, chio, zalpha, sigma, chi1, chi2, p;
                Integer gl, n;

                ss = Double.valueOf(ssTextP9.getText());
                sigma = Double.valueOf(sigmaTextP9.getText());
                alpha = Double.valueOf(alphaTextP9.getText());
                n = Integer.valueOf(nTextP9.getText());

                if (tail2RButtonP9.isSelected()) {

                    latexLabelP9.setIcon(tex.getIconOfLatex(Latex.TH2C4(sigma.toString()), 20));

                    gl = n - 1;
                    chio = (gl) * ss / sigma;
                    chi1 = Rsrc.qchis(alpha / 2 + "", gl.toString(), false);
                    chi2 = Rsrc.qchis(alpha / 2 + "", gl.toString());
                    p = Rsrc.pchis(chio.toString(), gl.toString(), false);

                    ss = rnd(ss);
                    sigma = rnd(sigma);
                    alpha = rnd(alpha);
                    alpha = rnd(alpha);
                    chio = rnd(chio);
                    chi1 = rnd(chi1);
                    chi2 = rnd(chi2);
                    p = rnd(p);

                    String cadena = "gl=n-1=" + gl
                            + "\\\\ " + Latex.CHIo
                            + "\\ = \\dfrac{(" + gl + ")" + ss + "}{" + sigma + "}=" + chio
                            + "\\\\ \\chi^2_{\\alpha/2(n-1)} = \\chi^2_{" + rnd(alpha / 2) + "(" + gl + ")} = " + chi1
                            + "\\\\ \\chi^2_{(1-\\frac{\\alpha}{2})(n-1)} = \\chi^2_{(" + rnd(1 - (alpha / 2)) + ")(" + gl + ")} = " + chi2
                            + "\\\\ \\textrm{p-value}=" + p;

                    if (chio > chi1) {
                        cadena += "\\\\ \\textrm{Dado que } \\chi^2_o > \\chi^2_{\\frac{\\alpha}{2}(n-1)} \\textrm{ Rechazo } H_0";
                    } else if (chio < chi2) {
                        cadena += "\\\\ \\textrm{Dado que } \\chi^2_o < \\chi^2_{(1-\\frac{\\alpha}{2})(n-1)} \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } \\chi^2_{(1-\\frac{\\alpha}{2})(n-1)}<\\chi^2_o < \\chi^2_{\\frac{\\alpha}{2}(n-1)} \\textrm{ Acepto } H_0";
                    }

                    if (2 * p < alpha) {
                        cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} < \\alpha \\textrm{ Rechazo: } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } 2\\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                    }
                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = cadena;
                    copy = Latex.TH2C4(sigma.toString()) + "\\\\ " + cadena;

                } else if (tailInfRButtonP9.isSelected()) {

                    latexLabelP9.setIcon(tex.getIconOfLatex(Latex.THCI4(sigma.toString()), 20));

                    gl = n - 1;
                    chio = (gl) * ss / sigma;
                    chi1 = Rsrc.qchis(alpha.toString(), gl.toString());
                    p = Rsrc.pchis(chio.toString(), gl.toString());

                    ss = rnd(ss);
                    sigma = rnd(sigma);
                    alpha = rnd(alpha);
                    alpha = rnd(alpha);
                    chio = rnd(chio);
                    chi1 = rnd(chi1);
                    p = rnd(p);

                    String cadena = "gl=n-1=" + gl
                            + "\\\\ " + Latex.CHIo
                            + "\\ = \\dfrac{(" + gl + ")" + ss + "}{" + sigma + "}=" + chio
                            + "\\\\ \\chi^2_{(1-\\alpha)(n-1)} = \\chi^2_{(" + rnd(1 - alpha) + ")(" + gl + ")} = " + chi1
                            + "\\\\ \\textrm{p-value}=" + p;

                    if (chio < chi1) {
                        cadena += "\\\\ \\textrm{Dado que } \\chi^2_o < \\chi^2_{(1-\\alpha2)(n-1)} \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } \\chi^2_o > \\chi^2_{(1-\\alpha)(n-1)} \\textrm{ Acepto } H_0";
                    }

                    if (p < alpha) {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo: } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                    }
                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = cadena;
                    copy = Latex.THCI4(sigma.toString()) + "\\\\ " + cadena;

                } else if (tailSupRButtonP9.isSelected()) {

                    latexLabelP9.setIcon(tex.getIconOfLatex(Latex.THCS4(sigma.toString()), 20));

                    gl = n - 1;
                    chio = (gl) * ss / sigma;
                    chi1 = Rsrc.qchis(alpha.toString(), gl.toString(), false);
                    p = Rsrc.pchis(chio.toString(), gl.toString(), false);

                    ss = rnd(ss);
                    sigma = rnd(sigma);
                    alpha = rnd(alpha);
                    alpha = rnd(alpha);
                    chio = rnd(chio);
                    chi1 = rnd(chi1);
                    p = rnd(p);

                    String cadena = "gl=n-1=" + gl
                            + "\\\\ " + Latex.CHIo
                            + "\\ = \\dfrac{(" + gl + ")" + ss + "}{" + sigma + "}=" + chio
                            + "\\\\ \\chi^2_{(\\alpha)(n-1)} = \\chi^2_{(" + alpha + ")(" + gl + ")} = " + chi1
                            + "\\\\ \\textrm{p-value}=" + p;

                    if (chio > chi1) {
                        cadena += "\\\\ \\textrm{Dado que } \\chi^2_o > \\chi^2_{\\frac{\\alpha}{2}(n-1)} \\textrm{ Rechazo } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } \\chi^2_o < \\chi^2_{\\frac{\\alpha}{2}(n-1)} \\textrm{ Acepto } H_0";
                    }

                    if (p < alpha) {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} < \\alpha \\textrm{ Rechazo: } H_0";
                    } else {
                        cadena += "\\\\ \\textrm{Dado que } \\textrm{p-value} > \\alpha \\textrm{ Acepto } H_0";
                    }
                    labelLatex.setIcon(tex.getIconOfLatex(cadena, tamañoLatex));
                    latexExpression = cadena;
                    copy = Latex.THCS4(sigma.toString()) + "\\\\ " + cadena;

                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione el tipo de prueba de hipótesis");
                }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para realizar la operación");
        }
    }//GEN-LAST:event_calcTHvarButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            outRText.setText(Rsrc.exec(RTextArea.getText()).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ops, tenemos problemas en ejecutar el comando!\n"
                    + "probablemente el valor de retorno no es númerico");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void themesCBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_themesCBoxItemStateChanged
        try {
            for (LookAndFeelInfo info : FlatAllIJThemes.INFOS) {
                if (themesCBox.getSelectedItem().toString().equals(info.getName())) {
                    UIManager.setLookAndFeel((LookAndFeel) Class.forName(info.getClassName()).newInstance());
                    SwingUtilities.updateComponentTreeUI(this);
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        }
    }//GEN-LAST:event_themesCBoxItemStateChanged

    private void themesCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themesCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themesCBoxActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        StringSelection stringSelection = new StringSelection(copy);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }//GEN-LAST:event_copyButtonActionPerformed

    private Boolean validarJTextOfPanel(JPanel panel) {
        for (int i = 0; panel.getComponentCount() > i; i++) {
            if (panel.getComponents()[i] instanceof JTextField) {
                if (((JTextField) panel.getComponents()[i]).getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private Double rnd(Double n) {
        return Precision.round(n, round);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatDraculaContrastIJTheme());
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }

        Ventana programa = new Ventana();
        programa.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JPanel P4;
    private javax.swing.JPanel P5;
    private javax.swing.JPanel P6;
    private javax.swing.JPanel P7;
    private javax.swing.JPanel P8;
    private javax.swing.JPanel P9;
    private javax.swing.JTextArea RTextArea;
    private javax.swing.JLabel alphaLabelP7;
    private javax.swing.JLabel alphaLabelP8;
    private javax.swing.JLabel alphaLabelP9;
    private javax.swing.JTextField alphaTextP7;
    private javax.swing.JTextField alphaTextP8;
    private javax.swing.JTextField alphaTextP9;
    private javax.swing.JButton calICPropButton;
    private javax.swing.JButton calProbMeanButton;
    private javax.swing.JButton calcICButton1;
    private javax.swing.JButton calcICvarButton1;
    private javax.swing.JButton calcTHmeanButton;
    private javax.swing.JButton calcTHpropButton;
    private javax.swing.JButton calcTHvarButton1;
    private javax.swing.JButton calcTamPropButton;
    private javax.swing.JButton calcTamXMeanButton;
    private javax.swing.JButton copyButton;
    private javax.swing.JTextField dat2TextP;
    private javax.swing.JTextField datTextP1;
    private javax.swing.JLabel desLabelP3;
    private javax.swing.JLabel desLabelP7;
    private javax.swing.JTextField desTextP3;
    private javax.swing.JTextField desTextP7;
    private javax.swing.JLabel desvLabelP1;
    private javax.swing.JLabel desvLabelP2;
    private javax.swing.JTextField desvTextP1;
    private javax.swing.JTextField desvTextP2;
    private javax.swing.JRadioButton entreJRButton;
    private javax.swing.JLabel errLabelP3;
    private javax.swing.JLabel errLabelP5;
    private javax.swing.JTextField errTextP3;
    private javax.swing.JTextField errTextP5;
    private javax.swing.ButtonGroup icDistType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelLatex;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel latexLabelP2;
    private javax.swing.JLabel latexLabelP3;
    private javax.swing.JLabel latexLabelP4;
    private javax.swing.JLabel latexLabelP5;
    private javax.swing.JLabel latexLabelP6;
    private javax.swing.JLabel latexLabelP7;
    private javax.swing.JLabel latexLabelP8;
    private javax.swing.JLabel latexLabelP9;
    private javax.swing.JRadioButton mayorJRButton;
    private javax.swing.JLabel mean1LabelP7;
    private javax.swing.JTextField mean1TextP7;
    private javax.swing.JLabel mean2LabelP7;
    private javax.swing.JTextField mean2TextP7;
    private javax.swing.JLabel meanLabelP1;
    private javax.swing.JLabel meanLabelP2;
    private javax.swing.JTextField meanTextP1;
    private javax.swing.JTextField meanTextP2;
    private javax.swing.JRadioButton menorJRbutton;
    private javax.swing.JLabel nLabelP1;
    private javax.swing.JLabel nLabelP2;
    private javax.swing.JLabel nLabelP4;
    private javax.swing.JLabel nLabelP6;
    private javax.swing.JLabel nLabelP7;
    private javax.swing.JLabel nLabelP8;
    private javax.swing.JLabel nLabelP9;
    private javax.swing.JTextField nTextP1;
    private javax.swing.JTextField nTextP2;
    private javax.swing.JTextField nTextP4;
    private javax.swing.JTextField nTextP6;
    private javax.swing.JTextField nTextP7;
    private javax.swing.JTextField nTextP8;
    private javax.swing.JTextField nTextP9;
    private javax.swing.JLabel ncLabelP2;
    private javax.swing.JLabel ncLabelP3;
    private javax.swing.JLabel ncLabelP4;
    private javax.swing.JLabel ncLabelP5;
    private javax.swing.JLabel ncLabelP6;
    private javax.swing.JTextField ncTextP2;
    private javax.swing.JTextField ncTextP3;
    private javax.swing.JTextField ncTextP4;
    private javax.swing.JTextField ncTextP5;
    private javax.swing.JTextField ncTextP6;
    private javax.swing.JRadioButton normDistRButonP7;
    private javax.swing.JRadioButton normJRButtonP1;
    private javax.swing.JTextField outRText;
    private javax.swing.JLabel p0LabelP8;
    private javax.swing.JTextField p0TextP8;
    private javax.swing.JPanel panelLatex;
    private javax.swing.JLabel phatLabelP5;
    private javax.swing.JTextField phatTextP5;
    private javax.swing.ButtonGroup probOfMeanType;
    private javax.swing.JRadioButtonMenuItem round1RButton;
    private javax.swing.JRadioButtonMenuItem round2RButton;
    private javax.swing.JRadioButtonMenuItem round4RButton;
    private javax.swing.JRadioButtonMenuItem round6RButton;
    private javax.swing.ButtonGroup roundGroup;
    private javax.swing.JScrollPane scrollPaneLatex;
    private javax.swing.JLabel siLabelP4;
    private javax.swing.JLabel siLabelP8;
    private javax.swing.JTextField siTextP4;
    private javax.swing.JTextField siTextP8;
    private javax.swing.JLabel sigmaLabelP9;
    private javax.swing.JTextField sigmaTextP9;
    private javax.swing.JSlider sizeLatexSlider;
    private javax.swing.JLabel ssLabelP6;
    private javax.swing.JLabel ssLabelP9;
    private javax.swing.JTextField ssTextP6;
    private javax.swing.JTextField ssTextP9;
    private javax.swing.JRadioButton tDistRButtonP7;
    private javax.swing.JRadioButton tJRButtonP1;
    private javax.swing.JRadioButton tail2RButtonP7;
    private javax.swing.JRadioButton tail2RButtonP8;
    private javax.swing.JRadioButton tail2RButtonP9;
    private javax.swing.JRadioButton tailInfRButtonP7;
    private javax.swing.JRadioButton tailInfRButtonP8;
    private javax.swing.JRadioButton tailInfRButtonP9;
    private javax.swing.JRadioButton tailSupRButtonP7;
    private javax.swing.JRadioButton tailSupRButtonP8;
    private javax.swing.JRadioButton tailSupRButtonP9;
    private javax.swing.ButtonGroup thMeanDist;
    private javax.swing.ButtonGroup thTailMeanType;
    private javax.swing.ButtonGroup thTailPropType;
    private javax.swing.JComboBox<String> themesCBox;
    // End of variables declaration//GEN-END:variables
}
