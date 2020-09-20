package bttd.enginit.bttd;

class RowDataO {
    private Integer d;
    private Double D;
    private Double t;
    private Double klr;
    private Double dtmc;

    public RowDataO(Integer d, Double D, Double t, Double klr, Double dtmc) {
        this.d = d;
        this.D = D;
        this.t = t;
        this.klr = klr;
        this.dtmc = dtmc;
    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public Double getDD() {
        return D;
    }

    public void setDD(Double D) {
        this.D = D;
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
