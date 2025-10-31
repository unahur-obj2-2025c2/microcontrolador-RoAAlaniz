package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public class Lodv extends Comando{
    private Integer val;

    public Lodv(Integer val) {
        this.val = val;
    }

    @Override
    protected void doExecute(Programable micro) {
        micro.setAcumuladorA(val);
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }
}