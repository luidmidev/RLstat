package com.WaiperSoft;

import javax.swing.JOptionPane;
import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.REngineException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class R {

    private RConnection R;

    public R() {
        try {
            R = new RConnection();
        } catch (RserveException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al conectarse con R, cierre el programa y lea las instrucciones");
        }
    }

    public void asignarDatos(String variable, int[] values) {
        try {
            R.assign(variable, values);
        } catch (REngineException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
    }

    public Double mean(int[] values) {
        try {
            R.assign("input", values);
            return R.eval("mean(input)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double exec(String command) {
        try {
            return R.eval(command).asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pnorm(String q, String mean, String sd, Boolean tailLower) {
        try {
            R.eval("a = " + q);
            R.eval("b = " + mean);
            R.eval("c = " + sd);
            R.eval("d = " + (tailLower ? "T" : "F"));
            return R.eval("pnorm(a, mean = b, sd = c, lower.tail = d)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pnorm(String q, String mean, String sd) {
        try {
            R.eval("a = " + q);
            R.eval("b = " + mean);
            R.eval("c = " + sd);
            return R.eval("pnorm(a, mean = b, sd = c").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pnorm(String q, String mean) {
        try {
            R.eval("a = " + q);
            R.eval("b = " + mean);
            return R.eval("pnorm(a, mean = b").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pnorm(String q) {
        try {
            R.eval("a = " + q);
            return R.eval("pnorm(a)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qnorm(String p, String mean, String sd, Boolean tailLower) {
        try {
            R.eval("a = " + p);
            R.eval("b = " + mean);
            R.eval("c = " + sd);
            R.eval("d = " + (tailLower ? "T" : "F"));
            return R.eval("qnorm(a, mean = b, sd = c, lower.tail = d)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qnorm(String p, String mean, String sd) {
        try {
            R.eval("a = " + p);
            R.eval("b = " + mean);
            R.eval("c = " + sd);
            return R.eval("qnorm(a, mean = b, sd = c").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qnorm(String p, String mean) {
        try {
            R.eval("a = " + p);
            R.eval("b = " + mean);
            return R.eval("qnorm(a, mean = b").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qnorm(String p) {
        try {
            R.eval("a = " + p);
            return R.eval("qnorm(a)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pt(String q, String df, Boolean tailLower) {
        try {
            R.eval("a = " + q);
            R.eval("b = " + df);
            R.eval("c = " + (tailLower ? "T" : "F"));
            return R.eval("pt(a, b, lower.tail = c)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pt(String q, String df) {
        try {
            R.eval("a = " + q);
            R.eval("b = " + df);
            return R.eval("pt(a, b)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qt(String p, String df, Boolean tailLower) {
        try {
            R.eval("a = " + p);
            R.eval("b = " + df);
            R.eval("c = " + (tailLower ? "T" : "F"));
            return R.eval("qt(a, b, lower.tail = c)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qt(String p, String df) {
        try {
            R.eval("a = " + p);
            R.eval("b = " + df);
            return R.eval("qt(a, b)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pchis(String q, String df, Boolean tailLower) {
        try {
            R.eval("a = " + q);
            R.eval("b = " + df);
            R.eval("c = " + (tailLower ? "T" : "F"));
            return R.eval("pchisq(a, b, lower.tail = c)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double pchis(String q, String df) {
        try {
            R.eval("a = " + q);
            R.eval("b = " + df);
            return R.eval("pchisq(a, b)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qchis(String p, String df, Boolean tailLower) {
        try {
            R.eval("a = " + p);
            R.eval("b = " + df);
            R.eval("c = " + (tailLower ? "T" : "F"));
            return R.eval("qchisq(a, b, lower.tail = c)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public Double qchis(String p, String df) {
        try {
            R.eval("a = " + p);
            R.eval("b = " + df);
            return R.eval("qchisq(a, b)").asDouble();
        } catch (REngineException | REXPMismatchException ex) {
            JOptionPane.showMessageDialog(null, "R error: " + ex.getMessage());
        }
        return null;
    }

    public void close() {
        R.close();
    }
}
