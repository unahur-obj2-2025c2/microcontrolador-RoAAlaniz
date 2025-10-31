package ar.unahur.edu.obj2.patroncommand.operaciones;

import ar.unahur.edu.obj2.patroncommand.mircocontrolador.Programable;

public class StrAddr extends Comando{

    private Integer addr;

    public StrAddr(Integer addr) {
        this.addr = addr;
    }

    @Override
    protected void doExecute(Programable micro) {
        micro.setAddr(addr);
    }

    public Integer getAddr() {
        return addr;
    }

    public void setAddr(Integer addr) {
        this.addr = addr;
    }
}