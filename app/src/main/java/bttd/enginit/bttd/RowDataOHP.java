package bttd.enginit.bttd;

class RowDataOHP {
    private String d;
    private Integer socay;
    private Double t;
    private Double klc;

    public RowDataOHP(String d, Integer socay, Double t, Double klc) {
        this.d = d;
        this.socay = socay;
        this.t = t;
        this.klc = klc;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
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
