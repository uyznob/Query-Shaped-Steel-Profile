package bttd.enginit.bttd;

class RowDataIC {
    private String sohieu;   //So hieu
    private Integer h;
    private Integer b;
    private Double d;
    private Double t;
    private Double klr;      //Khoi luong rieng
    private Double dtmc;     //Dien tich mat cat ngang

    public RowDataIC(String sohieu, Integer h, Integer b, Double d, Double t, Double klr, Double dtmc) {
        this.sohieu = sohieu;
        this.h = h;
        this.b = b;
        this.d = d;
        this.t = t;
        this.klr = klr;
        this.dtmc = dtmc;
    }

    public String getSohieu() {
        return sohieu;
    }

    public void setSohieu(String sohieu) {
        this.sohieu = sohieu;
    }

    public Integer getH() {
        return h;
    }

    public void setH(Integer h) {
        this.h = h;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    public Double getKlr() {
        return klr;
    }

    public void setKlr(Double klr) {
        this.klr = klr;
    }

    public Double getDtmc() {
        return dtmc;
    }

    public void setDtmc(Double dtmc) {
        this.dtmc = dtmc;
    }
}
