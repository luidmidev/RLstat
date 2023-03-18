package com.WaiperSoft;

import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

public class Latex {

    public static String Z = "z = \\dfrac{\\bar{x}-\\mu }{\\sigma_{\\bar{x}}}";
    public static String Zo = "z_o = \\dfrac{\\bar{x}-\\mu }{\\sigma/\\sqrt{n}}";
    public static String Zo1 = "z_o=\\frac{\\hat{p}-p_0}{\\sqrt{\\dfrac{p_0(1-p_0)}{n}}}";
    public static String To = "t_o = \\dfrac{\\bar{x}-\\mu }{s/\\sqrt{n}}";
    public static String CHIo = "\\chi^2_o = \\dfrac{(n-1)s^2}{\\sigma^2_o}";
    public static String ICm1 = "IC=\\bar{x}\\pm z_{\\frac{\\alpha}{2}}\\dfrac{\\sigma }{\\sqrt{n}}";
    public static String ICm2 = "IC=\\bar{x}\\pm t_{\\frac{\\alpha}{2}(n-1)}\\dfrac{s}{\\sqrt{n}}";
    public static String NC = "NC=1 - \\alpha";
    public static String ALPHA = "\\alpha = 1 - NC";
    public static String nM = "n = \\left ( \\dfrac{z_{\\frac{\\alpha }{2}}\\cdot \\sigma }{E}\\right)^2";
    public static String ICp = "IC=\\hat{p} \\pm z_{\\frac{\\alpha }{2}}\\sqrt{\\dfrac{\\hat{p}(1-\\hat{p})}{n}}";
    public static String nP = "n=\\dfrac{ (z_{\\frac{\\alpha }{2}})^{2}\\hat{p}(1-\\hat{p})}{E^{2}}";
    public static String ICv = "IC=\\left(\\dfrac{(n-1)s^{2}}{x_{\\frac{\\alpha}{2}(n-1)}^{2}},"
            + "\\dfrac{(n-1)s^{2}}{x_{\\left(1-\\frac{\\alpha}{2} \\right)(n-1)}^{2}}\\right )";

    public static String THCI1 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de cola inferior}\\\\\n"
            + "H_0: \\mu \\geq \\mu_0 \\\\"
            + "H_1: \\mu < \\mu_0\\\\"
            + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_0<-z_\\alpha \\\\"
            + "\\end{matrix}";
    public static String THCS1 = "\\begin{matrix}"
            + "\\textrm{Prueba de cola superior}\\\\\n"
            + "H_0: \\mu \\leq  \\mu_0 \\\\"
            + "H_1: \\mu > \\mu_0 \\\\"
            + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_0>z_\\alpha \\\\"
            + "\\end{matrix}";
    public static String TH2C1 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de dos colas}\\\\\n"
            + "H_0: \\mu =  \\mu_0 \\\\\n"
            + "H_1: \\mu \\neq \\mu_0 \\\\\n"
            + "\\textrm{Rechazar }H_0\\textrm{ si } 2\\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: |z_0|>z_{\\alpha/2} \\\\\n"
            + "\\end{matrix}";

    public static String THCI1(String mu_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de cola inferior}\\\\\n"
                + "H_0: \\mu \\geq " + mu_0 + " \\\\"
                + "H_1: \\mu < " + mu_0 + " \\\\"
                + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_0<-z_\\alpha \\\\"
                + "\\end{matrix}";
    }

    public static String THCS1(String mu_0) {
        return "\\begin{matrix}"
                + "\\textrm{Prueba de cola superior}\\\\\n"
                + "H_0: \\mu \\leq  " + mu_0 + " \\\\"
                + "H_1: \\mu > " + mu_0 + " \\\\"
                + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_0>z_\\alpha \\\\"
                + "\\end{matrix}";
    }

    public static String TH2C1(String mu_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de dos colas}\\\\\n"
                + "H_0: \\mu =  " + mu_0 + " \\\\\n"
                + "H_1: \\mu \\neq " + mu_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0\\textrm{ si } 2\\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: |z_0|>z_{\\frac{\\alpha }{2}} \\\\\n"
                + "\\end{matrix}";
    }

    public static String THCI2 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de cola inferior}\\\\\n"
            + "H_0: \\mu \\geq \\mu_0 \\\\"
            + "H_1: \\mu < \\mu_0\\\\"
            + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: t_o<-t_\\alpha \\\\"
            + "\\end{matrix}";
    public static String THCS2 = "\\begin{matrix}"
            + "\\textrm{Prueba de cola superior}\\\\\n"
            + "H_0: \\mu \\leq  \\mu_0 \\\\"
            + "H_1: \\mu > \\mu_0 \\\\"
            + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: t_o>t_\\alpha \\\\"
            + "\\end{matrix}";
    public static String TH2C2 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de dos colas}\\\\\n"
            + "H_0: \\mu =  \\mu_0 \\\\\n"
            + "H_1: \\mu \\neq \\mu_0 \\\\\n"
            + "\\textrm{Rechazar }H_0\\textrm{ si } 2\\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: |t_o|>t_{\\alpha/2} \\\\\n"
            + "\\end{matrix}";

    public static String THCI2(String mu_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de cola inferior}\\\\\n"
                + "H_0: \\mu \\geq " + mu_0 + " \\\\"
                + "H_1: \\mu < " + mu_0 + " \\\\"
                + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: t_o<-t_\\alpha \\\\"
                + "\\end{matrix}";
    }

    public static String THCS2(String mu_0) {
        return "\\begin{matrix}"
                + "\\textrm{Prueba de cola superior}\\\\\n"
                + "H_0: \\mu \\leq  " + mu_0 + " \\\\"
                + "H_1: \\mu > " + mu_0 + " \\\\"
                + "\\textrm{Rechazar }H_0\\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: t_o>t_\\alpha \\\\"
                + "\\end{matrix}";
    }

    public static String TH2C2(String mu_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de dos colas}\\\\\n"
                + "H_0: \\mu =  " + mu_0 + " \\\\\n"
                + "H_1: \\mu \\neq " + mu_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0\\textrm{ si } 2\\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: |t_o|>t_{\\frac{\\alpha }{2}} \\\\\n"
                + "\\end{matrix}";
    }

    public static String THCI3 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de cola inferior} \\\\\n"
            + "H_0: p \\geq  p_0 \\\\\n"
            + "H_1: p <  p_0 \\\\\n"
            + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_o<-z_{\\alpha} \\\\\n"
            + "\\end{matrix}";

    public static String THCS3 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de cola superior} \\\\\n"
            + "H_0: p \\leq   p_0 \\\\\n"
            + "H_1: p >  p_0 \\\\\n"
            + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_o > z_{\\alpha} \\\\\n"
            + "\\end{matrix}";

    public static String TH2C3 = "\\begin{matrix}\n"
            + "\\textrm{Prueba dos colas} \\\\\n"
            + "H_0: p =   p_0 \\\\\n"
            + "H_1: p \\neq  p_0 \\\\\n"
            + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: |z_o| > z_{\\frac{\\alpha}{2}} \\\\\n"
            + "\\end{matrix}";

    public static String THCI3(String p_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de cola inferior} \\\\\n"
                + "H_0: p \\geq  " + p_0 + " \\\\\n"
                + "H_1: p <  " + p_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_o<-z_{\\alpha} \\\\\n"
                + "\\end{matrix}";
    }

    public static String THCS3(String p_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de cola superior} \\\\\n"
                + "H_0: p \\leq   " + p_0 + " \\\\\n"
                + "H_1: p >  " + p_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: z_o > z_{\\alpha} \\\\\n"
                + "\\end{matrix}";
    }

    public static String TH2C3(String p_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de dos colas} \\\\\n"
                + "H_0: p =   " + p_0 + " \\\\\n"
                + "H_1: p \\neq  " + p_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha \\:\\:\\: | \\:\\:\\: |z_o| > z_{\\frac{\\alpha}{2}} \\\\\n"
                + "\\end{matrix}";
    }

    public static String THCI4 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de cola inferior} \\\\\n"
            + "H_0: \\sigma^2  \\geq   \\sigma_0^2 \\\\\n"
            + "H_1: \\sigma^2 <  \\sigma_0^2 \\\\\n"
            + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha "
            + "\\: | \\\\ ​\n"
            + "\\chi^2_o < \\chi^2_{(1-\\alpha)(n-1)} \\\\\n"
            + "\\end{matrix}";

    public static String THCS4 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de cola superior} \\\\\n"
            + "H_0: \\sigma^2  \\leq   \\sigma_0^2 \\\\\n"
            + "H_1: \\sigma^2 > \\sigma_0^2 \\\\\n"
            + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha"
            + "\\: | \\\\ ​\n"
            + "\\chi^2_o >\\chi^2_{\\alpha(n-1)} \\\\\n"
            + "\\end{matrix}";

    public static String TH2C4 = "\\begin{matrix}\n"
            + "\\textrm{Prueba de dos colas} \\\\\n"
            + "H_0: \\sigma^2  =  \\sigma_0^2 \\\\\n"
            + "H_1: \\sigma^2 \\neq  \\sigma_0^2 \\\\\n"
            + "\\textrm{Rechazar }H_0 \\textrm{ si } 2\\textrm{p-value}<\\alpha "
            + "\\\\ \\chi^2_o < \\chi^2_{(1-\\frac{\\alpha}{2})(n-1)}\n"
            + "\\: | \\: \\chi^2_o > \\chi^2_{\\frac{\\alpha}{2}(n-1)} \\\\\n"
            + "\\end{matrix}";

    public static String THCI4(String sigma_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de cola inferior} \\\\\n"
                + "H_0: \\sigma^2  \\geq " + sigma_0 + " \\\\\n"
                + "H_1: \\sigma^2 < " + sigma_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha"
                + "\\: | \\\\ ​\n"
                + "\\chi^2_o < \\chi^2_{(1-\\alpha)(n-1)} \\\\\n"
                + "\\end{matrix}";
    }

    public static String THCS4(String sigma_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de cola superior} \\\\\n"
                + "H_0: \\sigma^2  \\leq  " + sigma_0 + " \\\\\n"
                + "H_1: \\sigma^2 > " + sigma_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0 \\textrm{ si } \\textrm{p-value}<\\alpha"
                + "\\: | \\\\ ​\n"
                + "\\chi^2_o >\\chi^2_{\\alpha(n-1)} \\\\\n"
                + "\\end{matrix}";
    }

    public static String TH2C4(String sigma_0) {
        return "\\begin{matrix}\n"
                + "\\textrm{Prueba de dos colas} \\\\\n"
                + "H_0: \\sigma^2  =  " + sigma_0 + " \\\\\n"
                + "H_1: \\sigma^2 \\neq  " + sigma_0 + " \\\\\n"
                + "\\textrm{Rechazar }H_0 \\textrm{ si } 2\\textrm{p-value}<\\alpha "
                + "\\\\ \\chi^2_o < \\chi^2_{(1-\\frac{\\alpha}{2})(n-1)}\n"
                + "\\: | \\: \\chi^2_o > \\chi^2_{\\frac{\\alpha}{2}(n-1)} \\\\\n"
                + "\\end{matrix}";
    }

    public TeXIcon getIconOfLatex(String math, int size) {
        try {
            TeXFormula formula = new TeXFormula(math);
            TeXIcon icon = formula.createTeXIcon(TeXConstants.ALIGN_LEFT, size);
            return icon;
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
