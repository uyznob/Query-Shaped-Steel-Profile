package bttd.enginit.bttd;

class RowDataHHP {
    private String sohieu;
    private Integer socay;
    private Double t;
    private Double klc;

    public RowDataHHP(String sohieu, Integer socay, Double t, Double klc) {
        this.sohieu = sohieu;
        this.socay = socay;
        this.t = t;
        this.klc = klc;
    }

    public String getSohieu() {
        return sohieu;
    }

    public void setSohieu(String sohieu) {
        this.sohieu = sohieu;
    }

    public Integer getSocay() {
        return socay;
    }

    public void setSocay(Integer socay) {
        this.socay = socay;
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    public Double getKlc() {
        return klc;
    }

    public void setKlc(Double klc) {
        this.klc = klc;
    }
}
