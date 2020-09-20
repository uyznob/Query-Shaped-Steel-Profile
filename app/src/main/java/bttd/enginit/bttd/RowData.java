package bttd.enginit.bttd;

class RowData {
    private String sohieu;   //So hieu
    private Double klr;      //Khoi luong rieng
    private Double dtmc;     //Dien tich mat cat ngang

    public RowData(String sohieu, Double klr, Double dtmc) {
        this.sohieu = sohieu;
        this.klr = klr;
        this.dtmc = dtmc;
    }

    public String getSohieu() {
        return sohieu;
    }

    public void setSohieu(String sohieu) {
        this.sohieu = sohieu;
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
