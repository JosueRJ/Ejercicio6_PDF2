
package ejercicio6;

public class Fecha {
    //atributos dia, mes y año
    private int dd;
    private int mm;
    private int aa;
    
    //Constructores
    //Por defecto
    public Fecha() {}
    
    //Con parametros
    public Fecha(int dd, int mm, int aa) {
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }
     
    //set and get

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }
    
    //Metodos
     public boolean fechaCorrecta() {
        boolean diaCorrecto, mesCorrecto, añoCorrecto;
        añoCorrecto = aa > 0;
        mesCorrecto = mm >= 1 && mm <= 12;
        switch (mm) {
            case 1:
                if (esBisiesto()) {
                    diaCorrecto = dd >= 1 && dd <= 29;
                } else {
                    diaCorrecto = dd >= 1 && dd <= 28;
                }
                break;
                
            case 2:
                diaCorrecto = dd >= 1 && dd <= 30;
                break;
            default:
                diaCorrecto = dd >= 1 && dd <= 31;
        }
        return diaCorrecto && mesCorrecto && añoCorrecto;
    }

    private boolean esBisiesto() {
        return (aa % 4 == 0 && aa % 100 != 0 || aa % 400 == 0);
    }
//Modificar fecha
    public void diaSiguiente() {
        dd++;
        if (!fechaCorrecta()) {
            dd = 1;
            mm++;
            if (!fechaCorrecta()) {
                mm = 1;
                aa++;
            }

        }
    }

    //Método toString para mostrar la fecha y sobreescribirla
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dd < 10) {
            sb.append("0");
        }
        sb.append(dd);
        sb.append("-");
        if (mm < 10) {
            sb.append("0");
        }
        sb.append(mm);
        sb.append("-");
        sb.append(aa);
        return sb.toString();
    }
}
