package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public class LodAddr extends Comando{

    private Integer addr;

    public LodAddr(Integer addr) {
        this.addr = addr;
    }

    @Override
    protected void doExecute(Programable micro) {
        micro.setAcumuladorA(micro.getAddr(addr));
    }

    public Integer getAddr() {
        return addr;
    }

    public void setAddr(Integer addr) {
        this.addr = addr;
    }
}